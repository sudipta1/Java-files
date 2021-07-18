class Banking{
int bal,w_amt,d_amt;
void withdraw(){
	bal=bal-w_amt;
	System.out.println(bal);
}
void deposit(){
	bal=bal+d_amt;
	System.out.println(bal);
}
}
class Banking0{
	public static void main(String[] args){
	Banking b=new Banking();
	b.bal=10000;
	b.w_amt=5000;
	b.d_amt=12000;
	b.withdraw();
	b.deposit();
	}
}