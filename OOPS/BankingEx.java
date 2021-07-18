class Employee{
	int id;
	String name;
	String dept;
	String desig;
	int salary;
	
	void setData(int eid,String na,String dp,String des,int sal){
		
	id=eid;
	name=na;
	dept=dp;
	desig=des;
	salary=sal;
	}

void displayDetails(){
	
	System.out.println("Employee ID : "+id);
	System.out.println("Name : "+name);
	System.out.println("Department : "+dept);
	System.out.println("Designation : "+des);
	System.out.println("Salary : "+salary);
}
}
Class MarketingEmployee extends Employee{
	
	int salesIncentive;
	void setIncentive(int incentive){
		salesIncentive=incentive;
	}
	void calculateTotalSalary(){
		System.out.println("Total : "+(salesIncentive+salary));
	}
}
class ProductionEmployee extends Employee{
	
	int bonus;
	void setBonus(int b){
		bonus=b;
	}
	void calculateTotalSalary(){
		System.out.println("Total : "+(bonus+salary));
	}
}
class EmployeeEx{
	public static void main(String[] args){
		
		MarketingEmployee me=new MarketingEmployee();
		ProductionEmployee pd=new ProductionEmployee();
		me.setData(3216,"Ram","Marketing","Manager",60000);
		me.setIncentive(12000);
		me.displayDetails();
		me.calculateTotalSalary();
	}
}

















