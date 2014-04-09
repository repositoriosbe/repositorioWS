package cl.bluex.tracking.ws.session;

import javax.ejb.Stateless;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

import cl.bluex.seguridad.SeguridadDao;
import cl.bluex.seguridad.factory.DaoFactory;
import cl.bluex.seguridad.factory.SeguridadDaoFactory;
import cl.bluex.seguridad.to.UsuarioTo;
import cl.bluex.ws.common.exceptions.BluexException;
import cl.bluex.ws.common.head.Cabecera;

/**
 * @author Edgardo Herrera
 * 
 */
@Stateless
public class SessionInterceptor {

	/**
	 * Crea instancia de {@link SessionInterceptor}.
	 * 
	 */
	public SessionInterceptor() {
		super();
	}

	
	/**
	 * @param context
	 * @return objeto de validacion sesion
	 * @throws Exception
	 */
	@AroundInvoke
	public Object validarSesion(final InvocationContext context)
			throws Exception {
		isValidaSesion(context);
		return context.proceed();
	}

	/**
	 * @param context
	 * @throws BluexException
	 */
	public void isValidaSesion(final InvocationContext context)
			throws BluexException {
		
		final Object[] parametros = context.getParameters();
		final Cabecera cabecera = casteaCabecera(parametros);
		
		final UsuarioTo usuario;
		
		final DaoFactory daoFactory = SeguridadDaoFactory.getInstance().getDaoFactory();
		final SeguridadDao seguridadDao = daoFactory.getSeguridadDao();
		
		try {
			usuario = seguridadDao.obtenerUsuario(cabecera.getToken());
		} finally {
			daoFactory.close();
		}
		if (!"0".equals(usuario.getCodError())) {
			throw new BluexException(usuario.getCodError(),
					usuario.getDescError());
		}
	}

	private Cabecera casteaCabecera(final Object[] parametros)
			throws BluexException {
		for (final Object object : parametros) {
			if (object instanceof Cabecera) {
				return (Cabecera) object;
			}
		}
		throw new BluexException(
				"Architecture: HeaderRequest is required at Web Services Parameters");
	}
}
