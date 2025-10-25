// Output the length of longest palindromic subsequence of s.
// All strings consist of lowercase English letters only.

// Input
// agbdba
// Output
// 5
// Explanation:
// The longest palindromic subsequence is "abdba"

package HackerRank;

public class Longest_Palindrome {
    public static int SubSequqnce(String str){
        int i=0,j=str.length()-1,total=0;
        while(i<=j){
            if(str.charAt(i)==str.charAt(j)){
                total+=2;
                i++;
                j--;
                if(i==j){
                    total+=1;
                    break;
                }
            }
            else{
                if(str.charAt(i+1)==str.charAt(j)){
                    i++;
                }
                else{
                    j--;
                }
            }
        }
        return total;
    }
    // public static void Palindrome(String str){
    //     for(int i=0;i<str.length()/2;i++){
    //         if(str.charAt(i)!=str.charAt(str.length()-1-i)){
    //             System.out.println("Not Palindrome");
    //             return;
    //         }
    //     }
    //     System.out.println("Palindrome");
    // }
    public static void main(String[] args) {
        String str="agbdba";
        System.out.println(SubSequqnce(str));
    }
}
