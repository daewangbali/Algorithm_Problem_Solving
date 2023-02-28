package sort;

public class HeapSort2 {
	
	public static void heapsort(int[] arr) {
		heapsort(arr, arr.length);
	}
	
	public static void heapsort(int[] arr, int size) {
		
		/*
		 * ������� heapify�������� ������ �߻��ϸ� �߸��� ������ �߻��ϱ� ������
		 * ���Ұ� 1���̰ų� 0���� ���� ���� �� �ʿ䰡 �����Ƿ� �ٷ� �Լ��� �����Ѵ�.
		 */
		if(size < 2) {
			return;
		}
		
		//���� ������ ����� �θ� ��� �ε���
		int parentIdx = getParent(size - 1);
		
		//max heap �����
		for(int i=parentIdx; i >= 0; i--) {
			
			//�θ���(i��)�� 1�� ���̸鼭 heap ������ ������Ű���� �籸���Ѵ�.
			heapify(arr, i, size - 1);
		}
		
		//���� ����
		for(int i = size - 1; i > 0 ; i--) {
			
			/*
			 * root�� 0��° �ε����� i��° �ε����� ���� ��ȯ���� ��
			 * 0 ~ (i - 1)������ �κ�Ʈ���� ���� max heap�� �����ϵ��� �籸���Ѵ�.
			 */
			swap(arr , 0, i);
			heapify(arr, 0, i - 1);
		}
		
	}
	
	//�θ� �ε����� ��� �Լ�
	private static int getParent(int child) {
		return (child - 1) / 2;
	}
	
	//�� �ε����� ���Ҹ� ��ȯ�ϴ� �Լ�
	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	

	
	//���� ����� �Լ�
	private static void heapify(int[] a, int parentIdx , int lastIdx) {
		
		int leftChildIdx;
		int rightChildIdx;
		int largestIdx;
		
		/*
		 * ���� �θ� �ε����� �ڽ� ��� �ε�����
		 * ������ �ε����� ���� ���� ������ �ݺ��Ѵ�.
		 * 
		 * �� �� ���� �ڽ� ��带 �������� �ؾ��Ѵ�.
		 * ������ �ڽ� ��带 �������� ������ �˻��ϰ� �Ǹ�
		 * ������ �θ� �ε����� ���� �ڽĸ� ���� ���� ���
		 * ���� �ڽ� ���ʹ� �� �� ��ȯ�� �� �� ���� �����̴�.
		 */
		while((parentIdx * 2) + 1 <= lastIdx) {
			leftChildIdx = (parentIdx * 2) + 1;
			rightChildIdx = (parentIdx * 2) + 2;
			largestIdx = parentIdx;
			
			/*
			 * left child node�� ��
			 * (������ while������ �˻������Ƿ� ���� �˻� �ʿ� ����)
			 */
			if(a[leftChildIdx] > a[largestIdx]) {
				largestIdx = leftChildIdx;
			}
			
			/*
			 * left child node�� ��
			 * right child node�� ������ �˻����־�� �Ѵ�.
			 */
			if(rightChildIdx <= lastIdx && a[rightChildIdx] > a[largestIdx]) {
				largestIdx  = rightChildIdx;
			}
			
			/*
			 * ��ȯ�� �߻����� ��� �� ���Ҹ� ��ü�� ��
			 * ��ȯ�� �� �ڽĳ�带 �θ� ��尡 �ǵ��� ��ü�Ѵ�
			 */
			if(largestIdx != parentIdx) {
				swap(a, parentIdx, largestIdx);
				parentIdx = largestIdx;
			}else {
				return;
			}	
		}
	}
}

