package Prototype;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrototypePatternTest {
    @Test
    public void StudentTest() throws CloneNotSupportedException {
        Students Students = new Students();
        Students.loadData();

        //Use the clone method to get the Student object
        Students NewStudents = (Students) Students.clone();
        Students NewStudents1 = (Students) Students.clone();
        List<String> list = NewStudents.getStudentsList();
        list.add("Mohammadreza");
        List<String> list1 = NewStudents1.getStudentsList();
        list1.remove("Kambiz");

        assertEquals(4,Students.getStudentsList().size());
        assertEquals(5,NewStudents.getStudentsList().size());
        assertEquals(3,NewStudents1.getStudentsList().size());
    }

}