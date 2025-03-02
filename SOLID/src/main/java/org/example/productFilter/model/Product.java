package org.example.productFilter.model;

import static org.example.productFilter.model.ProductColor.GRAY;
import java.util.List;

import static org.example.productFilter.model.ProductColor.*;
import static org.example.productFilter.model.ProductSize.*;


public class Product {
    private ProductColor color;
    private ProductSize size;

    public Product(ProductColor color, ProductSize size) {
        this.color = color;
        this.size = size;
    }

    public ProductColor getColor() {
        return color;
    }

    public void setColor(ProductColor color) {
        this.color = color;
    }

    public ProductSize getSize() {
        return size;
    }

    public void setSize(ProductSize size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Product{" +
                "color=" + color +
                ", size=" + size +
                '}';
    }

    public Product() {
        this(GRAY,ProductSize.M);
    }

    public static List<Product> getProducts(){
        return  List.of(
                new Product(GRAY, S),
                new Product(GRAY,XXL),
                new Product(RED, M),
                new Product(RED, XXL),
                new Product(CHARTREUSE,M),
                new Product(CHARTREUSE,S),
                new Product(CHARTREUSE,XXL)
        );
    }
}
