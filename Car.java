class Car extends Vehicle{
    String name;
    String colour;

    public void print() {
        System.out.println("Name: "+this.name);
        System.out.println("Colour: "+this.colour);
        System.out.println("Hourse power: "+this.hoursepower);
        System.out.println("Company: "+this.company);
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.name = "V1";
        c1.colour = "Red";
        c1.company = "Toyota";
        c1.hoursepower = 246;
        c1.print();
        c1.Accleration();
    }
}
