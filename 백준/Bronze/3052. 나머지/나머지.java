import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		HashSet<Integer> h = new HashSet<Integer>(); //Int형의 HashSet 생성
		
		for(int i =0;i<10;i++ ) {
			h.add(Integer.parseInt(bf.readLine())%42);
		}
		System.out.println(h.size());
		

	}

}