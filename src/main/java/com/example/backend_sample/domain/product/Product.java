package com.example.backend_sample.domain.product;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class Product {
    private String productName;
    private int price;
    private String category;
    private int deliveryPrice;

    @Builder
    public Product(String productName, int price, String category, int deliveryPrice) {
        this.productName = productName;
        this.price = price;
        this.category = category;
        this.deliveryPrice = deliveryPrice;
    }
}
