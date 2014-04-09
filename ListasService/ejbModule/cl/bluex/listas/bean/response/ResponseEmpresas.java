package cl.bluex.listas.bean.response;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import cl.bluex.listas.bean.Empresa;

/**
 * 
 * @author Edgardo Herrera
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
	name = "empresas")
public class ResponseEmpresas {

	@XmlElement(
		name = "empresa")
	private List<Empresa> empresas;

	public ResponseEmpresas() {
		super();
	}

	public ResponseEmpresas(final List<Empresa> empresas) {
		this.empresas = empresas;
	}

	public List<Empresa> getEmpresas() {
		return empresas;
	}

	public void setEmpresas(final List<Empresa> empresas) {
		this.empresas = empresas;
	}

}
