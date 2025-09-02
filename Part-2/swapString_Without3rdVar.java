public class swapString_Without3rdVar {
    public static void swap(String str1,String str2){
        
        str1=str1+str2;
        str2=str1.substring(0,str1.length()-str2.length());
        str1=str1.substring(str2.length());
        System.out.println(str1);
        System.out.println(str2);
    }
    public static void main(String[] args) {
        swap("hy","fly");
    }
}
