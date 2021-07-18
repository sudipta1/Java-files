class Users{
	
	 void login(String user,int pass){
		if(user=="sudipta"&& pass==1234){
		System.out.println("Login Successful");
		}
        else{
		System.out.println("Wrong Details");
        }		
			
	}
	
	void login(int pass){
		if(pass==5141){
		System.out.println("Login Successful");
		
		}
		else{
			System.out.println("Wrong Otp");
		}
		
	}
}
class LogIn{
	
public static void main(String[] args){
	Users u=new Users();
	u.login("sudipta",1234);
}
}