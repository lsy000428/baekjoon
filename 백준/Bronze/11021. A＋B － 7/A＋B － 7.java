
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	String mun = "Case #";
	String mun2 = ": ";
	String s = br.readLine();
	StringTokenizer st = new StringTokenizer(s);
	int num = Integer.parseInt(st.nextToken());
	int sum = 0;
	int v = 1;
	for(;num>0;num--) {
		String a1 = br.readLine();
		StringTokenizer a2 = new StringTokenizer(a1);
		int ss = Integer.parseInt(a2.nextToken());
		int sq = Integer.parseInt(a2.nextToken());
		sum = ss+sq;
		bw.write(mun);
		bw.write(String.valueOf(v));
		bw.write(mun2);
		bw.write(String.valueOf(sum)+"\n");
		bw.flush();
		v++;
		
	}
	


	bw.close();
	
	}
}