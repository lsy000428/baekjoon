
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt(); //개수
    	int X = sc.nextInt(); //기준 변수
    	
    	int[] array = new int [N];
    	
    	for(int i = 0; i<N; i++) {
    		array[i] = sc.nextInt();
    	}
    	
    	for(int i =0; i<N; i++) {
    		if(array[i]<X) {
    			System.out.print(array[i]+" ");
    		}
    	}
    	


    }
}