package cl.bluex.verificamodel.to;


/**
 * @author eherrera
 *
 */
public class OserTO {
	private long eevvNmrSerie;
	private long eevvNmrId;
	private String fechaCreacionOs;
	private String ctacteEmba;
	private String nombreCtacte;
	private String centroCosto;
	private String codigoPostaOrigen;
	private String codigoPostaDestino;
	private String codigoTipoServicio;
	private String codigoServComple;
	private float cntpiezas;
	private float pesofisico;
	private float pesovolumen;
	private float montoCOD;
	private float vlorimptopp;
	private float vlorimptocc;
	private float vlorfletepp;
	private float vlorfletecc;
	private float vlorvalorapp;
	private float vlorvaloracc;
	private float vlorvariospp;
	private float vlorvarioscc;
	private float vlorseguro;
	private float vlordeclarado;
	private float vloraduana;
	private float tarifa;
	private long clhlcodigoEmbarque;
	private int clhlsucursalEmbarque;
	private int tpclcodigoEmbarque;
	private String numeroBatch;
	
	private int codigoEmpresa;
	private String codigoProducto;
	private String codigoEstadoDcbt;
	
	/**
	 * crea instancia de OserTO
	 *
	 */
	public OserTO() {
		super();
	}

	/**
	 * @return the eevvNmrSerie
	 */
	public long getEevvNmrSerie() {
		return eevvNmrSerie;
	}

