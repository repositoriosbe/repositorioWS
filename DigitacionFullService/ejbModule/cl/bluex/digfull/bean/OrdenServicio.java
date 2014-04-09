package cl.bluex.digfull.bean;

import cl.bluex.digmodel.to.OrdenServicioTO;

/**
 * bean orden de servicio.
 * 
 * @author Edgardo Herrera
 * 
 */
public class OrdenServicio {
	private long eevvNmrId;
	private String codigoTipoClaseTarifa;
	private String tipoPago;
	private String tipoPagoOtros;
	private String tipoMedida;
	private String idAgente;
	private String dvAgente;
	private String rgnEstadoAgente;
	private String dirComunaAgente;
	private String dirCalleAgente;
	private int dirNmrAgente;
	private String dirBlockAgente;
	private String dirDeptoAgente;
	private int dirPisoAgente;
	private String direccionAgente;
	private String codigoPostalAgente;
	private String prfjFonoAgente;
	private String fonoAgente;
	private String extFonoAgente;
	private String idEmbarque;
	private String dvEmbarque;
	private String nombreEmbarque;
	private String dirRgnEstadoEmbarque;
	private String dirCalleEmbarque;
	private String dirComunaEmbarque;
	private long dirNmrEmbarque;
	private String dirBlockEmbarque;
	private int dirPisoEmbarque;
	private String direccionEmbarque;
	private String codigoPostalEmbarque;
	private String prfjFonoEmbarque;
	private String fonoEmbarque;
	private String extfonoEmbarque;
	private String idDestino;
	private String dvDestino;
	private String dirRgnEstadoDestino;
	private String dirComunaDestino;
	private String dirCalleDestino;
	private long dirNmrDestino;
	private String dirBlockDestino;
	private String dirDeptoDestino;
	private int dirPisoDestino;
	private String direccionDestino;
	private String cdgPostalDestino;
	private String prfjFonoDestino;
	private String fonoDestino;
	private String extFonoDestino;
	private double valorDeclarado;
	private double valorSeguro;
	private double valorAduana;
	private double valorFletepp;
	private double valorFletecc;
	private double valorValorapp;
	private double valorValoracc;
	private double valorGastoAgentepp;
	private double valorGastoAgentecc;
	private double valorGastoCarrierpp;
	private double valorGastoCarriercc;
	private double valorImptopp;
	private double valorImptocc;
	private double valorVariospp;
	private double valorVarioscc;
	private long cntPiezas;
	private double pesoFisico;
	private double pesoVolumen;
	private double tarifa;
	private String descripcionProducto;
	private String codigoMoneda;
	private long codigoEmpresa;
	private long codigoEmpresaLaer;
	private String codigoPostaDestino;
	private long codigoTipoNegDestino;
	private String codigoPostaOrigen;
	private long codigoTipoNegOrigen;
	private String codigoServicio;
	private String codigoUsuario;
	private String codigoFamilia;
	private String codigoProducto;
	private long doctEevvNmrId;
	private long tpclCodigoAgente;
	private long clhlCodigoAgente;
	private long clhlSucursalAgente;
	private long tpclCodigoEmbarque;
	private long clhlCodigoEmbarque;
	private long clhlSucursalEmbarque;
	private long tpclCodigoDestino;
	private long clhlCodigoDestino;
	private long clhlSucursalDestino;
	private String nombreDestino;
	private long codigoOser;
	private String codigoEstado;
	private String codigoOficinaDestino;
	private String observacion;
	private String tipoLlave;
	private String llaveTarifa;
	private String codigoCentroCosto;
	private String flagFactura;
	private long producto;
	private long customDuties;
	private long crrnSeqCodigo;
	private String fechaCreacion;
	private long numeroWhr;
	private double largo;
	private double ancho;
	private double alto;
	private double whrVolumen;
	private long whrCntPiezas;
	private int codigoRegion;
	private String codigoServicioTraducido;
	private int unidadValor;
	private String unidadDescripcion;
	private int cubicado;

	/**
	 * Crea instancia de {@link OrdenServicio}.
	 * 
	 */
	public OrdenServicio() {
		super();
	}

