//return the distinct non repeating elements of the array

package Arrays;

public class Non_Repeating {
    public static int nonRepeating(int[] arr){
        int xor=0;
        for(int i=0;i<arr.length;i++){
            xor^=arr[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        int arr[]={13,9,6,8,9,6,13};
        System.out.println(nonRepeating(arr));
    }
}
