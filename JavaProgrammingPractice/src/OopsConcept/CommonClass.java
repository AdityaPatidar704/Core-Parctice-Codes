package OopsConcept;

public class CommonClass {
    public static void main(String[] args) {
        Encapsulation ep=new Encapsulation();
        ep.setName("Aditya");
        System.out.println("Name "+ep.getName());
        ep.setAge(21);
        System.out.println("Age "+ep.getAge());
    }
}
