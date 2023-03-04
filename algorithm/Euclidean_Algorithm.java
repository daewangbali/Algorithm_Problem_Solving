package algorithm;

public class Euclidean_Algorithm {
	// 최대공약수 반복문 방식
	int gcd(int a, int b) {
		
		while(b != 0) {
			int r = a % b;	// 나머지를 구해준다.
	        
			// GCD(a, b) = GCD(b, r)이므로 변환한다.
			a = b;		
			b = r;
		}
		return a;
	}
	
	//최대공약수 재귀 방식
	 
	/**
     * 유클리드 호제법 구현 메서드
     * @param bn : 큰 숫자
     * @param sn : 작은 숫자
     * 큰 숫자를 작은숫자로 나눈 값이 0이면 작은숫자 리턴, 아니면 재귀형태로 자신을 호출
     */
	public int eucd(int bn, int sn) {
    // 큰 숫자를 작은 숫자로 나눈 나머지 계산
    int r = bn % sn;
    // 나머지가 0이면 작은 숫자가 최대공약수이므로 작은 숫자 리턴
    if(r == 0){
        return sn;
    }else{
        // 나머지가 0이 아닐 경우 재귀형태로 호출
        // 이때 파라미터는 작은 숫자와 나머지를 넣어줌
        return eucd(sn, r);
    }
}
}
