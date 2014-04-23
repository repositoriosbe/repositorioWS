package cl.bluex.etiquetasolucionmodel.to;

/**
 * The Class DatosImpresionTO.
 */
public class DatosImpresionTO {

	/** The p_basedest. */
	private String p_basedest;
	
	/** The p_bd. */
	private String p_bd;
	
	/** The p_c01. */
	private String p_c01;
	
	/** The p_c02. */
	private String p_c02;
	
	/** The p_c03. */
	private String p_c03;
	
	/** The p_c04. */
	private String p_c04;
	
	/** The p_c128_cb28l. */
	private String p_c128_cb28l;
	
	/** The p_c39_os. */
	private String p_c39_os;
	
	/** The p_cbl28. */
	private String p_cbl28;
	
	/** The p_cde. */
	private String p_cde;
	
	/** The p_comuna. */
	private String p_comuna;
	
	/** The p_contacto_dest. */
	private String p_contacto_dest;
	
	/** The p_cta_cte. */
	private String p_cta_cte;
	
	/** The p_dims. */
	private String p_dims;
	
	/** The p_dir_dest1. */
	private String p_dir_dest1;
	
	/** The p_dir_emba0. */
	private String p_dir_emba0;
	
	/** The p_dir_emba1. */
	private String p_dir_emba1;
	
	/** The p_dir_emba2. */
	private String p_dir_emba2;
	
	/** The p_eop. */
	private String p_eop;
	
	/** The p_fch_impr. */
	private String p_fch_impr;
	
	/** The p_folio. */
	private String p_folio;
	
	/** The p_fono_dest. */
	private String p_fono_dest;
	
	/** The p_monto_cod. */
	private String p_monto_cod;
	
	/** The p_nmb_emba. */
	private String p_nmb_emba;
	
	/** The p_nmb_psta. */
	private String p_nmb_psta;
	
	/** The p_nomb_dest. */
	private String p_nomb_dest;
	
	/** The p_obs. */
	private String p_obs;
	
	/** The p_or. */
	private String p_or;
	
	/** The p_pdf417_cb2d_os. */
	private String p_pdf417_cb2d_os;
	
	/** The p_peso. */
	private String p_peso;
	
	/** The p_refer. */
	private String p_refer;
	
	/** The p_servicio. */
	private String p_servicio;
	
	/** The p_sr. */
	private String p_sr;
	
	/** The p_tbu. */
	private String p_tbu;
	
	/** The p_pdt. */
	private String p_pdt;
	
	
	/**
	 * Instantiates a new datos impresion to.
	 */
	public DatosImpresionTO(){
		super();
	}
	
	
	/**
	 * Instantiates a new datos impresion to.
	 *
	 * @param datosImpresion the datos impresion
	 */
	public DatosImpresionTO( DatosImpresionTO datosImpresion){
		this.p_basedest = datosImpresion.p_basedest;
		this.p_bd = datosImpresion.p_bd;
		this.p_c01 = datosImpresion.p_c01;
		this.p_c02 = datosImpresion.p_c02;
		this.p_c03 = datosImpresion.p_c03;
		this.p_c04 = datosImpresion.p_c04;
		this.p_c128_cb28l = datosImpresion.p_c128_cb28l;
		this.p_c39_os = datosImpresion.p_c39_os;
		this.p_cbl28 = datosImpresion.p_cbl28;
		this.p_cde = datosImpresion.p_cde;
		this.p_comuna = datosImpresion.p_comuna;
		this.p_contacto_dest = datosImpresion.p_contacto_dest;
		this.p_cta_cte = datosImpresion.p_cta_cte;
		this.p_dims = datosImpresion.p_dims;
		this.p_dir_dest1 = datosImpresion.p_dir_dest1;
		this.p_dir_emba0 = datosImpresion.p_dir_emba0;
		this.p_dir_emba1 = datosImpresion.p_dir_emba1;
		this.p_dir_emba2 = datosImpresion.p_dir_emba2;
		this.p_eop = datosImpresion.p_eop;
		this.p_fch_impr = datosImpresion.p_fch_impr;
		this.p_folio = datosImpresion.p_folio;
		this.p_fono_dest = datosImpresion.p_fono_dest;
		this.p_monto_cod = datosImpresion.p_monto_cod;
		this.p_nmb_emba = datosImpresion.p_nmb_emba;
		this.p_nmb_psta = datosImpresion.p_nmb_psta;
		this.p_nomb_dest = datosImpresion.p_nomb_dest;
		this.p_obs = datosImpresion.p_obs;
		this.p_or = datosImpresion.p_or;
		this.p_pdf417_cb2d_os = datosImpresion.p_pdf417_cb2d_os;
		this.p_peso = datosImpresion.p_peso;
		this.p_refer = datosImpresion.p_refer;
		this.p_servicio = datosImpresion.p_servicio;
		this.p_sr = datosImpresion.p_sr;
		this.p_tbu = datosImpresion.p_tbu;
		this.p_pdt = datosImpresion.p_pdt;
	}


