package handler;

import request.LoginRequest;

public class Authentication extends BaseHandler {
    @Override
    public boolean handle(LoginRequest request) {
        // demo purpose only, should do actual validation
        if (request.getPassword().equals(request.getName())) {
            return false;
        }

        return handleNext(request);
    }
}
