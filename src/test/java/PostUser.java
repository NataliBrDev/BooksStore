import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.testng.Assert;


public class PostUser extends Main {
    String userName = "Artems";
    String password = "Qwert8163!";
    String userId ;


    public String registrationSuccessful(String userName, String password) {
        RestAssured.baseURI ="https://bookstore.toolsqa.com/Account/v1/User";
        RequestSpecification request = RestAssured.given();
        JSONObject requestParam =new JSONObject();
        requestParam.put("userName", userName);
        requestParam.put("password", password);

        request.header("content-Type", "application/json");
        request.body(requestParam.toString());
        Response response = request.post();
        int statusCode = response.getStatusCode();
        System.out.println("Status code " + statusCode);
        System.out.println(response.getBody().asString());
        Assert.assertEquals(statusCode, 201);
        String resUserName = response.jsonPath().get("username");
        Assert.assertEquals( userName, resUserName, "User name is invalid");
       // userName = response.jsonPath().get("SuccessCode");
       // Assvert.assertEquals( "Correct Success code was returned", userName, "OPERATION_SUCCESS");

        return response.jsonPath().get("userId");

        }
        public void authorise(String userName, String password){
            RestAssured.baseURI ="https://bookstore.toolsqa.com/Account/v1/Authorized";
            RequestSpecification request1 = RestAssured.given();
            JSONObject requestParam =new JSONObject();
            requestParam.put("userName", userName);
            requestParam.put("password", password);
            request1.header("content-Type", "application/json");
            request1.body(requestParam.toString());
            Response response = request1.post();
            int statusCode = response.getStatusCode();
            System.out.println("Status code " + statusCode);
            System.out.println(response.getBody().asString());
            Assert.assertEquals(statusCode, 200);
        }
}