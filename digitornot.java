public class digitornot {
    public static String checkdigit(String str){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                return "String contains number";
            }
        }
        return "String doesn't contain any number";
    }
    public static void main(String[] args) {
        System.out.println(checkdigit("whflkc"));
    }
}
