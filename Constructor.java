class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(name);
        System.out.println(age);
    }
    //non-parameterized constructor
    // Student() {
    //     name = "Krishna";
    //     age = 20;
    // }

    //parameterized constructor
    // Student(String name, int age) {
    //     this.name = name;
    //     this.age = age;
    // }
    

    Student() {

    }
    // copy constructor
    Student (Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

}
    public class OOPsStu {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "krishna";
        s1.age = 20;
        s1.printInfo();

        Student s2 = new Student(s1);
        s2.printInfo();
    }
}
