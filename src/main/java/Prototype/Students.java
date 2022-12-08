package Prototype;

import java.util.ArrayList;
import java.util.List;

public class Students implements Cloneable{

    private List<String> studentList;

    public Students(){
        studentList = new ArrayList<String>();
    }

    public Students(List<String> list){
        this.studentList=list;
    }
    public void loadData(){
        //read all employees from database and put into the list
        studentList.add("Kambiz");
        studentList.add("Petros");
        studentList.add("Karim");
        studentList.add("mansour");
    }

    public List<String> getStudentsList() {
        return studentList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        List<String> temp = new ArrayList<String>();
        for(String s : this.getStudentsList()){
            temp.add(s);
        }
        return new Students(temp);
    }

}