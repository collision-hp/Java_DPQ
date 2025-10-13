import java.util.*;

public class Sub_Array_With_Largest_Product {
    public static void main(String[] args) {
        int arr[]={-1,3,4,2,-3,-2};
        List<Integer> list=new ArrayList<>();
        int prod=1,max=0;
        int finalindex=0,initialindex=0;
        for(int i=0;i<arr.length;i++){
            prod=1;
            for(int j=i;j<arr.length;j++){
                prod*=arr[j];
                if(prod>max){
                    max=prod;
                    initialindex=i;
                    finalindex=j;
                }
            }
        }
        for(int i=initialindex;i<=finalindex;i++){
            list.add(arr[i]);
        }
        System.out.println(max);
        System.out.println(list);
    }
}
