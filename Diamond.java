package Pattern;

public class Diamond {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<n*2;i++){
            int num = (n>=i)?i:n*2-i;
            for(int k=n;k>=num;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=num;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
