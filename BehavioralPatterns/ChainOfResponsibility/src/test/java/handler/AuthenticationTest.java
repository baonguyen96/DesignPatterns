package handler;

import org.junit.Before;
import org.junit.Test;
import request.LoginRequest;

import static org.junit.Assert.*;

public class AuthenticationTest {
    private Authentication authentication;

    @Before
    public void setUp() {
        authentication = new Authentication();
    }

    @Test
    public void handle_success() {
        assertTrue(authentication.handle(new LoginRequest("test", "testing")));
    }

    @Test
    public void handle_failure() {
        assertFalse(authentication.handle(new LoginRequest("test", "test")));
    }
}