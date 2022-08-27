import bank.*;
import java.util.*;

public class index {
      static int j=0;
      static long  ac=10000000;
	public static void main(String[] args) {
		int i=1,key,value,value1,pwd,con_pwd,pwd1,flag;
		Scanner sc=new Scanner(System.in);
		ArrayList<Information> a=new ArrayList<Information>();
		Information i1[]=new Information [500];
		System.out.println("<-------------Enter the key 1 to start and 0 to stop------------->");	
		System.out.print("Enter the key value: ");
		i=sc.nextInt();
		while(i==1)
		{
			flag=0;
		    System.out.println("\n1)Enter the key 1 to 'Register'\n2)Enter the key 2 to 'Update Amount'\n3)Enter the key 3 to 'WithDraw'\n4)Enter the key 4 to 'Display Amount'\n5)Enter the key 5 to 'Display Information'\n6)Enter the key 6 to 'Update password'");
		    System.out.print("\nEnter the key value: ");
		    key=sc.nextInt();
          // Create account
			if(key==1)
			  {
				i1[j]=new Information();
				i1[j].ac_number(ac++);
				 i1[j].display_ac();
				 System.out.print("\n---------->Setup The Password-------------->\n");
				 while(i==1)
				  {
				    System.out.print("Enter the password: ");
				    pwd1=sc.nextInt();
				    System.out.print("\nEnter conform password: ");
				    con_pwd =sc.nextInt();
				    if(pwd1==con_pwd)
				      {
					    i1[j].set_pwd(con_pwd);
					    System.out.println("\nPassword Set Sucessfully.....!");
					    break;
				      }
				   else
				   	  {
					   	System.err.println("Please enter valid password");
					   	System.out.println(" ");		
				      }
				 }
				 a.add(i1[j++]);	
			}
			//Update amount
			 if(key==2)
			{
				 while(i==1)
				 {
					 System.out.print("Enter the Account Number: ");
					 value =sc.nextInt();
					 System.out.print("Enter the password: ");
					 value1=sc.nextInt();
					  for(Information i2:a)
					  	{
						  if(value==i2.get_ac_number()&&value1==i2.get_pwd())
						   {
							  i2.update_amt();
							  flag=1;
							  i=0;
						   }
					
					  	}
					  if(flag==0)
					  {
						  System.err.print("Please Enter Valid Information ......!\n");
					  }
				 }
			}
			//Withdraw Amount
			 if(key==3)
			    {
				 	while(i==1)
				 	{
				 		System.out.print("\nEnter the Account Number: ");
				 		value =sc.nextInt();
				 		System.out.print("\nEnter the password: ");
				 		value1=sc.nextInt();
				 		 for(Information i2:a)
				 		  {
				 			 if(value==i2.get_ac_number()&&value1==i2.get_pwd())
				 			  {
				 				 i2. withdraw();
				 				 flag=1;
				 				 i=0;
				 			  }
				 		  }
				 		 if(flag==0)
				 		  {
				 			 System.err.print("Please Enter Valid Information......!\n");
				 		  }
				 	}
			    }
			 //display Amount
		    if(key==4)
				{
		    	  while(i==1)
		    	   {
		    		  System.out.print("Enter the Account Number: ");
		    		  value =sc.nextInt();
		    		  System.out.print("\nEnter the password: ");
		    		  value1=sc.nextInt();
		    		   for(Information i2:a)
		    		    {
						 if(value==i2.get_ac_number()&&value1==i2.get_pwd())
						  {
					         i2.display_amt();
					         flag=1;
					         i=0;        
						  }
		    		    }
		    		   if(flag==0)
						 {
						 System.err.print("Please Enter Valid Information......!\n");
						 System.out.println(" ");
						}
						 
					}
				}
		    //Display information
			 if(key==5)
			  {
				 while(i==1)
				  {
					 System.out.print("Enter the Account Number: ");
					 value =sc.nextInt();
					  for(Information i2:a)
					   {
						  if(value==i2.get_ac_number())
						   {
							  i2.display();
							  flag=1;
							  i=0;
						   }
				
					   }
					  if(flag==0)
					   {
						  System.err.print("Please Enter Valid Account Number......!\n");
					   }
				  }
			  }
			 //reset password
			 if(key==6)
			  {
                 while(i==1)
                 	{
                	 	System.out.print("Enter the Account Number: ");
                	 	value =sc.nextInt();
					 	for(Information i2:a)
					 	 {
					 		if(value==i2.get_ac_number())
					 		 {
					 			flag=1;
					 		     while(i==1)
					 		     {
									 System.out.print("\nEnter new password: ");
									 pwd1=sc.nextInt();
									 System.out.print("\nEnter conform password: ");
									 con_pwd =sc.nextInt();
									 if(pwd1==con_pwd)
									  {
										 i2.set_pwd(con_pwd);
										 System.out.println("\nPassword Updated Sucessfully.....!");
										 i=0;
									  }
									 else
									 {
										 System.err.println("Please enter valid password");
										 System.out.println(" ");
									 }
					 		     }
					              
					 		 }
					 	 }
						 if(flag==0)
						   {
							 System.err.print("Please Enter Valid Account Number......!\n");
							 System.out.println(" ");
						   }
                 	}
				 
			  }
			System.out.println("\n\n<-------------Enter the key 1 to start and 0 to stop:------------->");
			System.out.print("Enter the key value: ");
			i=sc.nextInt();
			
		}
		
		

}
	
	}

