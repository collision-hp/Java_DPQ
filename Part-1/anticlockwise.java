// program of anticlockwise 

// Input                  anticlockwise Output: 
// 1    2    3             3    6    9 
// 4    5    6             2    5    8 
// 7    8    9             1    4    7

public class anticlockwise {
    public static int[][] anticlockwiseArray(int arr[][], int r, int c) {
        int newarr[][] = new int[r][c];
        int n=c;
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                newarr[n-1-j][i]=arr[i][j];
            }
        }
        return newarr;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int newarr[][]=anticlockwiseArray(arr, 3, 3);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(newarr[i][j]+" ");
            }
            System.out.println();
        }
    }
}