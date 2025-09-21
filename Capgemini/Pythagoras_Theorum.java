// 13. Pythagorean Triplets:
// Problem: Generate all Pythagorean triplets with values smaller than a given limit.

// Input: 
// limit = 20

// Output:
// 3 4 5
// 8 6 10
// 5 12 13
// 12 16 20

// Explanation: The triplets satisfy the condition and are integers

public class Pythagoras_Theorum {
    public static boolean triplet(int a,int b,int c){
        a=a*a;
        b=b*b;
        c=c*c;
        if(a+b==c){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(triplet(3, 4, 5));
    }
}
