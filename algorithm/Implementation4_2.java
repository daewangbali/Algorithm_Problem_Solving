package algorithm;
import java.io.*;
import java.util.*;

public class Implementation4_2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		String s = br.readLine();
		List<Character> list = new ArrayList<>();
		int num = 0;
		
		//���ڸ� �ϳ��� Ȯ���ϸ�
		for(int i=0 ; i<s.length(); i++) {
			//���ĺ��� ��� ��� ����Ʈ�� ����
			char c = s.charAt(i);
			if(Character.isLetter(c)) {
				list.add(c);
			}
			//���ڴ� ���� ���ϱ�
			else {
				num += c - '0';
			}
		}
		//���ĺ� ������������ ����
		Collections.sort(list);
		
		//���ĺ��� ���ʴ�� ���
		for(char c : list) {
			sb.append(c);
		}
		//���ڰ� �ϳ��� �����ϴ� ��� ���� �ڿ� ���
		if(num != 0) {
			sb.append(num);
		}
		System.out.println(sb.toString());
		
	}
}
