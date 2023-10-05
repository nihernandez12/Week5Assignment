package Week05Assignment;

/*
 ********Problem 3 **********
 */
public class AsteriskLogger implements Logger {
	
	
	
/*
 ********* Problem 4a *********
 */

	@Override
	public void log(String string) {
		System.out.println("*** " + string + " ***");

	}

/*
 *********** Problem 4b **********
 */
	@Override
	public void error(String string) {
		System.out.println("***************************");
		System.out.println("***Error: " + string + "***");
		System.out.println("***************************");

	}

}
