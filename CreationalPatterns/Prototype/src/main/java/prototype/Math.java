package prototype;

import java.util.Arrays;
import java.util.List;

public class Math extends Course {
    public Math() {
        super();
        name = "Math";
    }

    @Override
    public List<String> getTopics() {
        return Arrays.asList("Calculus", "Linear Algebra", "Statistics");
    }
}
