package handler;

import request.LoginRequest;

public interface Handler {
    boolean handle(LoginRequest request);
    void next(Handler handler);
}
