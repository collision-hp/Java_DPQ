package Arrays;

public class missing_number {
    public static int missing(int []arr){
        int missing=0;
        for(int i=0;i<arr.length-1;i++){
            if((arr[i]+1)!=arr[i+1]){
                missing=arr[i]+1;
            }
        }
        return missing;
    }
    public static void main(String[] args) {
        int [] arr={1,2,4,5,6};
        System.out.println(missing(arr));
    }
}
