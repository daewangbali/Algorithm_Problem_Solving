package baekjoon;

import java.io.*;
import java.util.*;

public class Main3052 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		int[] array = new int[42];
		int count = 0;
		for(int i=0;i<10;i++) {
			int tc = Integer.parseInt(br.readLine());
			int remainder = tc % 42;
			array[remainder] = 1;
		}
		for(int i=0;i<array.length;i++) {
			if(array[i]==1) {
				count++;
			}
		}
		*/
		Set<Integer> array = new HashSet<Integer>();
		for(int i=0;i<10;i++) {
			int tc = Integer.parseInt(br.readLine());
			int remainder = tc % 42;
			array.add(remainder);
		}
		System.out.println(array.size());
	}
}
