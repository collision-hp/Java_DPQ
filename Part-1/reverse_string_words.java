// 25. Write a program to reverse Words of the Given 
// String? 
//  Ex: "Today is Monday" 
//  Output: yadoT si yadnoM

public class reverse_string_words {
    public static String reverse_wordsofString(String str) {
        String revstr = "";
        String revword = " ";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                revword=str.charAt(i)+revword;
            }
            if(str.charAt(i)==' ' || i==str.length()-1){
                revstr+=revword;
                revword=" ";
            }
        }
        return revstr;
    }
    public static void main(String[] args) {
        String str="Today is Monday";
        System.out.println(reverse_wordsofString(str));
    }
}
