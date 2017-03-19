import java.io.InputStream;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;


public class LeitorXml {
	
	public Endereco carrega(InputStream inputStream) {

		Endereco endereco;
    XStream stream = new XStream(new DomDriver());
    stream.alias("xmlcep", Endereco.class);
    endereco = (Endereco) stream.fromXML(inputStream);

	
    return endereco;
	}
}
