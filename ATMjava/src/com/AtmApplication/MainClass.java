package com.AtmApplication;

import java.util.Scanner;

public class MainClass {
     public static void main(String[] args) {
         AtmOperationInterface ob= new AtmSystemImpl();
         int atmnum = 12345;
         int atmpin = 123;
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter The Number :");
         int atmNum = sc.nextInt();
         System.out.println("Enter the Pin:");
         int pin = sc.nextInt();
         if ((atmnum == atmNum) && (atmpin == pin)) {
             while (true) {
                 System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Ministatement\n5.Exit");
                 System.out.println("Enter Choice : ");
                 int ch = sc.nextInt();
                 if (ch == 1) {
                     ob.viewBalance();

                 } else if (ch == 2) {
                     System.out.println("Enter The Amount to Withdraw");
                     double withdrawAmount= sc.nextDouble();
                     ob.withdrawAmount(withdrawAmount);

                 } else if (ch == 3) {
                     System.out.println("Enter The Amount to Deposite:");
                     double depositeAmount=sc.nextDouble();
                     ob.depositAmount(depositeAmount);

                 } else if (ch == 4) {
                     ob.viewMiniStatement();

                 } else if (ch == 5) {
                     System.out.println("Collect your ATM Card\n Thank you for using ATM Machine!!");
                     System.exit(0);
                 } else {
                     System.out.println("Please Enter Correct Choice");
                 }
             }
         } else {
             System.out.println("Incorrect Atm Number or pin");
             System.exit(0);
         }


     }
}
