// program to take 2 array list of size is dynamic use user input and merge them and later sort them
import java.util.ArrayList;
import java.util.Scanner;

class mergesort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        System.out.print("Enter size of first array: ");
        int size1 = sc.nextInt();
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < size1; i++) {
            list1.add(sc.nextInt());
        }

        System.out.print("Enter size of second array: ");
        int size2 = sc.nextInt();
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < size2; i++) {
            list2.add(sc.nextInt());
        }

        ArrayList<Integer> mergedList = mergeLists(list1, list2);
        System.out.println("Merged List: " + mergedList);
        
        mergedList.sort(null); // Sort the merged list
        System.out.println("Sorted Merged List: " + mergedList);
        // after sort find the all the elements before and after the element given by user(single number)
        System.out.print("enter an element to find its neighbors: ");
        int element = sc.nextInt();
        int index = mergedList.indexOf(element);
        if (index != -1) {
            Integer before = (index > 0) ? mergedList.get(index - 1) : null;
            Integer after = (index < mergedList.size() - 1) ? mergedList.get(index + 1) : null;
            System.out.println("Element: " + element);
            System.out.println("Before: " + before);
            System.out.println("After: " + after);
        } else {
            System.out.println("Element not found in the merged list.");
        }

        // i also want u to print all the elements before thr element and after the element given by user using Iterator

    //     System.out.print("Enter an element to find its neighbors: ");
    //     int element = sc.nextInt();
    //     int index = mergedList.indexOf(element);
    //     if (index != -1) {
    //         System.out.println("Element: " + element);
    //         System.out.print("Elements before: ");
    //         for (int i = 0; i < index; i++) {
    //             System.out.print(mergedList.get(i) + " ");
    //         }
    //         System.out.println();
    //         System.out.print("Elements after: ");
    //         for (int i = index + 1; i < mergedList.size(); i++) {
    //             System.out.print(mergedList.get(i) + " ");
    //         }
    //         System.out.println();
    //     } else {
    //         System.out.println("Element not found in the merged list.");
    //     }
        
    //     sc.close();
    }

    public static ArrayList<Integer> mergeLists(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> merged = new ArrayList<>(list1);
        merged.addAll(list2);
        return merged;
    }
}
