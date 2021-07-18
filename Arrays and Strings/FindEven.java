import java.util.Scanner;

class FindEven{
public static void main(String[] args){
Scanner cn=new Scanner(System.in);
int[] num=new int[9];
System.out.println("Enter the numbers : ");

for(int x=0;x<=num.length-1;x++)
{
	num[x]=cn.nextInt();
}
System.out.println("Your even numbers are : ");
for(int x=0;x<=num.length-1;x++)
{
	if(num[x]%2==0)
	{
		System.out.println(num[x]);
	}
}

}

}