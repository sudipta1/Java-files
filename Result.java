package org.result;

public class Result{
	public void marks(int m1,int m2,int m3,int m4,int m5){
		int total=m1+m2+m3+m4+m5;
		float avg=(m1+m2+m3+m4+m5)/5;
		System.out.println("Total is : "+total);
		System.out.println("Average is : "+avg);
	}

}