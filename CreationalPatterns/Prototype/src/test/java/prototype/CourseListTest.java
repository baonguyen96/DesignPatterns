package prototype;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CourseListTest {

    @Test(timeout = 5000)
    public void test1_loadFromStorage() {
        int courses = CourseList.loadFromStorage();
        assertEquals(2, courses);
    }

    @Test(timeout = 1000)
    public void test2_clone() throws CloneNotSupportedException {
        Course mathCourse1 = CourseList.getCourse("Math");
        Course mathCourse2 = CourseList.getCourse("Math");
        Course physicsCourse = CourseList.getCourse("Physics");
        assertEquals("Math", mathCourse1.name);
        assertEquals("Math", mathCourse2.name);
        assertNotEquals(mathCourse1.getId(), mathCourse2.getId());
        assertEquals("Physics", physicsCourse.getName());
    }
}