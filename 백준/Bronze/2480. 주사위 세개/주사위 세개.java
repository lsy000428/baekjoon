import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	java.util.Scanner sc = new Scanner(System.in);
	
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int a1 = 0;
	if(a==b&&b==c) {
		a1 = 10000+(a*1000);
	}
	else if(a==b&&a!=c) {
		a1 = 1000+(b*100);
	}
	else if(b==c&&b!=a) {
		a1 = 1000+(b*100);
	}
	else if(a==c&&a!=b) {
		a1 = 1000+(a*100);
	}
	else if(a!=b&&b!=c&&a!=c) {
		if(a>b) {
			if(a>c) {
				a1 = 100*a;
			}
			else if(a<c) {
				a1 = 100*c;
			}
		}
		else if (a<b) {
			if(b>c) {
				a1 = 100*b;
			}
			else if(b<c) {
				a1 = 100*c;
			}
		}
			
	}
	System.out.println(a1);
	
}
}	