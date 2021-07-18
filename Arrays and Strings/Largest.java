class Largest{
public static void main(String[] args){
	int[] arr={7,9,4,2,1};
	int a=arr[0];
	for(int i=1;i<=arr.length-1;i++)
	{
		if(arr[i]>a)
		{
			a=arr[i];
		}
	}
	System.out.println("Largest number is : "+a);
	
}
}