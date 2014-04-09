package cl.bluex.etiquetasolucion;

import java.util.List;

import cl.bluex.etiquetasolucionmodel.to.ParametrosEntradaTO;
import cl.bluex.etiquetasolucionmodel.to.ParametrosSalidaTO;
import cl.bluex.ws.common.exceptions.BluexException;


/**
 * Interfaz.
 * 
 * @author rmoscoso
 * 
 */
public interface EtiquetaSolucionDao {

	
	/**
	 * Metodo.
	 * 
	 * @param to {@link ParametrosEntradaTO}
	 * @return lista de {@link ParametrosSalidaTO}
	 */
	List<ParametrosSalidaTO> getSolucionEtiqueta(ParametrosEntradaTO to) throws BluexException;
	
}
