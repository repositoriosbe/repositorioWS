package cl.bluex.digmodel.to;

import java.io.Serializable;

/**
 * Almacena datos de tipo de servicio.
 * 
 * @author Edgardo Herrera
 *
 */
public class TipoServicioTO implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -5283902026368278121L;
    private String codigo;
    private String descripcion;
    private String impuesto;
    private long codigoEmpresa;
    
    /**
     * Crea instancia {@link TipoServicioTO}.
     */
    public TipoServicioTO() {
	super();
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
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
     * @param descripcion the descripcion to set
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
     * @param impuesto the impuesto to set
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
     * @param codigoEmpresa the codigoEmpresa to set
     */
    public void setCodigoEmpresa(final long codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

}
