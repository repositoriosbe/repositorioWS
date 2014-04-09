package cl.bluex.digfull.mybatis;

import static cl.bluex.ws.common.util.Constantes.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import cl.bluex.digfull.DigitacionFullDao;
import cl.bluex.digfull.mapper.DigitacionFullMapper;
import cl.bluex.digfull.util.Constante;
import cl.bluex.digfull.util.UtilFecha;
import cl.bluex.digmodel.to.DatosClienteTO;
import cl.bluex.digmodel.to.EntradaObtieneTarifaTO;
import cl.bluex.digmodel.to.EspecieValoradaTO;
import cl.bluex.digmodel.to.OrdenServicioTO;
import cl.bluex.digmodel.to.ReferenciaTO;
import cl.bluex.digmodel.to.ServicioComplementarioDetalleTO;
import cl.bluex.digmodel.to.ServicioComplementarioPagoTO;
import cl.bluex.digmodel.to.ServicioComplementarioTO;
import cl.bluex.digmodel.to.TarifaTO;
import cl.bluex.digmodel.to.TipoClienteTO;
import cl.bluex.digmodel.to.WareHouseTO;
import cl.bluex.ws.common.dao.AbstractDao;
import cl.bluex.ws.common.exceptions.BluexException;
import cl.bluex.ws.common.util.Util;

/**
 * Implementacion interfaz Dao.
 * 
 * @author Edgardo Herrera
 * 
 */
