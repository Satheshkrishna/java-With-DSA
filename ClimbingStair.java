package JavaDSA;

public class ClimbingStair {
    public static void main(String[] args) {
        int n = 2;
        int a[] = new int[n+1];
        a[0]=1;
        a[1]=1;
        for(int i=2;i<=n;i++){
            a[i]=a[i-1]+a[i-2];
        }
        System.out.println(a[n]);
    }
}
