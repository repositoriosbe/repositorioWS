package cl.bluex.generadorcodigobarra.bean.response;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import cl.bluex.generadorcodigobarra.bean.CodigoBarraL28;

/**
 * @author eherrera
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseCodigoBarraL28")
public class ResponseCodigoBarraL28 {
	List<CodigoBarraL28> codigosBarraL28;
	
	/**
	 * crea instancia de ResponseTrackingReferencia
	 *
	 */
	public ResponseCodigoBarraL28() {
		super();
	}

	/**
	 * crea instancia de ResponseCodigoBarraL28.
	 * 
	 * @param codigosBarraL28 
	 *
	 */
	public ResponseCodigoBarraL28(final List<CodigoBarraL28> codigosBarraL28) {
		super();
		this.codigosBarraL28 = codigosBarraL28;
	}

	/**
	 * @return the codigosBarraL28
	 */
	public List<CodigoBarraL28> getCodigosBarraL28() {
		return codigosBarraL28;
	}

	/**
	 * @param codigosBarraL28 the codigosBarraL28 to set
	 */
	public void setCodigosBarraL28(final List<CodigoBarraL28> codigosBarraL28) {
		this.codigosBarraL28 = codigosBarraL28;
	}

}
