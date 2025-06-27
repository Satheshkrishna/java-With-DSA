package JavaDSA;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int a[] = {2,5,8,9};
        int target = 7;
        int res[] = sum(a,target);
        for(int i: res){
            System.out.print(i+" ");
        }
    }
    static int[] sum(int a[],int tar){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<a.length;i++){
            int diff = tar-a[i];
            if(map.containsKey(diff)){
                return new int[] {map.get(diff),i};
            }
            map.put(a[i],i);
        }
        return new int[]{-1,-1};
    }
}
