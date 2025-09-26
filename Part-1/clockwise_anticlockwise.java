// 33. program of clockwise and anticlockwise       
// Input                clockwise  Output:                
// 1    2    3             7    4    1                     
// 4    5    6             8    5    2                     
// 7    8    9             9    6    3 

public class clockwise_anticlockwise {
    public static int[][] rotate(int arr[][], int r, int c){
        int arrnew[][]=new int[r][c];
        int n=c;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arrnew[j][n-1]=arr[i][j];
            }
            n--;
        }
        return arrnew;

    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int newarr[][]=rotate(arr, 3, 3);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(newarr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
