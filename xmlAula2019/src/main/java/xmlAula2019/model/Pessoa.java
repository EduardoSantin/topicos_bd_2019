package xmlAula2019.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Pessoa {

	@XmlAttribute
	private String nome;
	
	@XmlElement
	private Integer CPF;
	
	@XmlElement
	private Endereco endereco;
	
	public Pessoa(){
		
	}

	public Pessoa(String nome, Integer cPF, Endereco endereco) {
		super();
		this.nome = nome;
		CPF = cPF;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public Integer getCPF() {
		return CPF;
	}
	
	public Endereco getEndereco(){
		return endereco;
	}
}
