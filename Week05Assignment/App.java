package Week05Assignment;

public class App {

	public static void main(String[] args) {
		
/*
 ********Problem 6 *************
 */
		Logger asteriskLogger = new AsteriskLogger();
		Logger spacedLogger = new SpacedLogger();
		
		asteriskLogger.log("Fall is here!");
		asteriskLogger.error("It is chilly!");
		System.out.println("------------------");
		spacedLogger.log("Space is good.");
		spacedLogger.error("TOO MUCH SPACE!");
	}

}
