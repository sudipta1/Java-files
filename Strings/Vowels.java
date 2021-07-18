import java.util.Scanner;
class Vowels{
public static void main(String[] args){
Scanner cn=new Scanner(System.in);
	System.out.println("Enter the input : ");
	String str=cn.nextLine();
	String str2="";
	int li=str.length()-1;
	for(int i=0;i<=li;i++)
	{
		char ch=str.charAt(i);
		if(ch=='A'|| ch=='E'|| ch=='I'|| ch=='O' || ch=='U')
		{
			continue;
		}
		else
		{
			str2=str2+ch;
		}
	}
	System.out.println(str2);
	
}
}