package org.example.chapter07.animalApp;

import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {
        // == 서비스 계층(실행) 생성 == //
        // : service 객체의 handleAnimal 메서드는 Animal 타입의 객체를 인자로 받음
        AnimalService service = new AnimalService();

        // 동물을 관리하는 List 생성
        // : 객체 타입을 저장할 수 있는 ArrayList
        ArrayList<Animal> animals = new ArrayList<>();

        // 동적 배열에 객체 추가
        // : Animal 타입에 Cat/Dog 객체를 추가
        animals.add(new Cat()); // 업캐스팅 (자동 타입 변환)
        animals.add(new Dog()); // 업캐스팅 (자동 타입 변환)
        animals.add(new Cat()); // 업캐스팅 (자동 타입 변환)
        animals.add(new Dog()); // 업캐스팅 (자동 타입 변환)
        animals.add(new Cat()); // 업캐스팅 (자동 타입 변환)

        for (Animal animal: animals) {
            if (animal instanceof Cat) {
                System.out.println("고양이가 있다");
                Cat cat = (Cat) animal;
                cat.eat();
            }
            service.handleAnimal(animal);
        }

        Animal cat = new Cat();
        Animal dog = new Dog();

        service.handleAnimal(cat);
        service.handleAnimal(dog);

        // cat.eat();

        if (cat instanceof Cat) {
            Cat onlyCat = (Cat) cat;
            onlyCat.eat();
        }

        if (dog instanceof Cat) {
            Cat dogCat = (Cat) dog;
            dogCat.eat();
            System.out.println("강아지는 고양이의 인스턴스가 X (출력 X)");
        }
    }
}
