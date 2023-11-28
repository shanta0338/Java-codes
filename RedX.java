public class RedX extends DeliverySystem {

    @Override
    public double deliveryCharge(boolean insideDhaka) {
        if(insideDhaka==true) {
            return 50.00;
        }
        else {
            return 70.00;
        }
    }

    @Override
    public double cash(boolean cashOnDelivery, double amount) {
        if(cashOnDelivery==true) {
            return amount;
        }
        else {
            return 0.0;
        }
    }
    
    @Override
    public String nameOfCompany() {
        return "Redex";
    }

    public static void main(String[] args) {
        RedX r1 = new RedX();
        System.out.println(r1.cash(false, 989));
        System.out.println(r1.deliveryCharge(true));
        System.out.println(r1.nameOfCompany());
    }
}
