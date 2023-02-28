package baekjoon;

public class Main2 {
	public static void main(String[] args) {
		
		String a = "10101";

        System.out.println("2진수 -> 10진수");
        System.out.println(Integer.parseInt(a,2));

        System.out.println("8진수 -> 10진수");
        System.out.println(Integer.parseInt(a,8));

        System.out.println("16진수 -> 10진수");;
        System.out.println(Integer.parseInt(a,16));
		
        System.out.println("10진수 -> 10진수");;
        System.out.println(Integer.parseInt(a));
        
        
		/*
		int s2 = Integer.parseInt("1100" , 2);
		System.out.println(s2);
		
		int s10 = Integer.parseInt("1100");
		System.out.println(s10);
		
		int s8 = Integer.parseInt("1100" , 8);
		System.out.println(s8);
		
		int s16 = Integer.parseInt("1100" , 16);
		System.out.println(s16);
		
		int a = 33;

        System.out.println("10진수 -> 2진수");
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toString(a,2));

        System.out.println("10진수 -> 8진수");
        System.out.println(Integer.toOctalString(a));
        System.out.println(Integer.toString(a,8));

        System.out.println("10진수 -> 16진수");
        System.out.println(Integer.toString(a,16));
        System.out.println(Integer.toHexString(a));
        
        System.out.println("10진수 -> 10진수");
        System.out.println(Integer.toString(a));
		
		
		
		
		String a = "10101";

        System.out.println("2진수 -> 10진수");
        System.out.println(Integer.parseInt(a,2));

        System.out.println("8진수 -> 10진수");
        System.out.println(Integer.parseInt(a,8));

        System.out.println("16진수 -> 10진수");;
        System.out.println(Integer.parseInt(a,16));
		
        System.out.println("10진수 -> 10진수");;
        System.out.println(Integer.parseInt(a));
        
		
		String answer2 = Integer.toString(n,2);
		String answer8 = Integer.toString(n,8);
		String answer10 = Integer.toString(n);
		String answer16 = Integer.toString(n,16);
		
		System.out.println(answer2); // 1100
		System.out.println(answer8); // 14
		System.out.println(answer10); // 12
		System.out.println(answer16); // c
		*/
	}
}
