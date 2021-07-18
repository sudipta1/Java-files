class Employee{
	int id;
	String name;
	int sal;
	int alw;
	void setDetails(int ide,String n,int salary,int allowance){
		id=ide;
		name=n;
		sal=salary;
		alw=allowance;
	}
	void Salary(){
		
		int netsal;
		netsal=sal+alw;
		System.out.println("Salary is : "+netsal);
	}
}
class Marketing extends Employee{
	int inc;
	void setIncentive(int incentive){
		inc=incentive;
	}
	
	void Salary(){
		int netsal;
		netsal=sal+alw+inc;
		System.out.println("Net Salary is : "+netsal);
		super.Salary();
	}
}
class EmployeeDetails{
	public static void main(String[] args){
		Marketing mr=new Marketing();
		mr.setDetails(25469,"Saptarshi",20000,12000);
		mr.setIncentive(2000);
		mr.Salary();
	}
}