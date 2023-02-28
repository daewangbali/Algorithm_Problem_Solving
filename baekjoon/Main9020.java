package baekjoon;
import java.io.*;

public class Main9020 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws NumberFormatException, IOException {
		int T = Integer.parseInt(br.readLine());
		boolean[] pnum = new boolean[10001];
		pnum[0] = pnum[1] = true;
		//소수 배열에 넣기
		for(int i=2;i<Math.sqrt(pnum.length);i++) {
			if(!pnum[i]) {
				for(int j=i*i; j<pnum.length; j+=i) {
					pnum[j] = true;
				}
			}
		}
		//T만큼 반복
		for(int tc=1;tc<=T;tc++) {
			int n = Integer.parseInt(br.readLine());
			int a = n/2;
			int b = n/2;
			while(true) {
				if(!pnum[a] && !pnum[b] && a+b == n) {
					sb.append(a).append(" ").append(b).append("\n");
					break;
				}
				a--;
				b++;
			}
		}
		System.out.println(sb.toString());
	}
}
