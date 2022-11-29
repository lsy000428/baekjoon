
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt(); //개수
    	
    	int[] array = new int [N];
    	int low = 0;
    	int high = 0;
    	for(int i = 0; i<N; i++) {
    		array[i] = sc.nextInt();
    	}
			low = array[0];
			high = array[0];
    	for(int i =1; i<N; i++) {
    		if(array[i]<low) {
    			low = array[i];
    		}
    		if(array[i]>high) {
    			high = array[i];
    		}
    	}
    	System.out.print(low+" ");
    	System.out.println(high);
    	


    }
}