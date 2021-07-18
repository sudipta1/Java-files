class Bank{
	int acno;
	int amount;
	String name;
	void setDetails(int ano,int amt,String n){
		acno=ano;
		amount=amt;
		name=n;
	}
	
	void FindInterest(){
		float intr=amount*(3.0f/100);
		System.out.println("3.0 % base interest is : "+intr);
	}
}
class ICICI extends Bank{
	
	void FindInterest(){
		float intr=amount*(4.0f/100);
		System.out.println("4.0 % interest for ICICI is : "+intr);
	}
}
class SBI extends Bank{
	void FindInterest(){
		float intr=amount*(4.5f/100);
		System.out.println("4.5 % interest for SBI is : "+intr);
	}
}
class BankEx{
	public static void main(String[] args){
		ICICI ic=new ICICI();
		SBI sb=new SBI();
		ic.setDetails(1234,5000,"Sudipta");
		sb.setDetails(4567,10000,"Sudipta");
		sb.FindInterest();
		ic.FindInterest();
		
	}
}