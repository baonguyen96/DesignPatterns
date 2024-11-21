package service;

import handler.Handler;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import request.LoginRequest;

import static org.junit.Assert.*;

public class AuthenticationServiceTest {
    private AuthenticationService service;

    @After
    public void tearDown() {
        service = null;
    }

    @Test
    public void login_success() {
        service = new AuthenticationService(new Handler() {
            @Override
            public boolean handle(LoginRequest request) {
                return true;
            }

            @Override
            public void next(Handler handler) {}
        });

        assertEquals(0, service.login(new LoginRequest("", "")));
    }

    @Test
    public void login_fail() {
        service = new AuthenticationService(new Handler() {
            @Override
            public boolean handle(LoginRequest request) {
                return false;
            }

            @Override
            public void next(Handler handler) {}
        });

        assertEquals(1, service.login(new LoginRequest("", "")));
    }
}