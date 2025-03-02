package org.example.productFilter.filter;

import org.example.productFilter.model.Product;
import org.example.productFilter.model.ProductColor;
import org.example.productFilter.model.ProductSize;

import java.util.ArrayList;
import java.util.List;

public class ProductFilter {
    public List<Product> ByColor(List<Product> products, ProductColor productColor) {
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getColor() == productColor) {filteredProducts.add(product);}
        }
        return filteredProducts;
    }

    public List<Product> BySize(List<Product> products, ProductSize productSize) {
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getSize() == productSize) {filteredProducts.add(product);}
        }
        return filteredProducts;
    }

    public List<Product> ByColorAndSize(
            List<Product> products,
            ProductColor productColor,
            ProductSize productSize) {
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getSize() == productSize && product.getColor() == productColor) {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }
}
