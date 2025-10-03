//Write a java program to print second last non-repeated character from a given string

import java.util.*;

public class Non_Rep_char_end_2nd {
    public static String non_rep_char_end(String str) {
        String ch = "";
        Set <Character> set=new HashSet<>();
        boolean flag;
        int count=0;
        for(int i=str.length()-1;i>=0;i--){
            flag=true;
            if(set.contains(str.charAt(i))){
                continue;
            }
            for(int j=0;j<i;j++){
                if(str.charAt(i)==str.charAt(j)){
                    flag=false;
                    break;
                }
            }
            set.add(str.charAt(i));
            if(flag==true){
                count++;
                if(count==2){
                    ch+=str.charAt(i);
                    break;
                }
            }
        }
        return ch;
    }

    public static void main(String[] args) {

        Scanner ni = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = ni.nextLine();
        System.out.println(non_rep_char_end(str));
        ni.close();
    }
}
