package JavaDSA;
import java.util.*;

public class LeaderArray {
    public static void main(String[] args) {
        int a[] = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> result = leader(a);
        System.out.println(result);
    }
    static ArrayList<Integer> leader(int a[]){
        ArrayList<Integer> res = new ArrayList<>();
        int last = a[a.length-1];
        res.add(last);
        for(int i=a.length-2;i>=0;i--){
            if(a[i]>=last){
                last=a[i];
                res.add(a[i]);
            }
        }
        Collections.reverse(res);
        return res;
    }
}
