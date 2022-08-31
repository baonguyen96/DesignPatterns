import proxy.ProxyService;
import real.IService;
import real.RealService;

public class Main {
    private static IService service;

    public static void main(String[] args) {
        callRealService();
        callProxyService();
    }

    private static void callRealService() {
        System.out.println("callRealService");
        service = new RealService();
        System.out.println(service.handleRequest());
    }

    private static void callProxyService() {
        System.out.println("callProxyService");
        service = new ProxyService(new RealService());
        System.out.println(service.handleRequest());
    }
}
