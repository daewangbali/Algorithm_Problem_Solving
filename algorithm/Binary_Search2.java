package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Binary_Search2 {
	//���� Ž�� �ҽ��ڵ� ����(�ݺ���)
	public static int binarySearch(int[] arr, int target, int start, int end) {
		
		while(start <= end) {
			int mid = (start + end) / 2;
			//ã�� ��� �߰��� �ε��� ��ȯ
			if(arr[mid] == target) {
				return mid;			
			}
			//�߰����� ������ ã���� �ϴ� ���� ū ��� ������ Ȯ��
			else if(arr[mid] < target) {
				start = mid + 1;
			}
			//�߰����� ������ ã���� �ϴ� ���� ���� ��� ���� Ȯ��
			else if(arr[mid] > target) {
				end = mid -1;
			}
		}
		return -1;
	}
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		//���� ����(N)�� ã���� �ϴ� ������(target) �Է¹ޱ�
		int N = Integer.parseInt(st.nextToken());
		int target = Integer.parseInt(st.nextToken());
		
		//��ü ���� �ޱ�
		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0 ; i<N ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int result = binarySearch(arr, target, 0, N-1);
		if(result == -1) {
			System.out.println("���Ұ� �������� �ʽ��ϴ�.");
		}else {
			System.out.println(result + 1);
		}
	}
}
