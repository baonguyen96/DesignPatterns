import prototype.Course;
import prototype.CourseList;

import java.time.Duration;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Fetching from storage, should be around 4 seconds");
            LocalDateTime start = LocalDateTime.now();
            CourseList.loadFromStorage();
            LocalDateTime end = LocalDateTime.now();
            Duration duration = Duration.between(start, end);
            System.out.println("Completed fetching in " + duration.getSeconds() + " second(s)");

            System.out.println();

            System.out.println("Cloning, should be quick");
            start = LocalDateTime.now();
            Course course = CourseList.getCourse("Math");
            System.out.println(course);
            end = LocalDateTime.now();
            duration = Duration.between(start, end);
            System.out.println("Completed cloning in " + duration.getSeconds() + " second(s)");

            System.out.println();

            System.out.println("Another clone, also should be quick");
            start = LocalDateTime.now();
            course = CourseList.getCourse("Physics");
            System.out.println(course);
            end = LocalDateTime.now();
            duration = Duration.between(start, end);
            System.out.println("Completed cloning in " + duration.getSeconds() + " second(s)");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
