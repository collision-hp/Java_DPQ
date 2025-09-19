public class RotateArray {
    public static void rotate_Using_String(int arr[], int key) {
        String arrkey = "";
        String arrrest = "";
        for (int i = arr.length - key; i < arr.length; i++) {
            arrkey += arr[i];
        }
        for (int i = 0; i < arr.length - key; i++) {
            arrrest += arr[i];
        }
        String str = arrkey.concat(arrrest);
        char[] arrnew = str.toCharArray();
        for (char ch : arrnew) {
            System.out.print(ch);
        }
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int key = 2;
        int[] arr = { 1, 2, 3, 4, 5 }; // 4,5,1,2,3
        rotate_Using_String(arr, key);
        // System.out.println(rotate_using_mod(arr, key));
    }
}
