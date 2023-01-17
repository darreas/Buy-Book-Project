package com.softuni.bookstore.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "users")
public class User extends BaseEntity{

    private String username;
    private String firstName;

    private String lastName;

    private String email;

    private Integer age;

    private List<Book> favouriteBooks;

    private List<Order> order;

    public User() {
    }
    @Column(nullable = false)
    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    @Column(nullable = false)
    public String getFirstName() {
        return firstName;
    }

    public User setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Column(nullable = false)
    public String getLastName() {
        return lastName;
    }

    public User setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Column(nullable = false)
    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    @Column(nullable = false)
    public Integer getAge() {
        return age;
    }

    public User setAge(Integer age) {
        this.age = age;
        return this;
    }

    @OneToMany
    public List<Book> getFavouriteBooks() {
        return favouriteBooks;
    }

    public User setFavouriteBooks(List<Book> favouriteBooks) {
        this.favouriteBooks = favouriteBooks;
        return this;
    }

    @OneToMany
    public List<Order> getOrder() {
        return order;
    }

    public User setOrder(List<Order> order) {
        this.order = order;
        return this;
    }
}
