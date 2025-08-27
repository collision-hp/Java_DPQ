public class second_num {
    public static int secondHighest(int [] arr,int n){
        int sechigh=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length-1-i;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        sechigh=arr[1];
        return sechigh;
    } 
    public static void main(String[] args) {
        int [] arr={4,5,7,8,1,2,3};
        int n=7;
        System.out.println(secondHighest(arr, n));
    }
}
