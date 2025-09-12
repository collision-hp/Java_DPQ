import java.util.*;

public class Sub_Array_With_Largest_Product {
    public static void main(String[] args) {
        int arr[]={-1,3,4,2,-3,-2};
        int max=arr[0];
        List<Integer> maxarr=new ArrayList<>();
        int maxy=0;
        for(int i=0;i<arr.length;i++){
            int fin=arr[i];
            List<Integer> list=new ArrayList<>();
            list.add(arr[i]);
            for(int j=i+1;j<arr.length;j++){
                fin*=arr[j];
                list.add(arr[j]);
                if(fin>max){
                    max=fin;
                }
            }
            if(max>maxy){
                maxy=max;
                maxarr=list;
            }
        }
        System.out.println(max);
        System.out.println(maxarr);
    }
}
