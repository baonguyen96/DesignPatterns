package proxy;

import org.junit.Test;
import real.IService;
import real.RealService;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ProxyServiceTest {
    @Test
    public void testHandleRequest() {
        IService service = new ProxyService(new RealService());
        List<String> responses = service.handleRequest();
        assertEquals(3, responses.size());
        assertEquals(Arrays.asList("ProxyService: Checking access prior to firing a real request",
                "RealService: handleRequest call",
                "ProxyService: Logging the time of request"), responses);
    }
}