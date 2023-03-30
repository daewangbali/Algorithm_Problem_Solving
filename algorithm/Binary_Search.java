package algorithm;
import java.io.*;
import java.util.*;

public class Binary_Search {
	//���� Ž�� �ҽ��ڵ� ����(����Լ�)
	public static int binarySearch(int[] arr, int target, int start, int end) {
		if(start > end){
			return -1;
		}
		int mid = (start + end) / 2;
		//ã�� ��� �߰��� �ε��� ��ȯ
		if(arr[mid] == target) {
			return mid;
		}
		//�߰����� ������ ã���� �ϴ� ���� ū ��� ������ Ȯ��
		else if(arr[mid] < target) {
			return binarySearch(arr, target, mid + 1, end);
		}
		//�߰����� ������ ã���� �ϴ� ���� ���� ��� ���� Ȯ��
		else {
			return binarySearch(arr, target, start, mid - 1);
		}
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
