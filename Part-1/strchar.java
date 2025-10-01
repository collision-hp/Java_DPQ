// String given-"+--"
// user input -> 5
// print -> "+--+-"

public class strchar {
    public static String stringPrint(int n){
        String str="+--";
        String repstr="";
        String resstr="";
        int len=str.length();
        int x=n/len;
        if(n<=len){
            for(int i=0;i<n;i++){
                resstr+=str.charAt(i);
            }
        }
        else if(n%3==0){
            for(int i=0;i<x;i++){
                resstr+=str;
            }
        }
        else{
            for(int i=0;i<x+1;i++){
                repstr+=str;
            }
            for(int i=0;i<n;i++){
                resstr+=repstr.charAt(i);
            }
        }
        return resstr;
    } 
    public static void main(String[] args) {
        System.out.println(stringPrint(8));
    }
}
