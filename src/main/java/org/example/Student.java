package org.example;

public class Student extends Person {
    public String name;
    public int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", score=" + score + "]";
    }

    @Override
    public void getHandle() {
        System.out.println("my handle" + Person.HANDLE);
    }

    @Override
    public void getBody() {
        System.out.println("my body" + Person.BODY);
    }
}
