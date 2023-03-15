package algorithm;
import java.io.*;

public class Implementation2 {
    public static boolean check(int h, int m, int s) {
    	//Ư���� �ð� �ȿ� '3'�� ���ԵǾ� �ִ����� ����
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
