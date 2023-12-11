import java.util.*;

public class Q8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Vector<String> shopping_list = new Vector<String>();
        System.out.println("This program will help you make and edit your shopping cart");
        int i = 1;
        int choice;
        String item;
        int index;
        int exit = 0;
        while (i > 0) {
            System.out.println(
                    "1: Insert item at end, 2: Insert item at specific index, 3: Delete item from end, 4: Delete item from specific index, 5: Print List, 0: Print list and exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter item to add");
                    item = sc.next();
                    shopping_list.add(item);
                    break;
                case 2:
                    System.out.println("Enter item to add");
                    item = sc.next();
                    System.out.println("Enter index to add to");
                    index = sc.nextInt();
                    shopping_list.add(index, item);
                    break;
                case 3:
                    shopping_list.remove(shopping_list.size() - 1);
                    break;
                case 4:
                    System.out.println("Enter index you want to remove");
                    index = sc.nextInt();
                    shopping_list.remove(index);
                    break;
                case 5:
                    Enumeration enu = shopping_list.elements();
                    System.out.println("Current List:");
                    while (enu.hasMoreElements()) {
                        System.out.println(enu.nextElement());
                    }
                    break;
                case 0:
                    System.out.println("Final List:");
                    Enumeration enu1 = shopping_list.elements();
                    while (enu1.hasMoreElements()) {
                        System.out.println(enu1.nextElement());
                    }
                    exit = 1;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            if (exit == 1) {
                break;
            }
        }
    }
}