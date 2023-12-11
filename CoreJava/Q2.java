// Given five positive integers, find the minimum and maximum values that can be
// calculated by summing exactly four of the five integers. Then print the respective
// minimum and maximum values as a single line of two space-separated long integers.
// Example 1 2 3 4 5
// The minimum sum is 1+2+3+4=10 and the maximum sum is 2+3+4+5=14. The
// function prints

import java.util.*;

class Q2{
    public static void printArray(int[] array) {
        System.out.println("Array is: ");
        for (Object element : array) {
            System.out.println(element);
        }
    }

    public static void main(String args[]){
        int i , j, min=0 , max=0 ;
        int a[] = new int[5];
        Scanner s = new Scanner(System.in);
        for(i = 0; i<5; i++){
            System.out.println("Enter the next number");
            a[i] = s.nextInt();
        }
        printArray(a);
        Arrays.sort(a);
        printArray(a);
        for(i = 0 ; i < 5; i++){
            if(i<4){
                min+=a[i];
                System.out.println("added to min "+a[i]);
            }
            if(i>0){
                max+=a[i];
                System.out.println("added to max "+a[i]);
            }
        }
        System.out.println("Min: "+min);
        System.out.println("Max: "+max);
    }
}

