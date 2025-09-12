import java.util.*;

public class Three_Sum_Problem{
    public static void main(String[] args) {
        int arr[]={2,7,3,5,4};
        int k=11;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int x=k-arr[i]; //gives 
            for(int j=i+1;j<arr.length;j++){
                int y=x-arr[j];
                if(set.contains(y)){
                    System.out.println("3 numbers with sum 11 are "+arr[i]+","+arr[j]+","+y);
                }
            }
            set.add(arr[i]);
        }
    }
}