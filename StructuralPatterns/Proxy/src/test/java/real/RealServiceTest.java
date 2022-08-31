package real;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class RealServiceTest {
    @Test
    public void testHandleRequest() {
        IService service = new RealService();
        List<String> responses = service.handleRequest();
        assertEquals(1, responses.size());
        assertEquals("RealService: handleRequest call", responses.get(0));
    }
}