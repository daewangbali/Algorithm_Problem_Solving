package baekjoon;
import java.io.*;

public class Main1193 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException {
		int T = Integer.parseInt(br.readLine());
		int count = 1;
		int prenum = 0;
		while(true) {
			if(T>=prenum+count) {
				prenum += count;
				count++;
			}else {
				if(count%2==1) {
					System.out.println((count-(T-prenum-1))+"/"+(T-prenum));
					break;
				}else {
					System.out.println((T-prenum)+"/"+(count-(T-prenum-1)));
					break;
				}
				
			}
		}
	}
}
/*

int T = Integer.parseInt(br.readLine());
		int count = 1;
		int prenum = 0;
		int nexnum = 0;
		while(true) {
			if(T>nexnum) {
				prenum = nexnum;
				nexnum = count+nexnum;
				count++;
			}
			else if(T<=nexnum) {
				if(count%2==0) {
					System.out.println((nexnum-T+1)+" / "+(T - prenum));
				}else {
					System.out.println((T - prenum)+" / "+(nexnum-T+1));					
				}
				return;
			}
		}
	
 */
