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
			//N이 K로 나누어 떨어지는 수가 될 때까지 빼기
			int target = (N / K) * K;
			count += (N - target);
			N = target;
			//N이 K보다 작을 때 (더 이상 나눌 수 없을 때) 반복문 탈출
			if(N < K) {
				break;
			}
			//K로 나누기
			count++;
			N /= K;	
		}
		//마지막으로 남은 수에 대하여 1씩 빼기
		count += (N - 1);
		System.out.println(count);
	}
}
