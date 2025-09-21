// 15. String Rotation:
// Problem: Determine if one string is a rotation of another.

// Input:
// String A: "ABCD"
// String B: "CDAB"

// Output: True
// Explanation: B is a rotation of A.

public class String_Rotation {
    public static boolean isRotation(String a,String b){
        int chars[]=new int[256];
        if(a.length()!=b.length()){
            return false;
        }
        else{
            for(int i=0;i<a.length();i++){
                chars[a.charAt(i)]++;
                chars[b.charAt(i)]--;
            }
            if(chars[0]==0){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isRotation("abcd", "cabd"));
    }
}
