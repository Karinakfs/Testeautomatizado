package ApiRest;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;



@SuppressWarnings("deprecation")
public class Teste {
	
	
	@Test
	public void testResponsecode()
	{
	
	Response resp=RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
	
	int code=resp.getStatusCode();
	
	System.out.println("Status code is "+code);
	
	Assert.assertEquals(code, 200);
	}


	@Test
	public void testinform()
	{

		Response resp=RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");

		String data=resp.asString();

		System.out.println("Data is "+data);
		
		System.out.println("Termpo de resposta " +resp.getTime());

	}

}
