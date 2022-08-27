package bank;

import java.util.Scanner;
public class Information {
	 private String name;
	 private String branch_name;
	 private String district;
	 private long ph_no;
	 private long ac_no=0;
	 private float total_amt;
	 private int password=0;
	 // constructor
	 Information()
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.print("\nEnter the Name: ");
		 name= sc.next();
	      System.out.print("\nEnter the Branch: ");
		 branch_name=sc.next();
	     System.out.print("\nEnter the District: ");
		 district=sc.next();
		 System.out.print("\nEnter the Phone Number: ");
		 ph_no=sc.nextInt();
		 System.out.print("\nEnter the Amount: ");
		 total_amt=sc.nextFloat();
	 }
	 
       //return account number
	 public long get_ac_number()
	 {
		 return ac_no;
	 }
	 
	 // initializes account number
	public long ac_number(long no)
	 {
		ac_no=no;
		 return ac_no;
	 }
	
	// display account number
	
	public void display_ac()
	{
		System.out.println("\nDear,"+name+" your account number is:"+ac_no);
	}
	
	//return amount
	public float get_amt()
	{
		return total_amt;
	}
	//update amount
	public void update_amt()
	{
		System.out.println("Enter The Amount: ");
		Scanner sc=new Scanner(System.in);
		total_amt= total_amt+sc.nextInt();
		System.out.println("\nAmount Update Sucessfully.....!");
		System.out.println("\nYour Balance is: "+total_amt);	
	}
	//Withdraw amount
	public void withdraw()
	{
		System.out.println("Enter The Amount: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		 if(total_amt>=a)
		  {
		     total_amt= total_amt-a;
		     System.out.println("\nAmount Withdraw Sucessfully.....!");
		     System.out.println("\nYour Balance is: "+total_amt);
		  }
		 else
		 {
			 System.err.println("\nAmount is Insufficient.....!");
			 System.out.println("\nYour Balance is: "+total_amt);
		 }
		
	}
	
	  //display amount
	public void display_amt()
	{
		System.out.println("Total Amount :"+total_amt);
	}
	
	
	//display information
    public void display()
	 {
      System.out.println("+--------------------------------------------------+");
      System.out.println("Name: "+name+"\n"+"Branch: "+branch_name+"\n"+"District: "+district+"\n"+"phone Number: "+ph_no);
      System.out.println("+--------------------------------------------------+\n");
	 }
    // initializes password and update password
	 public void set_pwd(int v)
	 {
		 password=v;
	 }
	 // return password
	 public int get_pwd()
	 {
		 return password;
	 }
	 
	 

}
