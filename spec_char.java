   // 11. Write a program to whether check given string contains Special Characters or not? 
//  Ex: nacre123@#    nacre123

public class spec_char {
    public static String special_charater(String str){
        String ans="";
        for(int i=0;i<str.length();i++){
            if((str.charAt(i)>='a' && str.charAt(i)<='z') ||
                (str.charAt(i)>='A' && str.charAt(i)<='Z') ||
                (str.charAt(i)>='0' && str.charAt(i)<='9')){
                    ans+=str.charAt(i);
                }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(special_charater("nacre123AkL@i2#"));
    }
}
