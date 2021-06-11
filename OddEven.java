import java.util.Scanner;

class OddEven{
	
	public static void main(String[] args){
		
	Scanner cn=new Scanner(System.in);
	System.out.print("Enter the number : ");
	int m = cn.nextInt();
	if (m%2==0)
		{
		System.out.println("The number is Even");
		}
	else
		{
		System.out.println("The number is Odd");
		}
	
	}
}