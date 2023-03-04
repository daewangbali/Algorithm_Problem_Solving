package baekjoon;
import java.io.*;
import java.util.*;

public class Main9613 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st ;
	static StringBuilder sb = new StringBuilder();
	static int encd(int bn, int sn) {
		int r = bn % sn;
		if(r == 0) {
			return sn;
		}else {
			return encd(sn, r);
		}
	}
	public static void main(String[] args) throws IOException{
		int t = Integer.parseInt(br.readLine());
		while(t --> 0) {
			Long G = 0L;
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int[] narray = new int[n];
			//gcd�� ���ؾ� �ϴ� ��°��� �̱� ���� ���� �迭�� ���
			for(int i=0 ; i<n ; i++) {
				narray[i] = Integer.parseInt(st.nextToken());
			}
			//�迭�� ���� �Է°��� 2���� �̾� ������ GDC�� ���� �����ش�.
			for(int i=0 ; i<n-1 ; i++) {
				for(int j=i+1 ; j<n ; j++) {
					if(narray[i] > narray[j]) {
						G += encd(narray[i], narray[j]);
					}else {
						G += encd(narray[j], narray[i]);
					}
				}
			}
			sb.append(G).append("\n");
		}
		
		System.out.println(sb.toString());
	}
}
