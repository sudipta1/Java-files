import java.util.Scanner;

class Variable{
	public static void main(String[] args){
	Scanner cn=new Scanner(System.in);
	System.out.println("Enter the value of a :");
	int a=cn.nextInt();
	System.out.println("Enter the value of b :");
	int b=cn.nextInt();
	int c=((a*a)+(b*b));
	System.out.println("a^2 + b^2 = " +c);
	
	
	}
}