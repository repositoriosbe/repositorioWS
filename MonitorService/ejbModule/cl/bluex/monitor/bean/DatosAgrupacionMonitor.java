package cl.bluex.monitor.bean;

import java.io.Serializable;

import cl.bluex.monitor.to.DatosAgrupacionMonitorTO;

// TODO: Auto-generated Javadoc
/**
 * Clase con los datos de la agrupacion del monitor.
 * 
 * @author Edgardo Herrera
 *
 */
public class DatosAgrupacionMonitor implements Serializable {

	
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
	 * Instantiates a new datos agrupacion monitor.
	 */
	public DatosAgrupacionMonitor() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new datos agrupacion monitor.
	 *
	 * @param DatosAgrupacionMonitorTO to
	 */
	public DatosAgrupacionMonitor(DatosAgrupacionMonitorTO to) {
		this.courier = to.getCourier();
		this.voucher = to.getVoucher();
		this.modo = to.getModo();
		this.cantidadGuiasEstimada = to.getCantidadGuiasEstimada();
		this.cantidadGuiasDigitadas = to.getCantidadGuiasDigitadas();
		this.cantidadTotalBultos = to.getCantidadTotalBultos();
		this.cantidadBultosPuh = to.getCantidadBultosPuh();
		this.cantidadBultosSorteados = to.getCantidadBultosSorteados();
	}

	/**
	 * @return the courier
	 */
	public String getCourier() {
		return courier;
	}

	/**
	 * @param courier the courier to set
	 */
	public void setCourier(String courier) {
		this.courier = courier;
	}

	/**
	 * @return the voucher
	 */
	public long getVoucher() {
		return voucher;
	}

	/**
	 * @param voucher the voucher to set
	 */
	public void setVoucher(long voucher) {
		this.voucher = voucher;
	}

	/**
	 * @return the modo
	 */
	public String getModo() {
		return modo;
	}

	/**
	 * @param modo the modo to set
	 */
	public void setModo(String modo) {
		this.modo = modo;
	}

	/**
	 * @return the cantidadGuiasEstimada
	 */
	public long getCantidadGuiasEstimada() {
		return cantidadGuiasEstimada;
	}

	/**
	 * @param cantidadGuiasEstimada the cantidadGuiasEstimada to set
	 */
	public void setCantidadGuiasEstimada(long cantidadGuiasEstimada) {
		this.cantidadGuiasEstimada = cantidadGuiasEstimada;
	}

	/**
	 * @return the cantidadGuiasDigitadas
	 */
	public long getCantidadGuiasDigitadas() {
		return cantidadGuiasDigitadas;
	}

	/**
	 * @param cantidadGuiasDigitadas the cantidadGuiasDigitadas to set
	 */
	public void setCantidadGuiasDigitadas(long cantidadGuiasDigitadas) {
		this.cantidadGuiasDigitadas = cantidadGuiasDigitadas;
	}

	/**
	 * @return the cantidadTotalBultos
	 */
	public long getCantidadTotalBultos() {
		return cantidadTotalBultos;
	}

	/**
	 * @param cantidadTotalBultos the cantidadTotalBultos to set
	 */
	public void setCantidadTotalBultos(long cantidadTotalBultos) {
		this.cantidadTotalBultos = cantidadTotalBultos;
	}

	/**
	 * @return the cantidadBultosPuh
	 */
	public long getCantidadBultosPuh() {
		return cantidadBultosPuh;
	}

	/**
	 * @param cantidadBultosPuh the cantidadBultosPuh to set
	 */
	public void setCantidadBultosPuh(long cantidadBultosPuh) {
		this.cantidadBultosPuh = cantidadBultosPuh;
	}

	/**
	 * @return the cantidadBultosSorteados
	 */
	public long getCantidadBultosSorteados() {
		return cantidadBultosSorteados;
	}

	/**
	 * @param cantidadBultosSorteados the cantidadBultosSorteados to set
	 */
	public void setCantidadBultosSorteados(long cantidadBultosSorteados) {
		this.cantidadBultosSorteados = cantidadBultosSorteados;
	}



}
