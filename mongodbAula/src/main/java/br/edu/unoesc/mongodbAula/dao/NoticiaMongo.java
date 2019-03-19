package br.edu.unoesc.mongodbAula.dao;

import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Updates.combine;
import static com.mongodb.client.model.Updates.set;

import java.util.ArrayList;
import java.util.List;

import com.mongodb.client.MongoCollection;

import br.edu.unoesc.mongodbAula.model.Noticia;

public class NoticiaMongo implements NoticiaDAO {

	private MongoCollection<Noticia> getCollection() {
		return ConexaoMongo.getDatabase().getCollection("noticia", Noticia.class);
	}

	@Override
	public void inserir(Noticia noticia) {
		getCollection().insertOne(noticia);
	}

	@Override
	public void alterar(Noticia noticia) {
		getCollection()
			.updateOne(eq("codigo", noticia.getCodigo()), 
					combine(
							set("titulo", noticia.getTitulo()),
							set("descricao", noticia.getDescricao()),
							set("data_publicacao", noticia.getData_publicacao()),
							set("autor", noticia.getAutor())));
	}

	@Override
	public Noticia buscar(Long codigo) {
		return getCollection().find(eq("codigo",codigo)).first();
	}

	@Override
	public List<Noticia> listar() {
		List<Noticia> noticias = new ArrayList<>();
		getCollection().find().iterator().forEachRemaining(noticias::add);
		return noticias;
	}

	@Override
	public void remover(Long codigo) {
		getCollection().deleteOne(eq("codigo",codigo));
	}

}
