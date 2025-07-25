package org.example.test.test0717.프로그래밍언어활용;

//# 문제 2: 배열의 최솟값 찾기

//! 1. 문제 설명

// N개의 정수가 주어지면, 그 중 최솟값을 출력하는 프로그램을 작성하시오.


//! 2. 입력

// 첫 번째 줄에 정수 N이 주어진다.

// 두 번째 줄에 N개의 정수가 공백으로 구분되어 주어진다.


//! 3. 출력

// N개의 정수 중 최솟값을 출력한다.


import java.util.Scanner;

public class 문제2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("N의 정수를 입력해주세요: ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.println(N + "개의 정수 입력");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < N; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("최솟값: " + min);
        sc.close();
    }
}

