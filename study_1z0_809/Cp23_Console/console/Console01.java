package com.wealth.certificate.study_1z0_809.chapter23.console;

import java.io.Console;
import java.util.Arrays;

public class Console01 {
	public static void main(String[] args) {
		Console console = System.console();
		// Check if the console is available
		if (console != null) {
			console.writer().println("Enter your user and password");
			String user = console.readLine("Enter user: ");
			// readPassword() hides what the user is typing
			char[] pass = console.readPassword("Password: ");
			// Clear password from memory by overwriting it
			Arrays.fill(pass, 'x');
		}
	}
}
