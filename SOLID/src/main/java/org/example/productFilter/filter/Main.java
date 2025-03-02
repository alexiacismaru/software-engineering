package org.example.productFilter.filter;

import org.example.productFilter.model.Product;

import static org.example.productFilter.model.ProductColor.GRAY;
import static org.example.productFilter.model.ProductSize.S;

/*modeled using the Single Responsibility Principle from SOLID*/

public class Main {
    public static void main(String[] args) {
        ProductFilter pf = new ProductFilter();
        System.out.println("Gray products: "+pf.ByColor(Product.getProducts(), GRAY));
        System.out.println("S products: "+pf.BySize(Product.getProducts(), S));
        System.out.println("Gray S products: "+pf.ByColorAndSize(Product.getProducts(), GRAY,S));
    }
}
