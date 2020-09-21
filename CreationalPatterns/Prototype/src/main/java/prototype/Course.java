package prototype;

import java.util.List;
import java.util.UUID;

public abstract class Course implements Cloneable {

    protected String name;
    private UUID id = UUID.randomUUID();

    protected Course() {
        // simulate fetching
        try {
            Thread.sleep(2_000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Course newCourse = (Course) super.clone();
        newCourse.id = UUID.randomUUID();
        return newCourse;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
