package org.example.test.test0717.프로그래밍언어활용.book_management_system.service;

import org.example.test.test0717.프로그래밍언어활용.book_management_system.model.Book;

public interface BookService {
    void addBook(Book book);
    void checkBook(Book book);
    void updateBook(String Id, String newTitle, String newAuthor);
    void deleteBook(Book book);
    void searchBook(Book book);
}
