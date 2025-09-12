//Write a program to right shift and left shift an array by k=2

public class Circular_Right_Shift {
    public static void main(String[] args) {
        int k=2;
        int arr[]={2,3,5,7,11,13}; //11,13,2,3,5,7
        int arrnewr[]=new int[6];
        int arrnewl[]=new int[6];
        int n=arr.length;
        for(int i=0;i<n;i++){
            int newpos=(i+k)%n;
            arrnewr[newpos]=arr[i];
            arrnewl[i]=arr[newpos];
        }
        
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println(
            
        );
        for(int i:arrnewr){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i:arrnewl){
            System.out.print(i+" ");
        }
    }
}
