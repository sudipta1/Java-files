class Math{
int a,b,c,d;
Math(int x,int y){
	a=x;
	b=y;
}
void quotient(){
	c=a/b;
	System.out.println("Quotient is : "+c);
}
void remainder(){
	d=a%b;
	System.out.println("Remainder is : "+d);
}
}
class Math0{
	public static void main(String[] args){
		Math m=new Math(45,12);
		m.quotient();
		m.remainder();
	}
}