// Problem Summary
// Goal: Find the longest common prefix from N people's names.

// Input:
// First line: N (number of people)
// Next N lines: Names

// Output:
// The longest common prefix in lowercase
// Print nothing if no common prefix exists

// Input:
// 5
// Rosewood
// rose
// rosy
// rosemarry
// roshh

// Output:
// ros

package String;

import java.util.Scanner;

public class commonSubStr {
    public static String SubstringPrefix(String[] names){
        String substr=names[0];
        for(int i=1;i<names.length;i++){
            int j=0;
            while(j<substr.length() && j<names[i].length() && substr.charAt(j)==names[i].charAt(j)){
                j++;
            }
            substr=substr.substring(0, j);
            if(substr.isEmpty()){
                return "";
            }
        }
        return substr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=5;
        String names[]=new String[n];
        for(int i=0;i<n;i++){
            names[i]=sc.nextLine();
        }
        System.out.println(SubstringPrefix(names));
        sc.close();
    }
}
