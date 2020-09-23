public class Main {
    public static void main(String[] arg) {
        PostUser user = new PostUser();
        user.registrationSuccessful(user.userName, user.password); //firsttest
        user.authorise(user.userName, user.password);   //second
        PostBook postBook = new PostBook();
        postBook.testPostBook(user.userId);          //createbook
            GetBook test = new GetBook();
            test.GetWeatherDetails();
            test.GettextResponse();
            test.GetErrorResponce();
            test.GetErrorsTATUSLINE();
    }
}