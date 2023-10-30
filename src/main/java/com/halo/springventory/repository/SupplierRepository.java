package com.halo.springventory.repository;

import com.halo.springventory.model.Supplier;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {

    Supplier findBySupplierId(@NonNull Long supplierId);
    List<Supplier> findBySupplierName(String supplierName);
    List<Supplier> findAllByOrderBySupplierNameAsc();
    List<Supplier> findBySupplierNameContainingIgnoreCase(String keyword);
    void deleteBySupplierId(@NonNull Long supplierId);
}