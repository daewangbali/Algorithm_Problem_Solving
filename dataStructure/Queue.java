package dataStructure;

/**
 * 
 * �ڹ� Queue Interface�Դϴ�. <br>
 * Queue�� ArrayQueue, LinkedQueue,
 * Deque, PriorityQueue �� ���� �����˴ϴ�.
 * 
 * @param <E> the type of elements in this Que
 * 
 */

public interface Queue<E> {
	/**
	 * ť�� ���� �������� ��Ҹ� �߰��մϴ�.
	 * 
	 * @param e ť�� �߰��� ��� 
	 * @return ť�� ��Ұ� ���������� �߰��Ǿ��� ��� true�� ��ȯ 
	 */
	boolean offer(E e);
	
	/**
	 * ť�� ù ��° ��Ҹ� �����ϰ� ���� �� ��Ҹ� ��ȯ�մϴ�.
	 * 
	 * @return ť�� ���� �� ��� ��ȯ 
	 */
	E poll();
	
	/**
	 * ť�� ù ��° ��Ҹ� ��ȯ�մϴ�.
	 * 
	 * @return ť�� ù ��° ��� ��ȯ 
	 */
	E peek();
	
}
