package prototype;

import java.util.Arrays;
import java.util.List;

public class Physics extends Course {
    public Physics() {
        super();
        this.name = "Physics";
    }

    @Override
    public List<String> getTopics() {
        return Arrays.asList("Newton", "Optic", "Thermal Dynamics");
    }
}
