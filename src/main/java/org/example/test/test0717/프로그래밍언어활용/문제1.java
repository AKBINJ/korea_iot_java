package org.example.test.test0717.프로그래밍언어활용;

import java.util.Scanner;

class code01 {
    int A;
    int B;

    int divide() {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        return A / B ;
    }
}

public class 문제1 {
    public static void main(String[] args) {
        code01 obj = new code01();
        Scanner sc = new Scanner(System.in);
        System.out.println("A의 값 : ");
        System.out.println("B의 값 : ");
        try{
            System.out.println(obj.divide());
        } catch (ArithmeticException e) {
            System.out.println("0으로 정수를 나눌 수 없습니다");
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
