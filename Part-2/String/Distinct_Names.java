package String;

// Sample Input     Sample Output

// john tom             1
// john mary            2
// john tom             3
// mary anna            3
// mary anna            5


import java.util.*;
public class Distinct_Names {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        Set<String> set=new HashSet<>();
        String str="";
        for(int i=0;i<t;i++){
            str+=pair_left[i];
            str+=pair_right[i];
            set.add(str);
            System.out.println(set.size());
            str="";
        }        
        s.close();
    }
}
