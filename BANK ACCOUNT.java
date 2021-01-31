import java.util.*;
import java.util.Date;
import java.text.*;
 // Compiler version JDK 11.0.2

 class ATMDemo
 {
   public static void main(String args[])
   { 
    int accountnumber = 0;
        int pin = 0;
        int balance = 20000;
        int amount;
        String bank;
        int deposit;
        int withdrawal;
        int transfer;
        int customer_account;
        String accountname="Dave Enyi";
        String accountname3;
        String accountname2;
        int choice;
        
        Date TDate =new Date();
        SimpleDateFormat ft = new SimpleDateFormat("E dd.MM.yyyy 'at' hh:mm:ss a zzz");
        // display time and date using toString()
        
        Scanner input = new Scanner(System.in);
        System.out.println("your pin is:1998 and \nyour account number is:123456");
        System.out.println("Please enter your pin");
        pin = input.nextInt();
        System.out.println("*******************");
        System.out.println("Simple Bank Demo Program  Develop by Dave Enyi");
        System.out.println("*******************");
        if((pin == 1998)){
        System.out.println("Please enter your account number"); 
        accountnumber = input.nextInt();
        System.out.println("Press 1 to Deposit");
        System.out.println("Press 2 to Withdrawl");
        System.out.println("Press 3 to Balance");
        System.out.println("Press 4 to Transfer");
        System.out.println("Press 0 to End");
        }else if((accountnumber !=123456) && (pin !=1998)){
        System.out.println("Invalid login details");
        System.exit(0);
        }
       choice = input.nextInt();
        switch(choice){
            case 1:
                System.out.println(" Enter beneficiary account number to deposit to");
                customer_account = input.nextInt();
                System.out.println("Please enter Bank name");
                bank = input.next();
                System.out.println("Please enter amount to deposit");
                amount = input.nextInt();
                balance = amount+balance;
                System.out.println("You deposited "+"N"+amount+" To "+" Account Name:  "+accountname);
                System.out.println("Account Number: "+accountnumber);
                System.out.println("Bank Name: "+bank+" Bank");
                System.out.println("Beneficiary Account Number: "+customer_account);
                System.out.println("Your new balance is "+"N"+balance);
                System.out.println("Transaction Date: "+ ft.format(TDate));
                System.out.println("Transaction successful");
             
                break;
            case 2:
                System.out.println("Please enter amount to withdrawl");
                withdrawal = input.nextInt();
                balance = balance-withdrawal;
                System.out.println("Debit alert of "+"N"+withdrawal+" from\n"+"Account Name: "+accountname+","+"\n Account Number: "+accountnumber);
                System.out.println("Your new balance is "+"N"+balance);
                System.out.println("Transaction Date: "+ ft.format(TDate));
                System.out.println("Transaction successful");
                break;
            case 3:
                System.out.println("Your balance is "+"N"+balance);
                System.out.println("Transaction Date: "+ ft.format(TDate));
                break;
            case 4:
                System.out.println("Please enter account destination");
                accountnumber = input.nextInt();
                System.out.println("Please enter account first name");
                accountname3 = input.next();
                System.out.println("Please enter account last name");
                accountname2 = input.next();
                System.out.println("Please enter amount to transfer");
                transfer = input.nextInt();
                balance = balance-transfer;
                System.out.println("You transfer "+"N"+transfer+" To "+"\nAccount Number: "+accountnumber+" "+"\nAccount Name: "+accountname3+" "+accountname2+"");
                System.out.println("Your new balance is "+"N"+balance);
                System.out.println("Transaction Date: "+ ft.format(TDate));
                System.out.println("Transaction successful");
                break;
            default:
        System.out.println("Invalid selection");
                break;
        }
    }
    
   }
