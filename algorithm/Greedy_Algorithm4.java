package algorithm;
import java.io.*;
import java.util.*;

public class Greedy_Algorithm4 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws NumberFormatException, IOException {
		int N = Integer.parseInt(br.readLine());
		int[] adventurers = new int[N];
		int count = 0; //현재 그룹에 포함된 모험가의 수
		int result = 0;	//출력할 총 그룹의 수	
		st = new StringTokenizer(br.readLine());
		for(int i=0 ; i<N ; i++) {
			adventurers[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(adventurers);
		for(int level : adventurers) { //공포도를 낮은 것부터 하나씩 확인하며
			count++; //현재 그룹에 해당 모험가를 모함시키기
			if(count >= level) { //현재 그룹에 포함된 모험가의 수가 현재의 공포도 이상이라면, 그룹 결성
				result++; //총 그룹의 수 증가시키기
				count = 0; //현재 그룹에 포함된 모험가의 수 초기화
			}
		}
		
		System.out.println(result);
	}
}
