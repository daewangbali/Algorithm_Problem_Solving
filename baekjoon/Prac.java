package baekjoon;
import java.io.*;
import java.util.*;

public class Prac {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine(),"-");
		int result = Integer.MAX_VALUE;
		while(st.hasMoreTokens()) {
			int num = 0;
			StringTokenizer st2 = new StringTokenizer(st.nextToken(),"+");
			
			while(st2.hasMoreTokens()) {
				num += Integer.parseInt(st2.nextToken());
			}
			if(result == Integer.MAX_VALUE) {
				result = num;
			}else {
				result -= num; 
			}
		}
		System.out.println(result);
		
		/*
        String str = "abcde";
        List<Character> list = new ArrayList<>();
        for(int i=0 ; i<str.length() ; i++) {
        	list.add(str.charAt(i));
        }

        // reverse
        Collections.reverse(list);

        for(char c : list) {
        	System.out.print(c);
        }
		
		------------------------------------------
		
		double pie = 3.1415926535;
		double d = 287.189372;
		
		System.out.println(Math.ceil(pie * 1000) / 1000.0); // 3.142
		System.out.println(Math.round(pie * 1000) / 1000.0); // 3.142
		System.out.println(Math.floor(pie * 1000) / 1000.0); // 3.141
		
		System.out.println(Math.ceil(d * 100) / 100.0); // 287.19
		System.out.println(Math.round(d * 100) / 100.0); // 287.19
		System.out.println(Math.floor(d * 100) / 100.0); // 287.18
		
		System.out.println(Math.ceil(d * 1000) / 1000.0); // 287.19
		System.out.println(Math.round(d * 1000) / 1000.0); // 287.189
 		System.out.println(Math.floor(d * 1000) / 1000.0); // 287.189
		System.out.println();
 		System.out.println(String.format("%.2f",  Math.floor(d*10)/10.0));
 		System.out.println();
		System.out.println(String.format("%.3f", Math.floor(pie*100)/100.0)); // 3.140
		*/
	}
}
