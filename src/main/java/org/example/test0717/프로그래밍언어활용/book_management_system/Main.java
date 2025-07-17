package org.example.test0717.프로그래밍언어활용.book_management_system;

import org.example.test0717.프로그래밍언어활용.book_management_system.service.BookService;
import org.example.test0717.프로그래밍언어활용.book_management_system.service.BookServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("=== 도서 관리 시스템 ===");
            System.out.println("1. 도서 등록");
            System.out.println("2. 전체 조회");
            System.out.println("3. 저자 수정");
            System.out.println("4. ID 조회");
            System.out.println("5. 삭제");
            System.out.println("6. 제목 검색");
            System.out.println("0. 프로그램 종료");
            System.out.println("메뉴를 선택해주세요 >> ");

            try {
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        addBook(bookService, sc);
                        break;
                    case 2:
                        checkBook(bookService, sc);
                        break;
                    case 3:
                        updateBook(bookService, sc);
                        break;
                    case 4:
                        checkBook(bookService, sc);
                        break;
                    case 5:
                        deleteBook(bookService, sc);
                        break;
                    case 6:
                        searchBook(bookService, sc);
                        break;
                    case 0:
                        System.out.println("=== 종료합니다 ===");
                        sc.close();
                        return;
                    default:
                        System.out.println("유효하지 않은 선택입니다. 다시 시도해주세요 :)");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    private static void addBook(BookService bookService, Scanner sc) {

    }
    private static void checkBook(BookService bookService, Scanner sc) {

    }
    private static void updateBook(BookService bookService, Scanner sc) {

    }
    private static void deleteBook(BookService bookService, Scanner sc) {

    }
    private static void searchBook(BookService bookService, Scanner sc) {

    }

}
