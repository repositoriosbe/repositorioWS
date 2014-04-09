package cl.bluex.tracking.mapper;

import java.util.Map;


/**
 * interfaz de mapeo.
 * 
 * @author Edgardo Herrera
 *
 */
public interface TrackingMapper {

	/**
	 * Mapper que obtiene lista de tracking de referencia.
	 * 
	 * @param  {@link Map<String, Object> params}
	 */
	void obtieneTrackingReferencia(Map<String, Object> params);

    
    
    
}
