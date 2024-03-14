import java.util.Scanner;

public class atmProgram {
    private static double balance=1000; // Initial balance set to 1000
    private static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int choice;

        do{
            System.out.println("1. Check Bank Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("Enter your choice :");
            choice =sc.nextInt();

            switch (choice) {
                case 1:
                checkbalance();
                    
                    break;

                case 2:
                Deposit();
                break;

                case 3:
                Withdraw();
                break;

                case 4:
                System.out.println("Exiting the program. Thank you!");
                break;
                default:
                System.out.println("Invalid choice. Please Enter a Number between 1 and 4.");
                break;
            }
        }
            
          while(choice !=4);
    }
        
    private static void  checkbalance(){
        System.out.println("Your balance is : "+balance);

    }
    private static void Deposit(){
        System.out.println("Enter amount to deposite :");
        double amount=sc.nextDouble();
        if(amount <= 0){
            System.out.println("Please enter a positie number :");
        }
        else{
            balance = balance+amount; // we also write balance +=amount;
            System.out.println("Rs"+amount+ "has been deposited successfully." );
            System.out.println("Your current balance is "+balance+".");

        }

    }

    private static void Withdraw(){
        System.out.println("Enter the amount to withdraw :");
        double amount =sc.nextDouble();
        if(amount<=0){
            System.out.println("Invalid amount!.Please enter a positive number");
        }
        else if(amount >balance){
            System.out.println("Insufficient Balance. Your current balance is Rs "+balance);
        }
        else
        {
            balance -=amount;
            System.out.println("Rs"+amount+"has been withdrawn successfully");
            System.out.println("Your current balance is "+balance+".");

        }

    }
    
    
}
