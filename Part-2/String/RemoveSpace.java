package String;
public class RemoveSpace {
    public static String spacesremoval(String str){
        String strnew="";
        for(char i:str.toCharArray()){
            if(i==' '){
                continue;
            }
            strnew+=i;
        }
        return strnew;
    }
    public static void main(String[] args) {
        System.out.println(spacesremoval("Welcome to java world"));
    }
}
