package Prototype;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrototypePatternTest {
    @Test
    public void StudentTest() throws CloneNotSupportedException {
        Students Student = new Students();
        Student.loadData();

        //Use the clone method to get the Student object
        Students StudentNew = (Students) Student.clone();
        Students StudentNew1 = (Students) Student.clone();
        List<String> list = StudentNew.getStudentsList();
        list.add("Mohammadreza");
        List<String> list1 = StudentNew1.getStudentsList();
        list1.remove("Kambiz");

        assertEquals(4,Student.getStudentsList().size());
        assertEquals(5,StudentNew.getStudentsList().size());
        assertEquals(3,StudentNew1.getStudentsList().size());
    }

}