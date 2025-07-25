package org.example.test.test0717.프로그래밍언어활용.book_management_system.model;

import org.example.test.test0717.프로그래밍언어활용.book_management_system.until.DateUtil;

public class Book {
    private int id;
    private String title;
    private String author;
    private String createdAt;
    private String updatedAt;

    public Book(int id, String title, String author, String createdAt, String updatedAt) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.createdAt = DateUtil.now();
        this.updatedAt = DateUtil.now();

    }

    public int getId() {return id;}
    public String getTitle() {return title;}
    public String getAuthor() {return author;}
    public String getCreatedAt() {return createdAt;}
    public String getUpdatedAt() {return updatedAt;}

    public void setAuthor(String author, String updatedAt) {
        this.author = author;
        this.updatedAt = DateUtil.now();
    }

    @Override
    public String toString() {
        System.out.println("id" + getId() + "title" + getTitle() + "author" + getAuthor()+ "createdAt" + getCreatedAt() + "updatedAt" + getUpdatedAt());
        return "";
    }

}
