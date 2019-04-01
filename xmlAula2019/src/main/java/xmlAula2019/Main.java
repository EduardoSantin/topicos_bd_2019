package xmlAula2019;

import java.io.File;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import xmlAula2019.conversor.ConverterXML;
import xmlAula2019.model.Cidade;
import xmlAula2019.model.Endereco;
import xmlAula2019.model.Pessoa;
import xmlAula2019.model.Pessoas;
import xmlAula2019.model.Uf;

public class Main {

	public static void main(String[] args) {
		Cidade xanxere = new Cidade("Xanxerê", new Uf("Santa catarina", "SC"));
		Endereco endereco = new Endereco("Rua teste 1", "bairro 1", xanxere);
		Pessoa pessoa = new Pessoa("André", 87654, endereco);
		Endereco endereco2 = new Endereco("Rua teste 2", "bairro 2", xanxere);
		Pessoa pessoa2 = new Pessoa("Joaquim", 87654, endereco2);

		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(pessoa);
		pessoas.add(pessoa2);

		ConverterXML<Pessoas> conversor = new ConverterXML<>(Pessoas.class);
		
		conversor.gerarXml(new File("pessoas.xml"), new Pessoas(pessoas));
		
		Pessoas pessoasConv = conversor.gerarObj(new File("pessoas.xml"));
		
		System.out.println(pessoasConv);

	}
}
