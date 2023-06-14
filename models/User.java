/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookshop.models;

import java.util.List;


public class User {
    private String id;
    private String name;
    private List<Book> borrowedBooks;

    public User(String id, String name, List<Book> borrowedBooks) {
        this.id = id;
        this.name = name;
        this.borrowedBooks = borrowedBooks;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String author) {
        this.name = author;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
    
    public void borrowBook(Book book) {
        this.borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        this.borrowedBooks.remove(book);
    }
}
