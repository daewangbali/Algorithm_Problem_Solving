package baekjoon;
import java.io.*;

public class Main24265 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException {
		long n = Long.parseLong(br.readLine());
		System.out.println(n * (n-1) / 2);
		System.out.println(2);
	}
}
