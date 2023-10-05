package Week05Assignment;

/*
 ***********Problem 3 **********
 */

public class SpacedLogger implements Logger {

/*
 ***********Problem 5a ***********
 */
	@Override
	public void log(String string) {
		StringBuilder log = new StringBuilder();
		for(int i = 0; i < string.length(); i++) {
			log.append(string.charAt(i) + " ");
		}
		System.out.println(log);
	}

	@Override
	public void error(String string) {
		StringBuilder error = new StringBuilder();
		for(int i = 0; i < string.length(); i++) {
			error.append(string.charAt(i) + " ");
		}
		System.out.println("ERROR: " + error);
	}

}
