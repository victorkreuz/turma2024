package lacoWhile;

public class att03 {

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 0;
        while (c < 500) {
            System.out.print(" " + c);
            c = a + b;
            a = b;
            b = c;
            
        }
    }
}
