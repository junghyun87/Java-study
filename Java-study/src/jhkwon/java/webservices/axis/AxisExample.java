package jhkwon.java.webservices.axis;

import org.apache.axis.wsdl.WSDL2Java;

public class AxisExample{

	public static void main(String[] args) throws Exception{
		// WSDL2Java.main(new String[] {"src/main/res/globalweather.wsdl"});
		// WSDL2Java.main(new String[] {"src/main/res/country.wsdl"});
		WSDL2Java.main(new String[] {"src/main/res/CountryInformationService.wsdl"});

		System.out.println("Done!");
	}

}