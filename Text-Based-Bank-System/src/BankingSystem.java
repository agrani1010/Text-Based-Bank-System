import java.io.*;
public class BankingSystem {

	public static void main(String[] args) throws IOException{
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         int userInput;
         int size=0;
         double[] accountBalance= new double[250];
         String[] accountNames=new String[250];
         for(;true;){
        	 System.out.println("Bank Admin Menu");
        	 System.out.println("Please Enter a Menu Option:");
        	 System.out.println("(1):  Add Customer to Bank");
        	 System.out.println("(2):  Change Customer Name");
        	 System.out.println("(3):  Check Account Balance");
        	 System.out.println("(4):  Modify Account Balance");
        	 System.out.println("(5):  Summary of All Accounts");
        	 System.out.println("(-1): Quit");
        	 
        	 userInput=Integer.parseInt(br.readLine());
        	 if(userInput == 1){
        		 System.out.println("Bank Add Customer Menu");
        		 System.out.println("Please enter the account balance");
        		 double balance=Integer.parseInt(br.readLine());
        		 accountBalance[size]=balance;
        		 System.out.println("Please enter the account name:");
        		 String name=br.readLine();
        		 accountNames[size]=name;
        		 System.out.println("Customer ID is: "+size);
        		 size=size+1;	 
        	 }
        	 else if(userInput == 2){
        		 System.out.println("Bank Change Name Menu");
        		 System.out.println("Please enter a customer ID to change their name:");
        		 int index=Integer.parseInt(br.readLine());
        		 System.out.println("Enter a new name:");
        		 accountNames[index]=br.readLine();
        	 }
        	 else if(userInput == 3){
        		 System.out.println("Bank Check Balance Menu");
        		 System.out.println("Please enter a customer ID to check balance");
        		 int index=Integer.parseInt(br.readLine());
        		 double balance=accountBalance[index];
        		 System.out.println("This customer has $ "+balance+" in their account.");
        	 }
        	 else if(userInput == 4){
        		 System.out.println("Bank Modify Balance Menu");
        		 System.out.println("Please enter a Customer ID to modify the balance:");
        		 int index=Integer.parseInt(br.readLine());
        		 System.out.println("Please enter your new balance:");
        		 accountBalance[index]=Double.parseDouble(br.readLine());
        	 }
        	 else if(userInput == 5){
        		 System.out.println("Bank All Customer Summary Menu");
        		 double total=0;
        		 for(int i=0;i<size;i++)
        		 {
        			 total = total+ accountBalance[i];
        			 System.out.println(accountNames[i]+" has $ "+accountBalance[i]+" in their account.");
        		 }
        		 System.out.println("In total, there is $"+ total+" in the bank");
        	 }
        	 else if(userInput == -1){
        		 System.out.println("-1");
        		 System.exit(-1);
        	 }
        	 else{
        		 System.out.println("ERROR: Invalid Input");
        	 }
         }

	}

}
