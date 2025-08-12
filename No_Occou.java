//WAP to count the number of occurences of each characters in the string

import java.util.Scanner;

public class No_Occou {
    public static void no_occur(String str){
        String diststr="";
        diststr+=str.charAt(0);
        for(int i=0;i<str.length();i++){
            boolean flag=true;
            for(int j=0;j<diststr.length();j++){
                if(str.charAt(i)==diststr.charAt(j)){
                    flag=false;
                    break;
                }
            }

            if(flag){
                diststr+=str.charAt(i);
            }
        }

        for(int i=0;i<diststr.length();i++){
            int count=0;
            for(int j=0;j<str.length();j++){
                if(diststr.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            System.out.println(diststr.charAt(i)+":"+count);
        }
    }
    public static void main(String[] args) {
        Scanner ni=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=ni.nextLine();
        no_occur(str);
    }
}
