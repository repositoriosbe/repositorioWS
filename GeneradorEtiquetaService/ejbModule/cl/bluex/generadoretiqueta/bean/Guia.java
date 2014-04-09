package cl.bluex.generadoretiqueta.bean;

import cl.bluex.generadoretiqueta.to.GuiaTO;

/**
 * @author eherrera
 *
 */
public class Guia {
	private long folioGuia;
	private long eevvId;
	private int idEncabezado;
	private int cantidad;
	private String codigoCompuesto;
	
	/**
	 * crea instancia de GuiasPorEncabezado
	 *
	 */
	public Guia() {
		super();
	}
	
	/**
	 * crea instancia de GuiasPorEncabezado
	 *
	 * @param to
	 */
	public Guia(final GuiaTO to) {
		if (to != null) {
			this.folioGuia = to.getFolioGuia();
			this.eevvId = to.getEevvId();
			this.idEncabezado = to.getIdEncabezado();
			this.cantidad = to.getCantidad();
			this.codigoCompuesto = to.getCodigoCompuesto();
		}
	}

	/**
	 * @return the idEncabezado
	 */
	public int getIdEncabezado() {
		return idEncabezado;
	}

	/**
	 * @param idEncabezado the idEncabezado to set
	 */
	public void setIdEncabezado(final int idEncabezado) {
		this.idEncabezado = idEncabezado;
	}

	/**
	 * @return the cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(final int cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * @return the codigoCompuesto
	 */
	public String getCodigoCompuesto() {
		return codigoCompuesto;
	}

	/**
	 * @param codigoCompuesto the codigoCompuesto to set
	 */
	public void setCodigoCompuesto(final String codigoCompuesto) {
		this.codigoCompuesto = codigoCompuesto;
	}

	/**
	 * @return the eevvId
	 */
	public long getEevvId() {
		return eevvId;
	}

	/**
	 * @param eevvId the eevvId to set
	 */
	public void setEevvId(final long eevvId) {
		this.eevvId = eevvId;
	}

	/**
	 * @return the folioGuia
	 */
	public long getFolioGuia() {
		return folioGuia;
	}

	/**
	 * @param folioGuia the folioGuia to set
	 */
	public void setFolioGuia(final long folioGuia) {
		this.folioGuia = folioGuia;
	}
	
	
}
