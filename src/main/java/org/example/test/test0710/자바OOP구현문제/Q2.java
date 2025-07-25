package org.example.test.test0710.자바OOP구현문제;

class Parson {
    private String name;
    private int age;

    public void setName (String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0 ) {
            System.out.println("나이는 0보다 작을 수 없습니다.");
            this.age = 0;
        } else  {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}



public class Q2 {
    public static void main(String[] args) {
        Parson parson = new Parson();
        parson.setName("박진영");
        parson.setAge(-5);
        System.out.println(parson.getName());
        System.out.println(parson.getAge());
    }
}
