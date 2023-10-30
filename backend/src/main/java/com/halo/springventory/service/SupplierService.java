package com.halo.springventory.service;

import com.halo.springventory.model.Supplier;
import com.halo.springventory.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SupplierService {

    private final SupplierRepository supplierRepository;

    @Autowired
    public SupplierService(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }

    public List<Supplier> getAllSuppliers() {
        return supplierRepository.findAll();
    }

    public Optional<Supplier> getSupplierById(Long id) {
        return supplierRepository.findById(id);
    }

    public Supplier createSupplier(Supplier supplier) {
        return supplierRepository.save(supplier);
    }

    public Supplier updateSupplier(Long id, Supplier supplier) {
        Optional<Supplier> existingSupplier = supplierRepository.findById(id);
        if (existingSupplier.isPresent()) {
            supplier.setSupplierId(id);
            return supplierRepository.save(supplier);
        } else {
            return null;
        }
    }

    public boolean deleteSupplier(Long id) {
        Optional<Supplier> existingSupplier = supplierRepository.findById(id);
        if (existingSupplier.isPresent()) {
            supplierRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
