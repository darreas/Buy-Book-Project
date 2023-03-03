package com.softuni.bookstore.models.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "users")
public class UserEntity extends BaseEntity{

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true)
    private String email;

    private Integer age;

    @OneToMany(fetch = FetchType.EAGER)
    private List<BookEntity> favouriteBookEntities;

    @OneToMany(mappedBy = "user")
    private List<OrderEntity> orderEntity;

    @OneToMany(mappedBy = "user")
    private List<ReviewEntity> reviews;

    public UserEntity() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<BookEntity> getFavouriteBooks() {
        return favouriteBookEntities;
    }

    public void setFavouriteBooks(List<BookEntity> favouriteBookEntities) {
        this.favouriteBookEntities = favouriteBookEntities;
    }

    public List<OrderEntity> getOrder() {
        return orderEntity;
    }

    public void setOrder(List<OrderEntity> orderEntity) {
        this.orderEntity = orderEntity;
    }

    public List<ReviewEntity> getReviews() {
        return reviews;
    }

    public void setReviews(List<ReviewEntity> reviews) {
        this.reviews = reviews;
    }
}
