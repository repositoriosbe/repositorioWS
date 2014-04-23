package cl.bluex.etiquetasolucion;

import java.util.List;

import cl.bluex.etiquetasolucionmodel.to.ImpresionSolucionTO;
import cl.bluex.etiquetasolucionmodel.to.InquietudTO;
import cl.bluex.etiquetasolucionmodel.to.SolicitudImpresionTO;
import cl.bluex.etiquetasolucionmodel.to.SolucionTO;
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
	 * @param to {@link InquietudTO}
	 * @return lista de {@link SolucionTO}
	 */
	List<SolucionTO> getSolucionEtiqueta(InquietudTO to) throws BluexException;
	
	/**
	 * Metodo.
	 * 
	 * @param to {@link SolicitudImpresionTO}
	 * @return to {@link ImpresionSolucionTO}
	 */
	ImpresionSolucionTO getImpresionSolucion(SolicitudImpresionTO to) throws BluexException;
}
