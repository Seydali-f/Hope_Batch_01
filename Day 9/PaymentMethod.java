interface Payment {
    void pay(double amount);
}

class CashPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Payment done using Cash: " + amount);
    }
}

class CardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Payment done using Card: " + amount);
    }
}

public class PaymentMethod {
    public static void main(String[] args) {

        Payment p1 = new CashPayment();
        p1.pay(500);

        Payment p2 = new CardPayment();
        p2.pay(1000);
    }
}