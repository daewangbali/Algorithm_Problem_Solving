package baekjoon;
import java.io.*;

public class Main1904 {
	static int[] d = new int[1000001];
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(br.readLine());
		d[0] = 0;
		d[1] = 1;
		d[2] = 2;
		
		for(int i=3 ; i<=1000000 ; i++) {
			d[i] = (d[i-1] + d[i-2]) % 15746;
		}

		
		System.out.println(d[n]);
		
	}
}
