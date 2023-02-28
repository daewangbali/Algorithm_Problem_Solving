package baekjoon;
import java.io.*;

public class Main2292 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException {
		int N = Integer.parseInt(br.readLine());
		int count = 1;
		int range = 1;
		while(N>range) {
				range = range + (count * 6);
				count++;
		}
		System.out.println(count);
	}
}
