// Given a string with lowercase English alphabets. The task is to replace all the consonants in the string with the nearest vowels. If a consonant is near to two vowels then replace it with the one that comes first in English alphabets.

// Note: Vowels already present in the string must be left as it is.

// Input: str = "codebashers"

// Output: aoeeaauieou

public class Consonant_to_Vowel {
    public static String Vowels(String str){
        String vow="aeiou";
        String strfinal="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                strfinal+=str.charAt(i);
            }
            else{
                char nearest='a';
                int min=(int)'u';
                for(int j=0;j<vow.length();j++){
                    int diff=Math.abs(str.charAt(i) - vow.charAt(j));//removes negative value
                    if(diff<min){
                        min=diff;
                        nearest=vow.charAt(j);
                    }
                }
                strfinal+=nearest;
            }
        }
        return strfinal;
    }
    public static void main(String[] args) {
        System.out.println(Vowels("codebashers"));
    }
}
