package cl.bluex.digmodel.to;

/**
 * @author eherrera
 *
 */
public class WareHouseTO {
	private long codigoTipoWarehouse;
	private long eevvNmrid;
	private String nombreEmbarque;
	private String nombreDestino;
	private String tipoMedida;
	private long cntPiezas;
	private double pesoFisico;
	private double pesoVolumen;
	private String codigoUsuario;
	private long tpclCodigoEmbarque;
	private long clhlCodigoEmbarque;
	private long clhlSucursalEmbarque;
	private long codigoEmpresa;
	private long codigoEmpresaLaer;
	private String codigoFamilia;
	private String codigoProducto;
	private String codigoServicio;
	private String dvEmbarque;
	private String idEmbarque;
	private String observaciones;
	private double largo;
	private double ancho;
	private double alto;
	
	/**
	 * crea instancia de WareHouseTO
	 *
	 */
	public WareHouseTO() {
		super();
	}

	/**
	 * @return the eevvNmrid
	 */
	public long getEevvNmrid() {
		return eevvNmrid;
	}

	/**
	 * @param eevvNmrid the eevvNmrid to set
	 */
	public void setEevvNmrid(final long eevvNmrid) {
		this.eevvNmrid = eevvNmrid;
	}

	/**
	 * @return the nombreEmbarque
	 */
	public String getNombreEmbarque() {
		return nombreEmbarque;
	}

	/**
	 * @param nombreEmbarque the nombreEmbarque to set
	 */
	public void setNombreEmbarque(final String nombreEmbarque) {
		this.nombreEmbarque = nombreEmbarque;
	}

	/**
	 * @return the nombreDestino
	 */
	public String getNombreDestino() {
		return nombreDestino;
	}

	/**
	 * @param nombreDestino the nombreDestino to set
	 */
	public void setNombreDestino(final String nombreDestino) {
		this.nombreDestino = nombreDestino;
	}

	/**
	 * @return the tipoMedida
	 */
	public String getTipoMedida() {
		return tipoMedida;
	}

	/**
	 * @param tipoMedida the tipoMedida to set
	 */
	public void setTipoMedida(final String tipoMedida) {
		this.tipoMedida = tipoMedida;
	}

	/**
	 * @return the cntPiezas
	 */
	public long getCntPiezas() {
		return cntPiezas;
	}

	/**
	 * @param cntPiezas the cntPiezas to set
	 */
	public void setCntPiezas(final long cntPiezas) {
		this.cntPiezas = cntPiezas;
	}

	/**
	 * @return the pesoFisico
	 */
	public double getPesoFisico() {
		return pesoFisico;
	}

	/**
	 * @param pesoFisico the pesoFisico to set
	 */
	public void setPesoFisico(final double pesoFisico) {
		this.pesoFisico = pesoFisico;
	}

	/**
	 * @return the pesoVolumen
	 */
	public double getPesoVolumen() {
		return pesoVolumen;
	}

	/**
	 * @param pesoVolumen the pesoVolumen to set
	 */
	public void setPesoVolumen(final double pesoVolumen) {
		this.pesoVolumen = pesoVolumen;
	}

	/**
	 * @return the tpclCodigoEmbarque
	 */
	public long getTpclCodigoEmbarque() {
		return tpclCodigoEmbarque;
	}

	/**
	 * @param tpclCodigoEmbarque the tpclCodigoEmbarque to set
	 */
	public void setTpclCodigoEmbarque(final long tpclCodigoEmbarque) {
		this.tpclCodigoEmbarque = tpclCodigoEmbarque;
	}

	/**
	 * @return the clhlCodigoEmbarque
	 */
	public long getClhlCodigoEmbarque() {
		return clhlCodigoEmbarque;
	}

	/**
	 * @param clhlCodigoEmbarque the clhlCodigoEmbarque to set
	 */
	public void setClhlCodigoEmbarque(final long clhlCodigoEmbarque) {
		this.clhlCodigoEmbarque = clhlCodigoEmbarque;
	}

	/**
	 * @return the clhlSucursalEmbarque
	 */
	public long getClhlSucursalEmbarque() {
		return clhlSucursalEmbarque;
	}

	/**
	 * @param clhlSucursalEmbarque the clhlSucursalEmbarque to set
	 */
	public void setClhlSucursalEmbarque(final long clhlSucursalEmbarque) {
		this.clhlSucursalEmbarque = clhlSucursalEmbarque;
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

	/**
	 * @return the codigoEmpresaLaer
	 */
	public long getCodigoEmpresaLaer() {
		return codigoEmpresaLaer;
	}

	/**
	 * @param codigoEmpresaLaer the codigoEmpresaLaer to set
	 */
	public void setCodigoEmpresaLaer(final long codigoEmpresaLaer) {
		this.codigoEmpresaLaer = codigoEmpresaLaer;
	}

	/**
	 * @return the codigoFamilia
	 */
	public String getCodigoFamilia() {
		return codigoFamilia;
	}

	/**
	 * @param codigoFamilia the codigoFamilia to set
	 */
	public void setCodigoFamilia(final String codigoFamilia) {
		this.codigoFamilia = codigoFamilia;
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
	 * @return the codigoServicio
	 */
	public String getCodigoServicio() {
		return codigoServicio;
	}

	/**
	 * @param codigoServicio the codigoServicio to set
	 */
	public void setCodigoServicio(final String codigoServicio) {
		this.codigoServicio = codigoServicio;
	}

	/**
	 * @return the dvEmbarque
	 */
	public String getDvEmbarque() {
		return dvEmbarque;
	}

	/**
	 * @param dvEmbarque the dvEmbarque to set
	 */
	public void setDvEmbarque(final String dvEmbarque) {
		this.dvEmbarque = dvEmbarque;
	}

	/**
	 * @return the idEmbarque
	 */
	public String getIdEmbarque() {
		return idEmbarque;
	}

	/**
	 * @param idEmbarque the idEmbarque to set
	 */
	public void setIdEmbarque(final String idEmbarque) {
		this.idEmbarque = idEmbarque;
	}

	/**
	 * @return the observaciones
	 */
	public String getObservaciones() {
		return observaciones;
	}

	/**
	 * @param observaciones the observaciones to set
	 */
	public void setObservaciones(final String observaciones) {
		this.observaciones = observaciones;
	}

	/**
	 * @return the largo
	 */
	public double getLargo() {
		return largo;
	}

	/**
	 * @param largo the largo to set
	 */
	public void setLargo(final double largo) {
		this.largo = largo;
	}

	/**
	 * @return the ancho
	 */
	public double getAncho() {
		return ancho;
	}

	/**
	 * @param ancho the ancho to set
	 */
	public void setAncho(final double ancho) {
		this.ancho = ancho;
	}

	/**
	 * @return the alto
	 */
	public double getAlto() {
		return alto;
	}

	/**
	 * @param alto the alto to set
	 */
	public void setAlto(final double alto) {
		this.alto = alto;
	}

	/**
	 * @return the codigoUsuario
	 */
	public String getCodigoUsuario() {
		return codigoUsuario;
	}

	/**
	 * @param codigoUsuario the codigoUsuario to set
	 */
	public void setCodigoUsuario(final String codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	/**
	 * @return the codigoTipoWarehouse
	 */
	public long getCodigoTipoWarehouse() {
		return codigoTipoWarehouse;
	}

	/**
	 * @param codigoTipoWarehouse the codigoTipoWarehouse to set
	 */
	public void setCodigoTipoWarehouse(final long codigoTipoWarehouse) {
		this.codigoTipoWarehouse = codigoTipoWarehouse;
	}

	
	
}
