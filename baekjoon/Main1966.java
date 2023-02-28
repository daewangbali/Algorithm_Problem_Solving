package baekjoon;

import java.io.*;
import java.util.*;

public class Main1966 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = null;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws NumberFormatException, IOException {
		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());

			LinkedList<int[]> q = new LinkedList<int[]>();

			st = new StringTokenizer(br.readLine());

			for (int j = 0; j < N; j++) {
				// {�ʱ� ��ġ, �߿䵵}
				q.offer(new int[] { j, Integer.parseInt(st.nextToken()) });

			}

			int count = 0; // ��� Ƚ��

			while (!q.isEmpty()) { // �� ���̽��� ���� �ݺ���
				int[] front = q.poll(); // ���� ù ����
				boolean isMax = true; // front ���Ұ� ���� ū ���������� �Ǵ��ϴ� ����

				// ť�� �����ִ� ���ҵ�� �߿䵵�� ��
				for (int k = 0; k < q.size(); k++) {

					// ó�� ���� ���Һ��� ť�� �ִ� i��° ���Ұ� �߿䵵�� Ŭ ���
					if (front[1] < q.get(k)[1]) {

						// ���� ���� �� i ������ ���ҵ��� �ڷ� ������.
						q.offer(front);
						for (int p = 0; p < k; p++) {
							q.offer(q.poll());
						}

						// fornt ���Ұ� ���� ū ���Ұ� �ƴϿ����Ƿ� false�� ��ȯ�ϰ� Ž���� ��ħ
						isMax = false;
						break;
					}
				}

				// front ���Ұ� ���� ū ���Ұ� �ƴϿ����Ƿ� ���� �ݺ������� �Ѿ
				if (isMax == false) {
					continue;
				}

				// front ���Ұ� ���� ū ���ҿ����ǿ� �ش� ���Ҵ� ����ؾ��ϴ� ������.
				count++;
				if (front[0] == M) { // ã���� �ϴ� ������� �ش� �׽�Ʈ���̽� ����
					break;
				}
			}
			sb.append(count).append('\n');
		}
		System.out.println(sb.toString());

	}
}
