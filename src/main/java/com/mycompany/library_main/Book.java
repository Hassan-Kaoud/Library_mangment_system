package com.mycompany.library_main;

public class Book {
    private String title;
    private String author;
    private int ISBN;
    private boolean isBorrow;

    public Book(String title, String author, int ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isBorrow = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getISBN() {
        return ISBN;
    }

    public boolean isBorrowed() {
        return isBorrow;
    }

    public void setIsBorrow(boolean isBorrow) {
        this.isBorrow = isBorrow;
    }
}