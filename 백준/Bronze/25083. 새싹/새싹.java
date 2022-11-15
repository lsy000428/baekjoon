import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		java.util.Scanner scanner = new Scanner(System.in);
	String s = "         ,r'\"7\n" + 	// \", \n 이 제어문자다.
				   "r`-_   ,'  ,/\n" + 		// \n 이 제어문자다.
				   " \\. \". L_r'\n" + 		// \\, \", \n 이 제어문자다.
				   "   `~\\/\n" + 			// \\, \n 이 제어문자다.
				   "      |\n" + 			// \n 이 제어문자다.
				   "      |";

	System.out.print(s);
}
}
