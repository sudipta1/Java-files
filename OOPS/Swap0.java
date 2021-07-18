import java.util.Scanner;
class Swap{
int a,b;
void swap(){
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("After Swapping "+a+" "+b);
}
}
class Swap0{
	public static void main(String args[]){
		Scanner cn=new Scanner(System.in);
		Swap s=new Swap();
		System.out.println("Enter the numbers : ");
		s.a=cn.nextInt();
		s.b=cn.nextInt();
		s.swap();
	}
}