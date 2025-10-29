package Common;
//the ascii value total approach

public class Anagrams_2 {
    public static boolean anagram(String str1,String str2){
        int arr[]=new int[256];
        if(str1.length()!=str2.length()){
            return false;
        }
        for(int i=0;i<str1.length();i++){
            arr[str1.charAt(i)]++;
            arr[str2.charAt(i)]--;
        }
        for(int i:arr){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(anagram("xyzaabc","yzabbcx"));
        System.out.println(anagram("xyzabc","yzabcx"));
    }
}
