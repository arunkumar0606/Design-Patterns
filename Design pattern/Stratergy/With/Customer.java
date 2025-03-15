package Stratergy.With;

public class Customer {
    public static void main(String[] args) {
        PaymentProcessor processor=new PaymentProcessor(new CreditCard("332-123-6776"));
        processor.processPayment(1000);

        PaymentProcessor processor1=new PaymentProcessor(new DebitCard("952-1555-002"));
        processor1.processPayment(200);

        PaymentProcessor processor2=new PaymentProcessor(new Gpay("arunkumar@axil"));
        processor2.processPayment(522);

    }
}
