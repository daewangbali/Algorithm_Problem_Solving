package baekjoon;
import java.io.*;

public class Main4989 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(br.readLine());
		boolean[] pnum = null;
		//�Է� �������� 0�̶�� ������ 0�� �ƴ� �� �ݺ��ϵ���
		while(n != 0) {
			int count = 0;
			//2n���� Ȯ���ҰŴϱ� �迭 ũ��� 2*n+1��ŭ
			pnum = new boolean[(2*n)+1];
			
			pnum[0] = pnum[1] = true;
			//�����佺�׳׽��� ü�� �Ÿ���
			for(int i=2;i<=Math.sqrt(2*n);i++) {
				if(!pnum[i]) {
					for(int j=i*i; j<=2*n; j+=i) {
						pnum[j] = true;
					}
				}
			}
			//�Ҽ���� ī��Ʈ
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
