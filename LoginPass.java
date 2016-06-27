import java.io.*;

public class LoginPass{
	public static void main(String[] args) {
		Console cons = System.console();
		String username = cons.readLine("Username: ");
		char[] pass = cons.readPassword("Password: ");
	}
}