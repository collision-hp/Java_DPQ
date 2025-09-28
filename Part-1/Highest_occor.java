// Write a program to print Highest occurred character from given String? 
//  Ex: aaaaabbcddddd  Output: a

public class Highest_occor {
    public static char highest_occuring_char(String str){
        char highoccur='a';
        int max=0;
        for(int i=0;i<str.length();i++){
            int count=0;
            for(int j=i;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count>max){
                max=count;

                highoccur = str.charAt(i);
            }

        }
        return highoccur;
    }
    public static void main(String[] args) {
        System.out.println(highest_occuring_char("aabbcddddd"));
    }
}
