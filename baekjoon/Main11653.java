package baekjoon;
import java.io.*;

public class Main11653 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException {
		int N = Integer.parseInt(br.readLine());
		int i = 2;
		while(N!=1) {
			if(N % i == 0) {
				System.out.println(i);
				N = N / i;
				i = 2;
			}else {
				i++;
			}
		}
	}
}
