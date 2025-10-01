// 29. Swap first and last charecter of a given String 
//     input:- NacrE   Output:-EacrN
public class swap_f_l {
    public static String swap(String str){
        String output="";
        char arr[]=str.toCharArray();
        char temp=arr[0];
        arr[0]=arr[arr.length-1];
        arr[arr.length-1]=temp;

        for(int i=0;i<arr.length;i++){
            output+=arr[i];
        }
        return output;
    }
    public static void main(String[] args) {
        System.out.println(swap("NacrE"));
    }
}
