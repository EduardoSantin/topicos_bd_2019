package xmlAula2019.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Cidade {

	@XmlElement
	private String nome;
	
	@XmlElement
	private Uf uf;

	public Cidade() {
	}

	public Cidade(String nome, Uf uf) {
		super();
		this.nome = nome;
		this.uf = uf;
	}

	public String getNome() {
		return nome;
	}

	public Uf getUf() {
		return uf;
	}
	
	
}
