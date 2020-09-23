import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetBook extends Main {



    @Test
    public void GetWeatherDetails()
    {
        RestAssured.baseURI = "https://bookstore.toolsqa.com/BookStore/v1";

        RequestSpecification httpRequest = RestAssured.given();

        Response response = httpRequest.request(Method.GET, "/Books");

        System.out.println("Status Code =>  " + response.getStatusCode());
    }



        @Test
        public void GettextResponse()
        {
            RestAssured.baseURI = "https://bookstore.toolsqa.com/BookStore/v1";

            RequestSpecification httpRequest = RestAssured.given();

            Response response = httpRequest.request(Method.GET, "/Books");

            System.out.println("Response Body is =>  " + response.asString());
            System.out.println(response.getStatusLine());
            System.out.println(response.getHeaders());

        }
    @Test
    public void GetErrorResponce()
    {
        RestAssured.baseURI = "https://bookstore.toolsqa.com/BookStore/v1/Book";
        RequestSpecification httpRequest = RestAssured.given();
        httpRequest.queryParam("ISBN", "INVALID");
        Response response = httpRequest.get();
        int statusCode = response.getStatusCode();
        System.out.println(response.getBody().asString());

        Assert.assertEquals(statusCode /*actual value*/, 400 /*expected value*/, "Correct status code returned");
        System.out.println(statusCode);
    }
    @Test
    public void GetErrorsTATUSLINE()
    {
        RestAssured.baseURI = "https://bookstore.toolsqa.com/BookStore/v1/Book";
        RequestSpecification httpRequest = RestAssured.given();
        httpRequest.queryParam("ISBN", "INVALID");
        Response response = httpRequest.get();
        int statusCode = response.getStatusCode();
        System.out.println(response.getBody().asString());
        String statusLine = response.getStatusLine();
        Assert.assertEquals(statusLine /*actual value*/,
                "HTTP/1.1 400 OK" /*expected value*/,
                "Correct status code returned");
        System.out.println(statusLine);




}
}