package baekjoon;
import java.io.*;

public class Main25501 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static int callCount = 0;
	public static int recursion(String s, int l, int r){
		callCount++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
    public static void main(String[] args) throws NumberFormatException, IOException{
        int T = Integer.parseInt(br.readLine());
        for(int i = 0;i < T ; i++) {
        	String S = br.readLine();
        	sb.append(isPalindrome(S)).append(" ").append(callCount).append("\n");
        	callCount = 0;
        }
        System.out.println(sb.toString()); 
    }
}
