import java.util.*;

// A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
// Ask user for quantity
// Suppose, one unit will cost 100.
// Judge and print total cost for u

class Q1{
    public static void main(String args[]){
        int units;
        double ppu, total_cost;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Price of each unit");
        units = s.nextInt();
        System.out.println("Enter number of units");
        ppu = s.nextDouble();
        total_cost = units*ppu;
        if(total_cost > 1000){
            total_cost = total_cost*0.9;
        }
        System.out.println("Total final cost is: "+total_cost);
    }
}