package com.braindata.bankmanagement.client;
import java.util.Scanner;
import com.braindata.bankmanagement.serviceImpl.SBI;
public class Test 
{
	public static void main(String args[])
	{
		SBI s=new SBI();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println();
			System.out.println("Welcome To Bank Management of BrainData");
			System.out.println();
			System.out.println("1.Create Account");
			System.out.println("2.Diaplay Account Details");
			System.out.println("3.Deposite Money");
			System.out.println("4.Withdraw Money");
			System.out.println("5.Check account Balance");
			System.out.println("6.Update Information");
			System.out.println("7.Exit");
			System.out.println();
			System.out.println("Select Option You Want");
			int i=sc.nextInt();
			switch(i)
			{
			case 1:
				s.createAccount();
				break;
			case 2:
				s.displayAllDetails();
				break;
			case 3:
				s.depositeMoney();
				break;
			case 4:
				s.withdrawal();
				break;
			case 5:
				s.balanceCheck();
			case 6:
				s.updateInformation();
			case 7:
				System.exit(0);
				default:
					System.out.println("Enter Valid Case");
			
			}
			
			
			
		}
		
	}

}
