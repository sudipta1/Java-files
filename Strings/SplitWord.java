import java.util.Scanner;

class SplitWord{
public static void main(String[] args){
Scanner cn= new Scanner(System.in);
System.out.println("Enter Input");
String str=cn.nextLine();
String[] data=str.split(" ");
for(int i=0;i<=data.length-1;i++)
{
	System.out.println(data[i]);
}
}
}