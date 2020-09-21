import prototype.Course;
import prototype.CourseList;

import java.time.Duration;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Fetching cache, should be around 4 seconds");
            LocalDateTime start = LocalDateTime.now();
            CourseList.loadCache();
            LocalDateTime end = LocalDateTime.now();
            Duration duration = Duration.between(start, end);
            System.out.println("Completed fetching in " + duration.toSeconds() + " second(s)");

            System.out.println();

            System.out.println("Cloning, should be quick");
            start = LocalDateTime.now();
            Course course = CourseList.getCourse("Math");
            System.out.println(course);
            end = LocalDateTime.now();
            duration = Duration.between(start, end);
            System.out.println("Completed cloning in " + duration.toSeconds() + " second(s)");

            System.out.println();

            System.out.println("Another clone, also should be quick");
            start = LocalDateTime.now();
            course = CourseList.getCourse("Physics");
            System.out.println(course);
            end = LocalDateTime.now();
            duration = Duration.between(start, end);
            System.out.println("Completed cloning in " + duration.toSeconds() + " second(s)");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