	/**
	 * Crea instancia de {@link OrdenServicio}.
	 * 
	 * @param to
	 */
	public OrdenServicio(final OrdenServicioTO to) {
		if (to != null) {
			this.eevvNmrId = to.getEevvNmrId();
			this.codigoTipoClaseTarifa = to.getCodigoTipoClaseTarifa();
			this.tipoPago = to.getTipoPago();
			this.tipoPagoOtros = to.getTipoPagoOtros();
			this.tipoMedida = to.getTipoMedida();
			this.idAgente = to.getIdAgente();
			this.dvAgente = to.getDvAgente();
			this.rgnEstadoAgente = to.getRgnEstadoAgente();
			this.dirComunaAgente = to.getDirComunaAgente();
			this.dirCalleAgente = to.getDirCalleAgente();
			final Integer dirNmrAgente2 = to.getDirNmrAgente();
			this.dirNmrAgente = dirNmrAgente2 != null ? dirNmrAgente2 : 0;
			this.dirBlockAgente = to.getDirBlockAgente();
			this.dirDeptoAgente = to.getDirDeptoAgente();
			final Integer dirPisoAgente2 = to.getDirPisoAgente();
			this.dirPisoAgente = dirPisoAgente2 != null ? dirPisoAgente2 : 0;
			this.direccionAgente = to.getDireccionAgente();
			this.codigoPostalAgente = to.getCodigoPostalAgente();
			this.prfjFonoAgente = to.getPrfjFonoAgente();
			this.fonoAgente = to.getFonoAgente();
			this.extFonoAgente = to.getExtFonoAgente();
			this.idEmbarque = to.getIdEmbarque();
			this.dvEmbarque = to.getDvEmbarque();
			this.nombreEmbarque = to.getNombreEmbarque();
			this.dirRgnEstadoEmbarque = to.getDirRgnEstadoEmbarque();
			this.dirCalleEmbarque = to.getDirCalleEmbarque();
			this.dirComunaEmbarque = to.getDirComunaEmbarque();
			this.dirNmrEmbarque = to.getDirNmrEmbarque();
			this.dirBlockEmbarque = to.getDirBlockEmbarque();
			final Integer dirPisoEmbarque2 = to.getDirPisoEmbarque();
			this.dirPisoEmbarque = dirPisoEmbarque2 != null ? dirPisoEmbarque2
					: 0;
			this.direccionEmbarque = to.getDireccionEmbarque();
			this.codigoPostalEmbarque = to.getCodigoPostalEmbarque();
			this.prfjFonoEmbarque = to.getPrfjFonoEmbarque();
			this.fonoEmbarque = to.getFonoEmbarque();
			this.extfonoEmbarque = to.getExtfonoEmbarque();
			this.idDestino = to.getIdDestino();
			this.dvDestino = to.getDvDestino();
			this.dirRgnEstadoDestino = to.getDirRgnEstadoDestino();
			this.dirComunaDestino = to.getDirComunaDestino();
			this.dirCalleDestino = to.getDirCalleDestino();
			this.dirNmrDestino = to.getDirNmrDestino();
			this.dirBlockDestino = to.getDirBlockDestino();
			this.dirDeptoDestino = to.getDirDeptoDestino();
			final Integer dirPisoDestino2 = to.getDirPisoDestino();
			this.dirPisoDestino = dirPisoDestino2 != null ? dirPisoDestino2 : 0;
			this.direccionDestino = to.getDireccionDestino();
			this.cdgPostalDestino = to.getCdgPostalDestino();
			this.prfjFonoDestino = to.getPrfjFonoDestino();
			this.fonoDestino = to.getFonoDestino();
			this.extFonoDestino = to.getExtFonoDestino();
			this.valorDeclarado = to.getValorDeclarado();
			this.valorSeguro = to.getValorSeguro();
			this.valorAduana = to.getValorAduana();
			this.valorFletepp = to.getValorFletepp();
			this.valorFletecc = to.getValorFletecc();
			this.valorValorapp = to.getValorValorapp();
			this.valorValoracc = to.getValorValoracc();
			this.valorGastoAgentepp = to.getValorGastoAgentepp();
			this.valorGastoAgentecc = to.getValorGastoAgentecc();
			this.valorGastoCarrierpp = to.getValorGastoCarrierpp();
			this.valorGastoCarriercc = to.getValorGastoCarriercc();
			this.valorImptopp = to.getValorImptopp();
			this.valorImptocc = to.getValorImptocc();
			this.valorVariospp = to.getValorVariospp();
			this.valorVarioscc = to.getValorVarioscc();
			this.cntPiezas = to.getCntPiezas();
			this.pesoFisico = to.getPesoFisico();
			this.pesoVolumen = to.getPesoVolumen();
			this.tarifa = to.getTarifa();
			this.descripcionProducto = to.getDescripcionProducto();
			this.codigoMoneda = to.getCodigoMoneda();
			this.codigoEmpresa = to.getCodigoEmpresa();
			this.codigoEmpresaLaer = to.getCodigoEmpresaLaer();
			this.codigoPostaDestino = to.getCodigoPostaDestino();
			this.codigoTipoNegDestino = to.getCodigoTipoNegDestino();
			this.codigoPostaOrigen = to.getCodigoPostaOrigen();
			this.codigoTipoNegOrigen = to.getCodigoTipoNegOrigen();
			this.codigoServicio = to.getCodigoServicio();
			this.codigoUsuario = to.getCodigoUsuario();
			this.codigoFamilia = to.getCodigoFamilia();
			this.codigoProducto = to.getCodigoProducto();
			this.doctEevvNmrId = to.getDoctEevvNmrId();
			this.tpclCodigoAgente = to.getTpclCodigoAgente();
			this.clhlCodigoAgente = to.getClhlCodigoAgente();
			this.clhlSucursalAgente = to.getClhlSucursalAgente();
			this.tpclCodigoEmbarque = to.getTpclCodigoEmbarque();
			this.clhlCodigoEmbarque = to.getClhlCodigoEmbarque();
			this.clhlSucursalEmbarque = to.getClhlSucursalEmbarque();
			this.tpclCodigoDestino = to.getTpclCodigoDestino();
			this.clhlCodigoDestino = to.getClhlCodigoDestino();
			this.clhlSucursalDestino = to.getClhlSucursalDestino();
			this.nombreDestino = to.getNombreDestino();
			this.codigoOser = to.getCodigoOser();
			this.codigoEstado = to.getCodigoEstado();
			this.codigoOficinaDestino = to.getCodigoOficinaDestino();
			this.observacion = to.getObservacion();
			this.tipoLlave = to.getTipoLlave();
			this.llaveTarifa = to.getLlaveTarifa();
			this.codigoCentroCosto = to.getCodigoCentroCosto();
			this.flagFactura = to.getFlagFactura();
			this.producto = to.getProducto();
			this.customDuties = to.getCustomDuties();
			this.crrnSeqCodigo = to.getCrrnSeqCodigo();
			this.fechaCreacion = to.getFechaCreacion();
			this.numeroWhr = to.getNumeroWhr();
			this.largo = to.getLargo();
			this.ancho = to.getAncho();
			this.alto = to.getAlto();
			this.whrVolumen = to.getWhrVolumen();
			this.whrCntPiezas = to.getWhrCntPiezas();
			this.codigoRegion = to.getCodigoRegion();
			this.codigoServicioTraducido = to.getCodigoServicioTraducido();
			final Integer unidadValor2 = to.getUnidadValor();
			this.unidadValor = unidadValor2 != null ? unidadValor2 : 0;
			this.unidadDescripcion = to.getUnidadDescripcion();
			final Integer cubicado2 = to.getCubicado();
			this.cubicado = cubicado2 != null ? cubicado2 : 0;
		}
	}

	/**
	 * @return the codigoTipoClaseTarifa
	 */
	public String getCodigoTipoClaseTarifa() {
		return codigoTipoClaseTarifa;
	}

