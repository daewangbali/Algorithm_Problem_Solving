package algorithm;
import java.io.*;

public class Implementation2 {
    public static boolean check(int h, int m, int s) {
    	//특정한 시각 안에 '3'이 포함되어 있는지의 여부
    	if(h % 10 == 3 || m / 10 == 3 || m % 10 == 3 || s / 10 == 3 || s % 10 == 3)
    		return true;
    	return false;
    }	
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws NumberFormatException, IOException {
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		for(int i=0 ; i<=N ; i++) {
			for(int j=0 ; j<60 ; j++) {
				for(int k=0 ; k<60 ; k++) {
					if(check(i,j,k)) count++;
				}
			}
		}
		System.out.println(count);
	}
}
