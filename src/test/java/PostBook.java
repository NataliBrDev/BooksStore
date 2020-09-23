import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;

import java.lang.reflect.Array;

public class PostBook extends Main {

  public void testPostBook(String userId) {
        RestAssured.baseURI ="https://bookstore.toolsqa.com/BookStore/v1/Books";
        RequestSpecification request = RestAssured.given();
        JSONObject requestParam =new JSONObject();
        requestParam.put("userId", userId);
        JSONArray isbns = new JSONArray();
        JSONObject isbn = new JSONObject();
        isbn.put("isbn","978-3-16-148410-0");
        isbns.put(isbn);
        requestParam.put("collectionOfIsbns", isbns);


      request.header("content-Type", "application/json");
      request.body(requestParam.toString());
      Response response = request.post();
      int statusCode = response.getStatusCode();
      System.out.println("Status code " + statusCode);
      System.out.println(response.getBody().asString());
      Assert.assertEquals(statusCode, 201);
      String resIsbn= response.jsonPath().get("isbn");
      Assert.assertEquals( "978-3-16-148410-0", resIsbn, "ISbn is invalid");
  }
}