	/**
	 * @param codigoTipoClaseTarifa
	 *            the codigoTipoClaseTarifa to set
	 */
	public void setCodigoTipoClaseTarifa(final String codigoTipoClaseTarifa) {
		this.codigoTipoClaseTarifa = codigoTipoClaseTarifa;
	}

	/**
	 * @return the tipoPago
	 */
	public String getTipoPago() {
		return tipoPago;
	}

	/**
	 * @param tipoPago
	 *            the tipoPago to set
	 */
	public void setTipoPago(final String tipoPago) {
		this.tipoPago = tipoPago;
	}

	/**
	 * @return the tipoPagoOtros
	 */
	public String getTipoPagoOtros() {
		return tipoPagoOtros;
	}

	/**
	 * @param tipoPagoOtros
	 *            the tipoPagoOtros to set
	 */
	public void setTipoPagoOtros(final String tipoPagoOtros) {
		this.tipoPagoOtros = tipoPagoOtros;
	}

	/**
	 * @return the tipoMedida
	 */
	public String getTipoMedida() {
		return tipoMedida;
	}

	/**
	 * @param tipoMedida
	 *            the tipoMedida to set
	 */
	public void setTipoMedida(final String tipoMedida) {
		this.tipoMedida = tipoMedida;
	}

	/**
	 * @return the idAgente
	 */
	public String getIdAgente() {
		return idAgente;
	}

	/**
	 * @param idAgente
	 *            the idAgente to set
	 */
	public void setIdAgente(final String idAgente) {
		this.idAgente = idAgente;
	}

	/**
	 * @return the dvAgente
	 */
	public String getDvAgente() {
		return dvAgente;
	}

	/**
	 * @param dvAgente
	 *            the dvAgente to set
	 */
	public void setDvAgente(final String dvAgente) {
		this.dvAgente = dvAgente;
	}

	/**
	 * @return the rgnEstadoAgente
	 */
	public String getRgnEstadoAgente() {
		return rgnEstadoAgente;
	}

	/**
	 * @param rgnEstadoAgente
	 *            the rgnEstadoAgente to set
	 */
	public void setRgnEstadoAgente(final String rgnEstadoAgente) {
		this.rgnEstadoAgente = rgnEstadoAgente;
	}

	/**
	 * @return the dirComunaAgente
	 */
	public String getDirComunaAgente() {
		return dirComunaAgente;
	}

	/**
	 * @param dirComunaAgente
	 *            the dirComunaAgente to set
	 */
	public void setDirComunaAgente(final String dirComunaAgente) {
		this.dirComunaAgente = dirComunaAgente;
	}

	/**
	 * @return the dirCalleAgente
	 */
	public String getDirCalleAgente() {
		return dirCalleAgente;
	}

	/**
	 * @param dirCalleAgente
	 *            the dirCalleAgente to set
	 */
	public void setDirCalleAgente(final String dirCalleAgente) {
		this.dirCalleAgente = dirCalleAgente;
	}

	/**
	 * @return the dirNmrAgente
	 */
	public int getDirNmrAgente() {
		return dirNmrAgente;
	}

	/**
	 * @param dirNmrAgente
	 *            the dirNmrAgente to set
	 */
	public void setDirNmrAgente(final int dirNmrAgente) {
		this.dirNmrAgente = dirNmrAgente;
	}

	/**
	 * @return the dirBlockAgente
	 */
	public String getDirBlockAgente() {
		return dirBlockAgente;
	}

	/**
	 * @param dirBlockAgente
	 *            the dirBlockAgente to set
	 */
	public void setDirBlockAgente(final String dirBlockAgente) {
		this.dirBlockAgente = dirBlockAgente;
	}

	/**
	 * @return the dirDeptoAgente
	 */
	public String getDirDeptoAgente() {
		return dirDeptoAgente;
	}

	/**
	 * @param dirDeptoAgente
	 *            the dirDeptoAgente to set
	 */
	public void setDirDeptoAgente(final String dirDeptoAgente) {
		this.dirDeptoAgente = dirDeptoAgente;
	}

	/**
	 * @return the dirPisoAgente
	 */
	public int getDirPisoAgente() {
		return dirPisoAgente;
	}

	/**
	 * @param dirPisoAgente
	 *            the dirPisoAgente to set
	 */
	public void setDirPisoAgente(final int dirPisoAgente) {
		this.dirPisoAgente = dirPisoAgente;
	}

	/**
	 * @return the direccionAgente
	 */
	public String getDireccionAgente() {
		return direccionAgente;
	}

	/**
	 * @param direccionAgente
	 *            the direccionAgente to set
	 */
	public void setDireccionAgente(final String direccionAgente) {
		this.direccionAgente = direccionAgente;
	}

	/**
	 * @return the codigoPostalAgente
	 */
	public String getCodigoPostalAgente() {
		return codigoPostalAgente;
	}

	/**
	 * @param codigoPostalAgente
	 *            the codigoPostalAgente to set
	 */
	public void setCodigoPostalAgente(final String codigoPostalAgente) {
		this.codigoPostalAgente = codigoPostalAgente;
	}

	/**
	 * @return the prfjFonoAgente
	 */
	public String getPrfjFonoAgente() {
		return prfjFonoAgente;
	}

	/**
	 * @param prfjFonoAgente
	 *            the prfjFonoAgente to set
	 */
	public void setPrfjFonoAgente(final String prfjFonoAgente) {
		this.prfjFonoAgente = prfjFonoAgente;
	}

	/**
	 * @return the fonoAgente
	 */
	public String getFonoAgente() {
		return fonoAgente;
	}

	/**
	 * @param fonoAgente
	 *            the fonoAgente to set
	 */
	public void setFonoAgente(final String fonoAgente) {
		this.fonoAgente = fonoAgente;
	}

	/**
	 * @return the extFonoAgente
	 */
	public String getExtFonoAgente() {
		return extFonoAgente;
	}

	/**
	 * @param extFonoAgente
	 *            the extFonoAgente to set
	 */
	public void setExtFonoAgente(final String extFonoAgente) {
		this.extFonoAgente = extFonoAgente;
	}

	/**
	 * @return the dvEmbarque
	 */
	public String getDvEmbarque() {
		return dvEmbarque;
	}

