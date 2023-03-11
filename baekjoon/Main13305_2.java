package baekjoon;
import java.io.*;
import java.util.*;

public class Main13305_2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws NumberFormatException, IOException {
		int N = Integer.parseInt(br.readLine());
		int[] road = new int[N-1];
		int[] price = new int[N];
		long total = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N-1 ; i++) {
			road[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N ; i++) {
			price[i] = Integer.parseInt(st.nextToken());
		}
		
		long minPrice = price[0];
		
		for(int i=0 ; i<N-1 ; i++) {
			/*
			 *  현재 주유소가 이전 주유소의 기름값보다 쌀 경우
			 *  minPrice를 갱신해준다. 
			 */
			if(price[i] < minPrice) {				
				minPrice = price[i];
			}
			
			total += (minPrice * road[i]);
			
		}
		System.out.println(total);
	}
}
