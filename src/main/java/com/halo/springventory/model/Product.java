package com.halo.springventory.model;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long product_id;

    @Column(name = "product_sku")
    private String product_sku;

    @Column(name = "product_name")
    private String product_name;

    @Column(name = "product_description")
    private String product_description;

    @Column(name = "product_quantity")
    private Integer product_quantity;

    @Column(name = "product_weight")
    private Double product_weight;

    @Column(name = "product_price")
    private Double product_price;

    public Product(Long product_id, String product_sku, String product_name, String product_description, Integer product_quantity, Double product_weight, Double product_price) {
        this.product_id = product_id;
        this.product_sku = product_sku;
        this.product_name = product_name;
        this.product_description = product_description;
        this.product_quantity = product_quantity;
        this.product_weight = product_weight;
        this.product_price = product_price;
    }

    public Product() {

    }

    public Long getProduct_id() {
        return product_id;
    }

    public String getProduct_sku() {
        return product_sku;
    }

    public void setProduct_sku(String product_sku) {
        this.product_sku = product_sku;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_description() {
        return product_description;
    }

    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }

    public Integer getProduct_quantity() {
        return product_quantity;
    }

    public void setProduct_quantity(Integer product_quantity) {
        this.product_quantity = product_quantity;
    }

    public Double getProduct_weight() {
        return product_weight;
    }

    public void setProduct_weight(Double product_weight) {
        this.product_weight = product_weight;
    }

    public Double getProduct_price() {
        return product_price;
    }

    public void setProduct_price(Double product_price) {
        this.product_price = product_price;
    }
}
