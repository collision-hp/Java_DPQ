// 20. Write a program to Check whether two given 
// Strings are anagram or not? 
//  Ex: Str1= reaction Str2: creation 
//   Output: Two Strings are anagrams
public class anagrams_1 {
    public static String anagram(String str1,String str2){
        if(str1.length()==str2.length()){
            int len=str1.length();            
            for(int i=0;i<len;i++){
                boolean flag=false;
                for(int j=0;j<len;j++){
                    if(str1.charAt(i)==str2.charAt(j)){
                        flag=true;
                        break;
                    }
                }
                if(flag==true){
                    continue;
                }
                else{
                    return "Not Anagram";
                }
            }
            return "Anagram";
        }
        else{
            return "Not anagram";
        }
    }
    public static void main(String[] args) {
        System.out.println(anagram("race","care"));
    }
}
