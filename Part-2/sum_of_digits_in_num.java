public class sum_of_digits_in_num {
    public static int sumOfNumber(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumOfNumber(12345));
    }
}
