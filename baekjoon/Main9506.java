package baekjoon;
import java.io.*;
import java.util.*;

public class Main9506 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n == -1)
				break;
			else {
				ArrayList<Integer> factors = new ArrayList<Integer>();
				for(int i=1 ; i<=n/2 ; i++) {
					if(n % i == 0)
						factors.add(i);
				}
				int sum = 0;
				String s = "";
				for(int i=0 ; i<factors.size() ; i++) {
					sum += factors.get(i);
					s += factors.get(i);
					if(i != factors.size()-1)
						s += " + ";
				}
				if(sum == n) {
					sb.append(n).append(" = ").append(s).append("\n");
				}else {
					sb.append(n).append(" is NOT perfect.").append("\n");
				}
			}
			
		}
		System.out.println(sb.toString());
	}
}