// 32. write a program of permutation. 
//      input:- "abc" 
//      output:-abc,acb,bac,bca,cab,cba
public class permutations {
    public static void permute(String str, String result) {
        if (str.isEmpty()) {
            System.out.println(result); // Base case: no characters left in remaining
        } 
        else {
            for (int i = 0; i < str.length(); i++) {
                // Choose character at index i
                char ch = str.charAt(i);
                // System.out.println(ch);
                // Remaining string after removing chosen character
                String remaining = str.substring(0, i) + str.substring(i + 1);
                // System.out.println(remaining);
                // Recurse with new prefix and remaining string
                permute(remaining, result + ch);
            }
        }
    }

    public static void main(String[] args) {
        String input = "abcd";
        permute(input, "");
    }
//done in copy last page
}
