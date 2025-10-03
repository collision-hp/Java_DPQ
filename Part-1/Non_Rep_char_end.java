//Write a java program to print last non-repeated character from a given string

import java.util.*;

public class Non_Rep_char_end {
    public static String non_rep_char_end(String str) {
        String ch="";
        Set<Character> set=new HashSet<>(); 
        for (int i = str.length() - 1; i >=0; i--) {
            boolean flag = true;
            if(set.contains(str.charAt(i))){
                continue;
            }
            for (int j = i-1; j >= 0; j--) {
                if (str.charAt(i) == str.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                ch += str.charAt(i);
                break;
            }
            set.add(str.charAt(i));

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
