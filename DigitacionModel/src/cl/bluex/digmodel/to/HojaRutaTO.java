package cl.bluex.digmodel.to;

import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * Almacena datos de la hoja de ruta.
 * 
 * @author Edgardo Herrera
 *
 */
public class HojaRutaTO implements Serializable {
    
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -3839895589691996980L;
    
    /** The courier. */
    private String  courier;
    
    /** The codigo ruta. */
    private long  codigoRuta;
    
    /** The codigo posta. */
    private String  codigoPosta;
    
    /** The codigo bodega. */
    private String  codigoBodega;
    
    /** The codigo oficina. */
    private String  codigoOficina;
    
    /** The codigo empresa. */
    private long  codigoEmpresa;
    
    /** The tipo negocio. */
    private long  tipoNegocio;
    
    /** The tipo hoja ruta. */
    private String  tipoHojaRuta;
    
    /** The estado ruta. */
    private String  estadoRuta;
    
    /** The folio ruta. */
    private String  folioRuta;
    
    /** The tipo bodega. */
    private String  patente;
    
    private long  codigoSorter;
    
    
    
    
    
    /**
     * Crea nueva instancia de {@link HojaRutaTO}.
     */
    public HojaRutaTO() {
	super();
    }

    /**
     * Gets the courier.
     *
     * @return the courier
     */
    public String getCourier() {
        return courier;
    }

    /**
     * Sets the courier.
     *
     * @param courier the courier to set
     */
    public void setCourier(final String courier) {
        this.courier = courier;
    }

    /**
     * Gets the codigo ruta.
     *
     * @return the codigoRuta
     */
    public long getCodigoRuta() {
        return codigoRuta;
    }

    /**
     * Sets the codigo ruta.
     *
     * @param codigoRuta the codigoRuta to set
     */
    public void setCodigoRuta(final long codigoRuta) {
        this.codigoRuta = codigoRuta;
    }

    /**
     * Gets the codigo posta.
     *
     * @return the codigoPosta
     */
    public String getCodigoPosta() {
        return codigoPosta;
    }

    /**
     * Sets the codigo posta.
     *
     * @param codigoPosta the codigoPosta to set
     */
    public void setCodigoPosta(final String codigoPosta) {
        this.codigoPosta = codigoPosta;
    }

    /**
     * Gets the codigo bodega.
     *
     * @return the codigoBodega
     */
    public String getCodigoBodega() {
        return codigoBodega;
    }

    /**
     * Sets the codigo bodega.
     *
     * @param codigoBodega the codigoBodega to set
     */
    public void setCodigoBodega(final String codigoBodega) {
        this.codigoBodega = codigoBodega;
    }

    /**
     * Gets the codigo oficina.
     *
     * @return the codigoOficina
     */
    public String getCodigoOficina() {
        return codigoOficina;
    }

    /**
     * Sets the codigo oficina.
     *
     * @param codigoOficina the codigoOficina to set
     */
    public void setCodigoOficina(final String codigoOficina) {
        this.codigoOficina = codigoOficina;
    }

    /**
     * Gets the codigo empresa.
     *
     * @return the codigoEmpresa
     */
    public long getCodigoEmpresa() {
        return codigoEmpresa;
    }

    /**
     * Sets the codigo empresa.
     *
     * @param codigoEmpresa the codigoEmpresa to set
     */
    public void setCodigoEmpresa(final long codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    /**
     * Gets the tipo negocio.
     *
     * @return the tipoNegocio
     */
    public long getTipoNegocio() {
        return tipoNegocio;
    }

    /**
     * Sets the tipo negocio.
     *
     * @param tipoNegocio the tipoNegocio to set
     */
    public void setTipoNegocio(final long tipoNegocio) {
        this.tipoNegocio = tipoNegocio;
    }

    /**
     * Gets the tipo hoja ruta.
     *
     * @return the tipoHojaRuta
     */
    public String getTipoHojaRuta() {
        return tipoHojaRuta;
    }

    /**
     * Sets the tipo hoja ruta.
     *
     * @param tipoHojaRuta the tipoHojaRuta to set
     */
    public void setTipoHojaRuta(final String tipoHojaRuta) {
        this.tipoHojaRuta = tipoHojaRuta;
    }

	/**
	 * Gets the estado ruta.
	 *
	 * @return the estadoRuta
	 */
	public String getEstadoRuta() {
		return estadoRuta;
	}

	/**
	 * Sets the estado ruta.
	 *
	 * @param estadoRuta the estadoRuta to set
	 */
	public void setEstadoRuta(String estadoRuta) {
		this.estadoRuta = estadoRuta;
	}

	/**
	 * Gets the folio ruta.
	 *
	 * @return the folioRuta
	 */
	public String getFolioRuta() {
		return folioRuta;
	}

	/**
	 * Sets the folio ruta.
	 *
	 * @param folioRuta the folioRuta to set
	 */
	public void setFolioRuta(String folioRuta) {
		this.folioRuta = folioRuta;
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
	 * @return the codigoSorter
	 */
	public long getCodigoSorter() {
		return codigoSorter;
	}

	/**
	 * @param codigoSorter the codigoSorter to set
	 */
	public void setCodigoSorter(long codigoSorter) {
		this.codigoSorter = codigoSorter;
	}

}
