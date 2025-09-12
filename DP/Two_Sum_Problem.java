import java.util.*;

public class Two_Sum_Problem {
    public static void main(String[] args) {
        int arr[]={2,7,3,5,8,4};
        int k=11;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int x=k-arr[i];
            if(set.contains(x)){
                System.out.println("2 numbers with sum "+k+" are "+x+" and "+arr[i]);
                return;
            }
            set.add(arr[i]);
        }
    }
}
