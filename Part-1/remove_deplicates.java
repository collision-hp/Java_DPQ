// Remove the 2nd duplicate elements from String(dont use predefine logic)
// AababAnhnhn
// Aabnh
public class remove_deplicates {
    public static String rem_dupl(String str){
        String newstr="";
        newstr+=str.charAt(0);
        for(int i=0;i<str.length();i++){
            boolean flag=true;
            for(int j=0;j<newstr.length();j++){
                if(str.charAt(i)==newstr.charAt(j)){
                    flag=false;
                    break;
                }
            }
            if(flag){
                newstr+=str.charAt(i);
            }
        }
        return newstr;
    }
    public static void main(String[] args) {
        System.out.println(rem_dupl("AababAnhnhn"));
    }
}
