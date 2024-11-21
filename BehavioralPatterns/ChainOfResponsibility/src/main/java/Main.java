import handler.Authentication;
import handler.Authorization;
import handler.Handler;
import request.LoginRequest;
import service.AuthenticationService;

public class Main {
    public static void main(String[] args) {
        Handler authentication = new Authentication();
        Handler authorization = new Authorization();
        authentication.next(authorization);

        AuthenticationService service = new AuthenticationService(authentication);
        int returnCode = service.login(new LoginRequest("userA", "test"));
        System.out.printf("Return code is %d%n", returnCode);
    }
}
