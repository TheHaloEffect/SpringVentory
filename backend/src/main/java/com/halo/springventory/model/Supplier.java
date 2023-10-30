package com.halo.springventory.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "suppliers")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long supplierId;

    @Column(name = "supplier_name")
    private String supplierName;
}
