import java.util.Scanner;
public class Main {

	public static void main(String[] args)  {
	java.util.Scanner sc = new Scanner(System.in);
	
	int a = sc.nextInt();
	int i = 0;
	int sum = 0;
	while(i<=a) {
		sum = sum+i;
		i++;
	}
	System.out.println(sum);
	
	
	
	}
}