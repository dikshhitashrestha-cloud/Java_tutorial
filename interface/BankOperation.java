interface RastraBank{
	void interestRate();
}
class PrabhuBank implements RastraBank{
	public void interestRate(){
		double i=8.5;
		System.out.println("Interest Rate: "+i);
	}
	
}
class SBIBank implements RastraBank{
	public void interestRate(){
		double i=10.5;
		System.out.println("Interest Rate: "+i);
	}
}
class BankOperation{
	public static void main(String... args){
      SBIBank p1 = new SBIBank();
	  p1.interestRate();
	  PrabhuBank p2 = new PrabhuBank();
	  p2.interestRate();
	}
}