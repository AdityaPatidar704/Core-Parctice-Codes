package loops;

public class Reverse {
    public static void main(String[] args) {
        int x = 12345;
        int y=1;
        while (x != 0) {
            y = x % 10;
            x=x/10;
            System.out.print(y);
        }
    }
}
