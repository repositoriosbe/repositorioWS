package cl.bluex.digmodel.to;

import java.io.Serializable;

/**
 * Almacena datos del centro de costo.
 * 
 * @author Edgardo Herrera
 *
 */
public class CentroCostoTO implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -5239192190817610961L;
    private String centroCosto;
    
    /**
     * crea instancia de {@link CentroCostoTO}.
     */
    public CentroCostoTO() {
	super();
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
