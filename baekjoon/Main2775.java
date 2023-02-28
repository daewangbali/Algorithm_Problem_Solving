package baekjoon;
import java.io.*;

public class Main2775 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException {
		int T = Integer.parseInt(br.readLine());
		int[][] sumarr = new int[15][15];
		for(int i=0;i<15;i++) {
			sumarr[0][i] = i;
			sumarr[i][1] = 1;
		}
		for(int i=1;i<=14;i++) {
			for(int j=2;j<=14;j++) {
				sumarr[i][j] = sumarr[i][j-1] + sumarr[i-1][j];
			}
		}
		for(int tc= 1;tc<=T;tc++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			System.out.println(sumarr[k][n]);	
		}
	}
}
