public class Main {
    public static void main(String[] args) {
        PaymentProcessor paypal = new PayPalAdapter();
        PaymentProcessor stripe = new StripeAdapter();

        System.out.println("Processing with PayPal:");
        paypal.processPayment(2500.0);

        System.out.println("Processing with Stripe:");
        stripe.processPayment(1800.0);
    }
}