	/**
	 * @param eevvNmrSerie the eevvNmrSerie to set
	 */
	public void setEevvNmrSerie(final long eevvNmrSerie) {
		this.eevvNmrSerie = eevvNmrSerie;
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
	 * @return the ctacteEmba
	 */
	public String getCtacteEmba() {
		return ctacteEmba;
	}

	/**
	 * @param ctacteEmba the ctacteEmba to set
	 */
	public void setCtacteEmba(final String ctacteEmba) {
		this.ctacteEmba = ctacteEmba;
	}

	/**
	 * @return the centroCosto
	 */
	public String getCentroCosto() {
		return centroCosto;
	}

	/**
	 * @param centroCosto the centroCosto to set
	 */
	public void setCentroCosto(final String centroCosto) {
		this.centroCosto = centroCosto;
	}

	/**
	 * @return the codigoPostaOrigen
	 */
	public String getCodigoPostaOrigen() {
		return codigoPostaOrigen;
	}

	/**
	 * @param codigoPostaOrigen the codigoPostaOrigen to set
	 */
	public void setCodigoPostaOrigen(final String codigoPostaOrigen) {
		this.codigoPostaOrigen = codigoPostaOrigen;
	}

	/**
	 * @return the codigoPostaDestino
	 */
	public String getCodigoPostaDestino() {
		return codigoPostaDestino;
	}

	/**
	 * @param codigoPostaDestino the codigoPostaDestino to set
	 */
	public void setCodigoPostaDestino(final String codigoPostaDestino) {
		this.codigoPostaDestino = codigoPostaDestino;
	}

	/**
	 * @return the codigoTipoServicio
	 */
	public String getCodigoTipoServicio() {
		return codigoTipoServicio;
	}

	/**
	 * @param codigoTipoServicio the codigoTipoServicio to set
	 */
	public void setCodigoTipoServicio(final String codigoTipoServicio) {
		this.codigoTipoServicio = codigoTipoServicio;
	}

	/**
	 * @return the codigoServComple
	 */
	public String getCodigoServComple() {
		return codigoServComple;
	}

	/**
	 * @param codigoServComple the codigoServComple to set
	 */
	public void setCodigoServComple(final String codigoServComple) {
		this.codigoServComple = codigoServComple;
	}

	/**
	 * @return the cntpiezas
	 */
	public float getCntpiezas() {
		return cntpiezas;
	}

	/**
	 * @param cntpiezas the cntpiezas to set
	 */
	public void setCntpiezas(final float cntpiezas) {
		this.cntpiezas = cntpiezas;
	}

	/**
	 * @return the pesofisico
	 */
	public float getPesofisico() {
		return pesofisico;
	}

	/**
	 * @param pesofisico the pesofisico to set
	 */
	public void setPesofisico(final float pesofisico) {
		this.pesofisico = pesofisico;
	}

	/**
	 * @return the pesovolumen
	 */
	public float getPesovolumen() {
		return pesovolumen;
	}

	/**
	 * @param pesovolumen the pesovolumen to set
	 */
	public void setPesovolumen(final float pesovolumen) {
		this.pesovolumen = pesovolumen;
	}

	/**
	 * @return the montoCOD
	 */
	public float getMontoCOD() {
		return montoCOD;
	}

	/**
	 * @param montoCOD the montoCOD to set
	 */
	public void setMontoCOD(final float montoCOD) {
		this.montoCOD = montoCOD;
	}

	/**
	 * @return the vlorimptopp
	 */
	public float getVlorimptopp() {
		return vlorimptopp;
	}

	/**
	 * @param vlorimptopp the vlorimptopp to set
	 */
	public void setVlorimptopp(final float vlorimptopp) {
		this.vlorimptopp = vlorimptopp;
	}

	/**
	 * @return the vlorimptocc
	 */
	public float getVlorimptocc() {
		return vlorimptocc;
	}

	/**
	 * @param vlorimptocc the vlorimptocc to set
	 */
	public void setVlorimptocc(final float vlorimptocc) {
		this.vlorimptocc = vlorimptocc;
	}

	/**
	 * @return the vlorfletepp
	 */
	public float getVlorfletepp() {
		return vlorfletepp;
	}

	/**
	 * @param vlorfletepp the vlorfletepp to set
	 */
	public void setVlorfletepp(final float vlorfletepp) {
		this.vlorfletepp = vlorfletepp;
	}

	/**
	 * @return the vlorfletecc
	 */
	public float getVlorfletecc() {
		return vlorfletecc;
	}

	/**
	 * @param vlorfletecc the vlorfletecc to set
	 */
	public void setVlorfletecc(final float vlorfletecc) {
		this.vlorfletecc = vlorfletecc;
	}

	/**
	 * @return the vlorvalorapp
	 */
	public float getVlorvalorapp() {
		return vlorvalorapp;
	}

	/**
	 * @param vlorvalorapp the vlorvalorapp to set
	 */
	public void setVlorvalorapp(final float vlorvalorapp) {
		this.vlorvalorapp = vlorvalorapp;
	}

	/**
	 * @return the vlorvaloracc
	 */
	public float getVlorvaloracc() {
		return vlorvaloracc;
	}

	/**
	 * @param vlorvaloracc the vlorvaloracc to set
	 */
	public void setVlorvaloracc(final float vlorvaloracc) {
		this.vlorvaloracc = vlorvaloracc;
	}

	/**
	 * @return the vlorvariospp
	 */
	public float getVlorvariospp() {
		return vlorvariospp;
	}

	/**
	 * @param vlorvariospp the vlorvariospp to set
	 */
	public void setVlorvariospp(final float vlorvariospp) {
		this.vlorvariospp = vlorvariospp;
	}

	/**
	 * @return the vlorvarioscc
	 */
	public float getVlorvarioscc() {
		return vlorvarioscc;
	}

	/**
	 * @param vlorvarioscc the vlorvarioscc to set
	 */
	public void setVlorvarioscc(final float vlorvarioscc) {
		this.vlorvarioscc = vlorvarioscc;
	}

	/**
	 * @return the vlorseguro
	 */
	public float getVlorseguro() {
		return vlorseguro;
	}

	/**
	 * @param vlorseguro the vlorseguro to set
	 */
	public void setVlorseguro(final float vlorseguro) {
		this.vlorseguro = vlorseguro;
	}

	/**
	 * @return the vlordeclarado
	 */
	public float getVlordeclarado() {
		return vlordeclarado;
	}

	/**
	 * @param vlordeclarado the vlordeclarado to set
	 */
	public void setVlordeclarado(final float vlordeclarado) {
		this.vlordeclarado = vlordeclarado;
	}

	/**
	 * @return the vloraduana
	 */
	public float getVloraduana() {
		return vloraduana;
	}

	/**
	 * @param vloraduana the vloraduana to set
	 */
	public void setVloraduana(final float vloraduana) {
		this.vloraduana = vloraduana;
	}

	/**
	 * @return the tarifa
	 */
	public float getTarifa() {
		return tarifa;
	}

	/**
	 * @param tarifa the tarifa to set
	 */
	public void setTarifa(final float tarifa) {
		this.tarifa = tarifa;
	}

	/**
	 * @return the clhlcodigoEmbarque
	 */
	public long getClhlcodigoEmbarque() {
		return clhlcodigoEmbarque;
	}

	/**
	 * @param clhlcodigoEmbarque the clhlcodigoEmbarque to set
	 */
	public void setClhlcodigoEmbarque(final long clhlcodigoEmbarque) {
		this.clhlcodigoEmbarque = clhlcodigoEmbarque;
	}

	/**
	 * @return the clhlsucursalEmbarque
	 */
	public int getClhlsucursalEmbarque() {
		return clhlsucursalEmbarque;
	}

	/**
	 * @param clhlsucursalEmbarque the clhlsucursalEmbarque to set
	 */
	public void setClhlsucursalEmbarque(final int clhlsucursalEmbarque) {
		this.clhlsucursalEmbarque = clhlsucursalEmbarque;
	}

	/**
	 * @return the tpclcodigoEmbarque
	 */
	public int getTpclcodigoEmbarque() {
		return tpclcodigoEmbarque;
	}

	/**
	 * @param tpclcodigoEmbarque the tpclcodigoEmbarque to set
	 */
	public void setTpclcodigoEmbarque(final int tpclcodigoEmbarque) {
		this.tpclcodigoEmbarque = tpclcodigoEmbarque;
	}

	/**
	 * @return the numeroBatch
	 */
	public String getNumeroBatch() {
		return numeroBatch;
	}

	/**
	 * @param numeroBatch the numeroBatch to set
	 */
	public void setNumeroBatch(final String numeroBatch) {
		this.numeroBatch = numeroBatch;
	}

	/**
	 * @return the nombreCtacte
	 */
	public String getNombreCtacte() {
		return nombreCtacte;
	}

	/**
	 * @param nombreCtacte the nombreCtacte to set
	 */
	public void setNombreCtacte(final String nombreCtacte) {
		this.nombreCtacte = nombreCtacte;
	}

	/**
	 * @return the codigoEmpresa
	 */
	public int getCodigoEmpresa() {
		return codigoEmpresa;
	}

	/**
	 * @param codigoEmpresa the codigoEmpresa to set
	 */
	public void setCodigoEmpresa(final int codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}

	/**
	 * @return the codigoProducto
	 */
	public String getCodigoProducto() {
		return codigoProducto;
	}

	/**
	 * @param codigoProducto the codigoProducto to set
	 */
	public void setCodigoProducto(final String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	/**
	 * @return the codigoEstadoDcbt
	 */
	public String getCodigoEstadoDcbt() {
		return codigoEstadoDcbt;
	}

	/**
	 * @param codigoEstadoDcbt the codigoEstadoDcbt to set
	 */
	public void setCodigoEstadoDcbt(final String codigoEstadoDcbt) {
		this.codigoEstadoDcbt = codigoEstadoDcbt;
	}

	/**
	 * @return the fechaCreacionOs
	 */
	public String getFechaCreacionOs() {
		return fechaCreacionOs;
	}

	/**
	 * @param fechaCreacionOs the fechaCreacionOs to set
	 */
	public void setFechaCreacionOs(final String fechaCreacionOs) {
		this.fechaCreacionOs = fechaCreacionOs;
	}
	
	
}
