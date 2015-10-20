
public class HelloUser {
	private String username;
	
	HelloUser(String name){
		this.username=name;
	}
	public void greetUser(){
		System.out.println("Hello "+username+"!");
	}

}
