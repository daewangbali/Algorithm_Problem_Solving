package algorithm;

public class Euclidean_Algorithm {
	// �ִ����� �ݺ��� ���
	int gcd(int a, int b) {
		
		while(b != 0) {
			int r = a % b;	// �������� �����ش�.
	        
			// GCD(a, b) = GCD(b, r)�̹Ƿ� ��ȯ�Ѵ�.
			a = b;		
			b = r;
		}
		return a;
	}
	
	//�ִ����� ��� ���
	 
	/**
     * ��Ŭ���� ȣ���� ���� �޼���
     * @param bn : ū ����
     * @param sn : ���� ����
     * ū ���ڸ� �������ڷ� ���� ���� 0�̸� �������� ����, �ƴϸ� ������·� �ڽ��� ȣ��
     */
	public int eucd(int bn, int sn) {
    // ū ���ڸ� ���� ���ڷ� ���� ������ ���
    int r = bn % sn;
    // �������� 0�̸� ���� ���ڰ� �ִ������̹Ƿ� ���� ���� ����
    if(r == 0){
        return sn;
    }else{
        // �������� 0�� �ƴ� ��� ������·� ȣ��
        // �̶� �Ķ���ʹ� ���� ���ڿ� �������� �־���
        return eucd(sn, r);
    }
}
}
