import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	java.util.Scanner sc = new Scanner(System.in);
	
//	int a = sc.nextInt();
//	int b = sc.nextInt();
	int c = sc.nextInt();
	while(true) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		c--;
		System.out.println(a+b);
		if(c==0) {
			break;
		}
	}
}
}	