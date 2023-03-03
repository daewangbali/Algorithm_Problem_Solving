package baekjoon;
import java.io.*;

public class Main2231 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		
		int num = 1;
		while(num < N) {
			int n = num;
			int sum = n;
			while(n != 0) {
				sum += n % 10;
				n = n / 10;
			}
			if(sum == N) {
				System.out.println(num);
				return;
			}else{
				num++;
			}
		}
		System.out.println(0);
		
	}
}
