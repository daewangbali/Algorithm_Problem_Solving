package baekjoon;

public class Main4673 {
	public static int d(int n) {
		int sum = n;
		while(n != 0) {
			sum += n%10;
			n = n/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		int[] arr = new int[10001];
		for(int i=0;i<10000;i++) {
			int num = d(i);
			if(num<=10000)
				arr[num] = 1;
		}
		for(int i=0;i<10000;i++) {
			if(arr[i] != 1) {
				System.out.println(i);
			}
		}
	}
}
