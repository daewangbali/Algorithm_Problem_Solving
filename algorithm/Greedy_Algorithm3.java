package algorithm;
import java.io.*;

public class Greedy_Algorithm3 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		String s = br.readLine();
		// ù ��° ���ڸ� ���ڷ� �����Ͽ� ����
		long result = s.charAt(0) - '0';
		for(int i=1 ; i<s.length() ; i++) {
			// �� �� �߿��� �ϳ��� '0' Ȥ�� '1'�� ���, ���ϱ⺸�ٴ� ���ϱ� ����
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
