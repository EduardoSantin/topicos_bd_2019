package xmlAula2019.conversor;

import java.io.File;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class ConverterXML<T> {

	private JAXBContext jaxbContext;
	
	public ConverterXML(Class<?>... classes){
		try {
			jaxbContext = JAXBContext.newInstance(classes);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	public ConverterXML(String contextPath) {
		try {
			jaxbContext = JAXBContext.newInstance(contextPath);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	public void gerarXml(File file, T objeto) {
		try {
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.marshal(objeto, file);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	public T gerarObj(File file) {
		try {
			Unmarshaller unMarshaller = jaxbContext.createUnmarshaller();
			return (T) unMarshaller.unmarshal(file);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return null;
	}

	public String gerarString(T objeto) {
		try {
			Marshaller marshaller = jaxbContext.createMarshaller();
			StringWriter stringWriter = new StringWriter();
			marshaller.marshal(objeto, stringWriter);
			return stringWriter.toString();
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return "";
	}
}
