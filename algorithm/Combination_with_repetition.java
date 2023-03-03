package algorithm;

public class Combination_with_repetition {
	static StringBuilder sb = new StringBuilder();
	static int[] nums = { 1, 2, 3 }; 
	static int r = 2;
	static int[] out = new int[2];
	static void combination(int start, int count) {
		if(count == r) {
			sb.append(out[0]).append(" ").append(out[1]).append("\n");
			return;
		}
		
		// ��� ������ ��ȸ�ϸ� ���ڸ� �ϳ� �����Ѵ� �̶� �־��� �ε������� ��ȸ�Ѵ�.
		for(int i=start ; i<nums.length ; i++) {
			// �̹� ������ ���ڰ� �ƴ� ���(visited�� false)
			out[count] = nums[i];
			combination(i, count+1); // ����Լ� ȣ��
		}	
	}

	public static void main(String[] args) {
		combination(0,0);
		System.out.println(sb.toString());
	}
}