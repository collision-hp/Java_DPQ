public class strchar {
    public static void stringPrint(int n){
        String str="+--";
        String newstr="";
        int m=0;
        int x=0;
        if(n%2==0){
            x=n/2-1;
        }
        else{
            x=n/2;
        }
        for (int i=0;i<x;i++){
            newstr+=str;
        }
        m=newstr.length();
        if(m>n){
            for(int i=0;i<n;i++){
                System.out.print(newstr.charAt(i));
            }
        }
        else{
            System.out.print(newstr);
        }
    } 
    public static void main(String[] args) {
        stringPrint(7);
    }
}
