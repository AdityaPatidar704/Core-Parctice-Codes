package OopsConcept;

public class ClassB extends ClassA {
    ClassB(int x){
        System.out.println("I am dog.I can bark");
    }
    public static void main(String[] args) {
        System.out.println("Hii I am Derived Class");
        ClassA ob=new ClassB(2);
    }
}
