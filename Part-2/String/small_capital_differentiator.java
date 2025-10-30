package String;
public class small_capital_differentiator{
    public static void differentiator(String str) {
        StringBuilder lowerCase = new StringBuilder();
        StringBuilder upperCase = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                lowerCase.append(ch);
            } else {
                upperCase.append(ch);
            }
        }
        System.out.println("Output in lowercase: " + lowerCase);
        System.out.println("Output in uppercase " + upperCase);
    }
    public static void Separator(String str){
        String strlower="";
        String strupper="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                strupper+=str.charAt(i);
            }
            else{
                strlower+=str.charAt(i);
            }
        }
        System.out.println(strlower);
        System.out.println(strupper);
    }
    public static void main(String[] args) {
        differentiator("aBACbcEDed");
        Separator("aBACbcEDed");
    }
}
