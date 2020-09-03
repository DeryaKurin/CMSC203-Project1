import java.util.Scanner;

public class WiFiDriver {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	    
		//Documentation for JavaDoc program: on the command line use " javadoc SourceFile.java "
		
		/**
		 * Create an instance of WiFi class
		 */
		Wifi userSession = new Wifi();	
		
		System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.\n");
		
		/**
		 * Create a user session with a while loop to iterate five of the steps
		 */
		while(userSession.getIsFixed() == false) {
			
			Wifi.checkIfFixed("First step: Reboot the computer and try to connect");
			Wifi.checkUser();
			userSession.setIsFixed(input.nextLine());
			Wifi.checkIfFixed("Second step: Reboot the router and try to connect");
			Wifi.checkUser();
			userSession.setIsFixed(input.nextLine());
			Wifi.checkIfFixed("Third step: Make sure the cables connecting the router are firmly plugged in and \npower is getting to the router");
			Wifi.checkUser();
			userSession.setIsFixed(input.nextLine());
			Wifi.checkIfFixed("Fourth step: Move the computer closer to the router and try to connect");
			Wifi.checkUser();
			userSession.setIsFixed(input.nextLine());
			Wifi.checkIfFixed("Fifth step: Contact your ISP\nMake sure your ISP is hooked up to your router.");
	        System.exit(0);
	        
		}
	}

}

/**
 * WiFi class for holding the program's behavior regarding WiFi issues in one place
 */
class Wifi {
    // isFixed to keep track of the user response
	static boolean isFixed;
	
	public Wifi() {
		
	}
	
	public boolean getIsFixed() {
		return isFixed;
	}
	
	
	public void setIsFixed(String response) {
		if(response.equalsIgnoreCase("yes")) {
			isFixed = true;
		} else {
			isFixed = false;
		} 
	}

	// Prompt user if the issue is fixed
	public static void checkUser() {	
        System.out.println("Did that fix the problem? (Type Yes or No)");
	}
	
	// Evaluates the state of isFixed and exit the program if it is fixed or prompt the next fixing step if not
	public static void checkIfFixed(String nextStep) {
		if(isFixed == true) {
			System.out.println("Checking the router's cables seemed to work");
			System.exit(0);
		} else {
			System.out.println(nextStep);
	        
		}
	}
}

