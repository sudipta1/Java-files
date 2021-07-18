import java.util.Scanner;
class Palindrome{
	
public static void main(String[] args){
	Scanner cn=new Scanner(System.in);
	System.out.println("Enter the input : ");
	String str=cn.nextLine();
	String rev="";
	int li=str.length()-1;
	for(int i=li;i>=0;i--)
	{
		char ch=str.charAt(i);
		rev=rev+ch;
	}
	if(str.equals(rev))
	{
		System.out.println("Palindrome");
	}
	else
	{
		System.out.println("Not Palindrome");
	}
}
}
