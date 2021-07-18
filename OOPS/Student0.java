class Student{
int marks,n;
void total(){
	System.out.println("Total : "+marks);
}
void average(){
	int avg=marks/n;
	System.out.println("Average : "+avg);
}
}
class Student0{
	public static void main(String[] args){
		Student s=new Student();
		s.marks=512;
		s.n=6;
		s.total();
		s.average();
		}
}