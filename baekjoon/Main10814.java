package baekjoon;
import java.io.*;
import java.util.*;

public class Main10814 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = null;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws NumberFormatException, IOException {
		int T = Integer.parseInt(br.readLine());
		Person[] p = new Person[T];
		for(int i=0;i<T;i++) {
			st = new StringTokenizer(br.readLine());
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			p[i] = new Person(age, name);
		}
		Arrays.sort(p,(e1,e2)->{
			return e1.age - e2.age;
		});
		
		for(int i=0;i<T;i++) {
			sb.append(p[i]);
		}
		System.out.println(sb);
	}
	
	public static class Person {
		int age;
		String name;
		
		public Person(int age, String name) {
			this.age = age;
			this.name = name;
		}
		
		@Override
		public String toString() {
			return age + " " + name + "\n";
		}
		
	}
}
