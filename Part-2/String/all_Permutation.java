package String;
// write a program of permutation. 
//      input:- "abc" 
//      output:-abc,acb,bac,bca,cab,cba
public class all_Permutation {
    public static void Permutations(String str,String prefix){
        if(str.isEmpty()){
            System.out.println(prefix);
        }
        for(int i=0;i<str.length();i++){
            String rem=str.substring(0, i) +str.substring(i+1);
            Permutations(rem, prefix+str.charAt(i));
        }
    }
    public static void main(String[] args) {
        Permutations("abc","");
    }
}