	/**
	 * @param dvEmbarque
	 *            the dvEmbarque to set
	 */
	public void setDvEmbarque(final String dvEmbarque) {
		this.dvEmbarque = dvEmbarque;
	}

	/**
	 * @return the nombreEmbarque
	 */
	public String getNombreEmbarque() {
		return nombreEmbarque;
	}

	/**
	 * @param nombreEmbarque
	 *            the nombreEmbarque to set
	 */
	public void setNombreEmbarque(final String nombreEmbarque) {
		this.nombreEmbarque = nombreEmbarque;
	}

	/**
	 * @return the dirRgnEstadoEmbarque
	 */
	public String getDirRgnEstadoEmbarque() {
		return dirRgnEstadoEmbarque;
	}

	/**
	 * @param dirRgnEstadoEmbarque
	 *            the dirRgnEstadoEmbarque to set
	 */
	public void setDirRgnEstadoEmbarque(final String dirRgnEstadoEmbarque) {
		this.dirRgnEstadoEmbarque = dirRgnEstadoEmbarque;
	}

	/**
	 * @return the dirCalleEmbarque
	 */
	public String getDirCalleEmbarque() {
		return dirCalleEmbarque;
	}

	/**
	 * @param dirCalleEmbarque
	 *            the dirCalleEmbarque to set
	 */
	public void setDirCalleEmbarque(final String dirCalleEmbarque) {
		this.dirCalleEmbarque = dirCalleEmbarque;
	}

	/**
	 * @return the dirComunaEmbarque
	 */
	public String getDirComunaEmbarque() {
		return dirComunaEmbarque;
	}

	/**
	 * @param dirComunaEmbarque
	 *            the dirComunaEmbarque to set
	 */
	public void setDirComunaEmbarque(final String dirComunaEmbarque) {
		this.dirComunaEmbarque = dirComunaEmbarque;
	}

	/**
	 * @return the dirNmrEmbarque
	 */
	public long getDirNmrEmbarque() {
		return dirNmrEmbarque;
	}

	/**
	 * @param dirNmrEmbarque
	 *            the dirNmrEmbarque to set
	 */
	public void setDirNmrEmbarque(final long dirNmrEmbarque) {
		this.dirNmrEmbarque = dirNmrEmbarque;
	}

	/**
	 * @return the dirBlockEmbarque
	 */
	public String getDirBlockEmbarque() {
		return dirBlockEmbarque;
	}

	/**
	 * @param dirBlockEmbarque
	 *            the dirBlockEmbarque to set
	 */
	public void setDirBlockEmbarque(final String dirBlockEmbarque) {
		this.dirBlockEmbarque = dirBlockEmbarque;
	}

	/**
	 * @return the dirPisoEmbarque
	 */
	public int getDirPisoEmbarque() {
		return dirPisoEmbarque;
	}

	/**
	 * @param dirPisoEmbarque
	 *            the dirPisoEmbarque to set
	 */
	public void setDirPisoEmbarque(final int dirPisoEmbarque) {
		this.dirPisoEmbarque = dirPisoEmbarque;
	}

	/**
	 * @return the direccionEmbarque
	 */
	public String getDireccionEmbarque() {
		return direccionEmbarque;
	}

	/**
	 * @param direccionEmbarque
	 *            the direccionEmbarque to set
	 */
	public void setDireccionEmbarque(final String direccionEmbarque) {
		this.direccionEmbarque = direccionEmbarque;
	}

	/**
	 * @return the codigoPostalEmbarque
	 */
	public String getCodigoPostalEmbarque() {
		return codigoPostalEmbarque;
	}

	/**
	 * @param codigoPostalEmbarque
	 *            the codigoPostalEmbarque to set
	 */
	public void setCodigoPostalEmbarque(final String codigoPostalEmbarque) {
		this.codigoPostalEmbarque = codigoPostalEmbarque;
	}

	/**
	 * @return the prfjFonoEmbarque
	 */
	public String getPrfjFonoEmbarque() {
		return prfjFonoEmbarque;
	}

	/**
	 * @param prfjFonoEmbarque
	 *            the prfjFonoEmbarque to set
	 */
	public void setPrfjFonoEmbarque(final String prfjFonoEmbarque) {
		this.prfjFonoEmbarque = prfjFonoEmbarque;
	}

	/**
	 * @return the fonoEmbarque
	 */
	public String getFonoEmbarque() {
		return fonoEmbarque;
	}

	/**
	 * @param fonoEmbarque
	 *            the fonoEmbarque to set
	 */
	public void setFonoEmbarque(final String fonoEmbarque) {
		this.fonoEmbarque = fonoEmbarque;
	}

	/**
	 * @return the extfonoEmbarque
	 */
	public String getExtfonoEmbarque() {
		return extfonoEmbarque;
	}

	/**
	 * @param extfonoEmbarque
	 *            the extfonoEmbarque to set
	 */
	public void setExtfonoEmbarque(final String extfonoEmbarque) {
		this.extfonoEmbarque = extfonoEmbarque;
	}

	/**
	 * @return the idDestino
	 */
	public String getIdDestino() {
		return idDestino;
	}

	/**
	 * @param idDestino
	 *            the idDestino to set
	 */
	public void setIdDestino(final String idDestino) {
		this.idDestino = idDestino;
	}

	/**
	 * @return the dvDestino
	 */
	public String getDvDestino() {
		return dvDestino;
	}

	/**
	 * @param dvDestino
	 *            the dvDestino to set
	 */
	public void setDvDestino(final String dvDestino) {
		this.dvDestino = dvDestino;
	}

	/**
	 * @return the dirRgnEstadoDestino
	 */
	public String getDirRgnEstadoDestino() {
		return dirRgnEstadoDestino;
	}

	/**
	 * @param dirRgnEstadoDestino
	 *            the dirRgnEstadoDestino to set
	 */
	public void setDirRgnEstadoDestino(final String dirRgnEstadoDestino) {
		this.dirRgnEstadoDestino = dirRgnEstadoDestino;
	}

	/**
	 * @return the dirComunaDestino
	 */
	public String getDirComunaDestino() {
		return dirComunaDestino;
	}