	/**
	 * Gets the p_basedest.
	 *
	 * @return the p_basedest
	 */
	public String getP_basedest() {
		return p_basedest;
	}


	/**
	 * Sets the p_basedest.
	 *
	 * @param p_basedest the new p_basedest
	 */
	public void setP_basedest(String p_basedest) {
		this.p_basedest = p_basedest;
	}


	/**
	 * Gets the p_bd.
	 *
	 * @return the p_bd
	 */
	public String getP_bd() {
		return p_bd;
	}


	/**
	 * Sets the p_bd.
	 *
	 * @param p_bd the new p_bd
	 */
	public void setP_bd(String p_bd) {
		this.p_bd = p_bd;
	}


	/**
	 * Gets the p_c01.
	 *
	 * @return the p_c01
	 */
	public String getP_c01() {
		return p_c01;
	}


	/**
	 * Sets the p_c01.
	 *
	 * @param p_c01 the new p_c01
	 */
	public void setP_c01(String p_c01) {
		this.p_c01 = p_c01;
	}


	/**
	 * Gets the p_c02.
	 *
	 * @return the p_c02
	 */
	public String getP_c02() {
		return p_c02;
	}


	/**
	 * Sets the p_c02.
	 *
	 * @param p_c02 the new p_c02
	 */
	public void setP_c02(String p_c02) {
		this.p_c02 = p_c02;
	}


	/**
	 * Gets the p_c03.
	 *
	 * @return the p_c03
	 */
	public String getP_c03() {
		return p_c03;
	}


	/**
	 * Sets the p_c03.
	 *
	 * @param p_c03 the new p_c03
	 */
	public void setP_c03(String p_c03) {
		this.p_c03 = p_c03;
	}


	/**
	 * Gets the p_c04.
	 *
	 * @return the p_c04
	 */
	public String getP_c04() {
		return p_c04;
	}


	/**
	 * Sets the p_c04.
	 *
	 * @param p_c04 the new p_c04
	 */
	public void setP_c04(String p_c04) {
		this.p_c04 = p_c04;
	}


	/**
	 * Gets the p_c128_cb28l.
	 *
	 * @return the p_c128_cb28l
	 */
	public String getP_c128_cb28l() {
		return p_c128_cb28l;
	}


	/**
	 * Sets the p_c128_cb28l.
	 *
	 * @param p_c128_cb28l the new p_c128_cb28l
	 */
	public void setP_c128_cb28l(String p_c128_cb28l) {
		this.p_c128_cb28l = p_c128_cb28l;
	}


	/**
	 * Gets the p_c39_os.
	 *
	 * @return the p_c39_os
	 */
	public String getP_c39_os() {
		return p_c39_os;
	}


	/**
	 * Sets the p_c39_os.
	 *
	 * @param p_c39_os the new p_c39_os
	 */
	public void setP_c39_os(String p_c39_os) {
		this.p_c39_os = p_c39_os;
	}


	/**
	 * Gets the p_cbl28.
	 *
	 * @return the p_cbl28
	 */
	public String getP_cbl28() {
		return p_cbl28;
	}


	/**
	 * Sets the p_cbl28.
	 *
	 * @param p_cbl28 the new p_cbl28
	 */
	public void setP_cbl28(String p_cbl28) {
		this.p_cbl28 = p_cbl28;
	}


	/**
	 * Gets the p_cde.
	 *
	 * @return the p_cde
	 */
	public String getP_cde() {
		return p_cde;
	}


	/**
	 * Sets the p_cde.
	 *
	 * @param p_cde the new p_cde
	 */
	public void setP_cde(String p_cde) {
		this.p_cde = p_cde;
	}


	/**
	 * Gets the p_comuna.
	 *
	 * @return the p_comuna
	 */
	public String getP_comuna() {
		return p_comuna;
	}


	/**
	 * Sets the p_comuna.
	 *
	 * @param p_comuna the new p_comuna
	 */
	public void setP_comuna(String p_comuna) {
		this.p_comuna = p_comuna;
	}


	/**
	 * Gets the p_contacto_dest.
	 *
	 * @return the p_contacto_dest
	 */
	public String getP_contacto_dest() {
		return p_contacto_dest;
	}


