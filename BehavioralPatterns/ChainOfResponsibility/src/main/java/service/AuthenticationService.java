package service;

import handler.Handler;
import request.LoginRequest;

public class AuthenticationService {
    private final Handler handler;

    public AuthenticationService(Handler handler) {
        this.handler = handler;
    }

    public int login(LoginRequest request) {
        if (handler.handle(request)) {
            System.out.println("Login successfully");
            return 0;
        }

        System.out.println("Login fail");
        return 1;
    }
}
