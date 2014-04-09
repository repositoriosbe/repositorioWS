package cl.bluex.generadorcodigobarra;

import java.util.List;

import cl.bluex.generadorcodigobarramodel.to.CodigoBarraL28TO;
import cl.bluex.generadorcodigobarramodel.to.ParametroCodigoBarraL28TO;
import cl.bluex.ws.common.exceptions.BluexException;


/**
 * Interfaz.
 * 
 * @author Edgardo Herrera
 * 
 */
public interface GeneradorCodigoBarraDao {

	/**
	 * Metodo que obtiene el codigo de barra de largo 28.
	 * 
	 * @param to {@link ParametroCodigoBarraL28TO}
	 * @return lista de {@link CodigoBarraL28TO}
	 */
	List<CodigoBarraL28TO> obtieneCodigoBarraL28(ParametroCodigoBarraL28TO to) throws BluexException;

}
