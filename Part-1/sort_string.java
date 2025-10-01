// Write a program to sort the given String? 
//  Ex: nacre 
//  Output: acenr

public class sort_string {
    public static void swap(char [] arr,int a, int b){
        char temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static String sortString(String str){
        String result="";
        char arr[]= str.toCharArray();
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
        for(char i:arr){
            result+=i;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(sortString("nacre"));
    }
}
