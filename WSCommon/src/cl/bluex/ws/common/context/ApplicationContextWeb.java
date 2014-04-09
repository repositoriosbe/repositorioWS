package cl.bluex.ws.common.context;

import java.io.Serializable;

import javax.faces.context.FacesContext;

import cl.bluex.ws.common.property.Key;

/**
 * Application Context, Implementación para JSF 2.0
 * 
 * @author Sebastián Navia
 * 
 */
final class ApplicationContextWeb extends ApplicationContext implements
		Serializable {

	private static final long serialVersionUID = -136899278729899332L;

	private ApplicationContextWeb() {
		super();
	}

	@SuppressWarnings("unchecked")
	public static ApplicationContext getCurrentInstance() {
		synchronized (ApplicationContextWeb.class) {
			ApplicationContextWeb applicationContext = (ApplicationContextWeb) FacesContext
					.getCurrentInstance().getExternalContext().getSessionMap()
					.get(ApplicationContextWeb.class.getName());
			if (applicationContext == null) {
				applicationContext = new ApplicationContextWeb();
				final String nameContext = FacesContext.getCurrentInstance()
						.getExternalContext()
						.getInitParameter(Key.CONTEXT_NAME.getKey());

				applicationContext.setNameContext(nameContext);
				applicationContext.getPropertyManager().addProperties(
						FacesContext.getCurrentInstance().getExternalContext()
								.getInitParameterMap());
				FacesContext
						.getCurrentInstance()
						.getExternalContext()
						.getSessionMap()
						.put(ApplicationContextWeb.class.getName(),
								applicationContext);
			}
			return applicationContext;
		}
	}

}
