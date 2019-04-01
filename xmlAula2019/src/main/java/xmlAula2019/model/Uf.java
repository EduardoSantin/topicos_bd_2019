package xmlAula2019.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Uf {

	@XmlElement
	private String nome;
	
	@XmlAttribute
	private String sigla;

	
	public Uf() {
	}

	public Uf(String nome, String sigla) {
		super();
		this.nome = nome;
		this.sigla = sigla;
	}

	public String getNome() {
		return nome;
	}

	public String getSigla() {
		return sigla;
	}
	
	
}
