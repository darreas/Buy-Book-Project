package com.softuni.bookstore.models.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "books")
public class Book extends BaseEntity{

    private String name;

    private Date publishedOn;

    private String description;

    private Integer price;

//    private Author author;
//
//    private Category category;


    public Book() {
    }

    @Column(nullable = false)
    public String getName() {
        return name;
    }

    public Book setName(String name) {
        this.name = name;
        return this;
    }

    @Column(nullable = false, name = "published_on")
    public Date getPublishedOn() {
        return publishedOn;
    }

    public Book setPublishedOn(Date publishedOn) {
        this.publishedOn = publishedOn;
        return this;
    }

    @Column(nullable = false)
    public String getDescription() {
        return description;
    }

    public Book setDescription(String description) {
        this.description = description;
        return this;
    }
    @Column(nullable = false)
    public Integer getPrice() {
        return price;
    }

    public Book setPrice(Integer price) {
        this.price = price;
        return this;
    }
}
