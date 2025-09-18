// Problem Statement –
// A function is there which tells how many dealerships there are and the total number of cars in each dealership.
// Your job is to calculate how many tyres would be there in each dealership.
// Input-

// 3 
// 4 2
// 4 0
// 1 2

// Output

// 20
// 16
// 8

//Explanation

// There are total 3 dealerships
// dealerships1 contains 4 cars and 2 bikes
// dealerships2 contains 4 cars and 0 bikes
// dealerships3 contains 1 cars and 2 bikes
// Total number of tyres in dealerships1  is (4 x 4) + (2 x 2) = 20
// Total number of tyres in dealerships2 is (4 x 4) + (0 x 2) = 16
// Total number of tyres in dealerships3 is (1 x 4) + (2 x 2) = 8

public class Dealership {
    public static int[] total_Dealership(int[][] arr, int n) {
        int arrtotal[] = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                if (j == 0) {
                    arrtotal[i] = arr[i][j]*4;
                }
                else{
                    arrtotal[i]+=arr[i][j]*2;
                }
            }
        }
        return arrtotal;
    }
    public static void main(String[] args) {
        int n=3;
        int arr[][]={{4,2},{4,0},{1,2}};
        int arrnew[]=total_Dealership(arr, n);
        for(int i:arrnew){
            System.out.println(i);
        }
    }
}
