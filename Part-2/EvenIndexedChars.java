public class EvenIndexedChars {
    public static String even(String str){
        String strnew=" ";
        for(int i=0;i<str.length();i++){
            if(i%2==0){
                strnew+=str.charAt(i);
            }
        }
        return strnew;
    } 
    public static void main(String[] args) {
        System.out.println(even("Automation"));
    }
}
