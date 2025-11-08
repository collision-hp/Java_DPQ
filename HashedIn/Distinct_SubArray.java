import java.util.*;

public class Distinct_SubArray {
    public static int[] SmallestSubArr(int arr[]){
        Set <Integer> set=new HashSet<>();
        for(int i: arr){
            set.add(i);
        }
        //1,2,3,4
        int []result=arr;
        for(int i=0;i<arr.length-set.size()+1;i++){
            Set<Integer> newset=new HashSet<>();
            for(int j=i;j<arr.length;j++){
                newset.add(arr[j]);
                if(set.size()==newset.size()){
                    int [] arrresult=Arrays.copyOfRange(arr, i, j+1);
                    if(arrresult.length<result.length){
                        result=arrresult;
                    }
                    break;
                }
            }
        }
        return result;
    }

    public static int[] Distinct_Subarray(int []arr){
        int arrnew[]=new int[arr.length];
        Set<Integer> set=new HashSet<>();
        int min=arr.length;
        for(int i:arr){
            set.add(i);
        }
        int result[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            Set<Integer> newset=new HashSet<>();
            for(int j=i;j<arr.length;j++){
                newset.add(arr[j]);
                if(set.size()==newset.size()){
                    arrnew=Arrays.copyOfRange(arr, i, j+1);
                    if(arrnew.length<min){
                        min=arr.length;
                        result=arrnew;
                    }
                }
            }
        }
        return result;

    }
    public static void main(String[] args) {
        int [] arr={1,2,1,3,2,1,1,4};
        int [] arr2={1,2,3,1,2,3,4};
        int arr3[]=SmallestSubArr(arr);
        int arr4[]=Distinct_Subarray(arr2);
        for(int i:arr3){
            System.out.print(i);
        }
        System.out.println();
        for(int i:arr4){
            System.out.print(i);
        }
    }
}
