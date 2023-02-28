package baekjoon;
import  java.io.*;
import java.util.*;

public class Main18870 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = null;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		int T = Integer.parseInt(br.readLine());
		int[] originArr = new int[T]; // 원본 배열
		int[] sortedArr = new int[T]; // 정렬할 배열
		HashMap<Integer,Integer> rankMap = new HashMap<Integer,Integer>();
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<T; i++) {
			// 정렬할 배열과 원본 배열에 입력 값을 넣어준다.
			originArr[i] = sortedArr[i] = Integer.parseInt(st.nextToken());
		}
		
		// 정렬한 배열에 대해 정렬을 수행해준다.
		Arrays.sort(sortedArr);
		
		// 정렬된 배열을 순회하면서 map에 넣어준다.
		int rank = 0;
		for(int i=0;i<T;i++) {
			/*
			 * 이 때 만약 앞선 원소가 이미 순위가 매겨졌다면
			 * 중복되면 안되므로, 원소가 중복되지 않을 때만
			 * map에 원소와 그에 대응하는 순위를 넣어준다.
			 */
			if(!rankMap.containsKey(sortedArr[i])) {
				rankMap.put(sortedArr[i], rank);
				rank++; // map에 넣고나면 다음 순위를 가리킬 수 있도록 1을 더해준다.
			}
		}
		for(int key : originArr) {
			int ranking = rankMap.get(key); // 원본 배열 원소(key)에 대한 value(순위)를 가져온다.
			sb.append(ranking).append(" ");
		}
		System.out.println(sb.toString());
	}
}
