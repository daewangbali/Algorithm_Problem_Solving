package baekjoon;

import java.io.*;
import java.util.*;
/*
	�簢���� ���̸� ���϶� ��� �ϸ� �簢���� �����迭�� �ְ� �迭�� ���� �Ҵ����ص� �Ҵ�� ���� ������ ���ϸ� �ȴ�.
 */
public class Main2563 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		int T = Integer.parseInt(br.readLine());
		int[][] arr = new int[101][101];
		int count = 0;
		for(int tc = 0;tc<T;tc++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			for(int i = N;i<N+10;i++) {
				for(int j=M;j<M+10;j++) {
					if(arr[i][j] != 1) {
						arr[i][j] = 1;
						count ++;
					}
				}
			}
			/*
			 * for(int i=0;i<arr.length;i++) { for(int j=i;j<arr[i].length;j++) {
			 * if(arr[i][j]==1){ count ++; } } }
			 */
		}
		System.out.println(count);
	}
}
