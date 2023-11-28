class Pathao extends DeliverySystem {
    @Override
    public double deliveryCharge(boolean insideDhaka) {
        if(insideDhaka == true) {
            return 50.00;
        } else {
            return 70.00;
        }
    }

    @Override
    public double cash(boolean cashOnDelivery, double amount) {
        if (cashOnDelivery == true) {
            return amount;
        } else {
            return 0.0;
        }
    }
    @Override
    public String nameOfCompany() {
        return "Pathao";
    }

    public static void main(String[] args) {
        Pathao p1 = new Pathao();
        System.out.println(p1.cash(true,12.00));
        System.out.println(p1.deliveryCharge(false));
        System.out.println(p1.nameOfCompany());
    }


}