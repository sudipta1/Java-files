class Banking{
	int bal=0,wthdrw=0,depo=0;
	Banking(int a){
		a=bal;
	}
	void withdraw(){
		bal=bal-wthdrw;
		System.out.println("After withdraw bal is : "+bal);
	}
	void deposit(){
		bal=bal+depo;
		System.out.println("After deposit bal is : "+bal);
	}
}
class Banking1{
	public static void main(String[] args){
		Banking b1=new Banking(10000);
		b1.wthdrw=4000;
		b1.withdraw();
		b1.depo=12000;
		b1.deposit();
	}
}