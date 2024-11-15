package handler;

import request.LoginRequest;

public class Authorization extends BaseHandler {
    @Override
    public boolean handle(LoginRequest request) {
        // demo purpose only, should do actual validation
        if (request.getName().equals("userA")) {
            return false;
        }

        return handleNext(request);
    }
}
