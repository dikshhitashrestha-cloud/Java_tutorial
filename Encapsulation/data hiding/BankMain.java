class Customer{
	private String name;
	private int account_no;
	private double balance;
	public Customer(String name, int account_no, double balance){
		this.name=name;
		this.account_no=account_no;
		this.balance=balance;
	}
	public String getName(){
		return this.name;
	}
	public int getAccount_no(){
		return this.account_no;
	}
	public double getBalance(){
		return this.balance;
	}
	
	public void setName(String name){
		this.name=name;
	}
	public void setAccount_no(int account_no){
		this.account_no=account_no;
	}
	public void setBalance(double balance){
		this.balance=balance;
	}
	public void display(){
		System.out.println("Customer Name: "+this.name);
		System.out.println("Customer Account Number: "+this.account_no);
	    System.out.println("Customer Balance: "+this.balance);
		System.out.println("----------------------------------");
	}
	public void deposite(int acc_no, double amount){
		if(this.account_no==acc_no){
			this.balance=this.balance+amount;
			System.out.println("Balance deposited successfully");
			System.out.println("After deposited Balance: "+this.getBalance());
		}
		else{
			System.out.println("Invalid Account number!! please enter valid account number..");
		}	
	}
	public void withdraw(int acc_no, double amount){
		if(this.account_no==acc_no){
			if(amount<=this.balance){
				this.balance=this.balance-amount;
				System.out.println("Balance Withdrawed successfully");
				System.out.println("After Withdraw Balance: "+this.getBalance());
			}
			else{
				System.out.println("Insufficient Funds!!!");
			}
		}
		else{
			System.out.println("Invalid Account number!! please enter valid account number..");
		}	
	}
}
class BankMain{
	public static void main(String... args){
		Customer c1=new Customer("Bishal Patel",123456,5000);
		c1.display();
		c1.deposite(123456,50000);
		c1.withdraw(123456,40000);
		
		
	}
}