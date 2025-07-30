import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
 
public class Mergedarray {
    public static void main(String[] args) {
        Integer[] arr1 = {3, 7, 1};
        Integer[] arr2 = {9, 4, 6};
        List<Integer> mergedList = new ArrayList<>();
        mergedList.addAll(Arrays.asList(arr1));
        mergedList.addAll(Arrays.asList(arr2));
        mergedList.sort(Collections.reverseOrder());
        System.out.println(mergedList);
    }
}
