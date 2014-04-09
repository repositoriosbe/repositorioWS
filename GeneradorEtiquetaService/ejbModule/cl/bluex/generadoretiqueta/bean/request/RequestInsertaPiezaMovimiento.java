/**
 * 
 */
package cl.bluex.generadoretiqueta.bean.request;

import cl.bluex.generadoretiqueta.bean.PiezaMovimiento;

/**
 * @author rmoscoso
 *
 */
public class RequestInsertaPiezaMovimiento {

	private PiezaMovimiento piezaMovimiento;

	/**
	 *  constructor de la clase
	 */
	public RequestInsertaPiezaMovimiento() {
		super();
	}

	/**
	 * Crea instancia de {@link RequestInsertaPiezaMovimiento}.
	 * 
	 * @param piezaMovimiento
	 */
	public RequestInsertaPiezaMovimiento(PiezaMovimiento piezaMovimiento) {
		this.piezaMovimiento = piezaMovimiento;
	}

	/**
	 * @return the piezaMovimiento
	 */
	public PiezaMovimiento getPiezaMovimiento() {
		return piezaMovimiento;
	}

	/**
	 * @param piezaMovimiento the piezaMovimiento to set
	 */
	public void setPiezaMovimiento(PiezaMovimiento piezaMovimiento) {
		this.piezaMovimiento = piezaMovimiento;
	}
	
	
	
}
