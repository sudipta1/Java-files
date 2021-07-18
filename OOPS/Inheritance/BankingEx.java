class CurrentAcc{
	
	int acno;
	String name;
	int bal;
	int deposit;
	int withdraw;
	void setDetails(int ano,String n,int balance){
		
		acno=ano;
		name=n;
		bal=balance;
		System.out.println("Account no "+acno);
		System.out.println("Customer name "+name);
		System.out.println("Account balance "+bal);
	}
	
	void finddeposit(int depo){
		deposit=depo;
		bal=bal+depo;
		System.out.println("After Deposit Bal is "+bal);
	}
	
	void findwithdraw(int wthd){
		withdraw=wthd;
		bal=bal-wthd;
		System.out.println("After Withdrawal Bal is "+bal);
	}
	
}

class SavingAcc extends CurrentAcc{
	
	void simpleinterest(){
		
		float amt=bal*(5f/100f);
		System.out.println("Simple Interest  is "+amt);
	}
}

class BankingEx{
	public static void main(String[] args){
		
		SavingAcc sa=new SavingAcc();
		sa.setDetails(12345,"Sudipta Nayak",20000);
		sa.finddeposit(2000);
		sa.simpleinterest();
	}
}