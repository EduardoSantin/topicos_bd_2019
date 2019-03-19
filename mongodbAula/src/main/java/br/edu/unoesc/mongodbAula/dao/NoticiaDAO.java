package br.edu.unoesc.mongodbAula.dao;

import java.util.List;

import br.edu.unoesc.mongodbAula.model.Noticia;

public interface NoticiaDAO {

	void inserir(Noticia noticia);
	
	void alterar(Noticia noticia);
	
	Noticia buscar(Long codigo);
	
	List<Noticia> listar();
	
	void remover(Long codigo);
	
}
