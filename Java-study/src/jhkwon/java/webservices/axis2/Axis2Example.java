package jhkwon.java.webservices.axis2;

import org.apache.axis2.wsdl.WSDL2Code;

public class Axis2Example{

	public static void main(String[] args) throws Exception{
		WSDL2Code.main(new String[] {"-S", "src/main/java", /*source files will be put there*/
			"-R", "src/main/resources/META-INF", /*resource files like wsdl will be put there*/
			"-uri", "src/main/res/globalweather.wsdl"}); /*wsdl file*/

		System.out.println("Done!");
	}

}