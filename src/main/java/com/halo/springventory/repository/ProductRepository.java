package com.halo.springventory.repository;

import com.halo.springventory.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    Optional<Product> findById(Long id);
    Product findByProductSku(String sku);
    List<Product> findByProductQuantityGreaterThan(Integer quantity);
    List<Product> findByProductPriceBetween(Double minPrice, Double maxPrice);
    List<Product> findByProductName(String name);
    List<Product> findByProductDescriptionContaining(String keyword);
    @Modifying
    @Query("UPDATE Product p SET p.productQuantity = :quantity WHERE p.productId = :id")
    void updateProductQuantity(@Param("id") Long id, @Param("quantity") Integer quantity);
    void deleteById(Long id);
}