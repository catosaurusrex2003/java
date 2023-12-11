import java.util.*;

class Q9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string 1:");
        String s1 = sc.next();
        System.out.println("Enter string 2:");
        String s2 = sc.next();
        int count;
        int[] swap = new int[s1.length()];
        if (s1 == s2 || s1.length() != s2.length()) {
            System.out.println("No meta");
        } else {
            count = 0;
            int k = 0;
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    count++;
                    swap[k] = i;
                    k++;
                }
            }
            if (count != 2) {
                System.out.println("No meta");
            } else {
                if (s1.charAt(swap[0]) == s2.charAt(swap[1]) &&
                        s1.charAt(swap[1]) == s2.charAt(swap[0])) {
                    System.out.println("Meta!");
                }
            }
        }
        sc.close();
    }
}