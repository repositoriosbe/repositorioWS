package cl.bluex.monitor.tool;

import java.util.ArrayList;
import java.util.List;

import cl.bluex.monitor.bean.DatosAgrupacionMonitor;
import cl.bluex.monitor.to.DatosAgrupacionMonitorTO;



/**
 * Mapeos de objetos.
 * 
 * @author Edgardo Herrera
 *
 */
public final class Mappers {
    
    private Mappers() {
	super();
    }

    /**
     * Metodo que copia data de una lista de {@link ConversionTO} a {@link Conversion}.
     * 
     * @param lista de {@link ConversionTO}
     * @return lista de {@link Conversion}
     */
    public static List<DatosAgrupacionMonitor> mapperInformacionMonitor(final List<DatosAgrupacionMonitorTO> tos) {
	final List<DatosAgrupacionMonitor> beans = new ArrayList<DatosAgrupacionMonitor>();

	for (final DatosAgrupacionMonitorTO to : tos) {
	    beans.add(new DatosAgrupacionMonitor(to));
	}
	return beans;
    }
    
    

}
