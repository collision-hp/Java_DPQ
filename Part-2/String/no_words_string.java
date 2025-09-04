package String;
// Java program to count the number of words in a string
// Enter the String: Welcome to Java World
// Number of words in a string: 4

public class no_words_string {
    public static int Count_Words(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ' || i==str.length()-1){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(Count_Words("Welcome to Java World"));
    }
}
