import java.util.Scanner;

class Division{
	public static void main(String[] args){
	Scanner cn=new Scanner(System.in);
	System.out.print("Enter the number :");
	int m=cn.nextInt();
	int a=m/10;
	System.out.println("Quotient is : "+ a);
	int b=m%10;
	System.out.println("Remainder is : "+ b);
	
	}
}