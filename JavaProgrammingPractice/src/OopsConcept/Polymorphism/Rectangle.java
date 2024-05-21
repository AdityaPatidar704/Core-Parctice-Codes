package OopsConcept.Polymorphism;

import java.util.*;

public class Rectangle extends Cicle{
     static protected void meth1(int rad){
         
        System.out.println("area of rectangle is"+100);
    }
    public static void main(String[] args) {
        Rectangle obj=new Rectangle();
        obj.meth1(2);
        HashMap al=new HashMap();
        al.put("hii",1);
        al.put("byee",2);
        
        HashSet hm=new HashSet(al.keySet());
        Iterator i =hm.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

    }
}
