// 8. Problem Statement
// Mayuri buys "N" no of products from a shop. The shop offers a different percentage of discount on each item. She wants to know the item that has the minimum discount offer, so that she can avoid buying that and save money. [Input Format: The first input refers to the no of items; the second input is the item name, price and discount percentage separated by comma(,)]Assume the minimum discount offer is in the form of Integer.Note: There can be more than one product with a minimum discount.

// Sample Input 1:
// 4
// mobile, 10000,20
// shoe, 5000,10
// watch, 6000,15
// laptop, 35000,5

// Sample Output 1:
// shoe

// Explanation: The discount on the mobile is 2000, the discount on the shoe is 500, the discount on the watch is 900 and the discount on the laptop is 1750. So the discount on the shoe is the minimum

public class ProductnDiscount {
    public static String discount(int n,String []product,int[] amount,int[] discount){
        String str="";
        int min=amount[0];
        for(int i=0;i<n;i++){
            int disc=(amount[i]*discount[i])/100;
            if(disc<min){
                min=disc;
                str=product[i];
            }
        }
        return str;
    }
    public static void main(String[] args) {
        int n=4;
        String [] products={"mobile","shoe","watch","laptop"};
        int [] amount={10000,5000,6000,35000};
        int [] discount={20,10,15,5};
        System.out.println(discount(n, products, amount, discount));
    }
}
