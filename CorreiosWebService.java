
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
/*import java.util.ArrayList;
import java.util.List;

import org.apache.http.Consts;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.message.BasicNameValuePair;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.Consts;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;*/

public class CorreiosWebService {
	
//	private final DefaultHttpClient client = new DefaultHttpClient();
	
	public Endereco getEndereco(String cep) throws IOException {

		HttpURLConnection connection = null;
		
		try{
			String teste = "https://viacep.com.br/ws/"+cep+"/xml/";
			
			URL url = new URL(teste);
			connection = (HttpURLConnection)url.openConnection();
			InputStream content = connection.getInputStream();
			//teste = content.toString();
	    
			return new LeitorXml().carrega(content);
	    
	    }catch (IOException e){
	    	throw new RuntimeException(e);
	    } finally {
	      connection.disconnect();
	    }
  }
	
	/*public void post(String url, String cep) throws ClientProtocolException, IOException{
		final HttpPost post = new HttpPost(url);
        boolean result = false;
        final List<NameValuePair> nameValuePairs =
                new ArrayList<NameValuePair>();
        nameValuePairs.add(new BasicNameValuePair("cepEntrada", cep));
        nameValuePairs.add(new BasicNameValuePair("metodo", "buscarCep"));
        
        post.setEntity(new UrlEncodedFormEntity(nameValuePairs, Consts.UTF_8));
        post.addHeader("User-Agent", "Mozilla/5.0 (Windows NT 5.1; rv:18.0) Gecko/20100101 Firefox/18.0");
        HttpResponse response = client.execute(post);
        EntityUtils.consume(response.getEntity());
        System.out.println(response.getClass());
        final HttpGet get = new HttpGet(response.);
        response = client.execute(get);   
        //leHtml(response);
        
        
		
		
	}
	
	public void leHtml(final HttpResponse response) throws IOException {
		
		final BufferedReader rd = new BufferedReader(new InputStreamReader(
                response.getEntity().getContent()));
        String line;
         Deixa correr todo o laco, mesmo achando a String, para consumir o content 
        line = rd.readLine();
        while (line != null) {
        	System.out.println(line);
        	line = rd.readLine();
            if(line.contains("Logradouro:")) {
                line = rd.readLine();               
                
            }
        }
	}*/
}
