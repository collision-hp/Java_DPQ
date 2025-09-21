// 11. Counting Valleys:

// Problem: Given a sequence of up and down steps during a hike, determine the number of valleys traversed.

// Input:
// 8
// UDDDUDUU

// Output: 1
// Explanation: A valley is a sequence sea level. The example describes a single valley.

public class Counting_Valley {
    public static int valleys(int n,String path){
        int traversed=0;
        for(int i=0;i<path.length();i++){
            if(path.charAt(i)=='U'){
                traversed++;
            }
            else{
                traversed--;
            }
        }
        if(traversed==0){
            traversed++;
        }
        return traversed;
    }
    public static void main(String[] args) {
        String str="UDDDUDUU";
        int n=str.length();
        System.out.println(valleys(n, str));
    }
}
