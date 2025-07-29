package Pattern;

public class Butterfly {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 1; i < n * 2; i++) {
            int num = i <= n ? i : 2 * n - i;
            int space = (2 * n - 1) - 2 * num;
            for (int j = 1; j <= num; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= space; k++) {
                System.out.print(" ");
            }
        if(num!=n)
            for (int j = 1; j <= num; j++) {
                System.out.print("*");
            }
        else{
            for (int j = 1; j <= num-1; j++) {
                System.out.print("*");
            }
        }
            System.out.println();
        }
    }
}
