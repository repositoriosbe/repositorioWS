package cl.bluex.digfull.bean.request;

import java.util.Date;

/**
 * @author Edgardo Herrera
 *
 */
public class RequestValidaIndicadorUnidades {
	private long codigoCliente;
	private long sucursalCliente;
	private long tipoCliente;
	private Date fechaCreacionOser;
	
	/**
	 * Crea instancia de {@link RequestValidaIndicadorUnidades}.
	 *
	 */
	public RequestValidaIndicadorUnidades() {
		super();
	}

	/**
	 * @return the codigoCliente
	 */
	public long getCodigoCliente() {
		return codigoCliente;
	}

	/**
	 * @param codigoCliente the codigoCliente to set
	 */
	public void setCodigoCliente(final long codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	/**
	 * @return the sucursalCliente
	 */
	public long getSucursalCliente() {
		return sucursalCliente;
	}

	/**
	 * @param sucursalCliente the sucursalCliente to set
	 */
	public void setSucursalCliente(final long sucursalCliente) {
		this.sucursalCliente = sucursalCliente;
	}

	/**
	 * @return the tipoCliente
	 */
	public long getTipoCliente() {
		return tipoCliente;
	}

	/**
	 * @param tipoCliente the tipoCliente to set
	 */
	public void setTipoCliente(final long tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	/**
	 * @return the fechaCreacionOser
	 */
	public Date getFechaCreacionOser() {
		return fechaCreacionOser;
	}

	/**
	 * @param fechaCreacionOser the fechaCreacionOser to set
	 */
	public void setFechaCreacionOser(final Date fechaCreacionOser) {
		this.fechaCreacionOser = fechaCreacionOser;
	}
	
}
