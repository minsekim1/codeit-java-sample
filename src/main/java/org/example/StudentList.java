package org.example;

import java.util.ArrayList;

public class StudentList {
    private ArrayList<Student> studentList;

    public StudentList() {
        studentList = new ArrayList<>();
    }

    public void add(Student student) {
        studentList.add(student);
    }

    public boolean remove(int index){
        try{
            studentList.remove(index);
            return true;
        } catch (Exception e){
            return false;
        }
    }
}
