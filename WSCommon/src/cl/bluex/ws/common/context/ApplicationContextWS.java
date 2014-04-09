package cl.bluex.ws.common.context;

import java.io.Serializable;

final class ApplicationContextWS extends ApplicationContext implements
		Serializable {

	private static ApplicationContextWS applicationContext = new ApplicationContextWS();
	private static final long serialVersionUID = -136899278729899332L;

	private ApplicationContextWS() {
		super();
		setNameContext("Web Service Context");
	}

	public static ApplicationContext getCurrentInstance() {
		synchronized (ApplicationContextWS.class) {
			return applicationContext;
		}
	}

}
