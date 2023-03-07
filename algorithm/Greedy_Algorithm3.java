package algorithm;
import java.io.*;

public class Greedy_Algorithm3 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		String s = br.readLine();
		// 첫 번째 문자를 숫자로 변경하여 대입
		long result = s.charAt(0) - '0';
		for(int i=1 ; i<s.length() ; i++) {
			// 두 수 중에서 하나라도 '0' 혹은 '1'인 경우, 곱하기보다는 더하기 수행
			int num = s.charAt(i)- '0';
			if(result <= 1 || num <= 1) {
				result += num; 
			}else {
				result *= num;
			}
		}
		System.out.println(result);
	}
}
