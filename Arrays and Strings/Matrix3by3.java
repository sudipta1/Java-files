import java.util.Scanner;

class Matrix3by3{
public static void main(String[] args){
Scanner cn=new Scanner(System.in);
int[][] data = new int[3][3]; 
System.out.println("Enter the input values : ");
for(int x=0;x<=data.length-1;x++)
{
	for(int y=0;y<=data.length-1;y++)
	{
		data[x][y]=cn.nextInt();
	}
}
System.out.println("Matrix = ");
for(int x=0;x<=data.length-1;x++)
{
	for(int y=0;y<=data.length-1;y++)
	{
		System.out.print(data[x][y]+" ");
	}
	System.out.println();
}

}
}