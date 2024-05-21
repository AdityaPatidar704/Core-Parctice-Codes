package Collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class LL {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.add("10");
        ll.add("20");
        ll.add("null");
        ListIterator li =ll.listIterator();
        while(li.hasNext())
        {
            System.out.println(li.next());
        }
        while(li.hasPrevious())
        {
            System.out.println(li.previous());
        }
    }
}
