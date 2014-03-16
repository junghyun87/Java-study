package jhkwon.java.httpclient;

//http://www.vogella.com/articles/ApacheHttpClient/article.html
//api: http://hc.apache.org/httpcomponents-client-ga/httpclient/apidocs/index.html

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.message.BasicNameValuePair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class HttpClientEx{
	public static void main(String... args){
		//HTTP Get request 
		HttpClient client = new DefaultHttpClient();
		HttpGet request = new HttpGet("http://www.vogella.com");
		try{
			HttpResponse response = client.execute(request);

			BufferedReader rd = new BufferedReader(new InputStreamReader
				(response.getEntity().getContent()));

			String line = "";
			while ((line=rd.readLine())!=null){
				System.out.println(line);
			}
		} catch (IOException e){
			e.printStackTrace();
		}

		//send a post request and include a parameter "registrationid"
		HttpClient client2 = new DefaultHttpClient();
	    HttpPost post = new HttpPost("http://vogellac2dm.appspot.com/register");
	    try {
	      List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(1);
	      nameValuePairs.add(new BasicNameValuePair("registrationid",
	          "123456789"));
	      post.setEntity(new UrlEncodedFormEntity(nameValuePairs));
	 
	      HttpResponse response = client2.execute(post);
	      BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
	      String line = "";
	      while ((line = rd.readLine()) != null) {
	        System.out.println(line);
	      }

	    } catch (IOException e) {
	      e.printStackTrace();
	    }

	    //adds several parameters to the post request
	    HttpClient client3 = new DefaultHttpClient();
	    HttpPost post2 = new HttpPost("https://www.google.com/accounts/ClientLogin");

	    try {

	      List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(1);
	      nameValuePairs.add(new BasicNameValuePair("Email", "youremail"));
	      nameValuePairs
	          .add(new BasicNameValuePair("Passwd", "yourpassword"));
	      nameValuePairs.add(new BasicNameValuePair("accountType", "GOOGLE"));
	      nameValuePairs.add(new BasicNameValuePair("source",
	          "Google-cURL-Example"));
	      nameValuePairs.add(new BasicNameValuePair("service", "ac2dm"));

	      post2.setEntity(new UrlEncodedFormEntity(nameValuePairs));
	      HttpResponse response = client3.execute(post2);
	      BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

	      String line = "";
	      while ((line = rd.readLine()) != null) {
	        System.out.println(line);
	        if (line.startsWith("Auth=")) {
	          String key = line.substring(5);
	          // Do something with the key
	        }

	      }
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	}
}