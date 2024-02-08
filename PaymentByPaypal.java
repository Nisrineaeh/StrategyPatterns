public class PaymentByPaypal implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Paiement de " + amount + "effectuer par Paypal.");
    }
    
}
