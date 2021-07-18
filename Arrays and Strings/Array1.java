class Array1{
public static void main(String[] args){
int[][] data= new int[3][3];

data[0][0]=1;
data[0][1]=4;
data[0][2]=6;

data[1][0]=7;
data[1][1]=8;
data[1][2]=9;

data[2][0]=5;
data[2][1]=3;
data[2][2]=1;

for(int i=0;i<=2;i++)
{
	for(int j=0;j<=2;j++)
	{
		System.out.print(data[j][i]+" ");
	}
	System.out.println();
}
}
}