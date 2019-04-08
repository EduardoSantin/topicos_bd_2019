package correcaoExercicioXML.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Alunos {

	@XmlElement
	private List<Aluno> aluno;
	
	public Double getMedia(){
		return aluno.stream()
				.mapToDouble(Aluno::getMedia).average().orElse(0.0);
	}

	public List<Aluno> getAluno() {
		return aluno;
	}

	public void setAluno(List<Aluno> aluno) {
		this.aluno = aluno;
	}

}
