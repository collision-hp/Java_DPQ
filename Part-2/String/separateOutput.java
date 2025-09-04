package String;
// 17.) Java program to gives two Output: 
// “Subburaj”, “123” for the InputString Str = “Subbu123raj”

public class separateOutput {
    public static void split(String str){
        String strnew="";
        String digits="";
        for(char ch:str.toCharArray()){
            if(Character.isDigit(ch)){
                digits+=ch;
            }
            else{
                strnew+=ch;
            }
        }
        System.out.println(digits+" "+strnew);
    }
    public static void main(String[] args) {
        split("King18Kohli");
    }
}
