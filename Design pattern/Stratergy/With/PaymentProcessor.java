package Stratergy.With;

public class PaymentProcessor {
    
    private PaymentStratergy paymentStratergy; 

    public PaymentProcessor(PaymentStratergy stratergy){
        this.paymentStratergy=stratergy;
    }

    public void processPayment(int amount){
        if(paymentStratergy==null){
            System.out.println("Choose a payment method");
        }
        paymentStratergy.pay(amount);
    }
}
