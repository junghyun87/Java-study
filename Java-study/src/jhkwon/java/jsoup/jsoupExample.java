package jhkwon.java.jsoup;

import java.io.File;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Entities;
import org.jsoup.nodes.Entities.EscapeMode;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;


public class jsoupExample {
	public static void main (String... args){
		String filename = System.getProperty("user.dir") + File.separator + "resources" + File.separator +"a1.html";
		File input = new File(filename);
		try {
			Document doc = Jsoup.parse(input, null);
			
//			System.out.println(Entities.getCharacterByName("amp"));
			Elements coveredList = doc.getElementsByClass("c");
			for(Element covered:coveredList){
				Element ele1 = covered.select("td").get(0);
				Element ele2 = covered.select("td").get(1);
//				System.console().writer().println(ele1.text() + ": " + ele2.text());
				System.out.println(ele1.text() + ": " + ele2.text());
				
			}
			
			Elements partiallyCoveredList = doc.getElementsByClass("p");
			if(partiallyCoveredList.size()==0)
				System.out.println("zero");
			
			
			Elements titleElement = doc.getElementsByClass("in");
			String title = titleElement.get(0).text();
			System.out.println(title);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
