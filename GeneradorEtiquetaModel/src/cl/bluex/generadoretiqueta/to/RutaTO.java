/**
 * 
 */
package cl.bluex.generadoretiqueta.to;

import java.io.Serializable;

/**
 * @author rmoscoso
 *
 */
public class RutaTO implements Serializable {

	private static final long serialVersionUID = 2729130559598140952L;
	
	private int codigo;
	private String patente;
	private int numeroOdometro;
	
	/**
	 *  Constructor de la clase
	 */
	public RutaTO() {
		super();
	}

	/**
	 * @param codigo
	 * @param patente
	 * @param numeroOdometro
	 */
	public RutaTO(int codigo, String patente, int numeroOdometro) {
		super();
		this.codigo = codigo;
		this.patente = patente;
		this.numeroOdometro = numeroOdometro;
	}

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the patente
	 */
	public String getPatente() {
		return patente;
	}

	/**
	 * @param patente the patente to set
	 */
	public void setPatente(String patente) {
		this.patente = patente;
	}

	/**
	 * @return the numeroOdometro
	 */
	public int getNumeroOdometro() {
		return numeroOdometro;
	}

	/**
	 * @param numeroOdometro the numeroOdometro to set
	 */
	public void setNumeroOdometro(int numeroOdometro) {
		this.numeroOdometro = numeroOdometro;
	}

}
