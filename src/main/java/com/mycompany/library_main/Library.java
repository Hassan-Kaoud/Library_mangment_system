package com.mycompany.library_main;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private ArrayList<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void borrowBook(String memberId, int ISBN) {
        Member member = findMemberById(memberId);
        Book book = findBookByISBN(ISBN);

        if (member != null && book != null && !book.isBorrowed()) {
            member.borrowBook(book);
            book.setIsBorrow(true);
            System.out.println(member.getName() + " borrowed " + book.getTitle());
        } else {
            System.out.println("Cannot borrow book.");
        }
    }

    public void returnBook(String memberId, int ISBN) {
        Member member = findMemberById(memberId);
        Book book = findBookByISBN(ISBN);

        if (member != null && book != null && book.isBorrowed()) {
            member.returnBook(book);
            book.setIsBorrow(false);
            System.out.println(member.getName() + " returned " + book.getTitle());
        } else {
            System.out.println("Cannot return book.");
        }
    }

    public void displayAvailableBooks() {
        for (Book book : books) {
            if (!book.isBorrowed()) {
                System.out.println(book.getTitle() + " by " + book.getAuthor());
            }
        }
    }

    private Member findMemberById(String memberId) {
        for (Member member : members) {
            if (member.getId().equals(memberId)) {
                return member;
            }
        }
        return null;
    }

    private Book findBookByISBN(int ISBN) {
        for (Book book : books) {
            if (book.getISBN() == ISBN) {
                return book;
            }
        }
        return null;
    }
}