	/**
	 * Sets the p_contacto_dest.
	 *
	 * @param p_contacto_dest the new p_contacto_dest
	 */
	public void setP_contacto_dest(String p_contacto_dest) {
		this.p_contacto_dest = p_contacto_dest;
	}


	/**
	 * Gets the p_cta_cte.
	 *
	 * @return the p_cta_cte
	 */
	public String getP_cta_cte() {
		return p_cta_cte;
	}


	/**
	 * Sets the p_cta_cte.
	 *
	 * @param p_cta_cte the new p_cta_cte
	 */
	public void setP_cta_cte(String p_cta_cte) {
		this.p_cta_cte = p_cta_cte;
	}


	/**
	 * Gets the p_dims.
	 *
	 * @return the p_dims
	 */
	public String getP_dims() {
		return p_dims;
	}


	/**
	 * Sets the p_dims.
	 *
	 * @param p_dims the new p_dims
	 */
	public void setP_dims(String p_dims) {
		this.p_dims = p_dims;
	}


	/**
	 * Gets the p_dir_dest1.
	 *
	 * @return the p_dir_dest1
	 */
	public String getP_dir_dest1() {
		return p_dir_dest1;
	}


	/**
	 * Sets the p_dir_dest1.
	 *
	 * @param p_dir_dest1 the new p_dir_dest1
	 */
	public void setP_dir_dest1(String p_dir_dest1) {
		this.p_dir_dest1 = p_dir_dest1;
	}


	/**
	 * Gets the p_dir_emba0.
	 *
	 * @return the p_dir_emba0
	 */
	public String getP_dir_emba0() {
		return p_dir_emba0;
	}


	/**
	 * Sets the p_dir_emba0.
	 *
	 * @param p_dir_emba0 the new p_dir_emba0
	 */
	public void setP_dir_emba0(String p_dir_emba0) {
		this.p_dir_emba0 = p_dir_emba0;
	}


	/**
	 * Gets the p_dir_emba1.
	 *
	 * @return the p_dir_emba1
	 */
	public String getP_dir_emba1() {
		return p_dir_emba1;
	}


	/**
	 * Sets the p_dir_emba1.
	 *
	 * @param p_dir_emba1 the new p_dir_emba1
	 */
	public void setP_dir_emba1(String p_dir_emba1) {
		this.p_dir_emba1 = p_dir_emba1;
	}


	/**
	 * Gets the p_dir_emba2.
	 *
	 * @return the p_dir_emba2
	 */
	public String getP_dir_emba2() {
		return p_dir_emba2;
	}


	/**
	 * Sets the p_dir_emba2.
	 *
	 * @param p_dir_emba2 the new p_dir_emba2
	 */
	public void setP_dir_emba2(String p_dir_emba2) {
		this.p_dir_emba2 = p_dir_emba2;
	}


	/**
	 * Gets the p_eop.
	 *
	 * @return the p_eop
	 */
	public String getP_eop() {
		return p_eop;
	}


	/**
	 * Sets the p_eop.
	 *
	 * @param p_eop the new p_eop
	 */
	public void setP_eop(String p_eop) {
		this.p_eop = p_eop;
	}


	/**
	 * Gets the p_fch_impr.
	 *
	 * @return the p_fch_impr
	 */
	public String getP_fch_impr() {
		return p_fch_impr;
	}


	/**
	 * Sets the p_fch_impr.
	 *
	 * @param p_fch_impr the new p_fch_impr
	 */
	public void setP_fch_impr(String p_fch_impr) {
		this.p_fch_impr = p_fch_impr;
	}


	/**
	 * Gets the p_folio.
	 *
	 * @return the p_folio
	 */
	public String getP_folio() {
		return p_folio;
	}


	/**
	 * Sets the p_folio.
	 *
	 * @param p_folio the new p_folio
	 */
	public void setP_folio(String p_folio) {
		this.p_folio = p_folio;
	}


	/**
	 * Gets the p_fono_dest.
	 *
	 * @return the p_fono_dest
	 */
	public String getP_fono_dest() {
		return p_fono_dest;
	}


	/**
	 * Sets the p_fono_dest.
	 *
	 * @param p_fono_dest the new p_fono_dest
	 */
	public void setP_fono_dest(String p_fono_dest) {
		this.p_fono_dest = p_fono_dest;
	}


	/**
	 * Gets the p_monto_cod.
	 *
	 * @return the p_monto_cod
	 */
	public String getP_monto_cod() {
		return p_monto_cod;
	}


	/**
	 * Sets the p_monto_cod.
	 *
	 * @param p_monto_cod the new p_monto_cod
	 */
	public void setP_monto_cod(String p_monto_cod) {
		this.p_monto_cod = p_monto_cod;
	}


