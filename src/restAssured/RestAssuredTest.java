package restAssured;

import static org.testng.Assert.assertEquals;

import java.util.List;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class RestAssuredTest {
	
	public static void main(String[] args) {
	/*
		 RestAssured.baseURI="https://api.genderize.io/?name=Das";
		  RequestSpecification myRequest=RestAssured.given();
		  myRequest.queryParam("name", "Das");
		  Response response =myRequest.get("");
		  int StatusCode = response.getStatusCode();
		  System.out.println(StatusCode);
		  assertEquals(200,StatusCode);
		  System.out.println(response.getStatusLine());
		  response.getHeaders();
		  for(Header hd:response.getHeaders()) {
			System.out.println("name:= "+hd.getName());
			System.out.println("value:= "+hd.getValue());
		  }
		  ResponseBody resBody = response.getBody();
		  System.out.println(resBody.asString());
		  assertEquals(resBody.asString().contains("Das"),true);
		  JsonPath reponsePath = response.jsonPath();
		  String myName = reponsePath.get("name");
		  System.out.println(myName);
		  assertEquals("Das",myName);
		  String gender = reponsePath.get("gender");
		  System.out.println(gender);
		  assertEquals("male",gender);
		  */
		
		/*
		RestAssured.baseURI="http://universities.hipolabs.com/search?/";
		  RequestSpecification myRequest=RestAssured.given();
		  myRequest.queryParam("country", "india");
		  Response response =myRequest.get("");
		  int StatusCode = response.getStatusCode();
		  System.out.println("StatusCode: "+StatusCode);
		  assertEquals(200,StatusCode);
		  JsonPath reponsePath= response.jsonPath();
		  List<String> countries = reponsePath.getList("country");
		  List<String> names = reponsePath.getList("name");
		  List<String> states = reponsePath.getList("state-province");
		 int univCount = 0;
		  for(int i=0;i<states.size();i++) {
			  if(names.get(i).equals("NorthCap University")) {
			  System.out.println(states.get(i));
			  break;
		
		if(states.get(i)!=null) {	  
			if(states.get(i).equals("Punjab")) {
				univCount++;			
			  }
			
		  }
		  
	}
		  System.out.println("No. of unisversity in Punjab: "+univCount);
		  
		 */ 
		/*
		
		RequestSpecification myReq = 
				RestAssured.given().auth().preemptive().basic("postman", "password");
		Response reponse = myReq.get("https://postman-echo.com/basic-auth");
		ResponseBody resBody = reponse.getBody();
		String res = resBody.asString();
		System.out.println(res);
		*/
		
		String requestBody = "{\n" +
                "  \"title\": \"foo\",\n" +
                "  \"body\": \"bar\",\n" +
                "  \"userId\": \"1\" \n}";
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
        Response response=
                RestAssured.given()
                .header("Content-type", "application/json")
                .and()
                .body(requestBody)
                .when()
                .post("/posts")
                .then()
                .extract().response();
        System.out.println(response.statusCode());
        
		
	}

}
