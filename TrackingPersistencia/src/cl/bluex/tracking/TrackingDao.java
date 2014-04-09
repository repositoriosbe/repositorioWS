package cl.bluex.tracking;

import java.util.List;

import cl.bluex.trackingmodel.to.ParametrosTrackingReferenciaTO;
import cl.bluex.trackingmodel.to.TrackingReferenciaTO;
import cl.bluex.ws.common.exceptions.BluexException;


/**
 * Interfaz metodos listas.
 * 
 * @author Edgardo Herrera
 * 
 */
public interface TrackingDao {

	/**
	 * Metodo que obtiene el tracking de referencia.
	 * 
	 * @param to {@link ParametrosTrackingReferenciaTO}
	 * @return lista de {@link TrackingReferencia}
	 */
	List<TrackingReferenciaTO> obtieneTrackingReferencia(ParametrosTrackingReferenciaTO to) throws BluexException;

	


}
