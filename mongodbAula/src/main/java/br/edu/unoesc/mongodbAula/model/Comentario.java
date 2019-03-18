package br.edu.unoesc.mongodbAula.model;

import java.util.Date;

public class Comentario {

	private String autor;
	private Date data;
	private String descricao;
	
	public Comentario(String autor, Date data, String descricao) {
		super();
		this.autor = autor;
		this.data = data;
		this.descricao = descricao;
	}
	
	public Comentario() {
	}


	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
