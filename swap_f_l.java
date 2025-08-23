// 29. Swap first and last charecter of a given String 
//      input:- NacrE   Output:-EacrN
public class swap_f_l {
    public static String swap(String str){
        String output=" ";
        output+=str.charAt(str.length()-1);
        for(int i=1;i<str.length()-1;i++){
            output+=str.charAt(i);
        }
        output+=str.charAt(0);
        return output;
    }
    public static void main(String[] args) {
        System.out.println(swap("NacrE"));
    }
}
