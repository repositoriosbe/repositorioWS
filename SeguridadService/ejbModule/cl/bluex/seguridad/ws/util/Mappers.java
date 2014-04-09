package cl.bluex.seguridad.ws.util;

import java.util.ArrayList;
import java.util.List;

import cl.bluex.seguridad.bean.Rol;
import cl.bluex.seguridad.to.RolTO;

/**
 * @author eherrera
 *
 */
public class Mappers {
	/**
	 * crea instancia de Mappers
	 *
	 */
	public Mappers() {
		super();
	}
	
	/**
	 * Mapea {@link RolTO} a {@link Rol}.
	 * 
	 * @param to 
	 * @return
	 */
	public static Rol mapperTO(final RolTO to) {
		final Rol bean = new Rol();
		
		bean.setCodigo(to.getCodigo());
		bean.setDescripcion(to.getDescripcion());
		
		return bean;
	}

	/**
	 * @param rolesTO
	 * @return
	 */
	public static List<Rol> mapperRolesTO(final List<RolTO> tos) {
		final List<Rol> beans = new ArrayList<Rol>();
		for (final RolTO to : tos) {
			beans.add(new Rol(to));
		}
		return beans;
	}
}
