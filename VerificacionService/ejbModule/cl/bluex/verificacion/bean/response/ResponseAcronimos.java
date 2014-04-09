package cl.bluex.verificacion.bean.response;

import java.util.List;

import cl.bluex.verificacion.bean.Acronimo;

/**
 * @author eherrera
 *
 */
public class ResponseAcronimos {
	private List<Acronimo> acronimos;
	
	/**
	 * crea instancia de ResponseAcronimos
	 *
	 */
	public ResponseAcronimos() {
		super();
	}
	
	/**
	 * crea instancia de ResponseAcronimos
	 *
	 * @param acronimos
	 */
	public ResponseAcronimos(final List<Acronimo> acronimos) {
		super();
		this.acronimos = acronimos;
	}
	

	/**
	 * @return the acronimos
	 */
	public List<Acronimo> getAcronimos() {
		return acronimos;
	}

	/**
	 * @param acronimos the acronimos to set
	 */
	public void setAcronimos(final List<Acronimo> acronimos) {
		this.acronimos = acronimos;
	}
	
}
