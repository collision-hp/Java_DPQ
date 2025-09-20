// Problem Statement –
// Write a function to solve the following equation
// a^3 + a^2b + 2a^2b + 2ab^2 + ab2 + b3.
// Write a program to accept three values in order of a, b and c and get the result of the above equation.

//Solution->
// a^3 + a^2b + 2a^2b + 2ab^2 + ab2 + b3= a^3 + 3a^2b + 3ab^2 + b3
// = (a+b)^3

public class Equation {
    public static int cube(int a,int b){
        double result=0;
        result=Math.pow((a+b), 3);

        return (int)result;
    }
    public static void main(String[] args) {
        int a=4;
        int b=8;
        System.out.println(cube(a, b));
    }
}
