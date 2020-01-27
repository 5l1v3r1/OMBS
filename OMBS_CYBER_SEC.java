import java.io.*;
class Online_Mobile_Banking_System
{
   public static void main (String args[]) throws IOException
   {
      InputStreamReader read = new InputStreamReader(System.in);
      BufferedReader in = new BufferedReader(read); 
      
      String account_ho_name[] = {"Jaiprakash Narayan","Ashish Narayan","Aryan Sen","Abhishek Dhawan","Harsh Kumar Jr.","Abhinav Anand Jr.","Ratul Kumar Jr.","Krishna Kumar","Sumit K","Rahul Verma","Niraj Kumar Jr.","Sweta Singh","Kalpana Chawala","Arunima Sinha","Jeff Bezos","Bill Gates"};
      String father_hus_name[] = {"Mangal Prasad","Jaiprakash Narayan","Rajesh Sen","Sanjay Dhawan","Harsh Kumar","Abhinav Anand","Ratul Kumar","Sanjay Kumar","Harsh K","Raj Verma","Niraj Kumar","Rajshri Singh","Banarshi Lal Chawala","Gaurav Singh","Ted Jorgensen","Bill Gates Sr."};
      String date_births    [] = {"21 Jan 1972","7 Dec 2003","31 Dec 2001","26 April 1964","22 March 1993","14 July 1991","24 Sept 1997","19 Sept 1996","8 July 1993","13 March 1992","21 Feb 1969","30 Nov 1981","26 Aug 1973","17 May 1961","4 June 1959"};
      String login_usernames[] = {"JaiprakashN","AshishN","Aryan123","Abhishek","Harshjr26","Abhinav","Ratulpianist","KrishnaK","Sumit2","Rahul59","Nirajn","SwetaS2","Kalpanach1","Arunimasinha","Bezosjeff","Billgates32"};
      String login_passwords[] = {"abc1abc@","abc2abc@","abc3abc@","abc4abc@","abc5abc@","abc6abc@","abc7abc@","abc8abc@","abc9abc@","abc10abc@","abc11abc@","abc12abc@","abc13abc@","abc14abc@","abc15abc@","abc16abc@"};
      String account_numbers[] = {"0000085264209765","0000094852105394","0000052108537543","0000064265387630","0000064287645903","0000038765301836","0000065432790537","0000048205836501","0000045683109368","0000042963084169","0000035972157849","0000024597645935","0000058932498725","0000058796403170","0000059780005648","0000065892147896"};
      String account_type   [] = {"Savings Account","Savings Account","Savings Account","Savings Account","Savings Account","Savings Account","Savings Account","Savings Account","Savings Account","Savings Account","Savings Account","Savings Account","","Savings Account","Current Account","Current Account"};	        
      String mobile_numbers [] = {"+91 8537964276","+91 9763108743","+91 7345632301","+91 6246319842","+91 9756432601","+91 8965340110","+91 7656300242","+91 7295380118","+91 8234054685","+91 9234753684","+91 8269483515","+91 9828066090","+91 7558321940","+91 9548613884","+1 3495298421","+1 8526982546"};
      double amounts        [] = {45609.86,33506.74,60871.46,59980.07,45671.45,77876.12,34207.54,54676.43,21076.23,54504.03,56800.26,27348.30,35600.82,38096.7,60154.52,60054.19};
      
      int attempt_remaining=3,i=0,j=0,correct=0,correct1=0,correct2=0,correct3=0,store_location=0,want=0,wrong=0,wrong1=0,wrong2=0,wrong3=0,wrong4=0,entered_choice=0,enter_choice;
      double amount=0.0;
      String entered_username="",entered_password="",ben_acc_number="",ifsc="",operator_name="",mobile_number="",id_number="",cd_name ="",cc_acno ="",cc_dob  ="",biller_name="",reason="";
      
      do
      {
        if(wrong==0 && wrong1==0) // Conditions to check for Over Attempt if any
        {
         wrong=2;wrong1=2;wrong2=2;wrong3=2;j=0;
         System.out.println("Welcome to Bank of Economic Security for All ( CYBER SEC )");
	 System.out.println();
	 System.out.println("We welcome you in our Online Mobile Banking System");
	 System.out.println("____________________________________________________");
	 System.out.println();
	 
	 System.out.println("Please choose an option");
	 System.out.println();
	 System.out.println("Please enter 1 to Login in your Account!");
	 System.out.println("Please enter any Key to Exit from the System!");
	 want=Integer.parseInt(in.readLine());
	 System.out.println();
	 
	 if(want==1) // If USER want to LOGIN 
	 {
	   System.out.println("If you Enter Incorrect Password more than 3 times You will be Automatically EXITED from the SYSTEM!");
	   System.out.println();
	   
	   for(i=0;i<3;i++) // To give USER ONLY 3 ATTEMPTS
	   {
	     if(attempt_remaining==3)
	     System.out.println("Please enter your Login Username!");
	     else
	     System.out.println("Please enter your Login Username again!");
	     entered_username=in.readLine();
	     if(attempt_remaining==3)
	     System.out.println("Please enter your Login Password!");
	     else
	     System.out.println("Please enter your Login Password again!");
	     entered_password=in.readLine();
	     
	     for(j=0;j<login_usernames.length;j++)
	     {
	       if(entered_username.equals(login_usernames[j]) && entered_password.equals(login_passwords[j]))
	       {
	          correct=1;
		  store_location=j;
               }
               else
	       attempt_remaining=2-i;
	       }
	       
	       if(correct==1)
	       {
	          correct1=1;
		  break;  
	       }
	       else
	       {
	         if(attempt_remaining!=0)
	         {
	           System.out.println();
	           System.out.println("Sorry! You have entered Wrong Username or Password.");
	           System.out.println("Please try again.");
	           System.out.println("Your remaining Attempt is " + attempt_remaining + ".");
	           System.out.println();
	          }
	          else
	          {
	            wrong=1;correct1=0;
	            System.out.println();
	            System.out.println("Sorry! You have Exceeded the Limit of Attempt!");
	            System.out.println();
	            System.out.println("______________Your turn is over______________");
	            System.out.println();
	            break; 
	           }
	       }
	   }
	   
	   if(correct1==1) // If Entries are Correct
	   {
	   outer:
	   do
	   {
	        wrong=2;wrong1=2;wrong3=2;wrong2=0;j=1;
	        System.out.println();
	        System.out.println("Please enter your choice.");
	        System.out.println();
	        System.out.println("1. Account Details");
	        System.out.println("2. Fund Transfer");
	        System.out.println("3. Shop");
	        System.out.println("4  Credit Card");
                System.out.println("5. LOG OUT");
	        entered_choice=Integer.parseInt(in.readLine());
	        System.out.println();
	         
	         switch(entered_choice) // USER Desire
	         { 
	           case 1:
	           System.out.println();
		   System.out.println("ACCOUNT DETAILS");
		   System.out.println("_______________");
		   System.out.println();
		   System.out.println("Account Holder's Name   : "+ account_ho_name[store_location]);
		   System.out.println("Father's/Husband's Name : "+ father_hus_name[store_location]);
		   System.out.println("Date of Birth           : "+ date_births[store_location]);
		   System.out.println("Mobile Number           : "+ mobile_numbers[store_location]);
		   System.out.println("Account number          : "+ account_numbers[store_location]);
		   System.out.println("Account Type            : "+ account_type[store_location]);
		   System.out.println("Available Balance       : "+ amounts[store_location]+"rs.");
		   System.out.println();
		   System.out.println("_______________________");
		   System.out.println();
		   break; 
		   
		   case 2:
	           System.out.println();
		   System.out.println("FUND TRANSFER");
		   System.out.println("_____________");
		   System.out.println();
		   System.out.println("_____You can have Only 5 ATTEMPTS to Fill any Required Form_____    !");
		   System.out.println();
		   wrong2=0;j=1;
		   
		   for(i=0;i<6;i++)
		   {
		      j=j+1;
		      if(j<7)
		      {
		      correct=0;
		      if(i==0)
		      System.out.println("Please enter Benificiary Account Number (about 11 digits)!");
		      else
		      System.out.println("Please enter Correct Benificiary Account Number (about 11 digits)!");
		      ben_acc_number="00000"+in.readLine();
		       
		      if(ben_acc_number.length()==16)
		      {
		        System.out.println("Please enter Amount to be transferred!");
		        amount=Double.parseDouble(in.readLine());
		        System.out.println("Please enter IFS Code!");
		        ifsc=in.readLine();
		        System.out.println();
		        System.out.println("Please Verify the Details!");
		        System.out.println("______________________________________");
		        System.out.println();
		        System.out.println("Benificiary Account : " + ben_acc_number);
		        System.out.println("Transferable Amount : " + amount + "rs.");
		        System.out.println("IFS Code            : " + ifsc);
		         System.out.println("______________________________________");
		        System.out.println();
		        System.out.println("IF VERIFIED, Enter 1 to continue!");
		        System.out.println("Please enter ANY KEY to RE-ENTER the Details!");
		        entered_choice=Integer.parseInt(in.readLine());
		        
		        if(entered_choice==1)
		        {
		          System.out.println();
		          
		          for(i=0;i<3;i++)
		          {
		            if(i==0)
		            System.out.println("Please enter your Password!");
		            else
		            {
		            System.out.println("You have entered Wrong Password!");
		            System.out.println("Please enter your Password Again!");
		            }
		            entered_password=in.readLine();
		            if(entered_password.equals(login_passwords[store_location]))
		            {
		              if(amount!=0 && amount<amounts[store_location] || amount==amounts[store_location])
		              correct=1;
		              else
		              correct=2;
		              break;  
		             }
		          }
		          
		          if(correct==1 || correct==2)
		          {
		            if(correct==1)
		            {
		            amounts[store_location] =amounts[store_location]-amount;
		            System.out.println("Funds have been successfully Transferred!");
		            System.out.println("Thank you for using our Online Mobile Banking System.");
		            System.out.println();
		            System.out.println("Available Balance       : "+ amounts[store_location]+"rs.");
		            }
		            else
		            {
		             System.out.println("Funds can't be Transferred due to INSUFFICIENT BALANCE!");
	 System.out.println("TRANSFERABLE AMOUNT must be greater than ZERO, less than AVAILABLE BALANCE OR equal to AVAILABLE BALANCE!");
		             System.out.println("Available Balance       : "+ amounts[store_location]+"rs."); 
		            }
		         }
		         else
		         {
		         wrong=1;
		         break;
		          }
		      }  
		         else
		         {
		           if(wrong!=1)
		           continue;
		          }
		      
		      if(j>6)
		      {
		        wrong2=1;
		        break;
		      }
		  }
                  }
                  
		     else
		      {
		        wrong2=1;
		        break;
		      }
		      if(correct==1 || correct==2)
		      break;
		    }
		    if(correct==1 || correct==2)
		    continue;
		    if(wrong==1 || wrong2==1)
		    break;
		    
		   case 3:
		   System.out.println("SHOP");
                   System.out.println("____");
                   System.out.println();
                   System.out.println("Please choose an option");
                   System.out.println("1.  Mobile Recharge");
                   System.out.println("2.  DTH recharge");
                   entered_choice=Integer.parseInt(in.readLine());
                   System.out.println();
                   wrong2=0;j=1;
                   
                   switch(entered_choice)
                   {
                     case 1:
                     System.out.println("1.  Mobile Recharge");
                     System.out.println("____________________");
                     System.out.println();
                     System.out.println("_____You can have Only 5 ATTEMPTS to Fill any Required Form_____   !");
		     System.out.println();
		     
		     for(i=0;i<6;i++)
		     {
		       j=j+1;
		       if(j<7)
		       {
		         correct=0;
		         if(i==0)
		       System.out.println("Please enter Mobile Number (about 10 digits)!");
		       else
		       System.out.println("Please enter Correct Mobile Number (about 10 digits)!");
		       mobile_number=in.readLine();
		       
		      if(mobile_number.length()==10)
		      {
		        System.out.println("Please enter Operator name!");
		        operator_name=in.readLine();
		        System.out.println("Please enter Amount to be Recharged!_");
		        amount=Double.parseDouble(in.readLine());
		        System.out.println();
		        System.out.println("Please Verify the Details!");
		        System.out.println("______________________________________");
		        System.out.println();
		        System.out.println("Mobile Number       : " + mobile_number);
		        System.out.println("Operator Name       : " + operator_name);
		        System.out.println("Rechargeable Amount : " + amount + "rs.");
		        System.out.println("______________________________________");
		        System.out.println();
		        System.out.println("IF VERIFIED, Enter 1 to continue!");
		        System.out.println("Please enter ANY KEY to RE-ENTER the Details!");
		        entered_choice=Integer.parseInt(in.readLine());
		        
		        if(entered_choice==1)
		        {
		          System.out.println();
		          
		          for(i=0;i<3;i++)
		          {
		            if(i==0)
		            System.out.println("Please enter your Password!");
		            else
		            {
		            System.out.println("You have entered Wrong Password!");
		            System.out.println("Please enter your Password Again!");
		            }
		            entered_password=in.readLine();
		            if(entered_password.equals(login_passwords[store_location]))
		            {
		              if(amount!=0 && amount<amounts[store_location] || amount==amounts[store_location])
		              correct=1;
		              else
		              correct=2;
		              break;  
		             }
		          }
		          
		          if(correct==1 || correct==2)
		          {
		            if(correct==1)
		            {
		            amounts[store_location] =amounts[store_location]-amount;
		            System.out.println("Mobile have been Successfully Recharged!");
		            System.out.println("Thank you for using our Online Mobile Banking System.");
		            System.out.println();
		            System.out.println("Available Balance       : "+ amounts[store_location]+"rs.");
		            }
		            else
		            {
		             System.out.println("Mobile can't be Recharged due to INSUFFICIENT BALANCE!");
    System.out.println("Rechargeable Amount must be greater than ZERO, less than AVAILABLE BALANCE OR equal to AVAILABLE BALANCE!");
		             System.out.println("Available Balance       : "+ amounts[store_location]+"rs."); 
		            }
		         }
		         else
		         {
		         wrong=1;
		         break;
		          }
		      }  
		         else
		         {
		           if(wrong!=1)
		           continue;
		          }
		      
		      if(j>6)
		      {
		        wrong2=1;
		        break;
		      }
		  }
                  }
                  
		     else
		      {
		        wrong2=1;
		        break;
		      }
		      if(correct==1 || correct==2)
		      break;
		    }
		    if(correct==1 || correct==2)
		    continue;
		    if(wrong==1 || wrong2==1)
		    break;
	           
                     
                     case 2:
                     System.out.println("1.  DTH Recharge");
                     System.out.println("____________________");
                     System.out.println();
                     System.out.println("_____You can have Only 5 ATTEMPTS to Fill any Required Form_____  !");
		     System.out.println();
		     
		     for(i=0;i<6;i++)
		     {
		       j=j+1;
		       if(j<7)
		       {
		         correct=0;
		         if(i==0)
		       System.out.println("Please enter ID Number (about 10 digits)!");
		       else
		       System.out.println("Please enter Correct ID Number (about 10 digits)!");
		       id_number=in.readLine();
		       
		      
		        System.out.println("Please enter Operator name!");
		        operator_name=in.readLine();
		        System.out.println("Please enter Amount to be Recharged!_");
		        amount=Double.parseDouble(in.readLine());
		        System.out.println();
		        System.out.println("Please Verify the Details!");
		        System.out.println("______________________________________");
		        System.out.println();
		        System.out.println("ID Number           : " + id_number);
		        System.out.println("Operator Name       : " + operator_name);
		        System.out.println("Rechargeable Amount : " + amount + "rs.");
		        System.out.println("______________________________________");
		        System.out.println();
		        System.out.println("IF VERIFIED, Enter 1 to continue!");
		        System.out.println("Please enter ANY KEY to RE-ENTER the Details!");
		        entered_choice=Integer.parseInt(in.readLine());
		        
		        if(entered_choice==1)
		        {
		          System.out.println();
		          
		          for(i=0;i<3;i++)
		          {
		            if(i==0)
		            System.out.println("Please enter your Password!");
		            else
		            {
		            System.out.println("You have entered Wrong Password!");
		            System.out.println("Please enter your Password Again!");
		            }
		            entered_password=in.readLine();
		            if(entered_password.equals(login_passwords[store_location]))
		            {
		              if(amount!=0 && amount<amounts[store_location] || amount==amounts[store_location])
		              correct=1;
		              else
		              correct=2;
		              break;  
		             }
		          }
		          
		          if(correct==1 || correct==2)
		          {
		            if(correct==1)
		            {
		            amounts[store_location] =amounts[store_location]-amount;
		            System.out.println("DTH have been Successfully Recharged!");
		            System.out.println("Thank you for using our Online Mobile Banking System.");
		            System.out.println();
		            System.out.println("Available Balance       : "+ amounts[store_location]+"rs.");
		            }
		            else
		            {
		             System.out.println("DTH can't be Recharged due to INSUFFICIENT BALANCE!");
    System.out.println("Rechargeable Amount must be greater than ZERO, less than AVAILABLE BALANCE OR equal to AVAILABLE BALANCE!");
		             System.out.println("Available Balance       : "+ amounts[store_location]+"rs."); 
		            }
		         }
		         else
		         {
		         wrong=1;
		         break;
		          }
		      }  
		         else
		         {
		           if(wrong!=1)
		           continue;
		          }
		      
		      if(j>6)
		      {
		        wrong2=1;
		        break;
		      }
		  
                  }
                  
		     else
		      {
		        wrong2=1;
		        break;
		      }
		      if(correct==1 || correct==2)
		      break;
		    }
		    if(correct==1 || correct==2)
		    continue;
		    if(wrong==1 || wrong2==1)
		    break;
                     
                     default:
	             System.out.println("Wrong Choice!"); 
                       
                    }
                    if(correct==1 || correct==2)
		    continue;
		    if(wrong==1 || wrong2==1)
		    break;
		    
		    case 4:
		    System.out.println();
                    System.out.println("CREDIT CARD");
                    System.out.println("___________");
                    System.out.println();
                    System.out.println("Enter an option");
                    System.out.println();
                    System.out.println("1.  Apply for Credit card");
                    System.out.println("2.  Bill Payment");
                    System.out.println("3.  Available Amount");
                    entered_choice = Integer.parseInt(in.readLine());
                    wrong4=0;j=1;
                    
                    switch(entered_choice)
		    {
		       case 1:
		       System.out.println();
                       System.out.println("Apply for Credit card");
                       System.out.println("_____________________");
                       System.out.println();
                       
                       
		       for(i=0;i<5;i++)
		       {
		       j=j+1;
		       if(j<7)
		       {
		         correct=0;
		         if(i==0)
		         {
                         System.out.println("Please enter your Name!");
                         cd_name = in.readLine();
                         System.out.println("Please enter your Account number!");
                         cc_acno = in.readLine();
                         System.out.println("Please enter your Date of Birth (as 13 Jan 1993 or 13 April 1992)!");
                         cc_dob = in.readLine();
                         }
                         else
                         {
                            System.out.println("Please enter your Name Again!");
                            cd_name = in.readLine();
                            System.out.println("Please enter your Account number Again!");
                            cc_acno = in.readLine();
                            System.out.println("Please enter your Date of Birth (as 13 Jan 1993 or 13 April 1992) Again!");
                            cc_dob = in.readLine(); 
                          }
                          
                          System.out.println();
		          System.out.println("Please Verify the Details!");
		          System.out.println("______________________________________");
		          System.out.println();
		          System.out.println("Name                                            : " + cd_name);
		          System.out.println("Account number                                  : " + cc_acno);
		          System.out.println("Date of Birth (as 13 Jan 1993 or 13 April 1992) : " + cc_dob);
		          System.out.println("______________________________________");
		          System.out.println();
		          System.out.println("IF VERIFIED, Enter 1 to continue!");
		          System.out.println("Please enter ANY KEY to RE-ENTER the Details!");
		          entered_choice=Integer.parseInt(in.readLine());
		          
		          if(entered_choice==1)
		          {
		          System.out.println();
		          
		          for(i=0;i<3;i++)
		          {
		            if(i==0)
		            System.out.println("Please enter your Password!");
		            else
		            {
		            System.out.println("You have entered Wrong Password!");
		            System.out.println("Please enter your Password Again!");
		            }
		            entered_password=in.readLine();
		            if(entered_password.equals(login_passwords[store_location]))
		            {
if(cd_name.equals(account_ho_name[store_location]) && cc_acno.equals(account_numbers[store_location]) && cc_dob.equals(date_births[store_location]))
		            {
		              correct=1;
		              break;
		             }
		             if(correct==1)
		             {
		             correct=2;
		             break;
		             }
		             else
		             {
		             correct=2;
		             break;
		          }
		            }
		            
		          }
		          
		          if(correct==1 || correct==2)
		          {
		            if(correct==1)
		            {
		            System.out.println("You have Successfully Applied for Credit Card!");
		            System.out.println("Thank you for using our Online Mobile Banking System.");
		            System.out.println();
		            wrong4=1;
		            break;
		             }
		             if(correct==2)
		             {
		                System.out.println("Sorry! INCORRECT DETAILS.");
		                System.out.println("Please Fill CORRECT DETAILS!");
		                System.out.println();
		                
		              }
		            }
		         else
		         {
		         wrong=1;
		         break;
		          }
		      }
		       if(correct==2)
		       continue;
		       
		       if(j>5)
		      {
		        wrong2=1;
		        wrong4=0;
		        break;
		      }
                         }
                         if(j>5)
		         {
		           wrong2=1;
		           wrong4=0;
		           break;
		         }
		        
		     }
		    
		     if(wrong==1 || wrong2==1 || wrong4==1 || wrong4==0)
		     break;
		     
		     case 2:
		     System.out.println();
		     System.out.println("Bill Payment");
		     System.out.println("____________");
		     System.out.println();
		     correct=0;wrong=0;
		     
		     for(i=0;i<6;i++)
		     {
		       j=j+1;
		       if(j<7)
		       {
		         correct=0;
		         if(i==0)
		       System.out.println("Please enter Biller Name!");
		       else
		       System.out.println("Please enter Biller Name Again!");
		       biller_name=in.readLine();
		     
		        System.out.println("Please enter Payable Amount!");
		        amount=Double.parseDouble(in.readLine());
		        System.out.println("Please enter Biller's Mobile Number!");
		        mobile_number=in.readLine();
		        System.out.println("Please enter Reason for Paying!");
		        reason=in.readLine();
		        System.out.println();
		        System.out.println("Please Verify the Details!");
		        System.out.println("______________________________________");
		        System.out.println();
		        System.out.println("Biller Name             : " + biller_name);
		        System.out.println(" Biller's Mobile Number : " + mobile_number);
		        System.out.println("Pyable Amount           : " + amount + "rs.");
		        System.out.println("Reason for Paying       : " + reason);
		        System.out.println("______________________________________");
		        System.out.println();
		        System.out.println("IF VERIFIED, Enter 1 to continue!");
		        System.out.println("Please enter ANY KEY to RE-ENTER the Details!");
		        entered_choice=Integer.parseInt(in.readLine());
		        
		        if(entered_choice==1)
		        {
		          System.out.println();
		          
		          for(i=0;i<3;i++)
		          {
		            if(i==0)
		            System.out.println("Please enter your Password!");
		            else
		            {
		            System.out.println("You have entered Wrong Password!");
		            System.out.println("Please enter your Password Again!");
		            }
		            entered_password=in.readLine();
		            if(entered_password.equals(login_passwords[store_location]))
		            {
		              if(amount!=0 && amount<amounts[store_location] || amount==amounts[store_location])
		              correct=1;
		              else
		              correct=2;
		              break;  
		             }
		          }
		          
		          if(correct==1 || correct==2)
		          {
		            if(correct==1)
		            {
		            amounts[store_location] =amounts[store_location]-amount;
		            System.out.println("Payment Successfull!");
		            System.out.println("Thank you for using our Online Mobile Banking System.");
		            System.out.println();
		            System.out.println("Available Balance       : "+ amounts[store_location]+"rs.");
		            }
		            else
		            {
		             System.out.println("Payment NOT Successfull!");
    System.out.println("Rechargeable Amount must be greater than ZERO, less than AVAILABLE BALANCE OR equal to AVAILABLE BALANCE!");
		             System.out.println("Available Balance       : "+ amounts[store_location]+"rs."); 
		            }
		         }
		         else
		         {
		         wrong=1;
		         break;
		          }
		      }  
		         else
		         {
		           if(wrong!=1)
		           continue;
		          }
		      
		      if(j>6)
		      {
		        wrong2=1;
		        break;
		      }
                  }
                  
		     else
		      {
		        wrong2=1;
		        break;
		      }
		      if(correct==1 || correct==2)
		      break;
		    }
		    if(correct==1 || correct==2)
		    continue;
		    if(wrong==1 || wrong2==1)
		    break;
	           
		     
		     
		     case 3:
		     System.out.println("Available Balance : "+amounts[store_location]+"rs.");
		     wrong4=1;
		     break;
		      
		     default:
	             System.out.println("Wrong Choice!");
		   }
		   if(wrong==1 || wrong1==1 || wrong2==1 ||wrong4==1)
		   break;
		   
		     
	           case 5:
	           correct=0;
		   wrong3=1;
		   break;
	           
	           default:
	           System.out.println("Wrong Choice!");
	           
	           }
	      
	    
	      if(wrong==1 || wrong1==1 || wrong2==1 || wrong3==1)
	      break outer;
	     
	   }
	   while(entered_choice!=5);
          }
	     
	  }
	   
	 else // If USER doesn't want to login (want!=1)
	 {
	    System.out.println();System.out.println("You have Successfully EXITED!");
            System.out.println("_____________________________________________________________________________");
            break;
	  }
	 
        }
        else
        {
          if(wrong==1)
          {
            System.out.println();
            System.out.println("Due to Over Attempt, you are Automatically EXITED From The SYSTEM!");
            System.out.println("_____________________________________________________________________________");
            System.out.println(); 
            break;
          }
          if(wrong2==1 || wrong3==1)
          {
            System.out.println();
            if(wrong3==1)
            wrong2=0;
            if(wrong2==1)
            System.out.println("Due to Over Attempt, you are Automatically LOGGED OUT!");
            if(wrong3==1)
            System.out.println("You have Successfully LOGGED OUT!");
            System.out.println("_____________________________________________________________________________");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            want=0;
            System.out.println("Please enter 1 to Login Again");
            System.out.println("Please enter ANY key to EXIT from the System");
            want=Integer.parseInt(in.readLine());
            System.out.println("_____________________________________________________________________________");
            System.out.println();
            if(want==1)
            {
            wrong=0;wrong1=0;
            continue;
             }
            else
            {
              System.out.println();System.out.println("You have Successfully EXITED!");
              System.out.println("_____________________________________________________________________________");
              break;
            }
          }
        }
       }
       while(want==1);
    }
}