class Circle{
	float pi=3.14f;
	float r;
	Circle(){
		System.out.println("Circle created");
		r=7.0f;
	}
	void area(){
		float ar=pi*r*r;
		System.out.println("Area is "+ar);
	}
}
class CircleConst{
	public static void main(String[] args){
		Circle c=new Circle();
		c.area();
	}
}
