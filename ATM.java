import java.util.Scanner;

public class Atm{
int b;
long accountno;
long reaccountno;
int deposit;
int confirm;
int withdrawl;
Scanner puplic=new Scanner(System.in);
	Atm()
	{
		System.out.println("*************************Welcome user*************************");
		System.out.println();
		System.out.println();
		
type();
	}
	void type()
	{
		
				
		System.out.println("--------------------------------------------------");
		System.out.println("1)Savings                    2)Current Account");
		System.out.println();
		System.out.println();
		System.out.println("3)Fixed Deposit              4)Joint Account");
		System.out.println("--------------------------------------------------");
		System.out.println("Choose you're type of account");
		int choice;
		Scanner sc1=new Scanner(System.in);
		choice=sc1.nextInt();
		switch(choice)
		{
		case 1:System.out.println("You've choosen savings account");
				menu();
				break;
		case 2:System.out.println("You've choosen Current account");
		  		menu();
		  		break;
		case 3:System.out.println("You've choosen Fixed deposit");
				menu();
				break;
		case 4:System.out.println("YOu've choosen Joint account");
				int d=authorisation();
				int e=sc1.nextInt();
				if(e==d)
				{
					System.out.println("Authorisation completed successfully");
					menu();
				}
				
		}
	}
	int authorisation()
	{
		int max=100;
		int min=10;  
		 b = (int)(Math.random()*(max-min+1)-min);  // type casting into 
System.out.println(b);
			return b;
	}
	void deposit ()
	{
		System.out.println("Please Enter the Account number");
		accountno=puplic.nextLong();
		System.out.println("Please Re-Enter the Account number");
		reaccountno=puplic.nextLong();
		if(accountno==reaccountno)
		{
			System.out.println("Hurrah ! You made it buddy :},Now");
			System.out.println("Enter amount for deposit");
			deposit=puplic.nextInt();
			System.out.println("Confirm deposit");
			System.out.println("1)yes");
			System.out.println("2)No");
			confirm=puplic.nextInt();
			switch(confirm)
			{
			case 1:System.out.println("Deposit confirmed & completed of "+deposit+" into "+accountno);
			     break;
			case 2:System.out.println("Deposit Declined !Please verify once again manually :( ");
			break;
			 default:System.out.println("Deposit Declined !Please verify once again manually :( ");
			}
			
		}
		else
		{
			System.out.println("Please check account no");
		}
		
			
	
		menu();
	}
	void withdraw(int amount)
	{
		System.out.println();
		System.out.println("Please Enter the Account number");
		accountno=puplic.nextLong();
		System.out.println("Please Re-Enter the Account number");
		reaccountno=puplic.nextLong();
		if(accountno==reaccountno)
		{
			System.out.println("Hurrah ! You made it buddy :},Now");
	System.out.println("We'll go a quick authorisation");		
			int w=authorisation();
			int v=puplic.nextInt();
			if(w==v && amount<=10000)
			{
				System.out.println("Authorisation Completed successfully");
				System.out.println(amount+" "+" withdrawed from your"+" "+accountno);
				System.out.println("Please collect cash From the Cash Dispenser");
				System.out.println("--------------Thank you------------------- ");
			}
			else
			{
				System.out.println("Please check account no & Also ensure that the withdrawl \n amount should be less than or equal to 10000");
			}
			
		}
		else
		{
			System.out.println("Check account number");
		}
menu();
	}
	void checkbalance()
	{
		System.out.println();
		System.out.println("Please Enter the Account number");
		accountno=puplic.nextLong();
		System.out.println("Please Re-Enter the Account number");
		reaccountno=puplic.nextLong();
		if(accountno==reaccountno)
		{
			int c=authorisation();
			int d=puplic.nextInt();
		    if(c==d)
		    {
		    	System.out.println("You have an amount of rs");
		    }
		}
	}
	void menu()
	{
		System.out.println("--------------------------------------------------");
		System.out.println("                Choose you're option              ");
		System.out.println("-------------------------------------------------");
		System.out.println("| 1)Deposit                                        ");
		System.out.println("| 2)With_Drawl                                        ");
		System.out.println("| 3)Check_Balance   ");
		System.out.println("| 4)Main_Menu   ");
		System.out.println("| 5)Exit");
		System.out.println("--------------------------------------------------");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int withdrawl;
		switch(x)
		{
		case 1: System.out.println("You've choosen depositing cash into the account");
		        deposit();
		        break;
		case 2:System.out.println("You've choosen the withdrawl option");
				withdrawl=sc.nextInt();
				withdraw(withdrawl);
				break;
				
		case 3:System.out.println("you've opted to checking the balance of youre account");
			  	checkbalance();
			  	break;
		case 4:type();
	   default: System.out.println("Exited from the ");
		}
	}
	public static void main(String[] args) {
		new Atm();
	}
}
