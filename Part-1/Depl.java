// 7. write a program to print all duplicate character and their count form the given String? 
//  Ex: Programmming  Output: g: 2 
//                            r: 2
//                            m: 3

public class Depl {
    public static String printDupl_String(String str){
        String newstr="";
        for(int i=0;i<str.length();i++){
            int count=1;
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    if(str.charAt(i)==str.charAt(i-1)){
                        break;
                    }
                    count++;
                }
            }
            if(count>1){
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
