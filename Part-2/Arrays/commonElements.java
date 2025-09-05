// 1.) Find common elements between two arrays

package Arrays;
import java.util.*;

public class commonElements {
    public static Set<Integer> common(int [] arr1,int [] arr2){
        Set<Integer> set=new HashSet<>();
        for(int i:arr1){
            for(int j:arr2){
                if(i==j){
                    set.add(i);
                    break;
                }
            }
        }
        return set;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5}; 
        int[] arr2 = {4, 5, 6, 7, 8};
        System.out.println(common(arr1, arr2));
    }
}
