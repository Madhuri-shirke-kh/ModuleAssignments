class BankAccount {
    
    private double balance;
    private String accountHolder;

  
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

      public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Current balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

  
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Current balance: $" + balance);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

  
    public double getBalance() {
        return balance;
    }

  
    public String getAccountHolder() {
        return accountHolder;
    }

  
    public String getAccountDetails() {
        return "Account Holder: " + accountHolder + ", Balance: $" + balance;
    }
}


class SavingsAccount extends BankAccount {
    private double withdrawalLimit;


    public SavingsAccount(String accountHolder, double balance, double withdrawalLimit) {
        super(accountHolder, balance); 
        this.withdrawalLimit = withdrawalLimit;
    }

   
   
    public void withdraw(double amount) {
        if (amount > withdrawalLimit) {
            System.out.println("Withdrawal failed. The amount exceeds the withdrawal limit of $" + withdrawalLimit);
        } else if (amount > getBalance()) {
            System.out.println("Withdrawal failed. Insufficient balance.");
        } else {
            super.withdraw(amount); // Call the withdraw method of BankAccount
        }
    }

      
    public String getAccountDetails() {
        return super.getAccountDetails() + ", Withdrawal Limit: $" + withdrawalLimit;
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Madhuri shirke", 1000);
        System.out.println("BankAccount Details: " + account.getAccountDetails());
        account.deposit(500);
        account.withdraw(300);
        System.out.println("BankAccount Details after operations: " + account.getAccountDetails());
       
        SavingsAccount savingsAccount = new SavingsAccount("Madhuri shirke", 2000, 500);
        System.out.println("\nSavingsAccount Details: " + savingsAccount.getAccountDetails());

        savingsAccount.deposit(800);   
        savingsAccount.withdraw(600);   
        savingsAccount.withdraw(400);   
        System.out.println("SavingsAccount Details after operations: " + savingsAccount.getAccountDetails());
    }
}