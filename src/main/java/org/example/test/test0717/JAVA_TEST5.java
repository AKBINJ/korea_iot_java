package org.example.test.test0717;

class Student {
    String name;
    int score;

    public Student(String name, int score) {

        this.name = name;
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setScore(int score) {
        this.score = score;
    }

    public void getScore() {
        System.out.println(score);
    }

    public void getName() {
        System.out.println(name);
    }

}

public class JAVA_TEST5 {
    public static void main(String[] args) {

       // Student students = new Student(name, score)[5];

       // Student student1 = new Student("John", 85);
       // Student student2 = new Student("Jane", 92);
       // Student student3 = new Student("Tom", 78);
       // Student student4 = new Student("Emily", 88);
       // Student student5 = new Student("Alex", 95);


       // for(Student stu : students) {
       //     if(stu.score >= 90) {
       //         System.out.println(students.name);
       //     }
       // }
    }
}
