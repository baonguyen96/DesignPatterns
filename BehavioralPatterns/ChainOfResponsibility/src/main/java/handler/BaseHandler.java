package handler;

import request.LoginRequest;

public abstract class BaseHandler implements Handler {
    private Handler nextHandler = null;

    public boolean handleNext(LoginRequest request) {
        if (nextHandler == null) {
            return true;
        }

        return nextHandler.handle(request);
    }

    @Override
    public void next(Handler handler) {
        this.nextHandler = handler;
    }
}
