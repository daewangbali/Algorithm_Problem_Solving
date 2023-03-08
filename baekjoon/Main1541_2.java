package baekjoon;
import java.io.*;

public class Main1541_2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int result = Integer.MAX_VALUE; // 초기 상태 여부 확인을 위한 값으로 설정 
		String[] st = br.readLine().split("-");
		
		for(int i=0 ; i<st.length ; i++) {
			int num = 0;
			String[] st2 = st[i].split("\\+");
			
			for(int j=0 ; j<st2.length ; j++) {
				num += Integer.parseInt(st2[j]);
			}

			if (result == Integer.MAX_VALUE) {
				result = num;
			} else {
				result -= num;
			}
		}
		
		System.out.println(result);
	}
}
