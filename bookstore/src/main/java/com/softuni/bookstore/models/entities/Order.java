package com.softuni.bookstore.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "orders")
public class Order extends BaseEntity{

    private User user;

    private List<Book> books;

    public Order() {
    }

    @ManyToOne
    public User getUser() {
        return user;
    }

    public Order setUser(User user) {
        this.user = user;
        return this;
    }

    @OneToMany
    public List<Book> getBooks() {
        return books;
    }

    public Order setBooks(List<Book> books) {
        this.books = books;
        return this;
    }
}
