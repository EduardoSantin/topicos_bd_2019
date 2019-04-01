package xmlAula2019.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Endereco {

	@XmlElement
	private String rua;
	@XmlElement
	private String bairro;
	@XmlElement
	private Cidade cidade;
	
	public Endereco(){
		
	}
	
	public Endereco(String rua, String bairro, Cidade cidade) {
		super();
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
	}

	public String getRua() {
		return rua;
	}

	public String getBairro() {
		return bairro;
	}
	
	
	
	
	
	
}
