package algorithm;
import java.io.*;
import java.util.*;

public class Greedy_Algorithm2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int count = 0;
		while(true) {
			//N�� K�� ������ �������� ���� �� ������ ����
			int target = (N / K) * K;
			count += (N - target);
			N = target;
			//N�� K���� ���� �� (�� �̻� ���� �� ���� ��) �ݺ��� Ż��
			if(N < K) {
				break;
			}
			//K�� ������
			count++;
			N /= K;	
		}
		//���������� ���� ���� ���Ͽ� 1�� ����
		count += (N - 1);
		System.out.println(count);
	}
}
