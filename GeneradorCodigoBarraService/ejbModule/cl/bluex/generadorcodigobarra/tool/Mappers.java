package cl.bluex.generadorcodigobarra.tool;

import java.util.ArrayList;
import java.util.List;

import cl.bluex.generadorcodigobarra.bean.CodigoBarraL28;
import cl.bluex.generadorcodigobarra.bean.ParametroCodigoBarraL28;
import cl.bluex.generadorcodigobarramodel.to.CodigoBarraL28TO;
import cl.bluex.generadorcodigobarramodel.to.ParametroCodigoBarraL28TO;


/**
 * Mapeos de objetos.
 * 
 * @author Edgardo Herrera
 * 
 */
public final class Mappers {
	
	private Mappers() {
		super();
	}

	
	/**
	 * Mapea de {@link ParametroCodigoBarraL28} a {@link ParametroCodigoBarraL28TO}.
	 * 
	 * @param bean {@link ParametroCodigoBarraL28}
	 * @return {@link ParametroCodigoBarraL28TO}
	 */
	public static ParametroCodigoBarraL28TO mapeaTO(
			final ParametroCodigoBarraL28 bean) {
		final ParametroCodigoBarraL28TO to = new ParametroCodigoBarraL28TO();
		to.setCodigoEmpresa(bean.getCodigoEmpresa());
		to.setCodigoCliente(bean.getCodigoCliente());
		to.setCodigoSucursal(bean.getCodigoSucursal());
		to.setCodigoTipoCliente(bean.getCodigoTipoCliente());
		to.setNumeroSerie(bean.getNumeroSerie());
		to.setNumeroPiezas(bean.getNumeroPiezas());
		to.setTipoServicio(bean.getTipoServicio());
		to.setTipoProducto(bean.getTipoProducto());
		to.setCodigoPosta(bean.getCodigoPosta());
		to.setTipoDocumento(bean.getTipoDocumento());
		to.setTipoNegocio(bean.getTipoNegocio());
		to.setCodigoEmpresaDocumento(bean.getCodigoEmpresaDocumento());
		 
		 return to;
	}


	/**
	 * Metodo que mapea una lista de {@link CodigoBarraL28TO} a una de {@link CodigoBarraL28}.
	 * 
	 * @param tos lista de {@link CodigoBarraL28TO}
	 * @return lista de {@link CodigoBarraL28}
	 */
	public static List<CodigoBarraL28> mapeaCodigosBarraL28(
			final List<CodigoBarraL28TO> tos) {
		final List<CodigoBarraL28> beans = new ArrayList<CodigoBarraL28>();
		
		for(final CodigoBarraL28TO to : tos) {
			beans.add(new CodigoBarraL28(to));
		}
		return beans;
	}

}
