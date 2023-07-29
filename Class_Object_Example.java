class Pen {
    String color;
    String type;
    //method 1
    void printData() {
        System.out.println("Writing somthing");
    }
    //method 2 
    void printcolor() {
        System.out.println(this.color);
    }
}

public class Class_Object_Example {
    public static void main(String[] args) {
        // Pen -> class | pen1 -> object 
        Pen pen1 = new Pen();
        Pen pen2 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";
        pen1.printData();
        pen1.printcolor();

        pen2.color = "black";
        pen2.type = "bollpoint";
        pen2.printData();
        pen2.printcolor();
        
    }    
}
