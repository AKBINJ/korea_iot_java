package org.example.chapter07.orderApp;


/*
    : 주문 시스템의 실행 진입점
 */
public class MainApp {
    public static void main(String[] args) {
        Product laptop = new Electronics("Laptop", 5000);
        Product apple = new Food("apple", 600);

        // 주문 생성
        Order order1 = new Order(laptop, 1);
        Order order2 = new Order(apple, 10);

        System.out.println(order1);
        System.out.println(order2);
    }
}
