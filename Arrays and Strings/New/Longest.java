import java.util.Scanner;
class Longest{
public static void main(String[] args){
Scanner cn=new Scanner(System.in);
System.out.println("Enter 2 strings : ");
String a=cn.nextLine();
String b=cn.nextLine();
int x=a.length();
int y=b.length();
if(x>y)
{
	System.out.println("Longest string is : "+a);
}
else
{
	System.out.println("Longest string is : "+b);
}
}
}