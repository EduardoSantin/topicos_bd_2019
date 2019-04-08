package correcaoExercicioXML;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

import correcaoExercicioXML.conversor.ConverterXML;
import correcaoExercicioXML.model.Aluno;
import correcaoExercicioXML.model.Disciplina;
import correcaoExercicioXML.model.Turma;

public class Main {

	public static void main(String[] args) {
		ConverterXML<Turma> conversor = new ConverterXML<>(Turma.class);
		
		Turma turmaConv = conversor.gerarObj(new File("exercicio.xml"));

		System.out.println("Média da turma: "+turmaConv.getMedia());
		
		for(Aluno aluno: turmaConv.getAlunos().getAluno()){
			System.out.println("Aluno: "+aluno.getNome()+" Média: "+aluno.getMedia());	
		}
		
		Set<Disciplina> disciplinas = new HashSet<>();
		for(Aluno aluno: turmaConv.getAlunos().getAluno()){
			for(Disciplina disciplina: aluno.getDisciplinas().getDisciplina()){
				disciplinas.add(disciplina);
			}
		}
		for(Disciplina disciplina: disciplinas){
			System.out.println("Média "+disciplina.getNome()+" - "+mediaDisciplina(turmaConv, disciplina.getCodigo()));
		}
	}
	
	public static Double mediaDisciplina(Turma turma, Long codDisciplina){
		Double soma = 0.0;
		int contador = 0;
		for(Aluno aluno: turma.getAlunos().getAluno()){
			for(Disciplina disciplina: aluno.getDisciplinas().getDisciplina()){
				if(disciplina.getCodigo().equals(codDisciplina)){
					soma += disciplina.getNota();
					contador++;
				}
			}
		}
		return soma/contador;
	}
}
