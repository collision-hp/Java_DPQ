// Write a program to replace given character to other given Character in the string?

public class char_replace {
    public static String replace_char(String str,char ch1,char ch2){
        String replaced="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch1){
                replaced+=ch2;
            }
            else{
                replaced+=str.charAt(i);
            }
        }
        return replaced;
    }
    public static void main(String[] args) {
        System.out.println(replace_char("Trhinosauros",'o', 'z'));
    }
}

//or directly with method
//String replaced=str.replace('o','z');