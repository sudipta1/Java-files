class Gold{
	
	String name;
	void member(String n){
		name=n;
		if(name=="Gold"){
			System.out.println("You can Accress Waiting Room");
		}
		else{
			System.out.println("Access Denied");
		}
	}
}
class Platinum extends Gold{
	
	void member(String n){
		if(name=="Platinum"){
			System.out.println("And Lounge Facilities also");
		}
		else{
			System.out.println("Access Denied");
		}
	}
	
}
class Airport{
	
	public static void main(String[] args){
		
		Platinum p=new Platinum();
		p.member("Gold");
		
	}
}