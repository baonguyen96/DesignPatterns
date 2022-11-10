package real;

import java.util.Collections;
import java.util.List;

public class RealService implements IService {
    @Override
    public List<String> handleRequest() {
        return Collections.singletonList("RealService: handleRequest call");
    }
}
