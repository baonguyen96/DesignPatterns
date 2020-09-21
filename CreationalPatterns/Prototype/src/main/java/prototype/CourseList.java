package prototype;

import java.util.HashMap;
import java.util.Map;

public class CourseList {

    private static final Map<String, Course> courses = new HashMap<>();

    public static void loadCache() {
        courses.put("Math", new Math());
        courses.put("Physics", new Physics());

        for(String key : courses.keySet()) {
            System.out.println(courses.get(key));
        }
    }

    public static Course getCourse(String name) throws CloneNotSupportedException {
        return (Course) courses.get(name).clone();
    }

}
