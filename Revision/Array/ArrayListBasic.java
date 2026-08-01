import java.util.ArrayList;
public class ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.print(arr.get(2));
        arr.set(3,10);
        System.out.println(arr);
    }
}
