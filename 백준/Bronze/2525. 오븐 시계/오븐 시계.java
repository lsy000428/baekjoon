import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	java.util.Scanner sc = new Scanner(System.in);
	
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	
	int min = a*60+b;
	min += c;
	
	int hour = (min/60)%24;
	int mini = min%60;
	System.out.println(hour + " " + mini);
	
}
}