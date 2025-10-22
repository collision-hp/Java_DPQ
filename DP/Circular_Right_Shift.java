//Write a program to right shift and left shift an array by k=2
public class Circular_Right_Shift {
    public static void main(String[] args) {
        int k=2;
        int arr[]={2,3,5,7,11,13}; //11,13,2,3,5,7
        int arrnew[]=new int[6];
        int i=0;
        int len=0;
        int j=arr.length-k;
        if(len<arr.length){
            while(j<arr.length){
                arrnew[len]=arr[j];
                j++;
                len++;
            }
            while(len<j){
                arrnew[len]=arr[i];
                len++;
                i++;
            }
        }
        for(int d:arrnew){
            System.out.println(d);
        }
    }
}
