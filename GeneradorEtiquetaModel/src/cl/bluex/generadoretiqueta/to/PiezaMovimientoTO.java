package cl.bluex.generadoretiqueta.to;

import java.io.Serializable;

public class PiezaMovimientoTO implements Serializable{

	private static final long serialVersionUID = 4344544053871698472L;
	
	private	int	codigoEmpresa;
	private	int	codigoTipoDocumento	;
	private	String	codigoPieza;
	private	String	observacion;
	private	String	codigoTipoEvento;
	private	String	codigoBodegaEntrada;
	private	int	tipoCodigoBodegaEntrada;
	private	String	codigoOficinaEntrada;
	private	String	codigoPersona;
	private	String	fechaMovimiento;
	private	int	cantidadPiezas;
	private	float	pesoFisico;
	private	String	codigoPosta;
	private	int	codigoTipoNegocio;
	private	String	codigoTipoEstado;
	private	String	codigoTipoServicio;
	private	String	codigoTipoServicioPadre;
	private FotoTO foto;
	private ResponsableTO responsable;
	private RutaTO ruta;

	
	
	/**
	 * 
	 */
	public PiezaMovimientoTO() {
		super();
		foto = new FotoTO();
		responsable = new ResponsableTO();
		ruta = new RutaTO();
	}

	

