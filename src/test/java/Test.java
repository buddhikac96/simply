import java.util.ArrayList;
import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        HashSet<ArrayList<Integer>> set = new HashSet<>();

        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(1);
        arr2.add(2);
        arr2.add(4);

        set.add(arr1);
        System.out.println(set.add(arr2));
    }
}
