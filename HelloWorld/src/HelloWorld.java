import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mohsen
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello ASE2016 - how are you? :)");
		System.out.println("Please enter your name:");
		Scanner console = new Scanner(System.in);
		String userName = console.next();
		HelloUser user = new HelloUser(userName);
		user.greetUser();
	}

}
