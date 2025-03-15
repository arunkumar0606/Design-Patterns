package Stratergy.With;

public class CreditCard implements PaymentStratergy{

    private String creditCardNumber;

    public CreditCard(String number){
        this.creditCardNumber=number;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid "+amount+" using Credit card numer :"+creditCardNumber);
    }
    
}
