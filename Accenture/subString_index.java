import java.util.*;

public class subString_index {
    public static List<Integer> String_Substring_index(String str,String substr){
        List<Integer> list=new ArrayList<>();
        int arrsubstr[]=new int[256];
        int len=substr.length();
        for(char ch:substr.toCharArray()){
            arrsubstr[ch]++;
        }
        for(int i=0;i<=str.length()-len;i++){
            int arrstr[]=new int[256];
            for(int j=i;j<i+len;j++){
                arrstr[str.charAt(j)]++;
            }
            if(Arrays.equals(arrsubstr,arrstr)){
                list.add(i);
            }
        }
        return list;
    }   
    public static void main(String[] args) {
        System.out.println(String_Substring_index("bacdedbcacb", "abc"));
    }
}
