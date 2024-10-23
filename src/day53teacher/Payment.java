package day53teacher;

// Payment interface
interface Payment {
    void processPayment(double amount);
}
// Implementation of CreditCardPayment
class CreditCardPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}
// Implementation of PayPalPayment
class PayPalPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}
// PaymentProcessor class
class PaymentProcessor {
    public void makePayment(Payment paymentMethod, double amount) {
        paymentMethod.processPayment(amount); // Dynamic method resolution
    }
}
// Usage
class PaymentMain {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        Payment creditCard = new CreditCardPayment();
        Payment paypal = new PayPalPayment();
        // Output: Processing credit card payment of $100.0
        processor.makePayment(creditCard, 100.0);
        // Output: Processing PayPal payment of $150.0
        processor.makePayment(paypal, 150.0);
    }
}

