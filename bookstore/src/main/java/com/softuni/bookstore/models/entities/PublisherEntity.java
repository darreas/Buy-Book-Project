package com.softuni.bookstore.models.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "publishers")
public class PublisherEntity extends BaseEntity{

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private String address;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "publisher")
    private List<BookEntity> books;

    public PublisherEntity() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<BookEntity> getBooks() {
        return books;
    }

    public void setBooks(List<BookEntity> books) {
        this.books = books;
    }
}
