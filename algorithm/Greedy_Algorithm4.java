package algorithm;
import java.io.*;
import java.util.*;

public class Greedy_Algorithm4 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws NumberFormatException, IOException {
		int N = Integer.parseInt(br.readLine());
		int[] adventurers = new int[N];
		int count = 0; //���� �׷쿡 ���Ե� ���谡�� ��
		int result = 0;	//����� �� �׷��� ��	
		st = new StringTokenizer(br.readLine());
		for(int i=0 ; i<N ; i++) {
			adventurers[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(adventurers);
		for(int level : adventurers) { //�������� ���� �ͺ��� �ϳ��� Ȯ���ϸ�
			count++; //���� �׷쿡 �ش� ���谡�� ���Խ�Ű��
			if(count >= level) { //���� �׷쿡 ���Ե� ���谡�� ���� ������ ������ �̻��̶��, �׷� �Ἲ
				result++; //�� �׷��� �� ������Ű��
				count = 0; //���� �׷쿡 ���Ե� ���谡�� �� �ʱ�ȭ
			}
		}
		
		System.out.println(result);
	}
}
