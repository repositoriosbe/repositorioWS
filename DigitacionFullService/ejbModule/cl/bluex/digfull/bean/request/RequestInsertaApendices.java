package cl.bluex.digfull.bean.request;

/**
 * @author Edgardo Herrera
 *
 */
public class RequestInsertaApendices {
	private long eevvNmrId;
	private long codigoTipoApendice;
	private long valor;
	private String descripcion;
	
	/**
	 * Crea instancia de {@link RequestInsertaApendices}.
	 *
	 */
	public RequestInsertaApendices() {
		super();
	}

	/**
	 * @return the eevvNmrId
	 */
	public long getEevvNmrId() {
		return eevvNmrId;
	}

	/**
	 * @param eevvNmrId the eevvNmrId to set
	 */
	public void setEevvNmrId(final long eevvNmrId) {
		this.eevvNmrId = eevvNmrId;
	}

	/**
	 * @return the codigoTipoApendice
	 */
	public long getCodigoTipoApendice() {
		return codigoTipoApendice;
	}

	/**
	 * @param codigoTipoApendice the codigoTipoApendice to set
	 */
	public void setCodigoTipoApendice(final long codigoTipoApendice) {
		this.codigoTipoApendice = codigoTipoApendice;
	}

	/**
	 * @return the valor
	 */
	public long getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(final long valor) {
		this.valor = valor;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(final String descripcion) {
		this.descripcion = descripcion;
	}
	
}
