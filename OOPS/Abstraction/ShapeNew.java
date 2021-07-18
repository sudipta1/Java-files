abstract class Shape{
	int length;
	int breadth;
	void rectangle(int l,int b){
		length=l;
		breadth=b;
	}
	double side;
	void trangle(double s){
		side=s;
	}
	float radius;
	void circle(float r){
		radius=r;
	}
	abstract void printArea1();
	abstract void printArea2();
	abstract void printArea3();
}
class findArea extends Shape{
	
	void printArea1(){
		int area1=length*breadth;
		System.out.println("Area of Rectangle : "+area1);
	}
	void printArea2(){
		double area2=0.433*(side*side);
		System.out.println("Area of Triangle : "+area2);
	}
	void printArea3(){
		double area3= 3.143*(radius*radius);
		System.out.println("Area of Circle : "+area3);
	}
}
class ShapeNew{
	public static void main(String[] args){
		findArea ar=new findArea();
		ar.rectangle(10,12);
		ar.printArea1();
	}
}