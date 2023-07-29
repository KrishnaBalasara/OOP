// super class/ parent class/ base class
class Shape {
    int i=10;
    public void area() {
        System.out.println("Displays Area of Shape");
    }
}

// sub class/ child class / derived class
class Triangle extends Shape {
    public void area(int h, int b) {
        System.out.println(i);
        System.out.println((0.5)*b*h);
    }  
}

public class SigleInheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.area(10, 15);
    }
}
