package baekjoon;
import java.io.*;

public class Main2839 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException {
		int tc = Integer.parseInt(br.readLine());
		int[] fiveArr = {0,0,-1,1,0};
		int[] threeArr = {0,2,4,1,3};
		if(tc == 4 || tc == 7) {
			System.out.println("-1");
		}else if(tc % 5 == 0){
			System.out.println(tc / 5);
		}else  {
			int mok = tc/5;
			fiveArr[tc%5] += mok-1;
			System.out.println(fiveArr[tc%5]+threeArr[tc%5]);
		}
	}
}
