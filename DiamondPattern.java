package JavaDSA;

public class DiamondPattern {
    public static void main(String[] args) {
        int n = 5;
        int a =1;
        for(int i=1;i<=n;i++){
            for(int k=n-i;k>0;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(a++ +" ");
            }
            System.out.println();
        }
        for(int i=5;i>=1;i--){
            for(int k=n-i;k>0;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(a++ + " ");
            }
            System.out.println();
        }
    }
}
