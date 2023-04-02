package baekjoon;
import java.io.*;

public class Main24267 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException {
		long n = Integer.parseInt(br.readLine());
		System.out.println((n * (n-1) * (n-2)) / 6);
		System.out.println(3);
	}
}
