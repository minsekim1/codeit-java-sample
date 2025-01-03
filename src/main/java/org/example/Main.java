package org.example;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        StudentList list = new StudentList();
        list.add(new Student("name1",21));
        list.add(new Student("name2",11));
        list.add(new Student("name3",23));
        list.add(new Student("name4",28));
        list.add(new Student("name5",91));
        list.add(new Student("name6",91));
        list.add(new Student("name7",91));
        list.add(new Student("name8",91));

        list.getMaxScoreStudent();
    }
}