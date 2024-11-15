package handler;

import org.junit.Before;
import org.junit.Test;
import request.LoginRequest;

import static org.junit.Assert.*;

public class AuthorizationTest {
    private Authorization authorization;

    @Before
    public void setUp() throws Exception {
        authorization = new Authorization();
    }

    @Test
    public void handle_success() {
        assertTrue(authorization.handle(new LoginRequest("test", "testing")));
    }

    @Test
    public void handle_failure() {
        assertFalse(authorization.handle(new LoginRequest("userA", "test")));
    }
}