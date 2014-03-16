package jhkwon.java.webservices.cxf;

import org.apache.cxf.tools.wsdlto.WSDLToJava;

public class CxfExample{

	public static void main(String[] args){
		WSDLToJava.main(new String[] {"-client","-d", "src/main/java","src/main/res/globalweather.wsdl"});

		System.out.println("Done!");
	}

}