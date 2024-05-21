package loops;

public class Fibonnaci {
    public static void main(String[] args) {
        int x=-1;
        int y=1;
        int val=1;
        do{
            y=val;
            val=x+y;
            if(val==13)
            {
               break;
            }
            x=y;
            System.out.println(val);
        }
        while(val<50);
    }
}
