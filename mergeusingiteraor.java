import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;
public class mergeusingiteraor {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> mergedList = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of first list:");
        int size1 = sc.nextInt();
        for (int i = 0; i < size1; i++) {
            list1.add(sc.nextInt());
        }

        System.out.println("Enter the size of second list:");
        int size2 = sc.nextInt();
        for (int i = 0; i < size2; i++) {
            list2.add(sc.nextInt());
        }

        mergedList.addAll(list1);
        mergedList.addAll(list2);

        System.out.println("Merged List: " + mergedList);
        mergedList.sort(null);
        System.out.println("Sorted Merged List: " + mergedList);

        // Input the target value
        System.out.println("Enter the target value:");
        int target = sc.nextInt();

        ListIterator<Integer> iterator = mergedList.listIterator();

        while (iterator.hasNext()) {
            int current = iterator.next();
            if (current == target) {
                // Move back to get previous value
                if (iterator.hasPrevious()) {
                    iterator.previous(); // move back to current (target)
                    if (iterator.hasPrevious()) {
                        int before = iterator.previous(); // move to previous
                        System.out.println("Value before " + target + ": " + before);
                        iterator.next(); // back to target
                        iterator.next(); // move to current again
                    } else {
                        System.out.println("No value before " + target);
                        iterator.next(); // move to current again
                    }
                }

                // Now check for value after
                if (iterator.hasNext()) {
                    int after = iterator.next();
                    System.out.println("Value after " + target + ": " + after);
                } else {
                    System.out.println("No value after " + target);
                }
                break; // stop after first match
            }
        }
    }
}