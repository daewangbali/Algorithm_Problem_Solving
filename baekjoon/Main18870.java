package baekjoon;
import  java.io.*;
import java.util.*;

public class Main18870 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = null;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		int T = Integer.parseInt(br.readLine());
		int[] originArr = new int[T]; // ���� �迭
		int[] sortedArr = new int[T]; // ������ �迭
		HashMap<Integer,Integer> rankMap = new HashMap<Integer,Integer>();
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<T; i++) {
			// ������ �迭�� ���� �迭�� �Է� ���� �־��ش�.
			originArr[i] = sortedArr[i] = Integer.parseInt(st.nextToken());
		}
		
		// ������ �迭�� ���� ������ �������ش�.
		Arrays.sort(sortedArr);
		
		// ���ĵ� �迭�� ��ȸ�ϸ鼭 map�� �־��ش�.
		int rank = 0;
		for(int i=0;i<T;i++) {
			/*
			 * �� �� ���� �ռ� ���Ұ� �̹� ������ �Ű����ٸ�
			 * �ߺ��Ǹ� �ȵǹǷ�, ���Ұ� �ߺ����� ���� ����
			 * map�� ���ҿ� �׿� �����ϴ� ������ �־��ش�.
			 */
			if(!rankMap.containsKey(sortedArr[i])) {
				rankMap.put(sortedArr[i], rank);
				rank++; // map�� �ְ��� ���� ������ ����ų �� �ֵ��� 1�� �����ش�.
			}
		}
		for(int key : originArr) {
			int ranking = rankMap.get(key); // ���� �迭 ����(key)�� ���� value(����)�� �����´�.
			sb.append(ranking).append(" ");
		}
		System.out.println(sb.toString());
	}
}
