/**
 * 
 */
package cl.bluex.listas.bean.request;

/**
 * @author eherrera
 *
 */
public class RequestObtieneTraduccionEmpresas {
	private long codigo;
	private long codigoUsuario;
	private long codigoAplicacion;
	private long codigoSistema;
	
	/**
	 * crea instancia de RequestObtieneTraduccionEmpresas
	 *
	 */
	public RequestObtieneTraduccionEmpresas() {
		super();
	}

	/**
	 * @return the codigo
	 */
	public long getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(final long codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the codigoUsuario
	 */
	public long getCodigoUsuario() {
		return codigoUsuario;
	}

	/**
	 * @param codigoUsuario the codigoUsuario to set
	 */
	public void setCodigoUsuario(final long codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	/**
	 * @return the codigoAplicacion
	 */
	public long getCodigoAplicacion() {
		return codigoAplicacion;
	}

	/**
	 * @param codigoAplicacion the codigoAplicacion to set
	 */
	public void setCodigoAplicacion(final long codigoAplicacion) {
		this.codigoAplicacion = codigoAplicacion;
	}

	/**
	 * @return the codigoSistema
	 */
	public long getCodigoSistema() {
		return codigoSistema;
	}

	/**
	 * @param codigoSistema the codigoSistema to set
	 */
	public void setCodigoSistema(final long codigoSistema) {
		this.codigoSistema = codigoSistema;
	}
	
}
