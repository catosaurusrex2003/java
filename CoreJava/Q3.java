// Implement a java program to calculate gross salary and net salary taking the following
// data.
// Input: empno, empname, basic
// Process
// DA=70% of basic
// HRA=30% of basic
// CCA= Rs. 240/-
// PF=10% of basic
// PT=Rs.100/-

import java.util.*;

class Q3 {
    public static void main(String args[]) {
        String empno = new String();
        String empname = new String();
        int basic;
        double DA, HRA, CCA = 240, PF, PT = 100;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter empno, empnam, basic salary.");
        empno = sc.nextLine();
        empname = sc.nextLine();
        basic = sc.nextInt();
        DA = basic * 0.7;
        HRA = basic * 0.3;
        PF = basic * 0.1;
        System.out.println("empno = " + empno);
        System.out.println("empname = " + empname);
        System.out.println("basic = " + basic);
        System.out.println("DA = " + DA);
        System.out.println("HRA = " + HRA);
        System.out.println("CCA = " + CCA);
        System.out.println("PF = " + PF);
        System.out.println("PT = " + PT);
    }
}