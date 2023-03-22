package com.braindata.bankmanagement.serviceImpl;
import java.util.Scanner;
import com.braindata.bankmanagement.model.Account;
import com.braindata.bankmanagement.service.RBI;
public class SBI implements RBI
{
	Account ac=new Account();
	Scanner sc=new Scanner(System.in);
	public void createAccount()
	{
		System.out.println("Account Opening Form");
		
		System.out.println("......................");
		loop: while(true)
		{
			System.out.println("Enter Account Number");
			int a = sc.nextInt();
			String as = Integer.toString(a);
			int i;
			if(as.length()==8) 
			{
				i =1;
			}
			else
			{
				i =2;
			}
			switch(i) 
			{
				case 1:
					ac.setAccNo(a);
					break loop;
				case 2:	
					System.out.println("Please Enter 8 digit account number:");
					break;
			}
		}
			
		System.out.println("Enter Name");
		String name =sc.next();  //Accepted User input
		String n = name.substring(0, 1).toUpperCase() + name.substring(1);  
		
	loop:while(true)
	{
		System.out.println("Enter Mobile Number");
		String m=sc.next();
		
		int i;
		if(m.length()==10)
		{
			i=1;
		}
		else
		{
			i=2;
		}
		switch(i)
		{
		case 1:
			ac.setMobNo(m);
			break loop;
		case 2:
			System.out.println("Please Enter 10 Digit Mobile Number");
			break ;	
		}
	}
	loop:while(true)
	{
		System.out.println("Enter Adhar Number");
		String ad=sc.next();
		int i;
		if(ad.length()==12)
		{
			i=1;
		}
		else
		{
			i=2;
		}
		switch(i)
		{
		case 1:
			ac.setAdharNo(ad);
			break loop;
		case 2:
		System.out.println("Please Enter 12 Digit Number");
		break;
		}
	}
		
		
		System.out.println("Enter Gender");
		String g=sc.next();
		
		System.out.println("Enter Age");
		int ag=sc.nextInt();
		
		System.out.println("Please Enter Your First Bank Deposit");
		
		System.out.println("Enter Minimum amount rupees 500/-");
		
		
		System.out.println("Enter Your Bank Deposit Amount");
		double b=sc.nextDouble();
		
		
		ac.setName(n);
		ac.setGender(g);
		ac.setAge(ag);
		
		if(b>=500)
		{
			ac.setBalance(b);
		System.out.println();
		System.out.println("Thank you! Your Account has Created");
		System.out.println();
		System.out.println("Your Current Balance is="+" "+ac.getBalance());
		System.out.println("**************");
		}
		
		else
		{
			System.out.println("Deposit Amount must be 500/-");
		}
	}
		public void displayAllDetails()
		{
			System.out.println("Enter Account Number for verification :");
			int a=sc.nextInt();
			if(a==ac.getAccno())
			{
				System.out.println();
				System.out.println("Bank Account Details");
				System.out.println();
				System.out.println("************************************");
				System.out.println("Account Number="+" "+ac.getAccno());
				System.out.println("Account  Holder Name="+" "+ac.getName());
				System.out.println("Mobile Number="+" "+ac.getMobNo());
				System.out.println("Adhar Number="+" "+ac.getAdharNo());
				System.out.println("Gender="+" "+ac.getGender());
				System.out.println("Age="+" "+ac.getAge());
				System.out.println("Available Balance="+" "+ac.getBalance());
				System.out.println();
				System.out.println("*************************************");
			}
			else
			{
				System.out.println("Match Not Found");
			}
		}
			public void depositeMoney()
			{
				System.out.println("Enter Your Account Number To Deposit Money");
				int an=sc.nextInt();
				if(an==ac.getAccno())
				{
					System.out.println();
					System.out.println("Account Type");
					System.out.println("************************");
					System.out.println("1.Saving Account");
					System.out.println("2.Current Account");
					System.out.println("3.Exit");
					System.out.println();
					System.out.println("Select Account Type");
					int i=sc.nextInt();
				
				switch(i)
				{
				case 1:
					System.out.println("Enter Amount To Deposite");
					double d=sc.nextDouble();
					double c=ac.getBalance();
					double Bal=d+c;
					ac.setBalance(Bal);
					System.out.println();
					System.out.println("*************************");
					System.out.println();
					System.out.println("Successfully Done");
					System.out.println();
					break;
				case 2:
					System.out.println();
					System.out.println("Invalid account Number For Current Account");
					break;
				case 3:
					System.exit(0);
					break;
					default:
						System.out.println("Invalid account Type");
				}
				}
				else
				{
					System.out.println("Not Matched Try Again");
					System.out.println("****************");
				}
			}
			public void withdrawal()
			{
				System.out.println("Enter Your account Number To Withdraw Money");
				int acn=sc.nextInt();
				double balance=0;
				if(acn==ac.getAccno())
				{
					System.out.println();
					System.out.println("Account Type");
					System.out.println("...........................");
					System.out.println();
					System.out.println("1.Saving Account");
					System.out.println("2.Current Account");
					System.out.println("3.Exit");
					System.out.println("Select Account Type:");
					int i=sc.nextInt();
					switch(i)
					{
					case 1:
						System.out.println("Enter Amount to Withdraw");
						double w=sc.nextDouble();
						double cb=ac.getBalance();
						if(cb>w)
						{
							balance=cb-w;
							if(balance>=500)
							{
								ac.setBalance(balance);
								System.out.println();
								System.out.println("Successfully Done");
								System.out.println();
								System.out.println("............................");
								System.out.println();
							}
							else
							{
								System.out.println();
								System.out.println("........Warning.........");
						System.out.println("...Account Balance Must Be Minimum 500/-");
						System.out.println("Your account Will be Closed");
						System.out.println();
						System.out.println("....................");
						System.out.println();
							}
						}
							else
							{
								System.out.println();
							System.out.println("Insufficient balance in Your Account");
							System.out.println();
							System.out.println(".................");
							}
						break;
					case 2:
						System.out.println("Invalid Account Number For Current Account");
						System.out.println();
						System.out.println(".................");
						break;
					case 3:
						System.exit(0);
						break;
						default:
							System.out.println("Enter Valid Type");
							System.out.println();
							System.out.println("...................");
							System.out.println();
					}
				}
				else
				{
					System.out.println("Not Matched Try Again");
					System.out.println();
					System.out.println("......................");
				}
			}
			public void balanceCheck()
			{
				System.out.println("Enter Your Account Number to Check Balance ");
				int acn=sc.nextInt();
				System.out.println();
				System.out.println("Balance Detail");
				System.out.println(".............................");
				System.out.println();
				if(acn==ac.getAccno())
				{
				System.out.println();
				System.out.println("Available Balance="+ac.getBalance());
				System.out.println();
				System.out.println("...................................");
				System.out.println();
				}
				else
				{
					System.out.println("Not Matched Try Again");
					System.out.println("................................");
					System.out.println();
				}
			}
			public void updateInformation()
			{
				System.out.println("Enter Your Account NUmber To Update Information=");
				int acn=sc.nextInt();
				if(acn==ac.getAccno())
				{
					System.out.println();
					System.out.println("Update Your Details");
					System.out.println("........................");
					System.out.println();
					System.out.println("1.Mobile Number");
					System.out.println("2.Name");
					System.out.println("3.Age");
					System.out.println("4.Adhar Number");
					System.out.println("5.Exit");
					System.out.println("Select What You Want To Update");
					int i=sc.nextInt();
					switch(i)
					{
					case 1:
					System.out.println("Enter New Mobile Number");
					String newmb=sc.next();
					ac.setMobNo(newmb);
					System.out.println();
					System.out.println("Mobile Number Has Been Successfully Updated");
					System.out.println();
					System.out.println("....................................");
					System.out.println();
					break;
					case 2:
						System.out.println("Enter New Name");
						String newname=sc.next();
						ac.setName(newname);
						System.out.println();
						System.out.println("Name Has Been Successfully Updated");
						System.out.println();
						System.out.println("................................");
						System.out.println();
						break;
					case 3:
						System.out.println("Enter Age");
						int newage=sc.nextInt();
						ac.setAge(newage);
						System.out.println();
						System.out.println("Age has been Successfully Updated");
						System.out.println();
						System.out.println(".....................................");
						System.out.println();
						break;
					case 4:
						System.out.println("Enter New Adhar Number");
						String newad=sc.next();
						ac.setAdharNo(newad);
						System.out.println();
						System.out.println("Adhar NUmber has Been Successfully Updated");
						System.out.println();
						System.out.println("......................................");
						System.out.println();
						break;
					case 5:
						System.exit(0);
						break;
						default:
							System.out.println("Enter Valid Type");
							System.out.println();
							System.out.println(".......................................");
							System.out.println();
					}
				}	
				else
				{
					System.out.println("Not Matched Try Again Later");
					System.out.println();
					System.out.println(".............................");
				}
			}
			@Override
			public void updateInfo() {
				// TODO Auto-generated method stub
				
			}
			
				
			}

					
				
				
			
				
			
					
					
				
			

			
		


