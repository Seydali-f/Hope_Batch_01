package com.ecommerce.main;
import com.ecommerce.service.CartService;
import com.ecommerce.model.Product;
import com.ecommerce.util.DiscountUtil;

public class MainApp {
    public static void main(String[] args) {
        CartService cart = new CartService();
        Product p1 = new Product(1, "iPhone 18 Pro Max",175000);
        Product p2 = new Product(2, "Samsung Galaxy S30 Ultra", 150000);
        cart.addToCart(p1);
        cart.addToCart(p2);
        cart.showCart();
        int totalAmount = cart.calculateTotal();;
        System.out.println("Total Amount: $"+totalAmount);
    }
}
