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
			��ó�� �ص� ������ 100 ���϶�� �ݺ��� �����ʿ� ���� �� ���ڰ� count ���� �����ϴ�
			ex) 81������� count�� 81�̴� ���� �ݺ����� ���� �ʿ䰡 ����! 
		*/
		else {
			count = 99;//���� ���� �̻� 100�̻��� ���̱� ������ count�� 99�� �ʱ�ȭ
			//���� �ڸ����� �������� �����⸦ ����Ͽ� ���� �� �ڸ����� ���� ���� ������ count++ �����ش�!
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
