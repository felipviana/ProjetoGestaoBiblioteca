/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookshop.models;

import java.util.ArrayList;
import java.util.List;

public class DataManager {
    private static DataManager instance;
    
    private List<User> users;
    private List<Book> books;

    private DataManager() {
        this.users = new ArrayList<>();
        this.books = new ArrayList<>();
    }

    public static DataManager getInstance() {
        if (instance == null) {
            instance = new DataManager();
        }
        return instance;
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Book> getBooks() {
        return books;
    }
    
   
    
    public User getUserAt(int index) {
        return users.get(index);
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    
    public void removeBook(int index) {
        this.books.remove(index);
    }
    
    public void removeUser(int index) {
        this.users.remove(index);
    }
    
    public void addBook(Book book) {
        this.books.add(book);
    }
    
    public void addUser(User user) {
        this.users.add(user);
    }
    
    
    
    public void updateBookAt(int index, Book updatedBook) {
        if (index >= 0 && index < books.size()) {
            books.set(index, updatedBook);
        } else {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds!");
        }
    }
    
    public void updateUserAt(int index, User updatedUser) {
        if (index >= 0 && index < users.size()) {
            users.set(index, updatedUser);
        } else {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds!");
        }
    }
}

