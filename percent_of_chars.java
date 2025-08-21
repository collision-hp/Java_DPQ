// 16. Write a program to find the percentages of 
// characters, Digits and Special characters from the 
// given String?

public class percent_of_chars {
    public static String percentageOfCharacters(String str){
        int character=0,digit=0,spechar=0;
        float percchar=0,percdig=0,percspec=0;
        for(int i=0;i<str.length();i++){
            if((str.charAt(i)>='a' && str.charAt(i)<='z') || (str.charAt(i)>='A' && str.charAt(i)<='Z')){
                character++;
            }
            else if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                digit++;
            }
            else{
                spechar++;
            }
        }
        percchar=(character*100/str.length());
        percdig=(digit*100/str.length());
        percspec=(spechar*100/str.length());
        return ("Characters: "+percchar+"\n"+"Digits: "+percdig+"\n"+"Special Characters: "+percspec);
    }
    public static void main(String[] args) {
        System.out.println(percentageOfCharacters("heythere@6725$"));   
    }
}
