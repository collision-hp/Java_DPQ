// hear##t#is#f#o#r  ->  ######heartisfor

public class HashFirst {
    public static String hash(String str){
        String hashed="";
        String alpha="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='#'){
                hashed+='#';
            }
            else{
                alpha+=str.charAt(i);
            }
        }
        return hashed+alpha;
    }
    public static void main(String[] args) {
        System.out.println(hash("hear##t#is#f#o#r"));
    }
}
