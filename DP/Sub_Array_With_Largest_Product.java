import java.util.*;

public class Sub_Array_With_Largest_Product {
    public static void main(String[] args) {
        int arr[]={-1,3,4,2,-3,-2};
        int max=arr[0];
        int x=0,y=0;
        List<Integer> maxarr=new ArrayList<>();
        int maxy=0;
        for(int i=0;i<arr.length;i++){
            int fin=arr[i];
            for(int j=i+1;j<arr.length;j++){
                fin*=arr[j];
                if(fin>max){
                    max=fin;
                    y=j;
                }
            }
            if(max>maxy){
                x=i;
                maxy=max;
            }
        }
        for(int i=x;i<y+1;i++){
            maxarr.add(arr[i]);
        }
        System.out.println(max);
        System.out.println(maxarr);
    }
}
