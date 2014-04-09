package cl.bluex.listas.bean.response;

import java.util.List;

import cl.bluex.listas.bean.Sorter;

/**
 * @author Edgardo Herrera
 * 
 */
public class ResponseObtieneSorter {
	private List<Sorter> sorters;

	/**
	 * Crea instancia de {@link ResponseObtieneSorter}.
	 */
	public ResponseObtieneSorter() {
		super();
	}

	/**
	 * crea instancia de ResponseObtieneSorter
	 * 
	 * @param sorters
	 */
	public ResponseObtieneSorter(final List<Sorter> sorters) {
		this.sorters = sorters;
	}

	/**
	 * @return the sorters
	 */
	public List<Sorter> getSorters() {
		return sorters;
	}

	/**
	 * @param sorters
	 *            the sorters to set
	 */
	public void setSorters(final List<Sorter> sorters) {
		this.sorters = sorters;
	}

}
