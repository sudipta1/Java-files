abstract class Calculator{
	int a;
	int b;
	void setcalculator(int a1,int b1){
		a=a1;
		b=b1;
	}
	abstract void findSum();
	abstract void findDiff();
	abstract void findProduct();
	abstract void findDiv();
	
}
class CalculatorABC extends Calculator{
	
	void findSum(){
		int sum=a+b;
		System.out.println("Sum is : "+sum);
	}
	void findDiff(){
		int diff=a-b;
		System.out.println("Difference is : "+diff);
	}
	void findProduct(){
		int pro=a*b;
		System.out.println("Product is : "+pro);
	}
	void findDiv(){
		int div=a/b;
		System.out.println("Division is : "+div);
	}
}
class CalculatorNew{
	public static void main(String[] args){
		CalculatorABC cal=new CalculatorABC();
		cal.setcalculator(15,56);
		cal.findSum();
		cal.findDiff();
	}
}