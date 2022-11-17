import java.util.Scanner;
public class Main {

	public static void main(String[] args)  {
	java.util.Scanner sc = new Scanner(System.in);
	
	int a = sc.nextInt();
	int b = sc.nextInt();

	int sum = 0;
	int pr = 0;
	while(b>0) {
		b--;
		int c = sc.nextInt();
		int d = sc.nextInt();
		pr = c*d;
		sum = sum + pr;
		pr = 0;
		
	}
	
	if(a==sum) {
		System.out.println("Yes");
	}
	else {
		System.out.println("No");
	}
	
	}
}