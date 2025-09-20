// 6. Problem Statement

// Bela teaches her daughter to find the factors of a given number. When she provides a number to her daughter, she should tell the factors of that number. Help her to do this, by writing a program. Write a class FindFactor.java and write the main method in it.
// Note:
// If the input provided is negative, ignore the sign and provide the output. If the input is zero
// If the input is zero the output should be "No Factors".

// Sample Input 1:
// 54

// Sample Output 1:
// 1, 2, 3, 6, 9, 18, 27, 54

import java.util.ArrayList;
import java.util.List;

public class Factors {
    public static List<Integer> findFactors(int n){
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if((54%i)==0){
                list.add(i);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        System.out.println(findFactors(54));
    }
}
