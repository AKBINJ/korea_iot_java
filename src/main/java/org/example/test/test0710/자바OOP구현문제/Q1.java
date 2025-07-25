package org.example.test.test0710.자바OOP구현문제;

class Animal {
    String name;

    void makeSound() {
        System.out.println("동물 소리");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("멍멍");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("야옹");
    }
}

public class Q1 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{new Dog(), new Cat()};

        for (Animal a : animals) {
            a.makeSound();
        }
    }
}
