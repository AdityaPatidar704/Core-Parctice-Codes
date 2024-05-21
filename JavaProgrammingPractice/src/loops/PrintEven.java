package loops;

public class PrintEven {
    private int x=2;
    private int meth1() {
        for (int i = this.x; i <= 20; i += 2) {
            System.out.println(i);
        }
        return 0;
    }
        public static void main(String args[])
        {
               PrintEven pw=new PrintEven();
               pw.meth1();
        }
    }

