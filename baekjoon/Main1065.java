package baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1065 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException {
		int N = Integer.parseInt(br.readLine());
		int result = arithmetic_sequence(N);
		System.out.println(result);
				
	}
	
	public static int arithmetic_sequence(int N) {
		int count = 0;
		if(N<100) {
			return N;
		}
		/*
			if(x<100)
				count++;
			위처럼 해도 되지만 100 이하라면 반복문 돌릴필요 없이 그 숫자가 count 수랑 동일하다
			ex) 81까지라면 count도 81이니 굳이 반복문을 돌릴 필요가 없다! 
		*/
		else {
			count = 99;//여기 들어온 이상 100이상의 수이기 때문에 count를 99로 초기화
			//이후 자리수를 나머지와 나누기를 사용하여 구한 후 자리수의 차를 비교해 같으면 count++ 시켜준다!
			for(int i=100;i<=N;i++) {
				int han = i / 100;
				int mi = (i / 10) % 10;
				int one = i % 10;
				if((han-mi)==(mi-one)) {
					count++;
				}
			}
		}
		return count;
	}
	
}
