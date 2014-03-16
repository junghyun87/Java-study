package jhkwon.java.webservices.axis2;
import net.webservicex.www.GlobalWeatherStub;

public class Axis2ClientTest{
	
	public static void main(String[] args){

		try{
			GlobalWeatherStub stub = new GlobalWeatherStub("http://www.webservicex.net/globalweather.asmx"); //Endpoint
			GlobalWeatherStub.GetWeather req = new GlobalWeatherStub.GetWeather();
			req.setCountryName("Japan");
			req.setCityName("Tokyo");
			GlobalWeatherStub.GetWeatherResponse res = stub.getWeather(req);
			System.err.println(res.getGetWeatherResult());

		} catch (Exception e){
			e.printStackTrace();
		}
	}
}