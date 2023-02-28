package baekjoon;
import java.io.*;
import java.util.ArrayList;

public class Main2518 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException {
		int start = Integer.parseInt(br.readLine());
		int end = Integer.parseInt(br.readLine());
		boolean[] primeNumbers = new boolean[end+1];
		ArrayList<Integer> primes = new ArrayList<Integer>();
		
		primeNumbers[0] = primeNumbers[1] = true;
		
		for(int i=2; i*i<=end; i++) {
			if(!primeNumbers[i]) {
				for(int j=i*i; j<=end; j+=i) {
					primeNumbers[j] = true;
				}
			}
		}
		int primeSum = 0;
		for(int i=start;i<=end;i++) {
			if(!primeNumbers[i]) {
				primes.add(i);
				primeSum += i;
			}
		}
		if(primeSum==0) {
			System.out.println("-1");
		}else{
			System.out.println(primeSum);
			System.out.println(primes.get(0));
		}
	}
}


