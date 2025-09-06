package Arrays;
import java.util.*;
public class largest_smallest {
    public static void find(int [] arr){
        Set<Integer> set=new TreeSet<>();
        for(int i:arr){
            set.add(i);
        }
        List<Integer> ll=new ArrayList<>(set);
        //OR ll.addAll(set);
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 6, 3}; 
        find(arr);
    }
}
