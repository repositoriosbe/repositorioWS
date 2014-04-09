package cl.bluex.listas.bean;

import cl.bluex.digmodel.to.BancoTO;


/**
 * Almacena datos del Banco.
 * 
 * @author Edgardo Herrera
 *
 */
public class Banco {
	private long codigo;
	private String descripcion;

	/**
	 * Constructor.
	 */
	public Banco() {
		super();
	}

	
	/**
	 * crea instancia de Banco
	 *
	 * @param bancoTO
	 */
	public Banco(final BancoTO bancoTO) {
		if (bancoTO != null) {
			this.codigo = bancoTO.getCodigo();
			this.descripcion = bancoTO.getDescripcion();
		}
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