	/**
	 * @param dirComunaDestino
	 *            the dirComunaDestino to set
	 */
	public void setDirComunaDestino(final String dirComunaDestino) {
		this.dirComunaDestino = dirComunaDestino;
	}

	/**
	 * @return the dirCalleDestino
	 */
	public String getDirCalleDestino() {
		return dirCalleDestino;
	}

	/**
	 * @param dirCalleDestino
	 *            the dirCalleDestino to set
	 */
	public void setDirCalleDestino(final String dirCalleDestino) {
		this.dirCalleDestino = dirCalleDestino;
	}

	/**
	 * @return the dirNmrDestino
	 */
	public long getDirNmrDestino() {
		return dirNmrDestino;
	}

	/**
	 * @param dirNmrDestino
	 *            the dirNmrDestino to set
	 */
	public void setDirNmrDestino(final long dirNmrDestino) {
		this.dirNmrDestino = dirNmrDestino;
	}

	/**
	 * @return the dirBlockDestino
	 */
	public String getDirBlockDestino() {
		return dirBlockDestino;
	}

	/**
	 * @param dirBlockDestino
	 *            the dirBlockDestino to set
	 */
	public void setDirBlockDestino(final String dirBlockDestino) {
		this.dirBlockDestino = dirBlockDestino;
	}

	/**
	 * @return the dirDeptoDestino
	 */
	public String getDirDeptoDestino() {
		return dirDeptoDestino;
	}

	/**
	 * @param dirDeptoDestino
	 *            the dirDeptoDestino to set
	 */
	public void setDirDeptoDestino(final String dirDeptoDestino) {
		this.dirDeptoDestino = dirDeptoDestino;
	}

	/**
	 * @return the dirPisoDestino
	 */
	public int getDirPisoDestino() {
		return dirPisoDestino;
	}

	/**
	 * @param dirPisoDestino
	 *            the dirPisoDestino to set
	 */
	public void setDirPisoDestino(final int dirPisoDestino) {
		this.dirPisoDestino = dirPisoDestino;
	}

	/**
	 * @return the direccionDestino
	 */
	public String getDireccionDestino() {
		return direccionDestino;
	}

	/**
	 * @param direccionDestino
	 *            the direccionDestino to set
	 */
	public void setDireccionDestino(final String direccionDestino) {
		this.direccionDestino = direccionDestino;
	}

	/**
	 * @return the cdgPostalDestino
	 */
	public String getCdgPostalDestino() {
		return cdgPostalDestino;
	}

	/**
	 * @param cdgPostalDestino
	 *            the cdgPostalDestino to set
	 */
	public void setCdgPostalDestino(final String cdgPostalDestino) {
		this.cdgPostalDestino = cdgPostalDestino;
	}

	/**
	 * @return the prfjFonoDestino
	 */
	public String getPrfjFonoDestino() {
		return prfjFonoDestino;
	}

	/**
	 * @param prfjFonoDestino
	 *            the prfjFonoDestino to set
	 */
	public void setPrfjFonoDestino(final String prfjFonoDestino) {
		this.prfjFonoDestino = prfjFonoDestino;
	}

	/**
	 * @return the fonoDestino
	 */
	public String getFonoDestino() {
		return fonoDestino;
	}

	/**
	 * @param fonoDestino
	 *            the fonoDestino to set
	 */
	public void setFonoDestino(final String fonoDestino) {
		this.fonoDestino = fonoDestino;
	}

	/**
	 * @return the extFonoDestino
	 */
	public String getExtFonoDestino() {
		return extFonoDestino;
	}

	/**
	 * @param extFonoDestino
	 *            the extFonoDestino to set
	 */
	public void setExtFonoDestino(final String extFonoDestino) {
		this.extFonoDestino = extFonoDestino;
	}

	/**
	 * @param tarifa
	 *            the tarifa to set
	 */
	public void setTarifa(final long tarifa) {
		this.tarifa = tarifa;
	}

	/**
	 * @return the descripcionProducto
	 */
	public String getDescripcionProducto() {
		return descripcionProducto;
	}

	/**
	 * @param descripcionProducto
	 *            the descripcionProducto to set
	 */
	public void setDescripcionProducto(final String descripcionProducto) {
		this.descripcionProducto = descripcionProducto;
	}

	/**
	 * @return the codigoMoneda
	 */
	public String getCodigoMoneda() {
		return codigoMoneda;
	}

