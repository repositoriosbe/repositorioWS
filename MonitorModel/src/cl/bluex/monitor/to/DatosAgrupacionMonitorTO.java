package cl.bluex.monitor.to;

import java.io.Serializable;


// TODO: Auto-generated Javadoc
/**
 * The Class DatosAgrupacionMonitorTO.
 *
 * @author Edgardo Herrera
 * 
 * 22-01-2014	Ricardo Moscoso : 
 * 				Se modifica objeto de salida. 
 * 
 */
public class DatosAgrupacionMonitorTO implements Serializable {
    
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -8899065449978519282L;

    /** The courier. */
    private String courier;
    
    /** The voucher. */
    private long voucher;
    
    /** The modo. */
    private String modo;
    
	/** The cantidad guias estimada. */
    private long cantidadGuiasEstimada;
    
    /** The cantidad guias digitadas. */
    private long cantidadGuiasDigitadas;
    
    /** The cantidad total bultos. */
    private long cantidadTotalBultos;
    
    /** The cantidad bultos puh. */
    private long cantidadBultosPuh;
    
    /** The cantidad bultos sorteados. */
    private long cantidadBultosSorteados;
    
    
    /**
     * Instantiates a new datos agrupacion monitor to.
     */
	public DatosAgrupacionMonitorTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param courier
	 * @param voucher
	 * @param modo
	 * @param cantidadGuiasEstimada
	 * @param cantidadGuiasDigitadas
	 * @param cantidadTotalBultos
	 * @param cantidadBultosPuh
	 * @param cantidadBultosSorteados
	 */
	public DatosAgrupacionMonitorTO(String courier, long voucher, String modo,
			long cantidadGuiasEstimada, long cantidadGuiasDigitadas,
			long cantidadTotalBultos, long cantidadBultosPuh,
			long cantidadBultosSorteados) {
		this.courier = courier;
		this.voucher = voucher;
		this.modo = modo;
		this.cantidadGuiasEstimada = cantidadGuiasEstimada;
		this.cantidadGuiasDigitadas = cantidadGuiasDigitadas;
		this.cantidadTotalBultos = cantidadTotalBultos;
		this.cantidadBultosPuh = cantidadBultosPuh;
		this.cantidadBultosSorteados = cantidadBultosSorteados;
	}

    
	/**
	 * Gets the courier.
	 * @return the courier
	 */
	public String getCourier() {
		return courier;
	}
	
	/**
	 * Sets the courier.
	 * @param courier the courier to set
	 */
	public void setCourier(String courier) {
		this.courier = courier;
	}
	
	/**
	 * Gets the voucher.
	 * @return the voucher
	 */
	public long getVoucher() {
		return voucher;
	}
	
	/**
	 * Sets the voucher.
	 * @param voucher the voucher to set
	 */
	public void setVoucher(long voucher) {
		this.voucher = voucher;
	}
	
	/**
	 * Gets the modo.
	 * @return the modo
	 */
	public String getModo() {
		return modo;
	}
	
	/**
	 * Sets the modo.
	 * @param modo the modo to set
	 */
	public void setModo(String modo) {
		this.modo = modo;
	}
	
	/**
	 * Gets the cantidad guias estimada.
	 * @return the cantidadGuiasEstimada
	 */
	public long getCantidadGuiasEstimada() {
		return cantidadGuiasEstimada;
	}
	
	/**
	 * Sets the cantidad guias estimada.
	 * @param cantidadGuiasEstimada the cantidadGuiasEstimada to set
	 */
	public void setCantidadGuiasEstimada(long cantidadGuiasEstimada) {
		this.cantidadGuiasEstimada = cantidadGuiasEstimada;
	}
	
	/**
	 * Gets the cantidad guias digitadas.
	 * @return the cantidadGuiasDigitadas
	 */
	public long getCantidadGuiasDigitadas() {
		return cantidadGuiasDigitadas;
	}
	
	/**
	 * Sets the cantidad guias digitadas.
	 * @param cantidadGuiasDigitadas the cantidadGuiasDigitadas to set
	 */
	public void setCantidadGuiasDigitadas(long cantidadGuiasDigitadas) {
		this.cantidadGuiasDigitadas = cantidadGuiasDigitadas;
	}
	
	/**
	 * Gets the cantidad total bultos.
	 * @return the cantidadTotalBultos
	 */
	public long getCantidadTotalBultos() {
		return cantidadTotalBultos;
	}
	
	/**
	 * Sets the cantidad total bultos.
	 * @param cantidadTotalBultos the cantidadTotalBultos to set
	 */
	public void setCantidadTotalBultos(long cantidadTotalBultos) {
		this.cantidadTotalBultos = cantidadTotalBultos;
	}
	
	/**
	 * Gets the cantidad bultos puh.
	 * @return the cantidadBultosPuh
	 */
	public long getCantidadBultosPuh() {
		return cantidadBultosPuh;
	}
	
	/**
	 * Sets the cantidad bultos puh.
	 * @param cantidadBultosPuh the cantidadBultosPuh to set
	 */
	public void setCantidadBultosPuh(long cantidadBultosPuh) {
		this.cantidadBultosPuh = cantidadBultosPuh;
	}
	
	/**
	 * Gets the cantidad bultos sorteados.
	 * @return the cantidadBultosSorteados
	 */
	public long getCantidadBultosSorteados() {
		return cantidadBultosSorteados;
	}
	
	/**
	 * Sets the cantidad bultos sorteados.
	 * @param cantidadBultosSorteados the cantidadBultosSorteados to set
	 */
	public void setCantidadBultosSorteados(long cantidadBultosSorteados) {
		this.cantidadBultosSorteados = cantidadBultosSorteados;
	}
    
}
