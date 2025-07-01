package JavaDSA;

public class MajorityElement {
    public static void main(String[] args) {
        int a[] = {1,2,4,4};
        System.out.println(majority(a));
    }
    static int majority(int a[]){
        int maj=0;
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==maj){
                count++;
            }
            else if(count==0){
                maj=a[i];
                count=1;
            }
            else{
                count--;
            }
        }
        return maj;
    }
}
