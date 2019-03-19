package br.edu.unoesc.mongodbAula;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

import java.util.Date;

import org.bson.codecs.BsonValueCodecProvider;
import org.bson.codecs.DocumentCodecProvider;
import org.bson.codecs.IterableCodecProvider;
import org.bson.codecs.MapCodecProvider;
import org.bson.codecs.ValueCodecProvider;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import com.mongodb.DBObjectCodecProvider;
import com.mongodb.DBRefCodecProvider;
import com.mongodb.DocumentToDBRefTransformer;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.gridfs.codecs.GridFSFileCodecProvider;
import com.mongodb.client.model.geojson.codecs.GeoJsonCodecProvider;

import br.edu.unoesc.mongodbAula.model.Noticia;

public class Main {

	public static void main(String[] args) {
		
		CodecRegistry pojoCodecRegistry = fromRegistries(
          fromProviders(
        		  		new ValueCodecProvider(),
        		  		new BsonValueCodecProvider(),
        		  		new DBRefCodecProvider(),
        		  		new DBObjectCodecProvider(),
        		  		new DocumentCodecProvider(new DocumentToDBRefTransformer()),
        		  		new IterableCodecProvider(new DocumentToDBRefTransformer()),
        		  		new MapCodecProvider(new DocumentToDBRefTransformer()),
        		  		new GeoJsonCodecProvider(),
        		  		new GridFSFileCodecProvider(),
  	                    
  	                PojoCodecProvider.builder().automatic(true).build()
        		  ));
		
		
		MongoClientSettings settings = MongoClientSettings.builder()
		        .codecRegistry(pojoCodecRegistry)
		        .build();
		MongoClient mongoClient = MongoClients.create(settings);
		
		MongoDatabase db = mongoClient.getDatabase("aula1");
		
		db = db.withCodecRegistry(pojoCodecRegistry);

		MongoCollection<Noticia> noticias = db.getCollection("noticia",
																Noticia.class);
		
		System.out.println("-----Primero registro-----");
		Noticia myDoc = noticias.find().first();
		System.out.println(myDoc.getTitulo());
		System.out.println("-----Fim primeiro registro-----");
		
		for(Noticia noticia: noticias.find()){
			System.out.print(noticia.getTitulo());
			if(noticia.getComentario() != null){
				System.out.println(" total de comentários"+noticia.getComentario().size());
			}
		}
		
		Noticia noticiaNova = new Noticia();
		noticiaNova.setAutor("Teste objeto");
		noticiaNova.setData_publicacao(new Date());
		noticiaNova.setDescricao("Descrição de uma noticia de objeto");
		
		noticias.insertOne(noticiaNova);
		
//		
//		System.out.println("-----Inicio do for-----");
//		
//		for (Document cur : noticias.find()) {
//			System.out.println(cur.getString("titulo"));
//		    System.out.println(cur.toJson());
//		}
//		
//		System.out.println("-----Fim do for-----");
//		
//		Document noticia1 = new Document();
//		noticia1.append("titulo", "Java");
//		noticia1.append("autor", "Eclipse");
//		noticias.insertOne(noticia1);
		
	}

}
