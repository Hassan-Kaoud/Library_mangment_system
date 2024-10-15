/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.library_main;

/**
 *
 * @author DELL
 */
public class Library_main {

    public static void main(String[] args) {
        Library library = new Library();
Book b1= new Book("science", "author", 50);
Book b2= new Book("math", "author", 70);
Member m = new Member("hassan", "5");
library.addBook(b1);
        library.addMember(m);

        library.borrowBook("5", 70);
        library.returnBook("5", 50);
  library.borrowBook("5", 70);
        library.displayAvailableBooks();
    }
}
