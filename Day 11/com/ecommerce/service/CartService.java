package com.ecommerce.service;
import java.util.*;
import com.ecommerce.model.Product;

public class CartService {
    private ArrayList<Product> cart = new ArrayList<>();
    public void addToCart(Product product) {
        cart.add(product);
    }

    public int calculateTotal() {
        int total = 0;
        for(Product product : cart) {
            total += product.getPrice();
        }
        return total;
    }
    public void showCart() {
        for(Product product : cart) {
            product.display();
        }
    }
    
}
