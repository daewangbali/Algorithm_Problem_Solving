package baekjoon;
import java.io.*;
import java.util.*;

public class Main11399 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st ;
	public static void main(String[] args) throws NumberFormatException, IOException {
		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		int wait = 0; //���������� ���ð� ������
		int sum = 0; //����� ���ð� ����
		for(int i=0 ; i<N ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		for(int p : arr) {
			wait += p;
			sum += wait;
		}
		
		System.out.println(sum);
	}
}
