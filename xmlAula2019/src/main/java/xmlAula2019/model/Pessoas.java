package xmlAula2019.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Pessoas {

	@XmlElement(name = "pessoa", required = true)
	private List<Pessoa> pessoas;

	public Pessoas(List<Pessoa> pessoas) {
		super();
		this.pessoas = pessoas;
	}

	public Pessoas() {
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

}
