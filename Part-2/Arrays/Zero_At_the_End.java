package Arrays;

public class Zero_At_the_End {
    public static String zero_End(String str){
        String strnum="";
        String strzero="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='0'){
                strzero+='0';
            }
            else{
                strnum+=str.charAt(i);
            }
        }
        strnum+=strzero;
        return strnum;

    }
    public static void main(String[] args) {
        System.out.println(zero_End("50505050"));
    }
}
