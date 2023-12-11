// Write a menu driven program to perform the following operations on one
// dimensional array. (Accept data from user)
// a) to search a given element in an array
// b) to sort elements in descending order
// c) to delete the duplicate elements from an array

import java.util.*;

public class Q4 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Search an element");
            System.out.println("2. Sort elements in descending order");
            System.out.println("3. Delete duplicate elements");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    searchElement(array);
                    break;
                case 2:
                    sortArrayDescending(array);
                    break;
                case 3:
                    array = deleteDuplicates(array);
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }

    private static void searchElement(int[] array) {
        System.out.println("Enter the element to search:");
        int element = scanner.nextInt();
        boolean found = false;

        for (int value : array) {
            if (value == element) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(element + " was found in the array.");
        } else {
            System.out.println(element + " was not found in the array.");
        }
    }

    private static void sortArrayDescending(int[] array) {
        Arrays.sort(array);
        reverse(array);
        System.out.println("Array sorted in descending order: " + Arrays.toString(array));
    }

    private static void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    private static int[] deleteDuplicates(int[] array) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int j : array) {
            set.add(j);
        }

        int[] resultArray = new int[set.size()];
        int index = 0;
        for (Integer integer : set) {
            resultArray[index++] = integer;
        }

        System.out.println("Array after deleting duplicates: " + Arrays.toString(resultArray));
        return resultArray;
    }
}
