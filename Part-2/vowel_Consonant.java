public class vowel_Consonant {
    public static void count(String str){
        str=str.toLowerCase().replace(" " ,"");
        char arr[]={'a','e','i','o','u'};
        int vowel=0;
        for(int i=0;i<str.length();i++){
            for(int j=0;j<arr.length;j++){
                if(str.charAt(i)==arr[j]){
                    vowel++;
                }
            }
        }
        int consonant=str.length()-vowel;
        System.out.println("Vowel-"+vowel+"\nConsonant-"+consonant);
    }
    public static void main(String[] args) {
        count("Hello World");
    }
}
