package cl.bluex.etiquetasolucion.mapper;

import java.util.Map;


/**
 * interfaz de mapeo.
 * 
 * @autho rrmoscoso
 *
 */
public interface EtiquetaSolucionMapper {

	
    /**
     * Gets the solucion etiqueta.
     *
     * @param {@link Map<String, Object> params}
     * @return the solucion etiqueta
     */
    void getSolucionEtiqueta(Map<String, Object> params);
	
}
