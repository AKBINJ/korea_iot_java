package org.example.chapter01;

import java.util.Scanner;

public class Z_Practice {
    public static void main(String[] args) {
        /*

         */
        Scanner score = new Scanner(System.in);

        System.out.println("이름: ");
        String name = score.nextLine();
        System.out.println("국어 점수: ");
        int a = score.nextInt();
        System.out.println("영어 점수: ");
        int b = score.nextInt();
        System.out.println("수학 점수: ");
        int c = score.nextInt();

        int d = a+b+c;
        float f = d / 3.0F;
        String g = (a >= 60 && b >= 60 && c >= 60) ? "합격" : "불합격";

        System.out.println("[이름: " + name + "]");
        System.out.println("총점: " + d + "점");
        System.out.println("평균: " + f + "점");
        System.out.println("판정: " + g);

    }
}
