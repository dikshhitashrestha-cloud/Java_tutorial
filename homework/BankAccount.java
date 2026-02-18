class BankAccount {

    int accountNumber;
    double balance;

    // Constructor to initialize account details
    BankAccount(int accNo, double bal) {
        accountNumber = accNo;
        balance = bal;
    }
	public void display(){
        System.out.println("Total Balance: " + balance);
	}

    // Non-static method to deposit money
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited Amount: " + amount);
        System.out.println("Updated Balance: " + balance);
    }

    // Static method to display bank rules
    static void bankRules() {
        System.out.println("Bank Rules:");
        System.out.println("1. Minimum balance must be maintained.");
        System.out.println("2. Interest is calculated yearly.");
    }

    public static void main(String[] args) {

        // Calling static method
        BankAccount.bankRules();

        // Creating object of BankAccount
        BankAccount account = new BankAccount(101234, 5000);

        // Calling non-static method
		account.display();
        account.deposit(2000);
    }
}
