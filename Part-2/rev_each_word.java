//  Java program to reverse each word of a given 
// string
// Input: Java is good programming langauges 
// Output: avaJ si doog gnimmargorp seguagnal 

public class rev_each_word {
    public static String reverse(String str){
        String sentence=" ";
        String revword=" ";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                revword=str.charAt(i)+revword;
            }
            if(str.charAt(i)==' ' || i==str.length()-1){
                sentence+=revword;
                revword=" ";
            }
        }
        return sentence;
    }
    public static void main(String[] args) {
        System.out.println(reverse("Java is good programming langauges"));
    }
}