	/**
	 * Gets the p_nmb_emba.
	 *
	 * @return the p_nmb_emba
	 */
	public String getP_nmb_emba() {
		return p_nmb_emba;
	}


	/**
	 * Sets the p_nmb_emba.
	 *
	 * @param p_nmb_emba the new p_nmb_emba
	 */
	public void setP_nmb_emba(String p_nmb_emba) {
		this.p_nmb_emba = p_nmb_emba;
	}


	/**
	 * Gets the p_nmb_psta.
	 *
	 * @return the p_nmb_psta
	 */
	public String getP_nmb_psta() {
		return p_nmb_psta;
	}


	/**
	 * Sets the p_nmb_psta.
	 *
	 * @param p_nmb_psta the new p_nmb_psta
	 */
	public void setP_nmb_psta(String p_nmb_psta) {
		this.p_nmb_psta = p_nmb_psta;
	}


	/**
	 * Gets the p_nomb_dest.
	 *
	 * @return the p_nomb_dest
	 */
	public String getP_nomb_dest() {
		return p_nomb_dest;
	}


	/**
	 * Sets the p_nomb_dest.
	 *
	 * @param p_nomb_dest the new p_nomb_dest
	 */
	public void setP_nomb_dest(String p_nomb_dest) {
		this.p_nomb_dest = p_nomb_dest;
	}


	/**
	 * Gets the p_obs.
	 *
	 * @return the p_obs
	 */
	public String getP_obs() {
		return p_obs;
	}


	/**
	 * Sets the p_obs.
	 *
	 * @param p_obs the new p_obs
	 */
	public void setP_obs(String p_obs) {
		this.p_obs = p_obs;
	}


	/**
	 * Gets the p_or.
	 *
	 * @return the p_or
	 */
	public String getP_or() {
		return p_or;
	}


	/**
	 * Sets the p_or.
	 *
	 * @param p_or the new p_or
	 */
	public void setP_or(String p_or) {
		this.p_or = p_or;
	}


	/**
	 * Gets the p_pdf417_cb2d_os.
	 *
	 * @return the p_pdf417_cb2d_os
	 */
	public String getP_pdf417_cb2d_os() {
		return p_pdf417_cb2d_os;
	}


	/**
	 * Sets the p_pdf417_cb2d_os.
	 *
	 * @param p_pdf417_cb2d_os the new p_pdf417_cb2d_os
	 */
	public void setP_pdf417_cb2d_os(String p_pdf417_cb2d_os) {
		this.p_pdf417_cb2d_os = p_pdf417_cb2d_os;
	}


	/**
	 * Gets the p_peso.
	 *
	 * @return the p_peso
	 */
	public String getP_peso() {
		return p_peso;
	}


	/**
	 * Sets the p_peso.
	 *
	 * @param p_peso the new p_peso
	 */
	public void setP_peso(String p_peso) {
		this.p_peso = p_peso;
	}


	/**
	 * Gets the p_refer.
	 *
	 * @return the p_refer
	 */
	public String getP_refer() {
		return p_refer;
	}


	/**
	 * Sets the p_refer.
	 *
	 * @param p_refer the new p_refer
	 */
	public void setP_refer(String p_refer) {
		this.p_refer = p_refer;
	}


	/**
	 * Gets the p_servicio.
	 *
	 * @return the p_servicio
	 */
	public String getP_servicio() {
		return p_servicio;
	}


	/**
	 * Sets the p_servicio.
	 *
	 * @param p_servicio the new p_servicio
	 */
	public void setP_servicio(String p_servicio) {
		this.p_servicio = p_servicio;
	}


	/**
	 * Gets the p_sr.
	 *
	 * @return the p_sr
	 */
	public String getP_sr() {
		return p_sr;
	}


	/**
	 * Sets the p_sr.
	 *
	 * @param p_sr the new p_sr
	 */
	public void setP_sr(String p_sr) {
		this.p_sr = p_sr;
	}


	/**
	 * Gets the p_tbu.
	 *
	 * @return the p_tbu
	 */
	public String getP_tbu() {
		return p_tbu;
	}


	/**
	 * Sets the p_tbu.
	 *
	 * @param p_tbu the new p_tbu
	 */
	public void setP_tbu(String p_tbu) {
		this.p_tbu = p_tbu;
	}


	/**
	 * Gets the p_pdt.
	 *
	 * @return the p_pdt
	 */
	public String getP_pdt() {
		return p_pdt;
	}


	/**
	 * Sets the p_pdt.
	 *
	 * @param p_pdt the new p_pdt
	 */
	public void setP_pdt(String p_pdt) {
		this.p_pdt = p_pdt;
	}
	
}
