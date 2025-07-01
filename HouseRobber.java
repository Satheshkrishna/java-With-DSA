package JavaDSA;

public class HouseRobber {
    public static void main(String[] args) {
        int a[]= {2,7,9,3,1};
        int theif[] = new int[a.length+1];
        theif[0]=0;
        theif[1]=a[0];
        for(int i=2;i<theif.length;i++){
            theif[i]=Math.max(theif[i-1],theif[i-2]+a[i-1]);
        }
        System.out.println(theif[theif.length-1]);
    }
}
