package proxy;

import real.IService;
import real.RealService;

import java.util.Arrays;
import java.util.List;

public class ProxyService implements IService {
    private final RealService realService;

    public ProxyService(RealService realService) {
        this.realService = realService;
    }

    @Override
    public List<String> handleRequest() {
        return Arrays.asList(checkAccess(), String.join("\n", realService.handleRequest()), logAccess());
    }

    private String checkAccess() {
        return "ProxyService: Checking access prior to firing a real request";
    }

    private String logAccess() {
        return "ProxyService: Logging the time of request";
    }

}
