interface RastraBank{
	double interestRate();
}
class PrabhuBank implements RastraBank{
	public double interestRate(){
		return 8.5;
	}
	
}
class SBIBank implements RastraBank{
	public double interestRate(){
		return 10.5;
		
	}
}
class BankOperation1{
	public static void main(String... args){
      SBIBank p1 = new SBIBank();
	  System.out.println("SBI Interest Rate: "+p1.interestRate());
	  PrabhuBank p2 = new PrabhuBank();
	  System.out.println("Prabhu Bank Interest Rate: "+p2.interestRate());
	}
}