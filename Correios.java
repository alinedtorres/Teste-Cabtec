import java.io.IOException;
import java.util.Scanner;
/*import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;*/



public class Correios {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o CEP que deseja consultar:");
		String cep = scan.nextLine(); 
		
		//CorreiosWebService webService = new CorreiosWebService();
		
		
		//webService.post("http://m.correios.com.br/movel/buscaCep.do", "32241150");
		
		
		
		
		CorreiosWebService obj = new CorreiosWebService();
		
		
		
		
        
        Endereco endereco = new Endereco();
		endereco = obj.getEndereco(cep);

		System.out.println("Bairro: "+endereco.getBairro());
		System.out.println("Logradouro: "+endereco.getLogradouro());
		System.out.println("Localidade: "+endereco.getLocalidade());
		System.out.println("Uf: "+endereco.getUf());
		
		
		
	
	

	}

}
