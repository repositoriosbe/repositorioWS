package cl.bluex.etiquetasolucion.mybatis;

import static cl.bluex.ws.common.util.Constantes.UNCHECKED;
import static cl.bluex.ws.common.util.Constantes.RESULTADO;

import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import cl.bluex.etiquetasolucion.EtiquetaSolucionDao;
import cl.bluex.etiquetasolucion.mapper.EtiquetaSolucionMapper;
import cl.bluex.etiquetasolucionmodel.to.DatosImpresionTO;
import cl.bluex.etiquetasolucionmodel.to.ImpresionSolucionTO;
import cl.bluex.etiquetasolucionmodel.to.InquietudTO;
import cl.bluex.etiquetasolucionmodel.to.SolicitudImpresionTO;
import cl.bluex.etiquetasolucionmodel.to.SolucionTO;
import cl.bluex.ws.common.dao.AbstractDao;
import cl.bluex.ws.common.exceptions.BluexException;

/**
 * Implementacion interfaz Dao.
 * 
 * @author rmoscoso
 * 
 */
public class EtiquetaSolucionDaoImpl extends AbstractDao<EtiquetaSolucionMapper> implements
		EtiquetaSolucionDao {
	private static final Logger LOGGER = Logger
			.getLogger(EtiquetaSolucionDaoImpl.class);
	private Map<String, Object> params = new HashMap<String, Object>();

	/**
	 * crea instancia de EtiquetaSolucionDaoImpl
	 * 
	 * @param sqlSession
	 */
	public EtiquetaSolucionDaoImpl(final SqlSession sqlSession) {
		super(sqlSession);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.ws.common.dao.AbstractDao#getMapperClass()
	 */
	@Override
	public Class<EtiquetaSolucionMapper> getMapperClass() {
		return EtiquetaSolucionMapper.class;
	}
	
	/* (non-Javadoc)
	 * @see cl.bluex.etiquetasolucion.EtiquetaSolucionDao#getSolucionEtiqueta(cl.bluex.etiquetasolucionmodel.to.SolucionTO)
	 */
	@Override
	public List<SolucionTO> getSolucionEtiqueta(
			final InquietudTO to) throws BluexException {
		
		LOGGER.info("[getSolucionEtiqueta] Iniciando llamada PL :");
		
		params = new HashMap<String, Object>();
		params.put("i_fch_ini" 	, to.getFechaInicio());
		params.put("i_fch_fin" 	, to.getFechaFin());
		params.put("i_empr_cdg"	, to.getCodigoEmpresa());
		params.put("i_fevl_cdg"	, to.getCodigoTipoDocumento());
		params.put("i_ofcn_cdg"	, to.getCodigoOficina());
		params.put("i_psta_cdg"	, to.getCodigoPosta());
		params.put("i_clhl_cdg"	, to.getCodigoCliente());
		params.put("i_clhl_scrs", to.getSucursalCliente());
		params.put("i_tpcl_cdg"	, to.getCodigoTipoCliente());
		
		LOGGER.info("Parametros de entrada : " + params.toString());
		
		getMapper().getSolucionEtiqueta(params);
		
		this.esExcepcion();
		
		@SuppressWarnings(UNCHECKED)
		final List<SolucionTO> resultado = (List<SolucionTO>) params.get(RESULTADO);
		return resultado;
	
	}

	
	/* (non-Javadoc)
	 * @see cl.bluex.etiquetasolucion.EtiquetaSolucionDao#getImpresionSolucion(cl.bluex.etiquetasolucionmodel.to.ImpresionSolucionTO)
	 */
	@Override
	public ImpresionSolucionTO getImpresionSolucion(
			final SolicitudImpresionTO to) throws BluexException {
		
		LOGGER.info("[getImpresionSolucion] Iniciando llamada PL :");
		
		params = new HashMap<String, Object>();
		params.put("i_eevv_nmr_id" 	, to.getCodigoEspecieValorada());
		params.put("i_imte_cdg" 	, to.getCodigoTemplate());
		
		LOGGER.info("Parametros de entrada : " + params.toString());
		
		getMapper().getImpresionSolucion(params);
		
		this.esExcepcion();
		
		@SuppressWarnings(UNCHECKED)
		final List<DatosImpresionTO> datosImpresion = (List<DatosImpresionTO>) params.get(RESULTADO);
		
		final ImpresionSolucionTO respuesta = new ImpresionSolucionTO();
		respuesta.setCodigoBarraSorter(params.get("o_srtr_cdg").toString());
		respuesta.setCodigoEspecieValorada(to.getCodigoEspecieValorada());
		respuesta.setNumeroFolio(String.valueOf(params.get("o_eevv_nmr_serie")));
		
		String template = String.valueOf(params.get("o_imte_template"));
		
		respuesta.setContenido(reemplazarValoresTemplate(template , datosImpresion.get(0) ));
		
		return respuesta;
	
	}
	
	
	/**
     * Metodo que reemplaza los valores correspondientes a parametros en plantillas EPL/ZPL de impresion
     * 
     * @param string
     * @param datosImpresion
     * @return String con el contenido reemplazado
     */
    private String reemplazarValoresTemplate(String template, DatosImpresionTO datosImpresion) {
        LOGGER.info("INI [reemplazarValoresTemplate] ");
        String returnTemplate = template;
        try {
            for (PropertyDescriptor prop : Introspector.getBeanInfo(DatosImpresionTO.class).getPropertyDescriptors()) {
                LOGGER.info("about to process replacement of " + prop.getName());
                String fieldToReplace = prop.getName().toUpperCase();
                Object valorCampo;
                try {
                    valorCampo = prop.getReadMethod().invoke(datosImpresion);
                    if (valorCampo != null) {
                        returnTemplate = returnTemplate.replaceAll(fieldToReplace, valorCampo.toString());
                    } else {
                        returnTemplate = returnTemplate.replaceAll(fieldToReplace, "");
                    }
                } catch (Exception ex) {
                    LOGGER.error("Error al obtener el valor del campo" + ex.getMessage(), ex);
                }
            }
        } catch (IntrospectionException e) {
            LOGGER.error("Error al obtener las propiedades del bean: " + e.getMessage(), e);
        } finally {
            LOGGER.info("FIN [reemplazarValoresTemplate] ");
        }
        // Se agrega un Enter al final, ya que se le debe dar termino a la impresión de tipo TERMICA
        return returnTemplate + "\n";
    }
	

	private void esExcepcion() throws BluexException {
		final Integer codError = (Integer) params.get(COD_ERROR);
		final String descError = (String) params.get(DESC_ERROR);

		if (codError != 0) {
			throw new BluexException(codError.toString(), descError);
		}
	}


}
