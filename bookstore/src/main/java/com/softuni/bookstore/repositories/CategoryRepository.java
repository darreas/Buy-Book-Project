package com.softuni.bookstore.repositories;

import com.softuni.bookstore.models.entities.GenreEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<GenreEntity, String> {
}
