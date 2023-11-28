class Pen {
    String colour;
    String brand;
    String type;

    public void Write() {
        System.out.println("Somthing is writing");
    }

    public void Print() {
        System.out.println("Colour: "+this.colour);
        System.out.println("Brand: "+this.brand);
        System.out.println("Type: "+this.type);
    }
}

class Student {
    String name;
    int age;
    
    public void print_Name() {
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
    }

    Student() {

    }

    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }
}

class Main2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Shanta";
        s1.age = 21;
        //Coping constrator
        Student s2 = new Student(s1);
        s2.name = "shanta";
        s1.print_Name();
    }

}