package JavaDSA;
//kandane algorithm
public class MaxSubarray {
    public static void main(String[] args) {
    int a[] = {-2,1,-3,4,-1,2,1,-5,4};
    int sum=a[0];
    int max=Integer.MIN_VALUE;
    for(int i=1;i<a.length;i++){
        sum=Math.max(a[i],a[i]+sum);
        max=Math.max(sum,max);
    }
        System.out.println(max);
    }
}
