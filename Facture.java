class Facture{

    private PaymentMethod modeDePaiment;

    public Facture(PaymentMethod modeDePaiment){
        this.modeDePaiment = modeDePaiment;
    }

    public void payFacture(double amount){
        modeDePaiment.pay(amount);
    }

    public void setPaymentMethod(PaymentMethod modeDePaiement){
        this.modeDePaiment = modeDePaiement;
    }
}