package jhkwon.java.webservices.axis;
import NET.webserviceX.www.GlobalWeather;
import NET.webserviceX.www.GlobalWeatherLocator;
import NET.webserviceX.www.GlobalWeatherSoap;

public class AxisClientTest{
	public static void main(String[] args) throws Exception{
		// Make a service
		GlobalWeather service = new GlobalWeatherLocator();

		// Now use the service to get a stub which implements the SDI.
		GlobalWeatherSoap port = service.getGlobalWeatherSoap12();

		// Make the actual call
		String result = port.getWeather("Tokyo","Japan");
		System.out.println(result);

	}
}