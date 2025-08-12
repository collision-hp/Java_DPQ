//Write a java program to print first non-repeated character from a given string
//Sostware Services
import java.util.*;
public class Non_Rep_char {
    public static String nonrep(String str){
        String result="";
        for(int i=0;i<str.length();i++){
            boolean count=true;
            if(str.charAt(i)!=' '){
                for(int j=i+1;j<str.length();j++){
                    if(str.charAt(i)==str.charAt(j)){
                        count=false;
                        break;
                    }
                }
                if(count){
                    result+=str.charAt(i);
                    break;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner ni=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=ni.nextLine();
        System.out.println(nonrep(str));
    }
}
