package main;

/**
 * 
 * Initializes the program and generates the main window.
 * 
 * @authors
 * Alan T
 * Christopher H
 * Name
 * Name
 * Name
 *
 */
public class Main {
	
	public static final String VERSION = "v0.1";
	
	private static String user = "unregistered";
	
	public static String getUser() {
		return user;
	}
	
	public static void setUser(String newUser) {
		user = newUser;
	}
	
	public static void main(String[] args) {
		new MainWindow(800, 600);
	}
}
