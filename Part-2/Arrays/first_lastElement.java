package Arrays;
import java.util.ArrayList;

public class first_lastElement {
    public static void find(ArrayList<String> ll) {
        String first = ll.getFirst();
        String last = ll.getLast();

        System.out.println(first + " " + last);
    }
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Date");
        arrayList.add("Elderberry");
        find(arrayList);
    }
}
