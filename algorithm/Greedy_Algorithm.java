package algorithm;

public class Greedy_Algorithm {
	public static void main(String[] args) {
		int money = 1260;
		int countCoin = 0;
		int[] coins = {500, 100, 50, 10};
		
		for(int i=0 ; i<coins.length ; i++) {
			countCoin = countCoin + money / coins[i];
			money %= coins[i];
		}
		
		System.out.println(countCoin);
	}
}
