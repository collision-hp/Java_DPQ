//Write a program to reverse the string
import java.util.*;
public class Rev_Str {
    public static void main(String[] args) {
        Scanner ni=new Scanner(System.in);
        System.out.println("Enter the string to reverse");
        String str=ni.nextLine();
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
}