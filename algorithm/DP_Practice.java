package algorithm;
import java.io.*;
import java.util.*;

public class DP_Practice {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	// �ռ� ���� ����� �����ϱ� ���� DP ���̺� �ʱ�ȭ 
    public static int[] d = new int[100];
	public static void main(String[] args) throws NumberFormatException, IOException {
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int [N];
		st = new StringTokenizer(br.readLine());
		for(int i=0 ; i<N ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());;
		}
		
		int[][] sarr = new int[N][N];
		for(int i=0 ; i<N ; i++) {
			
		}
		// ���̳��� ���α׷���(Dynamic Programming) ����(���Ҿ�)
        d[0] = arr[0];
        d[1] = Math.max(arr[0], arr[1]);
        for (int i = 2; i < N; i++) {
            d[i] = Math.max(d[i - 1], d[i - 2] + arr[i]);
        }

        // ���� ��� ���
        System.out.println(d[N - 1]);
		
	}
}
