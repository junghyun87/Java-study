package jhkwon.java.webservices.wsimport;

import net.webservicex.GlobalWeather;
import net.webservicex.GlobalWeatherSoap;

public class WsimportTest{
	public static void main(String[] args){
		try{
			GlobalWeather service = new GlobalWeather();
			GlobalWeatherSoap port = service.getGlobalWeatherSoap();
			System.out.println(port.getWeather("Tokyo","Japan"));
			
		}catch(Exception e){
			e.printStackTrace();
		}

	}
}