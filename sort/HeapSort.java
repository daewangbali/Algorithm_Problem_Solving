package sort;

public class HeapSort {
	
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
		
		/*
		 * ���� Ʈ������ �θ� ����� �ڽĳ�� �ε����� ���� �����ش�
		 * ���� �θ� �ε����� ���� ū ���� ���� �ִٰ� �����Ѵ�.
		 */
		int leftChildIdx = 2 * parentIdx + 1;
		int rightChildIdx = 2 * parentIdx + 2;
		int largestIdx = parentIdx;
		
		/*
		 * left child node�� ��
		 * 
		 * �ڽ� ����� �ε����� ���� ���� �ε����� �Ѿ�� �����鼭
		 * ���� ���� ū �ε������� ���� �ڽĳ���� ���� �� Ŭ ���
		 * ���� ū �ε����� ����Ű�� largestIdx�� ���� �ڽ� ��� �ε����� �ٲ��ش�.
		 */
		if(leftChildIdx <= lastIdx && a[largestIdx] < a[leftChildIdx]) {
			largestIdx = leftChildIdx;
		}
		
		/*
		 * left right node�� ��
		 * 
		 * �ڽĳ�� �ε����� ���� ���� �ε����� �Ѿ�� �����鼭
		 * ���� ���� ū �ε������� ������ �ڽĳ��� ���� �� Ŭ ���
		 * ���� ū �ε����� ����Ű�� largesIndex�� ������ �ڽĳ���δ콺�� �ٲ��ش�.
		 */
		if(rightChildIdx <= lastIdx && a[largestIdx] < a[rightChildIdx]) {
			largestIdx = rightChildIdx;
		}
		
		/*
		 * largestIdx �� �θ��尡 ���� �ʴٴ� ����
		 * �� �ڽĳ�� �� �������� ���� �θ��庸�� ū ��尡 �����Ѵٴ� ���̴�.
		 * �׷� ��� �ش� �ڽ� ���� �θ��带 ��ȯ���ְ�,
		 * ��ȯ�� �ڽĳ�带 �θ���� ���� ����Ʈ���� �˻��ϵ��� ��� ȣ�� �Ѵ�.
		 */
		if(parentIdx != largestIdx) {
			swap(a, largestIdx, parentIdx);
			heapify(a, largestIdx, lastIdx);
		}
		
	}
}

