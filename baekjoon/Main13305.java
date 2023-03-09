package baekjoon;
import java.io.*;
import java.util.*;

public class Main13305 {
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
		
		long sum = road[0];
		long p = price[0];
		
		for(int i=1 ; i<N ; i++) {
			
			if(i == N-1) {
				total += (p * sum);
			}else if( p < price[i]) { //���� ������ ���� ���ݺ��� �� �����ϴٸ� ������ ���̸� ������
				sum += road[i];
			}else {//���� ������ �� �����ϴٸ� ������� ���� ������� �� ���� ü����
				total += (p * sum);
				sum = road[i];
				p = price[i];
				
			}
		}
		System.out.println(total);
	}
}
