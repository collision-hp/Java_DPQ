// 28. Write  a Program to print short name of given 
// string 
// Ex: Sanjeeva Reddy Nagar Output: SR Nagar
public class short_name {
    public static String shortName(String str){
        String shortstr="";
        String [] words=str.split(" ");
        for(int i=0;i<words.length-1;i++){
            shortstr+=words[i].charAt(0);
        }
        shortstr+=" "+words[words.length-1];
        return shortstr;
    }
    public static void main(String[] args) {
        String str="Sanjeeva Reddy Nagar";
        System.out.println(shortName(str));
    }
}
