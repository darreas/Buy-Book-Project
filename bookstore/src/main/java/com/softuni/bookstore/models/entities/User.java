package com.softuni.bookstore.models.entities;

import java.util.List;

public class User {

    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private Integer age;

    private List<Book> favouriteBooks;

    private Order order;
}
