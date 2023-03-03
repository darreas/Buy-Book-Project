package com.softuni.bookstore.models.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "categories")
public class GenreEntity extends BaseEntity{

    @Column(nullable = false)
    private String name;

    @ManyToMany(mappedBy = "genres")
    private List<BookEntity> books;

    public GenreEntity() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BookEntity> getBooks() {
        return books;
    }

    public void setBooks(List<BookEntity> books) {
        this.books = books;
    }
}
