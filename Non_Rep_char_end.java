//Write a java program to print last non-repeated character from a given string

import java.util.Scanner;

public class Non_Rep_char_end {
    public static String non_rep_char_end(String str){
        String ch="";
        for (int i=str.length()-1;i>0;i--){
            boolean flag=true;
            if(str.charAt(i)!=0){
                for(int j=0;j<str.length();j++){
                    if(str.charAt(i)==str.charAt(j) && i!=j){
                        flag=false;
                        break;
                    }
                }
                if(flag){
                    ch+=str.charAt(i);
                    break;
                }
            }
        }
        return ch;
    }
    public static void main(String[] args) {

        Scanner ni=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=ni.nextLine();
        System.out.println(non_rep_char_end(str));

    }
}
