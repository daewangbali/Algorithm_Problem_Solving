package baekjoon;

import java.util.ArrayList;

public class SieveOfEratosthenes {
	static boolean prime[] = new boolean[10001];
	static ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		//구하고자 하는 숫자 범위 N
		int N = 10000;
		
		//소수는 false
		//1은 소수가 아니므로 제외
		prime[0] = prime[1] = true;
		
		for(int i=2; i*i<=N; i++) {
			//prime[i]가 소수가 아니라면
			if(!prime[i]) {
				for(int j=i*i; j<=N; j+=i) {
					prime[j] = true;
				}
			}
		}
		//소수 출력
		for(int i=1;i<=N;i++) {
			if(!prime[i]) {
				primeNumbers.add(i);
			}
		}
		//소수 개수
		System.out.println(primeNumbers.size());
		//수소 확인
		for(int i=1;i<=10;i++) {
			System.out.println(primeNumbers.get(i));
		}
	}

}
