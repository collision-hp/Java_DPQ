//Write a java program to print first non-repeated character from a given string
//Software Services
import java.util.*;

public class Non_Rep_char {
    public static String nonrep(String str) {
        String result = "";
        Set<Character> set=new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            boolean count = true;
            if(set.contains(str.charAt(i))){
                continue;
            }
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count = false;
                    break;
                }
            }
            if (count) {
                result += str.charAt(i);
                break;
            }
            set.add(str.charAt(i));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner ni = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = ni.nextLine();
        System.out.println(nonrep(str));
    }
}
