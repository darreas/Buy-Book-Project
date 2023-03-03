package com.softuni.bookstore.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "reviews")
public class ReviewEntity extends BaseEntity{

    @Column(columnDefinition = "TEXT")
    private String text;

    @ManyToOne
    private BookEntity book;

    @ManyToOne
    private UserEntity user;

    private int rating;

    public ReviewEntity() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
