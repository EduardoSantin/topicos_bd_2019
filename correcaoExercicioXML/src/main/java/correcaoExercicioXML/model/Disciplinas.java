package correcaoExercicioXML.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Disciplinas {

	@XmlElement
	private List<Disciplina> disciplina;
	
	public Double getMedia(){
		return disciplina.stream()
				.mapToDouble(Disciplina::getNota).average().orElse(0.0);
	}

	public List<Disciplina> getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(List<Disciplina> disciplina) {
		this.disciplina = disciplina;
	}

}
