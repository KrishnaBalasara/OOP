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
class EquilateralTriangle extends Triangle {
    public void area(int h, int b) {
        System.out.println((0.5)*b*h);
    } 
}
 
public class MultiLevel_Inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.area(10, 15);
        EquilateralTriangle e1 = new EquilateralTriangle();
        e1.area(5,15);
    }
}
