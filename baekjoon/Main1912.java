package baekjoon;
import java.io.*;
import java.util.*;

public class Main1912 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i=0 ; i<n ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] sumarr = new int[n];
		int max = sumarr[0] = arr[0];
		for(int i=1; i<n ; i++) {
			if(sumarr[i-1] <0 && arr[i] < 0)
				sumarr[i] = arr[i];
			else if((sumarr[i-1] + arr[i]) < 0) {				
				sumarr[i] = 0;
			}
			else {
				sumarr[i] = sumarr[i-1] + arr[i];
			}
			
			if(max < sumarr[i])
				max = sumarr[i];
		}
		
		System.out.println(max);
	}
}
