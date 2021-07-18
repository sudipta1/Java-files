class FindArea{
	
	double area(double r){
		System.out.println("Area of Circle is : ");
		float PI=3.14f;
		double ar=PI*r*r;
		return ar;
	}
	
	int area(int a){
		System.out.println("Area of Square is : ");
		int ar=a*a;
		return ar;
	}
	
	int area(int l,int b){
		System.out.println("Area of Rectangle is : ");
		int ar=l*b;
		return ar;
	}
	
	float area(float a){
		System.out.println("Area of Triangle is : ");
		float ar=0.43f*a*a;
		return ar;
	}
}
class AreaAll{
	public static void main(String[] args){
		FindArea fa=new FindArea();
		System.out.println(fa.area(2.0));
	}
}