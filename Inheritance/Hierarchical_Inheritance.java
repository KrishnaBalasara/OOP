class Shape {
    public void area() {
        System.out.println("Displays Area of Shape");
    }
}
class Triangle extends Shape {
    public void area(int h, int b) {
        System.out.println((0.5)*b*h);
    }  
}
class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14)*r*r);
    }  
} 
public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.area(15, 10);
        Circle c1 = new Circle();
        c1.area(10);
    }
}
