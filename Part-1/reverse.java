// Write a Program to reverse words in a given 
// String? 
//  Ex: "Java is best programming language" 
//  Output "language programming best is Java".

public class reverse {
    public static String reversestring(String str) {
        String reversed = " ";
        String substr=" ";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)!=' '){
                substr+=str.charAt(i);
            }
            if(str.charAt(i)==' ' || i==str.length()-1){
                reversed=substr+reversed;
                substr=" ";
            }
        }
        return reversed;
    }

    public static void main(String[] args) {
        String str="Java is the best prog lang";
        System.out.println(reversestring(str));
    }
}
