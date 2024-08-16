/** Class that prints the Collatz sequence starting from a given number.
 *  @author Zhangguangye
 */
public class Collatz {

    /** Buggy implementation of nextNumber! */
    public static int nextNumber(int n) {
        if (n == 1){
            return 1;
        } else if (n % 2 == 0) {
            n = n / 2;
            return n;
        } else {
            n = n * 3 + 1;
            return n;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.print(n + " ");
        while (n != 1) {
            n = nextNumber(n);
            System.out.print(n + " ");
        }
        System.out.println();
    }
}

