// 32. write a program of permutation. 
//      input:- "abc" 
//      output:-abc,acb,bac,bca,cab,cba
public class permutations {
    public static void permute(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println(prefix); // Base case: no characters left
        } else {
            for (int i = 0; i < str.length(); i++) {
                // Choose character at index i
                char ch = str.charAt(i);

                // Remaining string after removing chosen character
                String remaining = str.substring(0, i) + str.substring(i + 1);

                // Recurse with new prefix and remaining string
                permute(remaining, prefix + ch);
            }
        }
    }

    public static void main(String[] args) {
        String input = "abcd";
        System.out.println("All permutations of " + input + " are:");
        permute(input, "");
    }

}
