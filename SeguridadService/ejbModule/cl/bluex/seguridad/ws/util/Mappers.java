package cl.bluex.seguridad.ws.util;

import java.util.ArrayList;
import java.util.List;

import cl.bluex.seguridad.bean.NewDatosUsuario;
import cl.bluex.seguridad.bean.Rol;
import cl.bluex.seguridad.to.Autenticacion;
import cl.bluex.seguridad.to.NewDatosUsuarioTO;
import cl.bluex.seguridad.to.NewUsuarioTO;
import cl.bluex.seguridad.to.RolTO;

/**
 * The Class Mappers.
 *
 * @author eherrera
 */
public class Mappers {
	
	/**
	 * crea instancia de Mappers.
	 */
	public Mappers() {
		super();
	}
	
	/**
	 * Mapea {@link RolTO} a {@link Rol}.
	 *
	 * @param to the to
	 * @return the rol
	 */
	public static Rol mapperTO(final RolTO to) {
		final Rol bean = new Rol();
		
		bean.setCodigo(to.getCodigo());
		bean.setDescripcion(to.getDescripcion());
		
		return bean;
	}

	/**
	 * Mapper roles to.
	 *
	 * @param tos the tos
	 * @return the list
	 */
	public static List<Rol> mapperRolesTO(final List<RolTO> tos) {
		final List<Rol> beans = new ArrayList<Rol>();
		for (final RolTO to : tos) {
			beans.add(new Rol(to));
		}
		return beans;
	}
	
	
	/**
	 * Mapea t oentrada.
	 *
	 * @param bean the bean
	 * @return the new usuario to
	 */
	public static NewUsuarioTO mapeaTOentrada(
			final Autenticacion bean) {
		
		
		final NewUsuarioTO to = new NewUsuarioTO();
		
		to.setPassword(bean.getPassword());
		to.setUsername(bean.getUsername());
		to.setToken(bean.getToken());
		
		return to;
	}

	
	/**
	 * Mapea t osalida.
	 *
	 * @param tos the tos
	 * @return the list
	 */
	public static NewDatosUsuario mapeaTOsalida(
			final NewDatosUsuarioTO to) {
		
		final NewDatosUsuario bean = new NewDatosUsuario();
		
		bean.setCantidadSesiones(to.getCantidadSesiones());
		bean.setCodigoUsuario(to.getCodigoUsuario());
		bean.setCodTipoUsuario(to.getCodTipoUsuario());
		bean.setFechaFinVigente(to.getFechaFinVigente());
		bean.setFechaInicioVigente(to.getFechaFinVigente());
		bean.setListaEmpresaPais(to.getListaEmpresaPais());
		bean.setToken(to.getToken());
		bean.setUrlFoto(to.getUrlFoto());
		bean.setUsername(to.getUsername());
		
		return bean;
	}
	
}
