import java.util.Scanner;
class UserPassword{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter the username and password : ");
      String username=sc.nextLine(); 
	  String password=sc.nextLine(); 
		String x="sudipta";
		String y="sudip123";
		if(x.equals(username))
		{
			if(y.equals(password))
			{
				System.out.println("Logged in Succesfully");
			}
			else
			{
				System.out.println("Wrong password");
			}
		}
		else{
			System.out.println("Incorrect Username");
		}
  }
}