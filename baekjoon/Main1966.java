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
				// {초기 위치, 중요도}
				q.offer(new int[] { j, Integer.parseInt(st.nextToken()) });

			}

			int count = 0; // 출력 횟수

			while (!q.isEmpty()) { // 한 케이스에 대한 반복문
				int[] front = q.poll(); // 가장 첫 원소
				boolean isMax = true; // front 원소가 가장 큰 원소인지를 판단하는 변수

				// 큐에 남아있는 원소들과 중요도를 비교
				for (int k = 0; k < q.size(); k++) {

					// 처음 뽑은 원소보다 큐에 있는 i번째 원소가 중요도가 클 경우
					if (front[1] < q.get(k)[1]) {

						// 뽑은 원소 및 i 이전의 원소들을 뒤로 보낸다.
						q.offer(front);
						for (int p = 0; p < k; p++) {
							q.offer(q.poll());
						}

						// fornt 원소가 가장 큰 원소가 아니였으므로 false를 반환하고 탐색을 마침
						isMax = false;
						break;
					}
				}

				// front 원소가 가장 큰 원소가 아니였으므로 다음 반복문으로 넘어감
				if (isMax == false) {
					continue;
				}

				// front 원소가 가장 큰 원소였으므오 해당 원소는 출력해야하는 문서다.
				count++;
				if (front[0] == M) { // 찾고자 하는 문서라면 해당 테스트케이스 종료
					break;
				}
			}
			sb.append(count).append('\n');
		}
		System.out.println(sb.toString());

	}
}
