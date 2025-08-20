// Write a program to count the characters, digits 
// and Special Characters from the given String? 
//  Ex: Nacre@123% 
//  Output: Characters are 5 
//          Special Characters are 2 
//          Digits are 3 

public class count_all {
    public static String count_all_characters(String str){
        int character=0,spec_char=0,digit=0;
        for(int i=0;i<str.length();i++){
            if((str.charAt(i)>='a' && str.charAt(i)<='z') ||
                (str.charAt(i)>='A' && str.charAt(i)<='Z')){
                    character++;
                }
            else if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                digit++;
            }
            else{
                spec_char++;
            }
        }
        return ("Character:"+character+"\n"+"Special Character:"+spec_char+"\n"+"Digit:"+digit);

    }
    public static void main(String[] args) {
        System.out.println(count_all_characters("Nacre@123%"));
    }
}
