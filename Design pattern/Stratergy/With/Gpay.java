package Stratergy.With;

public class Gpay implements PaymentStratergy{


    private String upiId;

    public Gpay(String id){
        this.upiId=id;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid "+amount+" using UPI ID : "+upiId);
    }
    
}
