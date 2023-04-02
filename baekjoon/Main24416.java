package baekjoon;
import java.io.*;

public class Main24416 {
	static int fib(int n) {
		if(n == 1 || n == 2) {
			count++;
			return 1;
		}
		else {
			return (fib(n-1) + fib(n -2));
		}
	}
	static int fibonacci(int n) {
		f[1] = f[2] = 1;
		for(int i=3 ; i<=n ; i++) {
			dpcount++;
			f[i] = f[i-1] + f[i - 2];
		}
		return f[n];
	}
	
	static int[] f = new int[41];
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static int count = 0;
	static int dpcount = 0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(br.readLine());
		fib(n);
		fibonacci(n);
		sb.append(count).append(" ").append(dpcount);
		System.out.println(sb.toString());
	}
}
