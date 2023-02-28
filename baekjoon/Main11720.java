package baekjoon;
import java.io.*;
import java.util.*;

public class Main11720 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = null;
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		String number = br.readLine();
		for(int i = 0;i<n;i++) {
			int num = number.charAt(i)-'0';
			//charAt() 은 해당 문자의 아스키코드 값을 반환하므로 반드시 -48 또는 -'0' 을 해주어야 우리가 입력받은 숫자 값 그대로를 사용할 수 있다!
			//더하고 빼고 하려면 문자열이 아닌 숫자형이여야 하기 때문에 문자열을 숫자로 변경해줘야 한다. 그것은 "문자열숫자" -'0' 을 해주면 된다.
			sum += num;
			/*
				OR
				String number = br.readLine();으로 읽지않고 
				바로 sum += br.read() - 48; 이렇게 해주는 방법도 있다
			*/
			 
		}
		System.out.println(sum);
	}
}
