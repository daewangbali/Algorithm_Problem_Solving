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
			//charAt() �� �ش� ������ �ƽ�Ű�ڵ� ���� ��ȯ�ϹǷ� �ݵ�� -48 �Ǵ� -'0' �� ���־�� �츮�� �Է¹��� ���� �� �״�θ� ����� �� �ִ�!
			//���ϰ� ���� �Ϸ��� ���ڿ��� �ƴ� �������̿��� �ϱ� ������ ���ڿ��� ���ڷ� ��������� �Ѵ�. �װ��� "���ڿ�����" -'0' �� ���ָ� �ȴ�.
			sum += num;
			/*
				OR
				String number = br.readLine();���� �����ʰ� 
				�ٷ� sum += br.read() - 48; �̷��� ���ִ� ����� �ִ�
			*/
			 
		}
		System.out.println(sum);
	}
}