	/**
	 * @param codigoMoneda
	 *            the codigoMoneda to set
	 */
	public void setCodigoMoneda(final String codigoMoneda) {
		this.codigoMoneda = codigoMoneda;
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

	/**
	 * @return the codigoEmpresaLaer
	 */
	public long getCodigoEmpresaLaer() {
		return codigoEmpresaLaer;
	}

	/**
	 * @param codigoEmpresaLaer
	 *            the codigoEmpresaLaer to set
	 */
	public void setCodigoEmpresaLaer(final long codigoEmpresaLaer) {
		this.codigoEmpresaLaer = codigoEmpresaLaer;
	}

	/**
	 * @return the codigoPostaDestino
	 */
	public String getCodigoPostaDestino() {
		return codigoPostaDestino;
	}

	/**
	 * @param codigoPostaDestino
	 *            the codigoPostaDestino to set
	 */
	public void setCodigoPostaDestino(final String codigoPostaDestino) {
		this.codigoPostaDestino = codigoPostaDestino;
	}

	/**
	 * @return the codigoTipoNegDestino
	 */
	public long getCodigoTipoNegDestino() {
		return codigoTipoNegDestino;
	}

	/**
	 * @param codigoTipoNegDestino
	 *            the codigoTipoNegDestino to set
	 */
	public void setCodigoTipoNegDestino(final long codigoTipoNegDestino) {
		this.codigoTipoNegDestino = codigoTipoNegDestino;
	}

	/**
	 * @return the codigoPostaOrigen
	 */
	public String getCodigoPostaOrigen() {
		return codigoPostaOrigen;
	}

	/**
	 * @param codigoPostaOrigen
	 *            the codigoPostaOrigen to set
	 */
	public void setCodigoPostaOrigen(final String codigoPostaOrigen) {
		this.codigoPostaOrigen = codigoPostaOrigen;
	}

	/**
	 * @return the codigoTipoNegOrigen
	 */
	public long getCodigoTipoNegOrigen() {
		return codigoTipoNegOrigen;
	}

	/**
	 * @param codigoTipoNegOrigen
	 *            the codigoTipoNegOrigen to set
	 */
	public void setCodigoTipoNegOrigen(final long codigoTipoNegOrigen) {
		this.codigoTipoNegOrigen = codigoTipoNegOrigen;
	}

	/**
	 * @return the codigoServicio
	 */
	public String getCodigoServicio() {
		return codigoServicio;
	}

	/**
	 * @param codigoServicio
	 *            the codigoServicio to set
	 */
	public void setCodigoServicio(final String codigoServicio) {
		this.codigoServicio = codigoServicio;
	}

	/**
	 * @return the codigoUsuario
	 */
	public String getCodigoUsuario() {
		return codigoUsuario;
	}

	/**
	 * @param codigoUsuario
	 *            the codigoUsuario to set
	 */
	public void setCodigoUsuario(final String codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	/**
	 * @return the codigoFamilia
	 */
	public String getCodigoFamilia() {
		return codigoFamilia;
	}

	/**
	 * @param codigoFamilia
	 *            the codigoFamilia to set
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
	 * @param codigoProducto
	 *            the codigoProducto to set
	 */
	public void setCodigoProducto(final String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	/**
	 * @return the doctEevvNmrId
	 */
	public long getDoctEevvNmrId() {
		return doctEevvNmrId;
	}

	/**
	 * @param doctEevvNmrId
	 *            the doctEevvNmrId to set
	 */
	public void setDoctEevvNmrId(final long doctEevvNmrId) {
		this.doctEevvNmrId = doctEevvNmrId;
	}

	/**
	 * @return the tpclCodigoAgente
	 */
	public long getTpclCodigoAgente() {
		return tpclCodigoAgente;
	}

	/**
	 * @param tpclCodigoAgente
	 *            the tpclCodigoAgente to set
	 */
	public void setTpclCodigoAgente(final long tpclCodigoAgente) {
		this.tpclCodigoAgente = tpclCodigoAgente;
	}

	/**
	 * @return the clhlCodigoAgente
	 */
	public long getClhlCodigoAgente() {
		return clhlCodigoAgente;
	}

	/**
	 * @param clhlCodigoAgente
	 *            the clhlCodigoAgente to set
	 */
	public void setClhlCodigoAgente(final long clhlCodigoAgente) {
		this.clhlCodigoAgente = clhlCodigoAgente;
	}

	/**
	 * @return the clhlSucursalAgente
	 */
	public long getClhlSucursalAgente() {
		return clhlSucursalAgente;
	}

	/**
	 * @param clhlSucursalAgente
	 *            the clhlSucursalAgente to set
	 */
	public void setClhlSucursalAgente(final long clhlSucursalAgente) {
		this.clhlSucursalAgente = clhlSucursalAgente;
	}

	/**
	 * @return the tpclCodigoEmbarque
	 */
	public long getTpclCodigoEmbarque() {
		return tpclCodigoEmbarque;
	}

	/**
	 * @param tpclCodigoEmbarque
	 *            the tpclCodigoEmbarque to set
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
	 * @param clhlCodigoEmbarque
	 *            the clhlCodigoEmbarque to set
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
	 * @param clhlSucursalEmbarque
	 *            the clhlSucursalEmbarque to set
	 */
	public void setClhlSucursalEmbarque(final long clhlSucursalEmbarque) {
		this.clhlSucursalEmbarque = clhlSucursalEmbarque;
	}

	/**
	 * @return the tpclCodigoDestino
	 */
	public long getTpclCodigoDestino() {
		return tpclCodigoDestino;
	}

	/**
	 * @param tpclCodigoDestino
	 *            the tpclCodigoDestino to set
	 */
	public void setTpclCodigoDestino(final long tpclCodigoDestino) {
		this.tpclCodigoDestino = tpclCodigoDestino;
	}

	/**
	 * @return the clhlCodigoDestino
	 */
	public long getClhlCodigoDestino() {
		return clhlCodigoDestino;
	}

	/**
	 * @param clhlCodigoDestino
	 *            the clhlCodigoDestino to set
	 */
	public void setClhlCodigoDestino(final long clhlCodigoDestino) {
		this.clhlCodigoDestino = clhlCodigoDestino;
	}

	/**
	 * @return the clhlSucursalDestino
	 */
	public long getClhlSucursalDestino() {
		return clhlSucursalDestino;
	}

	/**
	 * @param clhlSucursalDestino
	 *            the clhlSucursalDestino to set
	 */
	public void setClhlSucursalDestino(final long clhlSucursalDestino) {
		this.clhlSucursalDestino = clhlSucursalDestino;
	}

	/**
	 * @return the nombreDestino
	 */
	public String getNombreDestino() {
		return nombreDestino;
	}

	/**
	 * @param nombreDestino
	 *            the nombreDestino to set
	 */
	public void setNombreDestino(final String nombreDestino) {
		this.nombreDestino = nombreDestino;
	}

	/**
	 * @return the codigoOser
	 */
	public long getCodigoOser() {
		return codigoOser;
	}

	/**
	 * @param codigoOser
	 *            the codigoOser to set
	 */
	public void setCodigoOser(final long codigoOser) {
		this.codigoOser = codigoOser;
	}

	/**
	 * @return the codigoEstado
	 */
	public String getCodigoEstado() {
		return codigoEstado;
	}

	/**
	 * @param codigoEstado
	 *            the codigoEstado to set
	 */
	public void setCodigoEstado(final String codigoEstado) {
		this.codigoEstado = codigoEstado;
	}

	/**
	 * @return the codigoOficinaDestino
	 */
	public String getCodigoOficinaDestino() {
		return codigoOficinaDestino;
	}

	/**
	 * @param codigoOficinaDestino
	 *            the codigoOficinaDestino to set
	 */
	public void setCodigoOficinaDestino(final String codigoOficinaDestino) {
		this.codigoOficinaDestino = codigoOficinaDestino;
	}

	/**
	 * @return the observacion
	 */
	public String getObservacion() {
		return observacion;
	}

	/**
	 * @param observacion
	 *            the observacion to set
	 */
	public void setObservacion(final String observacion) {
		this.observacion = observacion;
	}

	/**
	 * @return the tipoLlave
	 */
	public String getTipoLlave() {
		return tipoLlave;
	}

	/**
	 * @param tipoLlave
	 *            the tipoLlave to set
	 */
	public void setTipoLlave(final String tipoLlave) {
		this.tipoLlave = tipoLlave;
	}

	/**
	 * @return the llaveTarifa
	 */
	public String getLlaveTarifa() {
		return llaveTarifa;
	}

	/**
	 * @param llaveTarifa
	 *            the llaveTarifa to set
	 */
	public void setLlaveTarifa(final String llaveTarifa) {
		this.llaveTarifa = llaveTarifa;
	}

	/**
	 * @return the codigoCentroCosto
	 */
	public String getCodigoCentroCosto() {
		return codigoCentroCosto;
	}

	/**
	 * @param codigoCentroCosto
	 *            the codigoCentroCosto to set
	 */
	public void setCodigoCentroCosto(final String codigoCentroCosto) {
		this.codigoCentroCosto = codigoCentroCosto;
	}

	/**
	 * @return the flagFactura
	 */
	public String getFlagFactura() {
		return flagFactura;
	}

	/**
	 * @param flagFactura
	 *            the flagFactura to set
	 */
	public void setFlagFactura(final String flagFactura) {
		this.flagFactura = flagFactura;
	}

	/**
	 * @return the producto
	 */
	public long getProducto() {
		return producto;
	}

	/**
	 * @param producto
	 *            the producto to set
	 */
	public void setProducto(final long producto) {
		this.producto = producto;
	}

	/**
	 * @return the customDuties
	 */
	public long getCustomDuties() {
		return customDuties;
	}

	/**
	 * @param customDuties
	 *            the customDuties to set
	 */
	public void setCustomDuties(final long customDuties) {
		this.customDuties = customDuties;
	}

	/**
	 * @return the crrnSeqCodigo
	 */
	public long getCrrnSeqCodigo() {
		return crrnSeqCodigo;
	}

	/**
	 * @param crrnSeqCodigo
	 *            the crrnSeqCodigo to set
	 */
	public void setCrrnSeqCodigo(final long crrnSeqCodigo) {
		this.crrnSeqCodigo = crrnSeqCodigo;
	}

	/**
	 * @return the idEmbarque
	 */
	public String getIdEmbarque() {
		return idEmbarque;
	}

	/**
	 * @param idEmbarque
	 *            the idEmbarque to set
	 */
	public void setIdEmbarque(final String idEmbarque) {
		this.idEmbarque = idEmbarque;
	}

	/**
	 * @return the eevvNmrId
	 */
	public long getEevvNmrId() {
		return eevvNmrId;
	}

	/**
	 * @param eevvNmrId
	 *            the eevvNmrId to set
	 */
	public void setEevvNmrId(final long eevvNmrId) {
		this.eevvNmrId = eevvNmrId;
	}

	/**
	 * @return the valorDeclarado
	 */
	public double getValorDeclarado() {
		return valorDeclarado;
	}

	/**
	 * @param valorDeclarado
	 *            the valorDeclarado to set
	 */
	public void setValorDeclarado(final double valorDeclarado) {
		this.valorDeclarado = valorDeclarado;
	}

	/**
	 * @return the valorSeguro
	 */
	public double getValorSeguro() {
		return valorSeguro;
	}

	/**
	 * @param valorSeguro
	 *            the valorSeguro to set
	 */
	public void setValorSeguro(final double valorSeguro) {
		this.valorSeguro = valorSeguro;
	}

	/**
	 * @return the valorAduana
	 */
	public double getValorAduana() {
		return valorAduana;
	}

	/**
	 * @param valorAduana
	 *            the valorAduana to set
	 */
	public void setValorAduana(final double valorAduana) {
		this.valorAduana = valorAduana;
	}

	/**
	 * @return the valorFletepp
	 */
	public double getValorFletepp() {
		return valorFletepp;
	}

	/**
	 * @param valorFletepp
	 *            the valorFletepp to set
	 */
	public void setValorFletepp(final double valorFletepp) {
		this.valorFletepp = valorFletepp;
	}

	/**
	 * @return the valorFletecc
	 */
	public double getValorFletecc() {
		return valorFletecc;
	}

	/**
	 * @param valorFletecc
	 *            the valorFletecc to set
	 */
	public void setValorFletecc(final double valorFletecc) {
		this.valorFletecc = valorFletecc;
	}

	/**
	 * @return the valorValorapp
	 */
	public double getValorValorapp() {
		return valorValorapp;
	}

	/**
	 * @param valorValorapp
	 *            the valorValorapp to set
	 */
	public void setValorValorapp(final double valorValorapp) {
		this.valorValorapp = valorValorapp;
	}

	/**
	 * @return the valorValoracc
	 */
	public double getValorValoracc() {
		return valorValoracc;
	}

	/**
	 * @param valorValoracc
	 *            the valorValoracc to set
	 */
	public void setValorValoracc(final double valorValoracc) {
		this.valorValoracc = valorValoracc;
	}

	/**
	 * @return the valorGastoAgentepp
	 */
	public double getValorGastoAgentepp() {
		return valorGastoAgentepp;
	}

	/**
	 * @param valorGastoAgentepp
	 *            the valorGastoAgentepp to set
	 */
	public void setValorGastoAgentepp(final double valorGastoAgentepp) {
		this.valorGastoAgentepp = valorGastoAgentepp;
	}

	/**
	 * @return the valorGastoAgentecc
	 */
	public double getValorGastoAgentecc() {
		return valorGastoAgentecc;
	}

	/**
	 * @param valorGastoAgentecc
	 *            the valorGastoAgentecc to set
	 */
	public void setValorGastoAgentecc(final double valorGastoAgentecc) {
		this.valorGastoAgentecc = valorGastoAgentecc;
	}

	/**
	 * @return the valorGastoCarrierpp
	 */
	public double getValorGastoCarrierpp() {
		return valorGastoCarrierpp;
	}

	/**
	 * @param valorGastoCarrierpp
	 *            the valorGastoCarrierpp to set
	 */
	public void setValorGastoCarrierpp(final double valorGastoCarrierpp) {
		this.valorGastoCarrierpp = valorGastoCarrierpp;
	}

	/**
	 * @return the valorGastoCarriercc
	 */
	public double getValorGastoCarriercc() {
		return valorGastoCarriercc;
	}

	/**
	 * @param valorGastoCarriercc
	 *            the valorGastoCarriercc to set
	 */
	public void setValorGastoCarriercc(final double valorGastoCarriercc) {
		this.valorGastoCarriercc = valorGastoCarriercc;
	}

	/**
	 * @return the valorImptopp
	 */
	public double getValorImptopp() {
		return valorImptopp;
	}

	/**
	 * @param valorImptopp
	 *            the valorImptopp to set
	 */
	public void setValorImptopp(final double valorImptopp) {
		this.valorImptopp = valorImptopp;
	}

	/**
	 * @return the valorImptocc
	 */
	public double getValorImptocc() {
		return valorImptocc;
	}

	/**
	 * @param valorImptocc
	 *            the valorImptocc to set
	 */
	public void setValorImptocc(final double valorImptocc) {
		this.valorImptocc = valorImptocc;
	}

	/**
	 * @return the valorVariospp
	 */
	public double getValorVariospp() {
		return valorVariospp;
	}

	/**
	 * @param valorVariospp
	 *            the valorVariospp to set
	 */
	public void setValorVariospp(final double valorVariospp) {
		this.valorVariospp = valorVariospp;
	}

	/**
	 * @return the valorVarioscc
	 */
	public double getValorVarioscc() {
		return valorVarioscc;
	}

	/**
	 * @param valorVarioscc
	 *            the valorVarioscc to set
	 */
	public void setValorVarioscc(final double valorVarioscc) {
		this.valorVarioscc = valorVarioscc;
	}

	/**
	 * @return the cntPiezas
	 */
	public long getCntPiezas() {
		return cntPiezas;
	}

	/**
	 * @param cntPiezas
	 *            the cntPiezas to set
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
	 * @param pesoFisico
	 *            the pesoFisico to set
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
	 * @param pesoVolumen
	 *            the pesoVolumen to set
	 */
	public void setPesoVolumen(final double pesoVolumen) {
		this.pesoVolumen = pesoVolumen;
	}

	/**
	 * @return the tarifa
	 */
	public double getTarifa() {
		return tarifa;
	}

	/**
	 * @param tarifa
	 *            the tarifa to set
	 */
	public void setTarifa(final double tarifa) {
		this.tarifa = tarifa;
	}

	/**
	 * @return the numeroWhr
	 */
	public long getNumeroWhr() {
		return numeroWhr;
	}

	/**
	 * @param numeroWhr
	 *            the numeroWhr to set
	 */
	public void setNumeroWhr(final long numeroWhr) {
		this.numeroWhr = numeroWhr;
	}

	/**
	 * @return the largo
	 */
	public double getLargo() {
		return largo;
	}

	/**
	 * @param largo
	 *            the largo to set
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
	 * @param ancho
	 *            the ancho to set
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
	 * @param alto
	 *            the alto to set
	 */
	public void setAlto(final double alto) {
		this.alto = alto;
	}

	/**
	 * @return the whrVolumen
	 */
	public double getWhrVolumen() {
		return whrVolumen;
	}

	/**
	 * @param whrVolumen
	 *            the whrVolumen to set
	 */
	public void setWhrVolumen(final double whrVolumen) {
		this.whrVolumen = whrVolumen;
	}

	/**
	 * @return the whrCntPiezas
	 */
	public long getWhrCntPiezas() {
		return whrCntPiezas;
	}

	/**
	 * @param whrCntPiezas
	 *            the whrCntPiezas to set
	 */
	public void setWhrCntPiezas(final long whrCntPiezas) {
		this.whrCntPiezas = whrCntPiezas;
	}

	/**
	 * @return the codigoRegion
	 */
	public int getCodigoRegion() {
		return codigoRegion;
	}

	/**
	 * @param codigoRegion the codigoRegion to set
	 */
	public void setCodigoRegion(final int codigoRegion) {
		this.codigoRegion = codigoRegion;
	}

	/**
	 * @return the codigoServicioTraducido
	 */
	public String getCodigoServicioTraducido() {
		return codigoServicioTraducido;
	}

	/**
	 * @param codigoServicioTraducido the codigoServicioTraducido to set
	 */
	public void setCodigoServicioTraducido(final String codigoServicioTraducido) {
		this.codigoServicioTraducido = codigoServicioTraducido;
	}

	/**
	 * @return the unidadValor
	 */
	public int getUnidadValor() {
		return unidadValor;
	}

	/**
	 * @param unidadValor the unidadValor to set
	 */
	public void setUnidadValor(final int unidadValor) {
		this.unidadValor = unidadValor;
	}

	/**
	 * @return the unidadDescripcion
	 */
	public String getUnidadDescripcion() {
		return unidadDescripcion;
	}

	/**
	 * @param unidadDescripcion the unidadDescripcion to set
	 */
	public void setUnidadDescripcion(final String unidadDescripcion) {
		this.unidadDescripcion = unidadDescripcion;
	}

	/**
	 * @return the fechaCreacion
	 */
	public String getFechaCreacion() {
		return fechaCreacion;
	}

	/**
	 * @param fechaCreacion the fechaCreacion to set
	 */
	public void setFechaCreacion(final String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	/**
	 * @return the cubicado
	 */
	public int getCubicado() {
		return cubicado;
	}

	/**
	 * @param cubicado the cubicado to set
	 */
	public void setCubicado(final int cubicado) {
		this.cubicado = cubicado;
	}

}