public class DigitacionFullDaoImpl extends AbstractDao<DigitacionFullMapper>
		implements DigitacionFullDao {

	private static final String CODIGO_ERROR = "-1";
	
	private Map<String, Object> params = new HashMap<String, Object>();

	/**
	 * constructor.
	 */
	public DigitacionFullDaoImpl(final SqlSession sqlSession) {
		super(sqlSession);
	}

	@Override
	public Class<DigitacionFullMapper> getMapperClass() {
		return DigitacionFullMapper.class;
	}

	/*
	 * (non-Javadoc) /* (non-Javadoc)
	 * 
	 * @see cl.bluex.digitacion.dao.Dao#validaEspecieValorada(long,
	 * java.lang.String, long)
	 */
	@Override
	public EspecieValoradaTO validaEspecieValoradaFull(
			final long codigoEmpresa, final String codigoTipoDocumento,
			final long numeroDocumento) throws BluexException {
		params = new HashMap<String, Object>();

		params.put(CODIGO_EMPRESA, codigoEmpresa);
		params.put(CODIGO_TIPO_DOCUMENTO, codigoTipoDocumento);
		params.put(NUMERO_DOCUMENTO, numeroDocumento);
		getMapper().validaEspecieValoradaFull(params);

		this.esExcepcion();

		final Long idEspecieValorada = (Long) params.get(EEVV_NMR_ID);
		final Long codigoCliente = (Long) params.get(CODIGO_CLIENTE);
		final Long sucursalCliente = (Long) params.get(SUCURSAL_CLIENTE);

		final EspecieValoradaTO especie = new EspecieValoradaTO();
		if (idEspecieValorada != null) {
			especie.setEevvNmrId(idEspecieValorada);
		}
		if (codigoCliente != null) {
			especie.setCodigoCliente(codigoCliente);
		}
		if (sucursalCliente != null) {
			especie.setSucursalCliente(sucursalCliente);
		}

		return especie;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.digfull.dao.Dao#insertaOrdenServicio(cl.bluex.digmodel.to.
	 * OrdenServicioTO)
	 */
	@Override
	public void insertaOrdenServicio(final OrdenServicioTO ordenTO)
			throws BluexException {

		params = agregaOrdenServicio(ordenTO);

		getMapper().insertaOrdenServicio(params);

		this.esExcepcion();
	}

	@Override
	public void actualizaOrdenServicio(final OrdenServicioTO ordenTO)
			throws BluexException {

		params = agregaOrdenServicio(ordenTO);

		getMapper().actualizaOrdenServicio(params);

		this.esExcepcion();
	}

	private Map<String, Object> agregaOrdenServicio(
			final OrdenServicioTO ordenTO) throws BluexException {

		final Map<String, Object> parametros = new HashMap<String, Object>();

		validaOrdenServicio(ordenTO);

		parametros.put(EEVV_NMR_ID, ordenTO.getEevvNmrId());
		parametros.put(CODIGO_TIPO_CLASE_TARIFA,
				ordenTO.getCodigoTipoClaseTarifa());
		parametros.put(TIPO_PAGO, ordenTO.getTipoPago());
		parametros.put(TIPO_PAGO_OTROS, ordenTO.getTipoPagoOtros());
		parametros.put(TIPO_MEDIDA, ordenTO.getTipoMedida());
		parametros.put(ID_AGENTE, ordenTO.getIdAgente());
		parametros.put(DV_AGENTE, ordenTO.getDvAgente());
		parametros.put(RGN_ESTADO_AGENTE, ordenTO.getRgnEstadoAgente());
		parametros.put(DIR_COMUNA_AGENTE, ordenTO.getDirComunaAgente());
		parametros.put(DIR_CALLE_AGENTE, ordenTO.getDirCalleAgente());
		parametros.put(DIR_NMR_AGENTE, ordenTO.getDirNmrAgente());
		parametros.put(DIR_BLOCK_AGENTE, ordenTO.getDirBlockAgente());
		parametros.put(DIR_DEPTO_AGENTE, ordenTO.getDirDeptoAgente());
		parametros.put(DIR_PISO_AGENTE, ordenTO.getDirPisoAgente());
		parametros.put(DIRECCION_AGENTE, ordenTO.getDireccionAgente());
		parametros.put(CODIGO_POSTAL_AGENTE, ordenTO.getCodigoPostalAgente());
		parametros.put(PRFJ_FONO_AGENTE, ordenTO.getPrfjFonoAgente());
		parametros.put(FONO_AGENTE, ordenTO.getFonoAgente());
		parametros.put(EXT_FONO_AGENTE, ordenTO.getExtFonoAgente());
		parametros.put(ID_EMBARQUE, ordenTO.getIdEmbarque());
		parametros.put(DV_EMBARQUE, ordenTO.getDvEmbarque());
		parametros.put(NOMBRE_EMBARQUE, ordenTO.getNombreEmbarque());
		parametros.put(DIR_RGN_ESTADO_EMBARQUE,
				ordenTO.getDirRgnEstadoEmbarque());
		parametros.put(DIR_CALLE_EMBARQUE, ordenTO.getDirCalleEmbarque());
		parametros.put(DIR_COMUNA_EMBARQUE, ordenTO.getDirComunaEmbarque());
		parametros.put(DIR_NMR_EMBARQUE, ordenTO.getDirNmrEmbarque());
		parametros.put(DIR_BLOCK_EMBARQUE, ordenTO.getDirBlockEmbarque());
		parametros.put(DIR_PISO_EMBARQUE, ordenTO.getDirPisoEmbarque());
		parametros.put(DIRECCION_EMBARQUE, ordenTO.getDireccionEmbarque());
		parametros.put(CODIGO_POSTAL_EMBARQUE,
				ordenTO.getCodigoPostalEmbarque());
		parametros.put(PRFJ_FONO_EMBARQUE, ordenTO.getPrfjFonoEmbarque());
		parametros.put(FONO_EMBARQUE, ordenTO.getFonoEmbarque());
		parametros.put(EXT_FONO_EMBARQUE, ordenTO.getExtfonoEmbarque());
		parametros.put(ID_DESTINO, ordenTO.getIdDestino());
		parametros.put(DV_DESTINO, ordenTO.getDvDestino());
		parametros
				.put(DIR_RGN_ESTADO_DESTINO, ordenTO.getDirRgnEstadoDestino());
		parametros.put(DIR_COMUNA_DESTINO, ordenTO.getDirComunaDestino());
		parametros.put(DIR_CALLE_DESTINO, ordenTO.getDirCalleDestino());
		parametros.put(DIR_NMR_DESTINO, ordenTO.getDirNmrDestino());
		parametros.put(DIR_BLOCK_DESTINO, ordenTO.getDirBlockDestino());
		parametros.put(DIR_DEPTO_DESTINO, ordenTO.getDirDeptoDestino());
		parametros.put(DIR_PISO_DESTINO, ordenTO.getDirPisoDestino());
		parametros.put(DIRECCION_DESTINO, ordenTO.getDireccionDestino());
		parametros.put(CDG_POSTAL_DESTINO, ordenTO.getCdgPostalDestino());
		parametros.put(PRFJ_FONO_DESTINO, ordenTO.getPrfjFonoDestino());
		parametros.put(FONO_DESTINO, ordenTO.getFonoDestino());
		parametros.put(EXT_FONO_DESTINO, ordenTO.getExtFonoDestino());
		parametros.put(VALOR_DECLARADO, ordenTO.getValorDeclarado());
		parametros.put(VALOR_SEGURO, ordenTO.getValorSeguro());
		parametros.put(VALOR_ADUANA, ordenTO.getValorAduana());
		parametros.put(VALOR_FLETE_PP, ordenTO.getValorFletepp());
		parametros.put(VALOR_FLETE_CC, ordenTO.getValorFletecc());
		parametros.put(VALOR_VALORA_PP, ordenTO.getValorValorapp());
		parametros.put(VALOR_VALORA_CC, ordenTO.getValorValoracc());
		parametros.put(VALOR_GASTO_AGENTE_PP, ordenTO.getValorGastoAgentepp());
		parametros.put(VALOR_GASTO_AGENTE_CC, ordenTO.getValorGastoAgentecc());
		parametros.put(VALOR_GASTOCARRIER_PP, ordenTO.getValorGastoCarrierpp());
		parametros.put(VALOR_GASTOCARRIER_CC, ordenTO.getValorGastoCarriercc());
		parametros.put(VALOR_IMPTO_PP, ordenTO.getValorImptopp());
		parametros.put(VALOR_IMPTO_CC, ordenTO.getValorImptocc());
		parametros.put(VALOR_VARIOS_PP, ordenTO.getValorVariospp());
		parametros.put(VALOR_VARIOS_CC, ordenTO.getValorVarioscc());
		parametros.put(CNT_PIEZAS, ordenTO.getCntPiezas());
		parametros.put(PESO_FISICO, ordenTO.getPesoFisico());
		parametros.put(PESO_VOLUMEN, ordenTO.getPesoVolumen());
		parametros.put(TARIFA, ordenTO.getTarifa());
		parametros.put(DESCRIPCION_PRODUCTO, ordenTO.getDescripcionProducto());
		parametros.put(CODIGO_MONEDA, ordenTO.getCodigoMoneda());
		parametros.put(CODIGO_EMPRESA, ordenTO.getCodigoEmpresa());
		parametros.put(CODIGO_EMPRESA_LAER, ordenTO.getCodigoEmpresaLaer());
		parametros.put(CODIGO_POSTA_DESTINO, ordenTO.getCodigoPostaDestino());
		parametros.put(CODIGO_TIPO_NEG_DESTINO,
				ordenTO.getCodigoTipoNegDestino());
		parametros.put(CODIGO_POSTA_ORIGEN, ordenTO.getCodigoPostaOrigen());
		parametros
				.put(CODIGO_TIPO_NEG_ORIGEN, ordenTO.getCodigoTipoNegOrigen());
		parametros.put(CODIGO_SERVICIO, ordenTO.getCodigoServicio());
		parametros.put(CODIGO_USUARIO, ordenTO.getCodigoUsuario());
		parametros.put(CODIGO_FAMILIA, ordenTO.getCodigoFamilia());
		parametros.put(CODIGO_PRODUCTO, ordenTO.getCodigoProducto());
		parametros.put(DOCT_EEVV_NMR_ID, ordenTO.getDoctEevvNmrId());
		parametros.put(TPCL_CODIGO_AGENTE, ordenTO.getTpclCodigoAgente());
		parametros.put(CLHL_CODIGO_AGENTE, ordenTO.getClhlCodigoAgente());
		parametros.put(CLHL_SUCURSAL_AGENTE, ordenTO.getClhlSucursalAgente());
		parametros.put(TPCL_CODIGO_EMBARQUE, ordenTO.getTpclCodigoEmbarque());
		parametros.put(CLHL_CODIGO_EMBARQUE, ordenTO.getClhlCodigoEmbarque());
		parametros.put(CLHL_SUCURSAL_EMBARQUE,
				ordenTO.getClhlSucursalEmbarque());
		parametros.put(TPCL_CODIGO_DESTINO, ordenTO.getTpclCodigoDestino());
		parametros.put(CLHL_CODIGO_DESTINO, ordenTO.getClhlCodigoDestino());
		parametros.put(CLHL_SUCURSAL_DESTINO, ordenTO.getClhlSucursalDestino());
		parametros.put(NOMBRE_DESTINO, ordenTO.getNombreDestino());
		parametros.put(CODIGO_OSER, ordenTO.getCodigoOser());
		parametros.put(CODIGO_ESTADO, ordenTO.getCodigoEstado());
		parametros.put(CODIGO_OFICINA_DESTINO,
				ordenTO.getCodigoOficinaDestino());
		parametros.put(OBSERVACION, ordenTO.getObservacion());
		parametros.put(TIPO_LLAVE, ordenTO.getTipoLlave());
		parametros.put(LLAVE_TARIFA, ordenTO.getLlaveTarifa());
		parametros.put(CODIGO_CENTRO_COSTO, ordenTO.getCodigoCentroCosto());
		parametros.put(FLAG_FACTURA, ordenTO.getFlagFactura());
		parametros.put(PRODUCTO, ordenTO.getProducto());
		parametros.put(CUSTOM_DUTIES, ordenTO.getCustomDuties());
		parametros.put(CRRN_SEQ_CODIGO, ordenTO.getCrrnSeqCodigo());
		parametros.put(LARGO,ordenTO.getLargo());
		parametros.put(ANCHO,ordenTO.getAncho());
		parametros.put(ALTO,ordenTO.getAlto());
		parametros.put(VOLUMEN_WAREHOUSE,ordenTO.getWhrVolumen());
		parametros.put(CANTIDAD_PIEZAS_WAREHOUSE,ordenTO.getWhrCntPiezas());
		parametros.put(FECHA_CREACION, ordenTO.getFechaCreacion());

		return parametros;
	}

	private void validaOrdenServicio(final OrdenServicioTO ordenTO)
			throws BluexException {
		if (ordenTO.getCodigoTipoClaseTarifa() != null
				&& ordenTO.getCodigoTipoClaseTarifa().length() > 25) {
			throw new BluexException(CODIGO_ERROR,
					"el campo codigoTipoClaseTarifa es muy largo ");
		}
		if (ordenTO.getTipoPago() != null && ordenTO.getTipoPago().length() > 2) {
			throw new BluexException(CODIGO_ERROR,
					"el campo tipoPago es muy largo ");
		}
		if (ordenTO.getTipoPagoOtros() != null
				&& ordenTO.getTipoPagoOtros().length() > 2) {
			throw new BluexException(CODIGO_ERROR,
					"el campo tipoPagoOtros es muy largo");
		}
		if (ordenTO.getTipoMedida() != null
				&& ordenTO.getTipoMedida().length() > 2) {
			throw new BluexException(CODIGO_ERROR,
					"el campo tipoMedida es muy largo ");
		}
		if (ordenTO.getIdAgente() != null
				&& ordenTO.getIdAgente().length() > 20) {
			throw new BluexException(CODIGO_ERROR,
					"el campo idAgente es muy largo ");
		}
		if (ordenTO.getDvAgente() != null && ordenTO.getDvAgente().length() > 2) {
			throw new BluexException(CODIGO_ERROR,
					"el campo dvAgente es muy largo ");
		}
		if (ordenTO.getRgnEstadoAgente() != null
				&& ordenTO.getRgnEstadoAgente().length() > 20) {
			throw new BluexException(CODIGO_ERROR,
					"el campo rgnEstadoAgente es muy largo ");
		}
		if (ordenTO.getDirComunaAgente() != null
				&& ordenTO.getDirComunaAgente().length() > 20) {
			throw new BluexException(CODIGO_ERROR,
					"el campo dirComunaAgente es muy largo ");
		}
		if (ordenTO.getDirCalleAgente() != null
				&& ordenTO.getDirCalleAgente().length() > 20) {
			throw new BluexException(CODIGO_ERROR,
					"el campo dirCalleAgente es muy largo ");
		}
		if (ordenTO.getDirNmrAgente() != null
				&& ordenTO.getDirNmrAgente().toString().length() > 6) {
			throw new BluexException(CODIGO_ERROR,
					"el campo dirNmrAgente es muy largo ");
		}
		if (ordenTO.getDirBlockAgente() != null
				&& ordenTO.getDirBlockAgente().length() > 6) {
			throw new BluexException(CODIGO_ERROR,
					"el campo dirBlockAgente es muy largo ");
		}
		if (ordenTO.getDirDeptoAgente() != null
				&& ordenTO.getDirDeptoAgente().length() > 6) {
			throw new BluexException(CODIGO_ERROR,
					"el campo dirDeptoAgente es muy largo ");
		}
		if (ordenTO.getDirPisoAgente() != null
				&& ordenTO.getDirPisoAgente().toString().length() > 3) {
			throw new BluexException(CODIGO_ERROR,
					"el campo dirPisoAgente es muy largo ");
		}
		if (ordenTO.getDireccionAgente() != null
				&& ordenTO.getDireccionAgente().length() > 80) {
			throw new BluexException(CODIGO_ERROR,
					"el campo direccionAgente es muy largo ");
		}
		if (ordenTO.getCodigoPostalAgente() != null
				&& ordenTO.getCodigoPostalAgente().length() > 8) {
			throw new BluexException(CODIGO_ERROR,
					"el campo codigoPostalAgente es muy largo ");
		}
		if (ordenTO.getPrfjFonoAgente() != null
				&& ordenTO.getPrfjFonoAgente().length() > 3) {
			throw new BluexException(CODIGO_ERROR,
					"el campo prfjFonoAgente es muy largo ");
		}
		if (ordenTO.getFonoAgente() != null
				&& ordenTO.getFonoAgente().length() > 20) {
			throw new BluexException(CODIGO_ERROR,
					"el campo fonoAgente es muy largo ");
		}
		if (ordenTO.getExtFonoAgente() != null
				&& ordenTO.getExtFonoAgente().length() > 5) {
			throw new BluexException(CODIGO_ERROR,
					"el campo extFonoAgente es muy largo ");
		}
		if (ordenTO.getIdEmbarque() != null
				&& ordenTO.getIdEmbarque().length() > 20) {
			throw new BluexException(CODIGO_ERROR,
					"el campo idEmbarque es muy largo ");
		}
		if (ordenTO.getDvEmbarque() != null
				&& ordenTO.getDvEmbarque().length() > 2) {
			throw new BluexException(CODIGO_ERROR,
					"el campo dvEmbarque es muy largo ");
		}
		if (ordenTO.getNombreEmbarque() != null
				&& ordenTO.getNombreEmbarque().length() > 50) {
			throw new BluexException(CODIGO_ERROR,
					"el campo nombreEmbarque es muy largo ");
		}
		if (ordenTO.getDirRgnEstadoEmbarque() != null
				&& ordenTO.getDirRgnEstadoEmbarque().length() > 20) {
			throw new BluexException(CODIGO_ERROR,
					"el campo dirRgnEstadoEmbarque es muy largo ");
		}
		if (ordenTO.getDirCalleEmbarque() != null
				&& ordenTO.getDirCalleEmbarque().length() > 20) {
			throw new BluexException(CODIGO_ERROR,
					"el campo dirCalleEmbarque es muy largo ");
		}
		if (ordenTO.getDirComunaEmbarque() != null
				&& ordenTO.getDirComunaEmbarque().length() > 20) {
			throw new BluexException(CODIGO_ERROR,
					"el campo dirComunaEmbarque es muy largo ");
		}
		if (String.valueOf(ordenTO.getDirNmrEmbarque()).length() > 6) {
			throw new BluexException(CODIGO_ERROR,
					"el campo dirNmrEmbarque es muy largo ");
		}
		if (ordenTO.getDirBlockEmbarque() != null
				&& ordenTO.getDirBlockEmbarque().length() > 6) {
			throw new BluexException(CODIGO_ERROR,
					"el campo dirBlockEmbarque es muy largo ");
		}
		if (ordenTO.getDirPisoEmbarque() != null
				&& ordenTO.getDirPisoEmbarque().toString().length() > 3) {
			throw new BluexException(CODIGO_ERROR,
					"el campo dirPisoEmbarque es muy largo ");
		}
		if (ordenTO.getDireccionEmbarque() != null
				&& ordenTO.getDireccionEmbarque().length() > 80) {
			throw new BluexException(CODIGO_ERROR,
					"el campo direccionEmbarque es muy largo ");
		}
		if (ordenTO.getCodigoPostalEmbarque() != null
				&& ordenTO.getCodigoPostalEmbarque().length() > 8) {
			throw new BluexException(CODIGO_ERROR,
					"el campo codigoPostalEmbarque es muy largo ");
		}
		if (ordenTO.getPrfjFonoEmbarque() != null
				&& ordenTO.getPrfjFonoEmbarque().length() > 3) {
			throw new BluexException(CODIGO_ERROR,
					"el campo prfjFonoEmbarque es muy largo ");
		}
		if (ordenTO.getFonoEmbarque() != null
				&& ordenTO.getFonoEmbarque().length() > 20) {
			throw new BluexException(CODIGO_ERROR,
					"el campo fonoEmbarque es muy largo ");
		}
		if (ordenTO.getExtfonoEmbarque() != null
				&& ordenTO.getExtfonoEmbarque().length() > 5) {
			throw new BluexException(CODIGO_ERROR,
					"el campo extfonoEmbarque es muy largo ");
		}
		if (ordenTO.getIdDestino() != null
				&& ordenTO.getIdDestino().length() > 20) {
			throw new BluexException(CODIGO_ERROR,
					"el campo idDestino es muy largo ");
		}
		if (ordenTO.getDvDestino() != null
				&& ordenTO.getDvDestino().length() > 2) {
			throw new BluexException(CODIGO_ERROR,
					"el campo dvDestino es muy largo ");
		}
		if (ordenTO.getDirRgnEstadoDestino() != null
				&& ordenTO.getDirRgnEstadoDestino().length() > 20) {
			throw new BluexException(CODIGO_ERROR,
					"el campo dirRgnEstadoDestino es muy largo ");
		}
		if (ordenTO.getDirComunaDestino() != null
				&& ordenTO.getDirComunaDestino().length() > 20) {
			throw new BluexException(CODIGO_ERROR,
					"el campo dirComunaDestino es muy largo ");
		}
		if (ordenTO.getDirCalleDestino() != null
				&& ordenTO.getDirCalleDestino().length() > 20) {
			throw new BluexException(CODIGO_ERROR,
					"el campo dirCalleDestino es muy largo ");
		}
		if (String.valueOf(ordenTO.getDirNmrDestino()).length() > 6) {
			throw new BluexException(CODIGO_ERROR,
					"el campo dirNmrDestino es muy largo ");
		}
		if (ordenTO.getDirBlockDestino() != null
				&& ordenTO.getDirBlockDestino().length() > 66) {
			throw new BluexException(CODIGO_ERROR,
					"el campo dirBlockDestino es muy largo ");
		}
		if (ordenTO.getDirDeptoDestino() != null
				&& ordenTO.getDirDeptoDestino().length() > 6) {
			throw new BluexException(CODIGO_ERROR,
					"el campo dirDeptoDestino es muy largo ");
		}
		if (ordenTO.getDirPisoDestino() != null
				&& ordenTO.getDirPisoDestino().toString().length() > 3) {
			throw new BluexException(CODIGO_ERROR,
					"el campo dirPisoDestino es muy largo ");
		}
		if (ordenTO.getDireccionDestino() != null
				&& ordenTO.getDireccionDestino().length() > 80) {
			throw new BluexException(CODIGO_ERROR,
					"el campo direccionDestino es muy largo ");
		}
		if (ordenTO.getCdgPostalDestino() != null
				&& ordenTO.getCdgPostalDestino().length() > 8) {
			throw new BluexException(CODIGO_ERROR,
					"el campo cdgPostalDestino es muy largo ");
		}
		if (ordenTO.getPrfjFonoDestino() != null
				&& ordenTO.getPrfjFonoDestino().length() > 3) {
			throw new BluexException(CODIGO_ERROR,
					"el campo prfjFonoDestino es muy largo ");
		}
		if (ordenTO.getFonoDestino() != null
				&& ordenTO.getFonoDestino().length() > 20) {
			throw new BluexException(CODIGO_ERROR,
					"el campo fonoDestino es muy largo ");
		}
		if (ordenTO.getExtFonoDestino() != null
				&& ordenTO.getExtFonoDestino().length() > 5) {
			throw new BluexException(CODIGO_ERROR,
					"el campo extFonoDestino es muy largo ");
		}
		if (ordenTO.getDescripcionProducto() != null
				&& ordenTO.getDescripcionProducto().length() > 256) {
			throw new BluexException(CODIGO_ERROR,
					"el campo descripcionProducto es muy largo ");
		}
		if (ordenTO.getCodigoMoneda() != null
				&& ordenTO.getCodigoMoneda().length() > 5) {
			throw new BluexException(CODIGO_ERROR,
					"el campo codigoMoneda es muy largo ");
		}
		if (String.valueOf(ordenTO.getCodigoEmpresa()).length() > 4) {
			throw new BluexException(CODIGO_ERROR,
					"el campo codigoEmpresa es muy largo ");
		}
		if (String.valueOf(ordenTO.getCodigoEmpresaLaer()).length() > 4) {
			throw new BluexException(CODIGO_ERROR,
					"el campo codigoEmpresaLaer es muy largo ");
		}
		if (ordenTO.getCodigoPostaDestino() != null
				&& ordenTO.getCodigoPostaDestino().length() > 5) {
			throw new BluexException(CODIGO_ERROR,
					"el campo codigoPostaDestino es muy largo ");
		}
		if (String.valueOf(ordenTO.getCodigoTipoNegDestino()).length() > 2) {
			throw new BluexException(CODIGO_ERROR,
					"el campo codigoTipoNegDestino es muy largo ");
		}
		if (ordenTO.getCodigoPostaOrigen() != null
				&& ordenTO.getCodigoPostaOrigen().length() > 5) {
			throw new BluexException(CODIGO_ERROR,
					"el campo codigoPostaOrigen es muy largo ");
		}
		if (String.valueOf(ordenTO.getCodigoTipoNegOrigen()).length() > 2) {
			throw new BluexException(CODIGO_ERROR,
					"el campo codigoTipoNegOrigen es muy largo ");
		}
		if (ordenTO.getCodigoServicio() != null
				&& ordenTO.getCodigoServicio().length() > 2) {
			throw new BluexException(CODIGO_ERROR,
					"el campo codigoServicio es muy largo ");
		}
		if (ordenTO.getCodigoUsuario() != null
				&& ordenTO.getCodigoUsuario().length() > 20) {
			throw new BluexException(CODIGO_ERROR,
					"el campo codigoUsuario es muy largo ");
		}
		if (ordenTO.getCodigoFamilia() != null
				&& ordenTO.getCodigoFamilia().length() > 5) {
			throw new BluexException(CODIGO_ERROR,
					"el campo codigoFamilia es muy largo ");
		}
		if (ordenTO.getCodigoProducto() != null
				&& ordenTO.getCodigoProducto().length() > 10) {
			throw new BluexException(CODIGO_ERROR,
					"el campo codigoProducto es muy largo ");
		}
		if (String.valueOf(ordenTO.getDoctEevvNmrId()).length() > 38) {
			throw new BluexException(CODIGO_ERROR,
					"el campo doctEevvNmrId es muy largo ");
		}
		if (String.valueOf(ordenTO.getTpclCodigoAgente()).length() > 3) {
			throw new BluexException(CODIGO_ERROR,
					"el campo tpclCodigoAgente es muy largo ");
		}
		if (String.valueOf(ordenTO.getClhlCodigoAgente()).length() > 9) {
			throw new BluexException(CODIGO_ERROR,
					"el campo clhlCodigoAgente es muy largo ");
		}
		if (String.valueOf(ordenTO.getClhlSucursalAgente()).length() > 5) {
			throw new BluexException(CODIGO_ERROR,
					"el campo clhlSucursalAgente es muy largo ");
		}
		if (String.valueOf(ordenTO.getTpclCodigoEmbarque()).length() > 3) {
			throw new BluexException(CODIGO_ERROR,
					"el campo tpclCodigoEmbarque es muy largo ");
		}
		if (String.valueOf(ordenTO.getClhlCodigoEmbarque()).length() > 9) {
			throw new BluexException(CODIGO_ERROR,
					"el campo clhlCodigoEmbarque es muy largo ");
		}
		if (String.valueOf(ordenTO.getClhlSucursalEmbarque()).length() > 5) {
			throw new BluexException(CODIGO_ERROR,
					"el campo clhlSucursalEmbarque es muy largo ");
		}
		if (String.valueOf(ordenTO.getTpclCodigoDestino()).length() > 3) {
			throw new BluexException(CODIGO_ERROR,
					"el campo tpclCodigoDestino es muy largo ");
		}
		if (String.valueOf(ordenTO.getClhlCodigoDestino()).length() > 9) {
			throw new BluexException(CODIGO_ERROR,
					"el campo clhlCodigoDestino es muy largo ");
		}
		if (String.valueOf(ordenTO.getClhlSucursalDestino()).length() > 5) {
			throw new BluexException(CODIGO_ERROR,
					"el campo clhlSucursalDestino es muy largo ");
		}
		if (ordenTO.getNombreDestino() != null
				&& ordenTO.getNombreDestino().length() > 50) {
			throw new BluexException(CODIGO_ERROR,
					"el campo nombreDestino es muy largo ");
		}
		if (ordenTO.getCodigoEstado() != null
				&& ordenTO.getCodigoEstado().length() > 2) {
			throw new BluexException(CODIGO_ERROR,
					"el campo codigoEstado es muy largo ");
		}
		if (ordenTO.getCodigoOficinaDestino() != null
				&& ordenTO.getCodigoOficinaDestino().length() > 5) {
			throw new BluexException(CODIGO_ERROR,
					"el campo codigoOficinaDestino es muy largo ");
		}
		if (ordenTO.getObservacion() != null
				&& ordenTO.getObservacion().length() > 500) {
			throw new BluexException(CODIGO_ERROR,
					"el campo observacion es muy largo ");
		}
		if (ordenTO.getTipoLlave() != null
				&& ordenTO.getTipoLlave().length() > 1) {
			throw new BluexException(CODIGO_ERROR,
					"el campo tipoLlave es muy largo ");
		}
		if (ordenTO.getLlaveTarifa() != null
				&& ordenTO.getLlaveTarifa().length() > 25) {
			throw new BluexException(CODIGO_ERROR,
					"el campo llaveTarifa es muy largo ");
		}
		if (ordenTO.getCodigoCentroCosto() != null
				&& ordenTO.getCodigoCentroCosto().length() > 15) {
			throw new BluexException(CODIGO_ERROR,
					"el campo codigoCentroCosto es muy largo ");
		}
		if (ordenTO.getFlagFactura() != null
				&& ordenTO.getFlagFactura().length() > 1) {
			throw new BluexException(CODIGO_ERROR,
					"el campo flagFactura es muy largo ");
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.digfull.dao.Dao#validaIndicadorPtoEntrega(long, long, long,
	 * java.util.Date)
	 */
	@Override
	public String validaIndicadorPtoEntrega(final long codigoCliente,
			final long sucursalCliente, final long tipoCliente,
			final Date fechaCreacionOser) throws BluexException {
		params = new HashMap<String, Object>();
		params.put(CODIGO_CLIENTE, codigoCliente);
		params.put(SUCURSAL_CLIENTE, sucursalCliente);
		params.put(TIPO_CLIENTE, tipoCliente);
		params.put(FECHA_CREACION_OSER, fechaCreacionOser);

		getMapper().validaIndicadorPtoEntrega(params);

		this.esExcepcion();

		return (String) params.get(RESULTADO);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.digfull.dao.Dao#validaTipoCliente(long, long, long, long)
	 */
	@Override
	public TipoClienteTO validaTipoCliente(final long codigoCliente,
			final long sucursalCliente, final long tipoCliente,
			final long codigoEmpresa) throws BluexException {
		params = new HashMap<String, Object>();
		params.put(CODIGO_CLIENTE, codigoCliente);
		params.put(SUCURSAL_CLIENTE, sucursalCliente);
		params.put(TIPO_CLIENTE, tipoCliente);
		params.put(CODIGO_EMPRESA, codigoEmpresa);

		getMapper().validaTipoCliente(params);

		this.esExcepcion();

		final TipoClienteTO valueTO = new TipoClienteTO();
		valueTO.setDescripcion((String) params.get(DESCRIPCION));
		valueTO.setTipoEstado((Long) params.get(TIPO_ESTADO));

		return valueTO;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.digfull.dao.Dao#obtieneDatosCliente(long, long, long, long)
	 */
	@Override
	public DatosClienteTO obtieneDatosCliente(final long codigoCliente,
			final long sucursalCliente, final long tipoCliente,
			final long codigoEmpresa) throws BluexException {
		params = new HashMap<String, Object>();
		params.put(CODIGO_CLIENTE, codigoCliente);
		params.put(SUCURSAL_CLIENTE, sucursalCliente);
		params.put(TIPO_CLIENTE, tipoCliente);
		params.put(CODIGO_EMPRESA, codigoEmpresa);

		getMapper().obtieneDatosCliente(params);

		this.esExcepcion();

		final DatosClienteTO valueTO = new DatosClienteTO();
		valueTO.setRut(Util.validaLong((Long) params.get(RUT)));
		valueTO.setDigitoVerificador((String) params.get(DIGITO_VERIFICADOR));
		valueTO.setNombre((String) params.get(NOMBRE));
		valueTO.setCodigoRegion((String) params.get(CODIGO_REGION));
		valueTO.setCiudad((String) params.get(CIUDAD));
		valueTO.setCalle((String) params.get(CALLE));
		valueTO.setCodigoComuna(Util.validaLong((Long) params.get(CODIGO_COMUNA)));
		valueTO.setComuna((String) params.get(COMUNA));
		valueTO.setNumero(Util.validaLong((Long) params.get(NUMERO)));
		valueTO.setDepto((String) params.get(DEPTO));
		valueTO.setBlock((String) params.get(BLOCK));
		valueTO.setPiso(Util.validaLong((Long) params.get(PISO)));
		valueTO.setDireccion((String) params.get(DIRECCION));
		valueTO.setCodigoPostal((String) params.get(CODIGO_POSTAL));
		valueTO.setPrefijoFono((String) params.get(PREFIJO_FONO));
		valueTO.setFono((String) params.get(FONO));
		valueTO.setExtensionFono((String) params.get(EXTENSION_FONO));
		valueTO.setSwtValorado(Util.validaLong((Long) params.get(SWT_VALORADO)));
		valueTO.setSwtCtaGratis((String) params.get(SWT_CTA_GRATIS));

		return valueTO;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cl.bluex.digfull.dao.Dao#insertaReferencia(cl.bluex.digmodel.to.ReferenciaTO
	 * )
	 */
	@Override
	public void insertaReferencia(final ReferenciaTO valueTO)
			throws BluexException {
		params = new HashMap<String, Object>();
		params.put(EEVV_NMR_ID, valueTO.getEevvNmrid());
		params.put(CODIGO_TIPO_REFERENCIA, valueTO.getCodigoTipoReferencia());

		getMapper().insertaReferencia(params);

		this.esExcepcion();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cl.bluex.digfull.dao.Dao#insertaServicioComplementario(cl.bluex.digmodel
	 * .to.ServicioComplementarioTO)
	 */
	@Override
	public void insertaServicioComplementario(final ServicioComplementarioTO to)
			throws BluexException {
		params = new HashMap<String, Object>();
		params.put(CODIGO_SERVICIO, to.getCodigoServicio());
		params.put(EEVV_NMR_ID, to.getEevvNmrid());
		params.put(NUMERO_RESERVA, to.getNroReserva());
		params.put(RENDIDA, to.getRendida());
		params.put(SW_BASICO, to.getSwBasico());

		getMapper().insertaServicioComplementario(params);

		this.esExcepcion();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.digfull.dao.Dao#insertaDetalleSC(cl.bluex.digmodel.to.
	 * ServicioComplementarioDetalleTO)
	 */
	@Override
	public void insertaDetalleSC(final ServicioComplementarioDetalleTO to)
			throws BluexException {
		params = agregaDetalleSC(to);
		getMapper().insertaDetalleSC(params);

		this.esExcepcion();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cl.bluex.digfull.DigitacionFullDao#actualizaDetalleSC(cl.bluex.digmodel
	 * .to.ServicioComplementarioDetalleTO)
	 */
	@Override
	public void actualizaDetalleSC(final ServicioComplementarioDetalleTO to)
			throws BluexException {
		params = agregaDetalleSC(to);
		getMapper().actualizaDetalleSC(params);

		this.esExcepcion();
	}

	private Map<String, Object> agregaDetalleSC(
			final ServicioComplementarioDetalleTO to) {
		final Map<String, Object> parametros = new HashMap<String, Object>();
		parametros.put(EEVV_NMR_ID, to.getEevvNmrid());
		parametros.put(CODIGO_SERVICIO, to.getCodigoServicio());
		parametros.put(ID_DOCUMENTO, to.getIdDocumento());
		parametros.put(TIPO_DOCUMENTO_SERVICIO, to.getTipoDocumentoServicio());
		parametros.put(CODIGO_EMPRESA, to.getCodigoEmpresa());

		return parametros;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.digfull.dao.Dao#insertaFormaPagoSC(cl.bluex.digmodel.to.
	 * ServicioComplementarioPagoTO)
	 */
	@Override
	public void insertaFormaPagoSC(final ServicioComplementarioPagoTO to)
			throws BluexException {
		params = agregaFormaPagoSC(to);
		getMapper().insertaFormaPagoSC(params);

		this.esExcepcion();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.digfull.DigitacionFullDao#actualizaFormaPagoSC(
	 * cl.bluex.digmodel.to.ServicioComplementarioPagoTO)
	 */
	@Override
	public void actualizaFormaPagoSC(final ServicioComplementarioPagoTO to)
			throws BluexException {
		params = agregaFormaPagoSC(to);
		getMapper().actualizaFormaPagoSC(params);

		this.esExcepcion();
	}

	private Map<String, Object> agregaFormaPagoSC(
			final ServicioComplementarioPagoTO to) throws BluexException {
		final Map<String, Object> parametros = new HashMap<String, Object>();
		parametros.put(EEVV_NMR_ID, to.getEevvNmrId());
		parametros.put(CODIGO_SERVICIO, to.getCodigoServicio());
		parametros.put(NUMERO_LINEA, to.getNumeroLinea());
		parametros.put(ID_DOCUMENTO, to.getIdDocumento());
		parametros.put(TIPO_PAGO, to.getTipoPago());
		parametros.put(TIPO_DOCUMENTO_SERVICIO, to.getTipoDocumentoServicio());
		parametros.put(MONTO, to.getMonto());
		parametros.put(SERIE_DOCUMENTO, to.getSerieDocumento());
		parametros.put(BANCO, to.getBanco());
		
		final Date parse = UtilFecha.formatearFecha(to.getFechaPago(), Constante.FECHA_DD_MM_YYY_HH_MM);
		
		parametros.put(FECHA_PAGO, parse);
		parametros.put(ID_DIAS_PAGO, to.getIdDiasPago());

		return parametros;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.digfull.dao.Dao#obtieneParametroGeneral(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public String obtieneParametroGeneral(final String idParametro,
			final String nombreCampo) throws BluexException {
		params = new HashMap<String, Object>();

		params.put(ID_PARAMETRO, idParametro);
		params.put(NOMBRE_PARAMETRO, nombreCampo);

		getMapper().obtieneParametroGeneral(params);

		this.esExcepcion();

		return (String) params.get(VALOR);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.digfull.dao.Dao#obtieneTarifa(cl.bluex.digmodel.to.
	 * EntradaObtieneTarifaTO)
	 */
	@Override
	public TarifaTO obtieneTarifa(final EntradaObtieneTarifaTO to)
			throws BluexException {
		params = new HashMap<String, Object>();

		params.put(CODIGO_EMPRESA, to.getCodigoEmpresa());
		params.put(CODIGO_SERVICIO, to.getCodigoServicio());
		params.put(CODIGO_PRODUCTO, to.getCodigoProducto());
		params.put(CODIGO_FAMILIA, to.getCodigoFamilia());
		params.put(CODIGO_CLIENTE, to.getCodigoCliente());
		params.put(CODIGO_SUCURSAL_CLIENTE, to.getCodigoSucursalCliente());
		params.put(CODIGO_TIPO_CLIENTE, to.getCodigoTipoCliente());
		params.put(CODIGO_POSTA_ORIGEN, to.getCodigoPostaOrigen());
		params.put(CODIGO_POSTA_DESTINO, to.getCodigoPostaDestino());
		params.put(CODIGO_MONEDA, to.getCodigoMoneda());
		params.put(PESO_VOLUMEN, to.getPesovolumen());
		params.put(PESO_FISICO, to.getPesofisico());

		Date parse = null;
		try {
			final Date fecha = to.getFecha();
			if (fecha != null) {
				final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				final String format = sdf.format(fecha);
				parse = sdf.parse(format);
			}
		} catch (final ParseException e) {
			throw new BluexException(CODIGO_ERROR,
					"Formato de fecha incorrecto");
		}

		params.put(FECHA, parse);
		params.put(CANTIDAD_PIEZAS, to.getCantidadPiezas());
		params.put(VALOR_APENDICE, to.getValorApendice());

		getMapper().obtieneTarifa(params);

		final TarifaTO tarifaTO = new TarifaTO();
		tarifaTO.setTarifa(Util.validaDouble((Double) params.get(TARIFA)));
		tarifaTO.setFlete(Util.validaDouble((Double) params.get(FLETE)));
		tarifaTO.setCodigoMetodoCalculo((String) params.get(CODIGO_METODO_CALCULO));
		tarifaTO.setUnidadBase((String) params.get(UNIDAD_BASE));
		tarifaTO.setIndicadorUsaRi((String) params.get(INDICADOR_USUARIO_RI));
		tarifaTO.setIndicadorUnidades((String) params.get(INDICADOR_UNIDADES));
		tarifaTO.setCargoPorcentual(Util.validaLong((Long) params.get(CARGO_PORCENTUAL)));
		tarifaTO.setCargoFijo((Long) params.get(CARGO_FIJO));
		tarifaTO.setNumeroAcuerdo(Util.validaLong((Long) params.get(NUMERO_ACUERDO)));
		tarifaTO.setUsaPuntoEntrega((String) params.get(USA_PUNTO_ENTREGA));
		tarifaTO.setSwActivacion((String) params.get(SW_ACTIVACION));
		tarifaTO.setImpuesto((String) params.get(IMPUESTO));

		this.esExcepcion();

		return tarifaTO;
	}

	@Override
	public OrdenServicioTO obtieneOrdenServicio(final long codigoEmpresa,
			final String codigoTipoDocumento, final long numeroDocumento) throws BluexException {
		params = new HashMap<String, Object>();

		params.put(CODIGO_EMPRESA, codigoEmpresa);
		params.put(CODIGO_TIPO_DOCUMENTO, codigoTipoDocumento);
		params.put(NUMERO_DOCUMENTO, numeroDocumento);

		getMapper().obtieneOrdenServicio(params);

		final OrdenServicioTO to = new OrdenServicioTO();
		to.setEevvNmrId(Util.validaLong((Long) params.get(EEVV_NMR_ID)));
		to.setCodigoTipoClaseTarifa((String) params.get(CODIGO_TIPO_CLASE_TARIFA));
		to.setTipoPago((String) params.get(TIPO_PAGO));
		to.setTipoPagoOtros((String) params.get(TIPO_PAGO_OTROS));
		to.setTipoMedida((String) params.get(TIPO_MEDIDA));
		to.setIdAgente((String) params.get(ID_AGENTE));
		to.setDvAgente((String) params.get(DV_AGENTE));
		to.setRgnEstadoAgente((String) params.get(RGN_ESTADO_AGENTE));
		to.setDirComunaAgente((String) params.get(DIR_COMUNA_AGENTE));
		to.setDirCalleAgente((String) params.get(DIR_CALLE_AGENTE));
		to.setDirNmrAgente(Util.validaInteger((Integer) params.get(DIR_NMR_AGENTE)));
		to.setDirBlockAgente((String) params.get(DIR_BLOCK_AGENTE));
		to.setDirDeptoAgente((String) params.get(DIR_DEPTO_AGENTE));
		to.setDirPisoAgente(Util.validaInteger((Integer) params.get(DIR_PISO_AGENTE)));
		to.setDireccionAgente((String) params.get(DIRECCION_AGENTE));
		to.setCodigoPostalAgente((String) params.get(CODIGO_POSTAL_AGENTE));
		to.setPrfjFonoAgente((String) params.get(PRFJ_FONO_AGENTE));
		to.setFonoAgente((String) params.get(FONO_AGENTE));
		to.setExtFonoAgente((String) params.get(EXT_FONO_AGENTE));
		to.setIdEmbarque((String) params.get(ID_EMBARQUE));
		to.setDvEmbarque((String) params.get(DV_EMBARQUE));
		to.setNombreEmbarque((String) params.get(NOMBRE_EMBARQUE));
		to.setDirRgnEstadoEmbarque((String) params.get(DIR_RGN_ESTADO_EMBARQUE));
		to.setDirCalleEmbarque((String) params.get(DIR_CALLE_EMBARQUE));
		to.setDirComunaEmbarque((String) params.get(DIR_COMUNA_EMBARQUE));
		to.setDirNmrEmbarque(Util.validaLong((Long) params.get(DIR_NMR_EMBARQUE)));
		to.setDirBlockEmbarque((String) params.get(DIR_BLOCK_EMBARQUE));
		to.setDirPisoEmbarque(Util.validaInteger((Integer) params.get(DIR_PISO_EMBARQUE)));
		to.setDireccionEmbarque((String) params.get(DIRECCION_EMBARQUE));
		to.setCodigoPostalEmbarque((String) params.get(CODIGO_POSTAL_EMBARQUE));
		to.setPrfjFonoEmbarque((String) params.get(PRFJ_FONO_EMBARQUE));
		to.setFonoEmbarque((String) params.get(FONO_EMBARQUE));
		to.setExtfonoEmbarque((String) params.get(EXT_FONO_EMBARQUE));
		to.setIdDestino((String) params.get(ID_DESTINO));
		to.setDvDestino((String) params.get(DV_DESTINO));
		to.setDirRgnEstadoDestino((String) params.get(DIR_RGN_ESTADO_DESTINO));
		to.setDirComunaDestino((String) params.get(DIR_COMUNA_DESTINO));
		to.setDirCalleDestino((String) params.get(DIR_CALLE_DESTINO));
		to.setDirNmrDestino(Util.validaLong((Long) params.get(DIR_NMR_DESTINO)));
		to.setDirBlockDestino((String) params.get(DIR_BLOCK_DESTINO));
		to.setDirDeptoDestino((String) params.get(DIR_DEPTO_DESTINO));
		to.setDirPisoDestino(Util.validaInteger((Integer) params.get(DIR_PISO_DESTINO)));
		to.setDireccionDestino((String) params.get(DIRECCION_DESTINO));
		to.setCdgPostalDestino((String) params.get(CDG_POSTAL_DESTINO));
		to.setPrfjFonoDestino((String) params.get(PRFJ_FONO_DESTINO));
		to.setFonoDestino((String) params.get(FONO_DESTINO));
		to.setExtFonoDestino((String) params.get(EXT_FONO_DESTINO));
		to.setValorDeclarado(Util.validaDouble((Double) params.get(VALOR_DECLARADO)));
		to.setValorSeguro(Util.validaDouble((Double) params.get(VALOR_SEGURO)));
		to.setValorAduana(Util.validaDouble((Double) params.get(VALOR_ADUANA)));
		to.setValorFletepp(Util.validaDouble((Double) params.get(VALOR_FLETE_PP)));
		to.setValorFletecc(Util.validaDouble((Double) params.get(VALOR_FLETE_CC)));
		to.setValorValorapp(Util.validaDouble((Double) params.get(VALOR_VALORA_PP)));
		to.setValorValoracc(Util.validaDouble((Double) params.get(VALOR_VALORA_CC)));
		to.setValorGastoAgentepp(Util.validaDouble((Double) params.get(VALOR_GASTO_AGENTE_PP)));
		to.setValorGastoAgentecc(Util.validaDouble((Double) params.get(VALOR_GASTO_AGENTE_CC)));
		to.setValorGastoCarrierpp(Util.validaDouble((Double) params.get(VALOR_GASTOCARRIER_PP)));
		to.setValorGastoCarriercc(Util.validaDouble((Double) params.get(VALOR_GASTOCARRIER_CC)));
		to.setValorImptopp(Util.validaDouble((Double) params.get(VALOR_IMPTO_PP)));
		to.setValorImptocc(Util.validaDouble((Double) params.get(VALOR_IMPTO_CC)));
		to.setValorVariospp(Util.validaDouble((Double) params.get(VALOR_VARIOS_PP)));
		to.setValorVarioscc(Util.validaDouble((Double) params.get(VALOR_VARIOS_CC)));
		to.setCntPiezas(Util.validaLong((Long) params.get(CNT_PIEZAS)));
		to.setPesoFisico(Util.validaDouble((Double) params.get(PESO_FISICO)));
		to.setPesoVolumen(Util.validaDouble((Double) params.get(PESO_VOLUMEN)));
		to.setTarifa(Util.validaDouble((Double) params.get(TARIFA)));
		to.setDescripcionProducto((String) params.get(DESCRIPCION_PRODUCTO));
		to.setCodigoMoneda((String) params.get(CODIGO_MONEDA));
		to.setCodigoEmpresa(Util.validaLong((Long) params.get(CODIGO_EMPRESA)));
		to.setCodigoEmpresaLaer(Util.validaLong((Long) params.get(CODIGO_EMPRESA_LAER)));
		to.setCodigoPostaDestino((String) params.get(CODIGO_POSTA_DESTINO));
		to.setCodigoTipoNegDestino(Util.validaLong((Long) params.get(CODIGO_TIPO_NEG_DESTINO)));
		to.setCodigoPostaOrigen((String) params.get(CODIGO_POSTA_ORIGEN));
		to.setCodigoTipoNegOrigen(Util.validaLong((Long) params.get(CODIGO_TIPO_NEG_ORIGEN)));
		to.setCodigoServicio((String) params.get(CODIGO_SERVICIO));
		to.setCodigoUsuario((String) params.get(CODIGO_USUARIO));
		to.setCodigoFamilia((String) params.get(CODIGO_FAMILIA));
		to.setCodigoProducto((String) params.get(CODIGO_PRODUCTO));
		to.setDoctEevvNmrId(Util.validaLong((Long) params.get(DOCT_EEVV_NMR_ID)));
		to.setTpclCodigoAgente(Util.validaLong((Long) params.get(TPCL_CODIGO_AGENTE)));
		to.setClhlCodigoAgente(Util.validaLong((Long) params.get(CLHL_CODIGO_AGENTE)));
		to.setClhlSucursalAgente(Util.validaLong((Long) params.get(CLHL_SUCURSAL_AGENTE)));
		to.setTpclCodigoEmbarque(Util.validaLong((Long) params.get(TPCL_CODIGO_EMBARQUE)));
		to.setClhlCodigoEmbarque(Util.validaLong((Long) params.get(CLHL_CODIGO_EMBARQUE)));
		to.setClhlSucursalEmbarque(Util.validaLong((Long) params.get(CLHL_SUCURSAL_EMBARQUE)));
		to.setTpclCodigoDestino(Util.validaLong((Long) params.get(TPCL_CODIGO_DESTINO)));
		to.setClhlCodigoDestino(Util.validaLong((Long) params.get(CLHL_CODIGO_DESTINO)));
		to.setClhlSucursalDestino(Util.validaLong((Long) params.get(CLHL_SUCURSAL_DESTINO)));
		to.setNombreDestino((String) params.get(NOMBRE_DESTINO));
		to.setCodigoOser(Util.validaLong((Long) params.get(CODIGO_OSER)));
		to.setCodigoEstado((String) params.get(CODIGO_ESTADO));
		to.setCodigoOficinaDestino((String) params.get(CODIGO_OFICINA_DESTINO));
		to.setObservacion((String) params.get(OBSERVACION));
		to.setTipoLlave((String) params.get(TIPO_LLAVE));
		to.setLlaveTarifa((String) params.get(LLAVE_TARIFA));
		to.setCodigoCentroCosto((String) params.get(CODIGO_CENTRO_COSTO));
		to.setFlagFactura((String) params.get(FLAG_FACTURA));
		to.setProducto(Util.validaLong((Long) params.get(PRODUCTO)));
		to.setCustomDuties(Util.validaLong((Long) params.get(CUSTOM_DUTIES)));
		to.setCrrnSeqCodigo(Util.validaLong((Long) params.get(CRRN_SEQ_CODIGO)));
		to.setFechaCreacion((String) params.get(FECHA_CREACION));
		to.setNumeroWhr(Util.validaLong((Long) params.get(NUMERO_WAREHOUSE)));
		to.setLargo(Util.validaDouble((Double) params.get(LARGO)));
		to.setAncho(Util.validaDouble((Double) params.get(ANCHO)));
		to.setAlto(Util.validaDouble((Double) params.get(ALTO)));
		to.setWhrVolumen(Util.validaDouble((Double) params.get(VOLUMEN_WAREHOUSE)));
		to.setWhrCntPiezas(Util.validaLong((Long) params.get(CANTIDAD_PIEZAS_WAREHOUSE)));
		to.setCodigoRegion(Util.validaInteger((Integer) params.get(CODIGO_REGION)));
		to.setCodigoServicioTraducido((String) params.get(CODIGO_SERVICIO_TRADUCIDO));
		to.setUnidadValor((Integer) params.get(UNIDAD_VALOR));
		to.setUnidadDescripcion((String) params.get(UNIDAD_DESCRIPCION));
		to.setCubicado(Util.validaInteger((Integer) params.get(CUBICADO)));

		return to;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cl.bluex.digfull.DigitacionFullDao#obtieneServiciosComplementarios(long)
	 */
	@Override
	public List<ServicioComplementarioTO> obtieneServiciosComplementarios(
			final long eevvNmrId) throws BluexException {
		params = new HashMap<String, Object>();

		params.put(EEVV_NMR_ID, eevvNmrId);

		getMapper().obtieneServiciosComplementarios(params);

		this.esExcepcion();

		@SuppressWarnings(UNCHECKED)
		final List<ServicioComplementarioTO> servicios = (List<ServicioComplementarioTO>) params
				.get(RESULTADO);
		return servicios;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.digfull.DigitacionFullDao#obtieneDetalleSC(long,
	 * java.lang.String)
	 */
	@Override
	public List<ServicioComplementarioDetalleTO> obtieneDetalleSC(
			final long eevvNmrId, final String codigoServicio)
			throws BluexException {
		params = new HashMap<String, Object>();

		params.put(EEVV_NMR_ID, eevvNmrId);
		params.put(CODIGO_SERVICIO, codigoServicio);

		getMapper().obtieneDetalleSC(params);

		this.esExcepcion();

		@SuppressWarnings(UNCHECKED)
		final List<ServicioComplementarioDetalleTO> detalles = (List<ServicioComplementarioDetalleTO>) params
				.get(RESULTADO);
		return detalles;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.digfull.DigitacionFullDao#obtieneFormaPagoSC(long,
	 * java.lang.String)
	 */
	@Override
	public List<ServicioComplementarioPagoTO> obtieneFormaPagoSC(
			final long eevvNmrId, 
			final String codigoServicio)
			throws BluexException {
		params = new HashMap<String, Object>();

		params.put(EEVV_NMR_ID, eevvNmrId);
		params.put(CODIGO_SERVICIO, codigoServicio);

		getMapper().obtieneFormaPagoSC(params);

		this.esExcepcion();

		@SuppressWarnings(UNCHECKED)
		final List<ServicioComplementarioPagoTO> pagos = (List<ServicioComplementarioPagoTO>) params
				.get(RESULTADO);

		return pagos;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.digfull.DigitacionFullDao#obtieneReferencias(long)
	 */
	@Override
	public List<ReferenciaTO> obtieneReferencias(final long eevvNmrId)
			throws BluexException {
		params = new HashMap<String, Object>();

		params.put(EEVV_NMR_ID, eevvNmrId);

		getMapper().obtieneReferencias(params);

		this.esExcepcion();

		@SuppressWarnings(UNCHECKED)
		final List<ReferenciaTO> referencias = (List<ReferenciaTO>) params
				.get(RESULTADO);

		return referencias;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cl.bluex.digfull.DigitacionFullDao#eliminaServicioComplementario(long,
	 * java.lang.String)
	 */
	@Override
	public void eliminaServicioComplementario(final long eevvNmrId,
			final String codigoServicio) throws BluexException {
		params = new HashMap<String, Object>();

		params.put(EEVV_NMR_ID, eevvNmrId);
		params.put(CODIGO_SERVICIO, codigoServicio);

		getMapper().eliminaServicioComplementario(params);

		this.esExcepcion();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.digfull.DigitacionFullDao#eliminaReferencia(long,
	 * java.lang.String)
	 */
	@Override
	public void eliminaReferencia(final long eevvNmrId,
			final String codigoTipoReferencia) throws BluexException {
		params = new HashMap<String, Object>();

		params.put(EEVV_NMR_ID, eevvNmrId);
		params.put(CODIGO_TIPO_REFERENCIA, codigoTipoReferencia);

		getMapper().eliminaReferencia(params);

		this.esExcepcion();
	}

	@Override
	public void eliminaDetalleSC(final long codigoEmpresa,
			final String codigoServicio, final long eevvNmrid)
			throws BluexException {
		params = new HashMap<String, Object>();

		params.put(EEVV_NMR_ID, eevvNmrid);
		params.put(CODIGO_SERVICIO, codigoServicio);
		params.put(CODIGO_EMPRESA, codigoEmpresa);

		getMapper().eliminaDetalleSC(params);

		this.esExcepcion();

	}

	@Override
	public void eliminaFormaPagoSC(final long eevvNmrId,
			final String codigoServicio) throws BluexException {
		params = new HashMap<String, Object>();

		params.put(EEVV_NMR_ID, eevvNmrId);
		params.put(CODIGO_SERVICIO, codigoServicio);

		getMapper().eliminaFormaPagoSC(params);

		this.esExcepcion();
	}

	@Override
	public String obtieneTraduccionServicioReal(final long codigoEmpresa,
			final String codigoServicio, final String codigoProducto,
			final long codigoRegion) throws BluexException {
		params = new HashMap<String, Object>();

		params.put(CODIGO_EMPRESA, codigoEmpresa);
		params.put(CODIGO_SERVICIO, codigoServicio);
		params.put(CODIGO_PRODUCTO, codigoProducto);
		params.put(CODIGO_REGION, codigoRegion);

		getMapper().obtieneTraduccionServicioReal(params);

		this.esExcepcion();

		return (String) params.get(RESULTADO);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.digfull.DigitacionFullDao#obtieneTraduccionServicio(
	 * java.lang.String, java.lang.String, long)
	 */
	@Override
	public String obtieneTraduccionServicio(final long codigoEmpresa,
			final String codigoServicioReal, final long codigoRegion)
			throws BluexException {
		params = new HashMap<String, Object>();

		params.put(CODIGO_EMPRESA, codigoEmpresa);
		params.put(CODIGO_SERVICIO_REAL, codigoServicioReal);
		params.put(CODIGO_REGION, codigoRegion);

		getMapper().obtieneTraduccionServicio(params);

		this.esExcepcion();

		return (String) params.get(RESULTADO);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.digfull.DigitacionFullDao#insertaApendices(long, long,
	 * long, java.lang.String)
	 */
	@Override
	public void insertaApendices(final long eevvNmrId,
			final long codigoTipoApendice, final long valor,
			final String descripcion) throws BluexException {
		params = new HashMap<String, Object>();

		params.put(EEVV_NMR_ID, eevvNmrId);
		params.put(CODIGO_TIPO_APENDICE, codigoTipoApendice);
		params.put(VALOR, valor);
		params.put(DESCRIPCION, descripcion);

		getMapper().insertaApendices(params);

		this.esExcepcion();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.bluex.digfull.DigitacionFullDao#validaIndicadorUnidades(long,
	 * long, long, java.util.Date)
	 */
	@Override
	public String validaIndicadorUnidades(final long codigoCliente,
			final long sucursalCliente, final long tipoCliente,
			final Date fechaCreacionOser) throws BluexException {
		params = new HashMap<String, Object>();

		params.put(CODIGO_CLIENTE, codigoCliente);
		params.put(SUCURSAL_CLIENTE, sucursalCliente);
		params.put(TIPO_CLIENTE, tipoCliente);
		params.put(FECHA_CREACION_OSER, fechaCreacionOser);

		getMapper().validaIndicadorUnidades(params);

		this.esExcepcion();

		return (String) params.get(RESULTADO);
	}
	
	/* (non-Javadoc)
	 * @see cl.bluex.digfull.DigitacionFullDao#insertaWrh(cl.bluex.digmodel.to.WareHouseTO)
	 */
	@Override
	public void insertaWarehouse(final WareHouseTO warehouseTO) throws BluexException {
		params = new HashMap<String, Object>();
		
		params.put(CODIGO_TIPO_WAREHOUSE, warehouseTO.getCodigoTipoWarehouse());
		params.put(EEVV_NMR_ID, warehouseTO.getEevvNmrid());
		params.put(NOMBRE_EMBARQUE, warehouseTO.getNombreEmbarque());
		params.put(NOMBRE_DESTINO, warehouseTO.getNombreDestino());
		params.put(TIPO_MEDIDA, warehouseTO.getTipoMedida());
		params.put(CNT_PIEZAS, warehouseTO.getCntPiezas());
		params.put(PESO_FISICO, warehouseTO.getPesoFisico());
		params.put(PESO_VOLUMEN, warehouseTO.getPesoVolumen());
		params.put(CODIGO_USUARIO, warehouseTO.getCodigoUsuario());
		params.put(TPCL_CODIGO_EMBARQUE, warehouseTO.getTpclCodigoEmbarque());
		params.put(CLHL_CODIGO_EMBARQUE, warehouseTO.getClhlCodigoEmbarque());
		params.put(CLHL_SUCURSAL_EMBARQUE, warehouseTO.getClhlSucursalEmbarque());
		params.put(CODIGO_EMPRESA, warehouseTO.getCodigoEmpresa());
		params.put(CODIGO_EMPRESA_LAER, warehouseTO.getCodigoEmpresaLaer());
		params.put(CODIGO_FAMILIA, warehouseTO.getCodigoFamilia());
		params.put(CODIGO_PRODUCTO, warehouseTO.getCodigoProducto());
		params.put(CODIGO_SERVICIO, warehouseTO.getCodigoServicio());
		params.put(DV_EMBARQUE, warehouseTO.getDvEmbarque());
		params.put(ID_EMBARQUE, warehouseTO.getIdEmbarque());
		params.put(OBSERVACIONES, warehouseTO.getObservaciones());
		params.put(LARGO, warehouseTO.getLargo());
		params.put(ANCHO, warehouseTO.getAncho());
		params.put(ALTO, warehouseTO.getAlto());
		
		getMapper().insertaWarehouse(params);

		this.esExcepcion();
		
	}

	private void esExcepcion() throws BluexException {
		final Integer codError = (Integer) params.get(COD_ERROR);
		final String descError = (String) params.get(DESC_ERROR);

		if (codError != 0) {
			throw new BluexException(codError.toString(), descError);
		}
	}

	

}
