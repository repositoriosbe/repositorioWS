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
     * @param params the params
     * @return the solucion etiqueta
     */
    void getSolucionEtiqueta(Map<String, Object> params);
    
    
    /**
     * Gets the impresion solucion.
     *
     * @param params the params
     * @return the impresion solucion
     */
    void getImpresionSolucion(Map<String, Object> params);
    
	
}
