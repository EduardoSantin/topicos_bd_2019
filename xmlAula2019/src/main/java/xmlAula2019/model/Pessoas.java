package xmlAula2019.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Pessoas {

	@XmlElement(name = "pessoa")
	private List<Pessoa> pessoas;

	public Pessoas(List<Pessoa> pessoas) {
		super();
		this.pessoas = pessoas;
	}

	public Pessoas() {
	}
}
