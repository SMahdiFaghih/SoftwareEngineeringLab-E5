package Prototype;

import java.util.ArrayList;
import java.util.List;

public class Students implements Cloneable{

    private List<String> empList;

    public Students(){
        empList = new ArrayList<String>();
    }

    public Students(List<String> list){
        this.empList=list;
    }
    public void loadData(){
        //read all employees from database and put into the list
        empList.add("Kambiz");
        empList.add("Petros");
        empList.add("Karim");
        empList.add("mansour");
    }

    public List<String> getStudentsList() {
        return empList;
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