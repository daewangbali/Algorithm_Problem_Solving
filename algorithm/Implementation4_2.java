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
		
		//문자를 하나씩 확인하며
		for(int i=0 ; i<s.length(); i++) {
			//알파벳인 경우 결과 리스트에 삽입
			char c = s.charAt(i);
			if(Character.isLetter(c)) {
				list.add(c);
			}
			//숫자는 따로 더하기
			else {
				num += c - '0';
			}
		}
		//알파벳 오름차순으로 정렬
		Collections.sort(list);
		
		//알파벳을 차례대로 출력
		for(char c : list) {
			sb.append(c);
		}
		//숫자가 하나라도 존재하는 경우 가장 뒤에 출력
		if(num != 0) {
			sb.append(num);
		}
		System.out.println(sb.toString());
		
	}
}
