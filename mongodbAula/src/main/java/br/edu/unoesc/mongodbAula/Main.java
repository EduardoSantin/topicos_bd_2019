package br.edu.unoesc.mongodbAula;

import java.util.Date;

import br.edu.unoesc.mongodbAula.dao.NoticiaDAO;
import br.edu.unoesc.mongodbAula.dao.NoticiaMongo;
import br.edu.unoesc.mongodbAula.model.Noticia;

public class Main {

	public static void main(String[] args) {
		
		NoticiaDAO noticiaDao = new NoticiaMongo();
		
		Noticia noticiaInsert = new Noticia();
		noticiaInsert.setAutor("André");
		noticiaInsert.setTitulo("Insert com DAO");
		noticiaInsert.setDescricao("Estamos criando um DAO para manipular");
		noticiaInsert.setData_publicacao(new Date());
		noticiaInsert.setCodigo(1L);
		
		noticiaDao.inserir(noticiaInsert);
		
		noticiaInsert.setAutor("Alterado");
		
		noticiaDao.alterar(noticiaInsert);
		
		noticiaDao.listar().forEach(noticia->{
			System.out.print(" Titulo: "+noticia.getTitulo());
			System.out.print(" Autor: "+noticia.getAutor());
			System.out.println(" Codigo: "+noticia.getCodigo());
		});

	}

}
