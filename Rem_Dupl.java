import java.util.Scanner;

public class Rem_Dupl {
    public static String rem_dupl(String str){
        String newstr="";
        for(int i=0;i<str.length();i++){
            boolean flag=true;
            for(int j=1;j<newstr.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    flag=false;
                    break;
                }
            }
            if(flag){
                newstr+=str.charAt(i);
            }
        }
        return newstr;
    }
    public static void main(String[] args) {
        Scanner ni=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=ni.nextLine();
        System.out.println(rem_dupl(str));
    }
}
