// 9. Write a program to remove the given Character 
// from the given String? 
//  Ex: nacre Software 
//  Remove character: a 
//  Output: ncre Softwre


public class Rem_char {
    public static String rem_char(String str,char ch){
        String result="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=ch){
                result+=str.charAt(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(rem_char("Software", 'a'));
    }
}