	/**
	 * @param codigoEmpresa
	 * @param codigoTipoDocumento
	 * @param codigoPieza
	 * @param observacion
	 * @param codigoTipoEvento
	 * @param codigoBodegaEntrada
	 * @param tipoCodigoBodegaEntrada
	 * @param codigoOficinaEntrada
	 * @param codigoPersona
	 * @param fechaMovimiento
	 * @param cantidadPiezas
	 * @param pesoFisico
	 * @param codigoPosta
	 * @param codigoTipoNegocio
	 * @param codigoTipoEstado
	 * @param codigoTipoServicio
	 * @param codigoTipoServicioPadre
	 * @param foto
	 * @param responsable
	 * @param ruta
	 */
	public PiezaMovimientoTO(int codigoEmpresa, int codigoTipoDocumento,
			String codigoPieza, String observacion, String codigoTipoEvento,
			String codigoBodegaEntrada, int tipoCodigoBodegaEntrada,
			String codigoOficinaEntrada, String codigoPersona,
			String fechaMovimiento, int cantidadPiezas, float pesoFisico,
			String codigoPosta, int codigoTipoNegocio, String codigoTipoEstado,
			String codigoTipoServicio, String codigoTipoServicioPadre,
			FotoTO foto, ResponsableTO responsable, RutaTO ruta) {
		this.codigoEmpresa = codigoEmpresa;
		this.codigoTipoDocumento = codigoTipoDocumento;
		this.codigoPieza = codigoPieza;
		this.observacion = observacion;
		this.codigoTipoEvento = codigoTipoEvento;
		this.codigoBodegaEntrada = codigoBodegaEntrada;
		this.tipoCodigoBodegaEntrada = tipoCodigoBodegaEntrada;
		this.codigoOficinaEntrada = codigoOficinaEntrada;
		this.codigoPersona = codigoPersona;
		this.fechaMovimiento = fechaMovimiento;
		this.cantidadPiezas = cantidadPiezas;
		this.pesoFisico = pesoFisico;
		this.codigoPosta = codigoPosta;
		this.codigoTipoNegocio = codigoTipoNegocio;
		this.codigoTipoEstado = codigoTipoEstado;
		this.codigoTipoServicio = codigoTipoServicio;
		this.codigoTipoServicioPadre = codigoTipoServicioPadre;
		this.foto = foto;
		this.responsable = responsable;
		this.ruta = ruta;
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
	public void setCodigoEmpresa(int codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}

	/**
	 * @return the codigoTipoDocumento
	 */
	public int getCodigoTipoDocumento() {
		return codigoTipoDocumento;
	}

	/**
	 * @param codigoTipoDocumento the codigoTipoDocumento to set
	 */
	public void setCodigoTipoDocumento(int codigoTipoDocumento) {
		this.codigoTipoDocumento = codigoTipoDocumento;
	}

	/**
	 * @return the observacion
	 */
	public String getObservacion() {
		return observacion;
	}

	/**
	 * @param observacion the observacion to set
	 */
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	/**
	 * @return the codigoTipoEvento
	 */
	public String getCodigoTipoEvento() {
		return codigoTipoEvento;
	}

	/**
	 * @param codigoTipoEvento the codigoTipoEvento to set
	 */
	public void setCodigoTipoEvento(String codigoTipoEvento) {
		this.codigoTipoEvento = codigoTipoEvento;
	}

	/**
	 * @return the codigoBodegaEntrada
	 */
	public String getCodigoBodegaEntrada() {
		return codigoBodegaEntrada;
	}

	/**
	 * @param codigoBodegaEntrada the codigoBodegaEntrada to set
	 */
	public void setCodigoBodegaEntrada(String codigoBodegaEntrada) {
		this.codigoBodegaEntrada = codigoBodegaEntrada;
	}

	/**
	 * @return the tipoCodigoBodegaEntrada
	 */
	public int getTipoCodigoBodegaEntrada() {
		return tipoCodigoBodegaEntrada;
	}

	/**
	 * @param tipoCodigoBodegaEntrada the tipoCodigoBodegaEntrada to set
	 */
	public void setTipoCodigoBodegaEntrada(int tipoCodigoBodegaEntrada) {
		this.tipoCodigoBodegaEntrada = tipoCodigoBodegaEntrada;
	}

	/**
	 * @return the codigoOficinaEntrada
	 */
	public String getCodigoOficinaEntrada() {
		return codigoOficinaEntrada;
	}

	/**
	 * @param codigoOficinaEntrada the codigoOficinaEntrada to set
	 */
	public void setCodigoOficinaEntrada(String codigoOficinaEntrada) {
		this.codigoOficinaEntrada = codigoOficinaEntrada;
	}

	/**
	 * @return the codigoPersona
	 */
	public String getCodigoPersona() {
		return codigoPersona;
	}

	/**
	 * @param codigoPersona the codigoPersona to set
	 */
	public void setCodigoPersona(String codigoPersona) {
		this.codigoPersona = codigoPersona;
	}

	/**
	 * @return the fechaMovimiento
	 */
	public String getFechaMovimiento() {
		return fechaMovimiento;
	}

	/**
	 * @param fechaMovimiento the fechaMovimiento to set
	 */
	public void setFechaMovimiento(String fechaMovimiento) {
		this.fechaMovimiento = fechaMovimiento;
	}

	/**
	 * @return the cantidadPiezas
	 */
	public int getCantidadPiezas() {
		return cantidadPiezas;
	}

	/**
	 * @param cantidadPiezas the cantidadPiezas to set
	 */
	public void setCantidadPiezas(int cantidadPiezas) {
		this.cantidadPiezas = cantidadPiezas;
	}

	/**
	 * @return the pesoFisico
	 */
	public float getPesoFisico() {
		return pesoFisico;
	}

	/**
	 * @param pesoFisico the pesoFisico to set
	 */
	public void setPesoFisico(float pesoFisico) {
		this.pesoFisico = pesoFisico;
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
	public void setCodigoPosta(String codigoPosta) {
		this.codigoPosta = codigoPosta;
	}

	/**
	 * @return the codigoTipoNegocio
	 */
	public int getCodigoTipoNegocio() {
		return codigoTipoNegocio;
	}

	/**
	 * @param codigoTipoNegocio the codigoTipoNegocio to set
	 */
	public void setCodigoTipoNegocio(int codigoTipoNegocio) {
		this.codigoTipoNegocio = codigoTipoNegocio;
	}

	/**
	 * @return the codigoTipoEstado
	 */
	public String getCodigoTipoEstado() {
		return codigoTipoEstado;
	}

	/**
	 * @param codigoTipoEstado the codigoTipoEstado to set
	 */
	public void setCodigoTipoEstado(String codigoTipoEstado) {
		this.codigoTipoEstado = codigoTipoEstado;
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
	public void setCodigoTipoServicio(String codigoTipoServicio) {
		this.codigoTipoServicio = codigoTipoServicio;
	}

	/**
	 * @return the codigoTipoServicioPadre
	 */
	public String getCodigoTipoServicioPadre() {
		return codigoTipoServicioPadre;
	}

	/**
	 * @param codigoTipoServicioPadre the codigoTipoServicioPadre to set
	 */
	public void setCodigoTipoServicioPadre(String codigoTipoServicioPadre) {
		this.codigoTipoServicioPadre = codigoTipoServicioPadre;
	}

	/**
	 * @return the foto
	 */
	public FotoTO getFoto() {
		return foto;
	}

	/**
	 * @param foto the foto to set
	 */
	public void setFoto(FotoTO foto) {
		this.foto = foto;
	}

	/**
	 * @return the responsable
	 */
	public ResponsableTO getResponsable() {
		return responsable;
	}

	/**
	 * @param responsable the responsable to set
	 */
	public void setResponsable(ResponsableTO responsable) {
		this.responsable = responsable;
	}

	/**
	 * @return the ruta
	 */
	public RutaTO getRuta() {
		return ruta;
	}

	/**
	 * @param ruta the ruta to set
	 */
	public void setRuta(RutaTO ruta) {
		this.ruta = ruta;
	}

	/**
	 * @return the codigoPieza
	 */
	public String getCodigoPieza() {
		return codigoPieza;
	}

	/**
	 * @param codigoPieza the codigoPieza to set
	 */
	public void setCodigoPieza(String codigoPieza) {
		this.codigoPieza = codigoPieza;
	}
	
	
	
}
