// 7. Problem Statement

// Raj wants to know the maximum marks scored by him in each semester. The mark should be between 0 to 100, if it goes beyond the range display "You have entered invalid mark."
// Sample Input 1:

// Enter no of semester:2
// Enter no of subjects in 1 semester:3
// Enter no of subjects in 2 semester:4
// Marks obtained in semester 1:50 60 70
// Marks obtained in semester 2:90 98 76 67

// Sample Output 1:
// Maximum mark in 1 semester:70
// Maximum mark in 2 semester:98

import java.util.Scanner;

public class Max_Marks {
    public static void max_Mark(){
        Scanner sc=new Scanner(System.in);
        int max=0;
        int sem=sc.nextInt();
        for(int i=0;i<sem;i++){
            int subs=sc.nextInt();
            for(int j=0;j<subs;j++){
                int mark[]=new int[subs];
                mark[j]=sc.nextInt();
                if(mark[j]<0 || mark[j]>100){
                    System.out.println("Invalid marks");
                }
                if(mark[j]>max){
                    max=mark[j];
                }
            }
            System.out.println("Maximum: "+max);
        }
        sc.close();
    }
    public static void main(String[] args) {
        max_Mark();
    }
}
