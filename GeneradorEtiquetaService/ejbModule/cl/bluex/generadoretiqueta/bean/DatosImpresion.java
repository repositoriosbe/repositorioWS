package cl.bluex.generadoretiqueta.bean;

import java.io.Serializable;

/**
 * @author Edgardo Herrera
 *
 */
public class DatosImpresion implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -8919999495566667628L;
    private long eevvNmrId;
	private String codigoBarra;
    private String tipoEtiqueta;
    private String empresa;
    private String inicialTipoEtiqueta;
    private String fecha;
    private String codigoPosta;
    private String nombrePosta;
    private long codigoImpresora;
    private long cantidad;
    private long codigoUsuario;
    private int codigoFormatoImpresion;
    private int fuente;
    private String zona;
	private String comunaine;
	private String codBodega;
	private String ruta;
	private String usuario;
	private String voucher;
    

	/**
	 * @return the voucher
	 */
	public String getVoucher() {
		return voucher;
	}

	/**
	 * @param voucher the voucher to set
	 */
	public void setVoucher(String voucher) {
		this.voucher = voucher;
	}

	/**
     * Crea instancia de {@link DatosImpresion}.
     *
     */
    public DatosImpresion() {
	super();
    }
    
    /**
     * @return the codigoBarra
     */
    public String getCodigoBarra() {
        return codigoBarra;
    }
    /**
     * @param codigoBarra the codigoBarra to set
     */
    public void setCodigoBarra(final String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }
    /**
     * @return the tipoEtiqueta
     */
    public String getTipoEtiqueta() {
        return tipoEtiqueta;
    }
    /**
     * @param tipoEtiqueta the tipoEtiqueta to set
     */
    public void setTipoEtiqueta(final String tipoEtiqueta) {
        this.tipoEtiqueta = tipoEtiqueta;
    }
    /**
     * @return the empresa
     */
    public String getEmpresa() {
        return empresa;
    }
    /**
     * @param empresa the empresa to set
     */
    public void setEmpresa(final String empresa) {
        this.empresa = empresa;
    }
    /**
     * @return the inicialTipoEtiqueta
     */
    public String getInicialTipoEtiqueta() {
        return inicialTipoEtiqueta;
    }
    /**
     * @param inicialTipoEtiqueta the inicialTipoEtiqueta to set
     */
    public void setInicialTipoEtiqueta(final String inicialTipoEtiqueta) {
        this.inicialTipoEtiqueta = inicialTipoEtiqueta;
    }
    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }
    /**
     * @param fecha the fecha to set
     */
    public void setFecha(final String fecha) {
        this.fecha = fecha;
    }
    /**
     * @return the codigoPosta
     */
    public String getCodigoPosta() {
        return codigoPosta;
    }
    /**
     * @param codigoPosta the codigoPosta to set
     */
    public void setCodigoPosta(final String codigoPosta) {
        this.codigoPosta = codigoPosta;
    }
    /**
     * @return the nombrePosta
     */
    public String getNombrePosta() {
        return nombrePosta;
    }
    /**
     * @param nombrePosta the nombrePosta to set
     */
    public void setNombrePosta(final String nombrePosta) {
        this.nombrePosta = nombrePosta;
    }
    /**
     * @return the codigoImpresora
     */
    public long getCodigoImpresora() {
        return codigoImpresora;
    }
    /**
     * @param codigoImpresora the codigoImpresora to set
     */
    public void setCodigoImpresora(final long codigoImpresora) {
        this.codigoImpresora = codigoImpresora;
    }
    /**
     * @return the cantidad
     */
    public long getCantidad() {
        return cantidad;
    }
    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(final long cantidad) {
        this.cantidad = cantidad;
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
     * @return the codigoFormatoImpresion
     */
    public int getCodigoFormatoImpresion() {
        return codigoFormatoImpresion;
    }
    /**
     * @param codigoFormatoImpresion the codigoFormatoImpresion to set
     */
    public void setCodigoFormatoImpresion(final int codigoFormatoImpresion) {
        this.codigoFormatoImpresion = codigoFormatoImpresion;
    }

	/**
	 * @return the eevvNmrId
	 */
	public long getEevvNmrId() {
		return eevvNmrId;
	}

	/**
	 * @return the codBodega
	 */
	public String getCodBodega() {
		return codBodega;
	}

	/**
	 * @param codBodega the codBodega to set
	 */
	public void setCodBodega(String codBodega) {
		this.codBodega = codBodega;
	}

	/**
	 * @return the ruta
	 */
	public String getRuta() {
		return ruta;
	}

	/**
	 * @param ruta the ruta to set
	 */
	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * @param eevvNmrId the eevvNmrId to set
	 */
	public void setEevvNmrId(final long eevvNmrId) {
		this.eevvNmrId = eevvNmrId;
	}

	/**
	 * @return the zona
	 */
	public String getZona() {
		return zona;
	}

	/**
	 * @param zona the zona to set
	 */
	public void setZona(final String zona) {
		this.zona = zona;
	}

	/**
	 * @return the comunaine
	 */
	public String getComunaine() {
		return comunaine;
	}

	/**
	 * @param comunaine the comunaine to set
	 */
	public void setComunaine(final String comunaine) {
		this.comunaine = comunaine;
	}
	
    /**
	 * @return the fuente
	 */
	public int getFuente() {
		return fuente;
	}

	/**
	 * @param fuente the fuente to set
	 */
	public void setFuente(final int fuente) {
		this.fuente = fuente;
	}

	

}
