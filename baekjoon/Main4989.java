package baekjoon;
import java.io.*;

public class Main4989 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(br.readLine());
		boolean[] pnum = null;
		//입력 마지막이 0이라고 했으니 0이 아닐 때 반복하도록
		while(n != 0) {
			int count = 0;
			//2n까지 확인할거니까 배열 크기는 2*n+1만큼
			pnum = new boolean[(2*n)+1];
			
			pnum[0] = pnum[1] = true;
			//에라토스테네스의 체로 거르기
			for(int i=2;i<=Math.sqrt(2*n);i++) {
				if(!pnum[i]) {
					for(int j=i*i; j<=2*n; j+=i) {
						pnum[j] = true;
					}
				}
			}
			//소수라면 카운트
			for(int i=n+1;i<=2*n;i++) {
				if(!pnum[i]) {
					count++;
				}
			}
			sb.append(count).append("\n");
			n = Integer.parseInt(br.readLine());
		}
		System.out.println(sb.toString());
	}
}
