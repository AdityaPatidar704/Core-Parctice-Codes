package loops;

public class Factorial {
    public static void main(String[] args) {
        int x=3;
        for(int i=x-1;i>0;i--)
        {
            x=x*i;
        }
        System.out.println(x);
    }
}
