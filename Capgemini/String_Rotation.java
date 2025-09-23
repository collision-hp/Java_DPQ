// Similar String Check

// Problem: Check if given strings are similar or not. If yes then print the size of string in binary, if not then print zero. Both strings are of same size, similar means just the letters are rearranged.

// Input:
// String 1: "abcd"
// String 2: "dbca"

// Output:
// 100 (4 in binary)

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
        String a="abcd";
        String b="cdab";
        System.out.println(isRotation(a,b));
        if(isRotation(a, b)==true){
            String binary=Integer.toBinaryString(a.length());
            System.out.println(binary);
        }
    }
}
