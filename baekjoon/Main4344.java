package baekjoon;

import java.io.*;
import java.util.*;

public class Main4344 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		int T = Integer.parseInt(br.readLine());
		for(int tc = 1;tc<=T;tc++) {
			double totalScore = 0;
			double count = 0;
			st = new StringTokenizer(br.readLine());
			int student = Integer.parseInt(st.nextToken());
			int[] score = new int[student];
			for(int i=0;i<student;i++) {
				score[i] = Integer.parseInt(st.nextToken());
				totalScore += score[i];
			}
			double avg = totalScore/student;
			for(int i=0;i<score.length;i++) {
				if(score[i] > avg)
					count++;
			}
			System.out.printf("%.3f%%\n",(count/student)*100);//반올림해서 3번째자리까지 표시하기!
			//float result = (float) count/student;
			//System.out.println(String.format("%.3f", result*100.0));
		}
	}
}
