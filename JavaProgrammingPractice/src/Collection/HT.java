package Collection;

import java.util.Hashtable;

public class HT {
    private void meth1()
    {
        System.out.println("HashTable Starts");
        Hashtable ht=new Hashtable();
        ht.put(1,"java");
        ht.put(2,2);
        ht.put(3,"as");
        ht.put(3,'a');
        System.out.println(ht);
    }

    public static void main(String[] args) {
        new HT().meth1();
    }
}
