
class SumAvg{

public static void main(String[] args){
	int[] array={1,4,5,3,2};
	int avg;
	int sum=0;
	for(int x=0;x<=array.length-1;x++)
	{
		sum=sum+array[x];
		
	}
	System.out.println("Sum = "+sum);
	avg = sum/array.length;
	System.out.println("Average = "+avg);
	
}
}