package cl.bluex.listas.bean;

import cl.bluex.digmodel.to.CentroCostoTO;


/**
 * Almacena datos del centro de costo.
 * 
 * @author Edgardo Herrera
 *
 */
public class CentroCosto {
	private String centroCosto;

	/**
	 * crea instancia de CentroCosto
	 *
	 */
	public CentroCosto() {
		super();
	}

	/**
	 * crea instancia de CentroCosto
	 *
	 * @param centroCostoTO
	 */
	public CentroCosto(final CentroCostoTO centroCostoTO) {
		if (centroCostoTO != null) {
			this.centroCosto = centroCostoTO.getCentroCosto();
		}
	}

	/**
	 * @return the centroCosto
	 */
	public String getCentroCosto() {
		return centroCosto;
	}

	/**
	 * @param centroCosto the centroCosto to set
	 */
	public void setCentroCosto(final String centroCosto) {
		this.centroCosto = centroCosto;
	}

}
