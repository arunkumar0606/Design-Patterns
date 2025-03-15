package Stratergy.With;

public class DebitCard implements PaymentStratergy{

    private String debitCardNumber;

    public DebitCard(String number){
        this.debitCardNumber=number;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid "+amount+" using Debit card numer :"+debitCardNumber);
    }
}
