// Lab06Ast.java
// The First Bank Program
// Object Methods and Output Formatting
// This is the student, starting version of Lab 06A.

import java.text.DecimalFormat;

public class Lab06Ast
{
	public static void main(String args[])
	{
      // Create DecimalFormat and Bank Objects
      DecimalFormat money = new DecimalFormat("$00,000.00");
      Bank tom  = new Bank();
      Bank suzy = new Bank(1600,32000);
      Bank bill = new Bank(8000,Expo.random(20000,90000));
      
      // Display Initial Balances
      System.out.println("INTIAL BALANCE:");
      System.out.println(" Tom's intial checking balance: " + money.format(tom.getChecking()));
      System.out.println(" Tom's saving balance: " + money.format(tom.getSavings()));
      System.out.println(" Suzy's intial checking balance: " + money.format(suzy.getChecking()));
      System.out.println(" Suzy's saving balance: " + money.format(suzy.getSavings()));
      System.out.println(" Bill's intial checking balance: " + money.format(bill.getChecking()));
      System.out.println(" Bill's saving balance: " + money.format(bill.getSavings()));  
      System.out.println();

      // Deposits and Withdrawals
      // Tom needs to deposits $500 in checking 
      tom.checkingDeposit(500);
      // Tom needs to deposit $7000 in savings
      tom.savingsDeposit(7000);
      // bill withdraws enitre balance of $8000 from checking
      bill.checkingWithdrawal(8000); 
      System.out.println();
      
      // Suzy's transfering $20,000 from saving to checking
      suzy.checkingDeposit(20000);
      suzy.savingsWithdrawal(20000);
      
      // Bills withdrawal to 0!
      bill.checkingWithdrawal(bill.getChecking());
      bill.savingsWithdrawal(bill.getSavings());
      //bil.savingsWihtdrawal
      
      // Display Final Balances
      System.out.println("Final Balances: ");
      System.out.println(" Tom's checking balance: " + money.format(tom.getChecking())); 
      System.out.println(" Tom's saving balannce: " + money.format(tom.getSavings()));
      System.out.println(" Suzy's intial checking balance: " + money.format(suzy.getChecking()));
      System.out.println(" Suzy's saving balance: " + money.format(suzy.getSavings()));
      System.out.println(" Bill's intial checking balance: " + money.format(bill.getChecking()));
      System.out.println(" Bill's saving balance: " + money.format(bill.getSavings())); 
      
      
      







	}
}
