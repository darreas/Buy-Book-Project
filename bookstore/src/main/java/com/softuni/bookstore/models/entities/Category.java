package com.softuni.bookstore.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "categories")
public class Category extends BaseEntity{

    private String name;


    private List<Book> book;

    public Category() {
    }

    @Column(nullable = false)
    public String getName() {
        return name;
    }

    public Category setName(String name) {
        this.name = name;
        return this;
    }

    @OneToMany
    public List<Book> getBook() {
        return book;
    }

    public Category setBook(List<Book> book) {
        this.book = book;
        return this;
    }
}
