package cl.bluex.generadorcodigobarra.ws;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import org.apache.log4j.Logger;
import org.jboss.ws.api.annotation.WebContext;

import cl.bluex.generadorcodigobarra.GeneradorCodigoBarraDao;
import cl.bluex.generadorcodigobarra.bean.CodigoBarraL28;
import cl.bluex.generadorcodigobarra.bean.ParametroCodigoBarraL28;
import cl.bluex.generadorcodigobarra.bean.request.RequestCodigoBarraL28;
import cl.bluex.generadorcodigobarra.bean.response.ResponseCodigoBarraL28;
import cl.bluex.generadorcodigobarra.factory.DaoFactory;
import cl.bluex.generadorcodigobarra.factory.GeneradorCodigoBarraDaoFactory;
import cl.bluex.generadorcodigobarra.tool.Mappers;
import cl.bluex.generadorcodigobarra.ws.session.SessionInterceptor;
import cl.bluex.generadorcodigobarramodel.to.CodigoBarraL28TO;
import cl.bluex.generadorcodigobarramodel.to.ParametroCodigoBarraL28TO;
import cl.bluex.ws.common.exceptions.BluexException;
import cl.bluex.ws.common.head.Cabecera;
import cl.bluex.ws.common.util.Util;

/**
 * @author Edgardo Herrera
 * 
 */
@WebService(
	endpointInterface = "cl.bluex.generadorcodigobarra.ws.GeneradorCodigoBarraService",
	name = "BXGCB001_generadorCodigoBarra",
	portName = "BXGCB001_generadorCodigoBarraPort",
	serviceName = "GeneradorCodigoBarraService",
	targetNamespace = "http://GeneradorCodigoBarraWS/BXGCB001_generadorCodigoBarra/GeneradorCodigoBarraPortType")
@SOAPBinding(
	parameterStyle = SOAPBinding.ParameterStyle.WRAPPED,
	style = SOAPBinding.Style.DOCUMENT,
	use = SOAPBinding.Use.ENCODED)
@Remote(GeneradorCodigoBarraService.class)
@Stateless
@WebContext(
	contextRoot = "/GeneradorCodigoBarraWS",
	urlPattern = "/BXGCB001_generadorCodigoBarra")
@Interceptors(SessionInterceptor.class)
public class GeneradorCodigoBarraServiceImpl implements GeneradorCodigoBarraService {
	private static final Logger LOGGER = Logger.getLogger(GeneradorCodigoBarraServiceImpl.class);

	/**
	 * Crea instancia de {@link GeneradorCodigoBarraServiceImpl}.
	 * 
	 */
	public GeneradorCodigoBarraServiceImpl() {
		super();
	}

	/* (non-Javadoc)
	 * @see cl.bluex.generadorcodigobarra.ws.GeneradorCodigoBarraService#obtieneCodigoBarraL28(cl.bluex.generadorcodigobarra.bean.request.RequestCodigoBarraL28, cl.bluex.ws.common.head.Cabecera)
	 */
	@Override
	public ResponseCodigoBarraL28 obtieneCodigoBarraL28(
			final RequestCodigoBarraL28 request,
			final Cabecera cabecera) 
			throws BluexException {
		LOGGER.info("inicio obtieneCodigoBarraL28");
		ResponseCodigoBarraL28 response;
		
		final ParametroCodigoBarraL28 parametro = request.getParametro();
		this.validacion(parametro);
		
		final DaoFactory daoFactory = GeneradorCodigoBarraDaoFactory.getInstance().getDaoFactory();
		final GeneradorCodigoBarraDao generadorDao = daoFactory.getGeneradorCodigoBarraDao();
		try {
			final ParametroCodigoBarraL28TO to = Mappers.mapeaTO(parametro);
			final List<CodigoBarraL28TO> codigosBarraTO = generadorDao.obtieneCodigoBarraL28(to);
			final List<CodigoBarraL28> codigosBarra = Mappers.mapeaCodigosBarraL28(codigosBarraTO);
			
			response = new ResponseCodigoBarraL28(codigosBarra);
		} finally {
			daoFactory.close();
		}
		
		LOGGER.info("fin obtieneCodigoBarraL28");
		return response;
	}

	/**
	 * @param parametro
	 * @throws BluexException
	 */
	private void validacion(final ParametroCodigoBarraL28 parametro)
			throws BluexException {
		
		Util.validaObligatorio(parametro.getCodigoEmpresa(), "codigoEmpresa");
		Util.validaObligatorio(parametro.getCodigoCliente(), "codigoCliente");
		Util.validaObligatorio(parametro.getCodigoSucursal(), "codigoSucursal");
		Util.validaObligatorio(parametro.getCodigoTipoCliente(), "codigoTipoCliente");
		Util.validaObligatorio(parametro.getNumeroSerie(), "numeroSerie");
		Util.validaObligatorio(parametro.getNumeroPiezas(), "numeroPiezas");
		Util.validaObligatorio(parametro.getTipoServicio(), "tipoServicio");
		Util.validaObligatorio(parametro.getTipoProducto(), "tipoProducto");
		Util.validaObligatorio(parametro.getCodigoPosta(), "codigoPostaa");
		Util.validaObligatorio(parametro.getTipoDocumento(), "tipoDocumento");
		Util.validaObligatorio(parametro.getTipoNegocio(), "tipoNegocio");
		Util.validaObligatorio(parametro.getTipoNegocio(), "tipoNegocio");
		
	}
}
