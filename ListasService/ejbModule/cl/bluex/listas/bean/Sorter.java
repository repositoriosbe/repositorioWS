package cl.bluex.listas.bean;

import cl.bluex.digmodel.to.SorterTO;

/**
 * @author Edgardo Herrera
 * 
 */
public class Sorter {
	private long codigo;
	private String descripcion;

	/**
	 * crea instancia de {@link Sorter}.
	 */
	public Sorter() {
		super();
	}

	
	/**
	 * crea instancia de Sorter
	 *
	 * @param to
	 */
	public Sorter(final SorterTO to) {
		this.codigo = to.getCodigo();
		this.descripcion = to.getDescripcion();
	}

	/**
	 * @return the codigo
	 */
	public long getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo
	 *            the codigo to set
	 */
	public void setCodigo(final long codigo) {
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

}
