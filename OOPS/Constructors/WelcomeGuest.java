class Welcome{
 Welcome(String n){
	System.out.println("Welcome "+n);
}
 Welcome(){
	
	System.out.println("Welcome guest");
 }
}
class WelcomeGuest{
	public static void main(String[] args){
		Welcome w0=new Welcome();
		Welcome w1=new Welcome("sudipta");
		
	}
}