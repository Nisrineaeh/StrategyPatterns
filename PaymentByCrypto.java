public class PaymentByCrypto implements PaymentMethod{

    @Override
    public void pay(double amount) {
        System.out.println("Paiement de " + amount + "effectuer par Crypto-monnaie.");
    }
    
}
