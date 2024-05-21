package OopsConcept;
/*in general encapsulation is binding of data member and member function in a single unit moving furthur we can say that
* is the process of making fields private and accesiing those fileds with the help of geters and setters that are public methods*/
public class Encapsulation {
    private String name;
    private int age;
    ////////////////////
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        //Encapsulation//

    }
}
