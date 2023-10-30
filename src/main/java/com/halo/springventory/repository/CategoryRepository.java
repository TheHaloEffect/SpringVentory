package com.halo.springventory.repository;

import com.halo.springventory.model.Category;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findByCategoryId(@NonNull Long categoryId);
    List<Category> findByCategoryName(String categoryName);
    List<Category> findAllByOrderByCategoryNameAsc();
    List<Category> findByCategoryNameContainingIgnoreCase(String keyword);
    void deleteByCategoryId(@NonNull Long categoryId);
}