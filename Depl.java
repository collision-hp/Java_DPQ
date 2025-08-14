// 6. Write a program to print duplicate characters 
// from the given String? 
//  Ex: Programming  Output:  r, g, m 

public class Depl {
    public static String printDupl_String(String str){
        String newstr="";
        for(int i=0;i<str.length();i++){
            int count=0;
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                System.out.println(str.charAt(i));
                newstr+=str.charAt(i)+":"+count+"\n";
            }
        }

        return newstr;
    }
    public static void main(String[] args) {
        System.out.println(printDupl_String("Programmming"));
    }
}
