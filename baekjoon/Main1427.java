package baekjoon;
import java.io.*;
import java.util.*;

public class Main1427 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws NumberFormatException, IOException {
		ArrayList<Character> list = new ArrayList<Character>();
		String n = br.readLine();
		for(int i=0;i<n.length();i++) {
			list.add(n.charAt(i));
		}
		Collections.sort(list, Collections.reverseOrder());
		for(int i=0;i<list.size();i++) {
			sb.append(list.get(i));
		}
		System.out.println(sb.toString());
	}
}
