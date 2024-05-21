package loops;

public class oddNumber {
    public static void main(String[] args) {
        int x=9;
        do{
            if(x%2!=0)
            { System.out.println(x);
                x--;
            }
            else{
                x--;
            }
        }
        while(x>0);
    }
}
