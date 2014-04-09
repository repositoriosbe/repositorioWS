package cl.bluex.listas.bean;

import java.io.Serializable;

import cl.bluex.digmodel.to.TipoServicioTO;

/**
 * Almacena datos del tipo de servicio.
 * 
 * @author Edgardo Herrera
 * 
 */
public class TipoServicio implements Serializable {

	/**
     * 
     */
	private static final long serialVersionUID = -1736892428304339801L;
	private String codigo;
	private String descripcion;
	private String impuesto;
	private long codigoEmpresa;

	/**
	 * Constructor.
	 */
	public TipoServicio() {
		super();
	}

	
	/**
	 * crea instancia de TipoServicio
	 *
	 * @param to
	 */
	public TipoServicio(final TipoServicioTO to) {
		if (to != null) {
			this.codigo = to.getCodigo();
			this.descripcion = to.getDescripcion();
			this.impuesto = to.getImpuesto();
			this.codigoEmpresa = to.getCodigoEmpresa();
		}
	}

	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo
	 *            the codigo to set
	 */
	public void setCodigo(final String codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion
	 *            the descripcion to set
	 */
	public void setDescripcion(final String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the impuesto
	 */
	public String getImpuesto() {
		return impuesto;
	}

	/**
	 * @param impuesto
	 *            the impuesto to set
	 */
	public void setImpuesto(final String impuesto) {
		this.impuesto = impuesto;
	}

	/**
	 * @return the codigoEmpresa
	 */
	public long getCodigoEmpresa() {
		return codigoEmpresa;
	}

	/**
	 * @param codigoEmpresa
	 *            the codigoEmpresa to set
	 */
	public void setCodigoEmpresa(final long codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}

}
