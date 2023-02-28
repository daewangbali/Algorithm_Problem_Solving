package baekjoon;

import java.util.ArrayList;

public class SieveOfEratosthenes {
	static boolean prime[] = new boolean[10001];
	static ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		//���ϰ��� �ϴ� ���� ���� N
		int N = 10000;
		
		//�Ҽ��� false
		//1�� �Ҽ��� �ƴϹǷ� ����
		prime[0] = prime[1] = true;
		
		for(int i=2; i*i<=N; i++) {
			//prime[i]�� �Ҽ��� �ƴ϶��
			if(!prime[i]) {
				for(int j=i*i; j<=N; j+=i) {
					prime[j] = true;
				}
			}
		}
		//�Ҽ� ���
		for(int i=1;i<=N;i++) {
			if(!prime[i]) {
				primeNumbers.add(i);
			}
		}
		//�Ҽ� ����
		System.out.println(primeNumbers.size());
		//���� Ȯ��
		for(int i=1;i<=10;i++) {
			System.out.println(primeNumbers.get(i));
		}
	}

}
