
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int[] array = new int [9];
    	int high = 0;
    	for(int i = 0; i<9; i++) {
    		array[i] = sc.nextInt();
    	}
			high = array[0];
			int num;
			int hihi = 0;
    	for(num =1; num<9; num++) {
    		if(array[num]>high) {
    			high = array[num];
    			hihi = num;
    		}
    	}
    	System.out.println(high);
    	System.out.println(hihi+1);
    }
}