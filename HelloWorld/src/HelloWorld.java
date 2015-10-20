import java.util.Scanner;

/**
 * 
 */

/**
 * @author Tobias
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello ASE2015 - how are you? :)");
		System.out.printf("Please enter your name: ");
		Scanner sc= new Scanner(System.in);
		String name=sc.next();
		HelloUser user= new HelloUser(name);
		user.greetUser();
		sc.close();
		
	}

}
