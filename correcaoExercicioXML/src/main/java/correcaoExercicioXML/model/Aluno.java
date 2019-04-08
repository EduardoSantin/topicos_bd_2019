package correcaoExercicioXML.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Aluno {

	@XmlElement
	private String nome;
	@XmlElement
	private Disciplinas disciplinas;

	public Double getMedia() {
		return disciplinas.getMedia();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Disciplinas getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(Disciplinas disciplinas) {
		this.disciplinas = disciplinas;
	}

}
