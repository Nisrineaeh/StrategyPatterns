public class StrategyPatterns {
    public static void main(String[] args) {
            // Création d'une mode de paiment
            PaymentMethod paiementParCarte = new PaymentByCb();

            // Créer une facture avec le mode de paiement CB
            Facture facture = new Facture(paiementParCarte);

            // Payer la facture
            facture.payFacture(100.0);

            // Changer le mode de paiement
            PaymentMethod paiementPayPal = new PaymentByPaypal();
            facture.setPaymentMethod(paiementPayPal);

            // Payer une autre facture
            facture.payFacture(200.0);

        
    }

   
        
    

}
