package String;
public class twiceLetters {
    public static String twice(String str){
        String strnew=" ";
        for(char i:str.toCharArray()){
            strnew+=i;
            strnew+=i;
        }
        return strnew;
    }
    public static void main(String[] args) {
        System.out.println(twice("Hey"));
    }
}
