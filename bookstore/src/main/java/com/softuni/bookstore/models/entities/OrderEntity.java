package com.softuni.bookstore.models.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "orders")
public class OrderEntity extends BaseEntity{

    @ManyToOne
    private UserEntity user;
   @ManyToMany(fetch = FetchType.EAGER)
    private List<BookEntity> books;

   @Column(nullable = false)
    private Long totalCost;

    public OrderEntity() {
    }

    public List<BookEntity> getBooks() {
        return books;
    }

    public void setBooks(List<BookEntity> books) {
        this.books = books;
    }

    public Long getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Long totalCost) {
        this.totalCost = totalCost;
    }
}
