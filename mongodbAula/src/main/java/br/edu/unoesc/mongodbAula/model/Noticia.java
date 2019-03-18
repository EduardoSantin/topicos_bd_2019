package br.edu.unoesc.mongodbAula.model;

import java.util.Date;
import java.util.List;

public class Noticia {

	private String titulo;
	private String autor;
	private Date data_publicacao;
	private String descricao;
	private List<Comentario> comentario;

	public Noticia(String titulo, String autor, Date data_publicacao, String descricao) {
		this.titulo = titulo;
		this.autor = autor;
		this.data_publicacao = data_publicacao;
		this.descricao = descricao;
	}

	public Noticia() {
		super();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Date getData_publicacao() {
		return data_publicacao;
	}

	public void setData_publicacao(Date data_publicacao) {
		this.data_publicacao = data_publicacao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Comentario> getComentario() {
		return comentario;
	}

	public void setComentario(List<Comentario> comentario) {
		this.comentario = comentario;
	}

}
