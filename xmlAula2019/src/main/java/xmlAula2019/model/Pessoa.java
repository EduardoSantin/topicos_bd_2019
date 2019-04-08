package xmlAula2019.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Pessoa {

	@XmlAttribute(name = "nome", required = true)
	private String nome;

	@XmlElement(name="cpf", required = true)
	private Integer CPF;

	@XmlElement
	private Endereco endereco;

	public Pessoa() {

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

	public Endereco getEndereco() {
		return endereco;
	}
}
