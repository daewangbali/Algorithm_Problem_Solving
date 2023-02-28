package dataStructure;

import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;

public class Heap<E> {
	private final Comparator<? super E> comparator;
	private static final int DEFAULT_CAPACITY = 10;	// �ּ�(�⺻) ���� ũ�� 
    
	private int size;	// ��� ���� 
 
	private Object[] array;	// ��Ҹ� ���� �迭 
 
	// ������ Type 1 (�ʱ� ���� �Ҵ� X)
	public Heap() {
		this(null);
	}
	
	public Heap(Comparator<? super E> comparator) {
		this.array = new Object[DEFAULT_CAPACITY];
		this.size = 0;
		this.comparator = comparator;
	}
	
	
	// ���� �ε����� �θ� ��� �ε����� ��ȯ
	private int getParent(int index) {
		return index / 2;
	}
	
	// ���� �ε����� ���� �ڽ� ��� �ε����� ��ȯ 
	private int getLeftChild(int index) {
		return index * 2;
	}
	
	// ���� �ε����� ������ �ڽ� ��� �ε����� ��ȯ
	private int getRightChild(int index) {
		return index * 2 + 1;
	}
	
	
 
	// ������ Type 2 (�ʱ� ���� �Ҵ� O)
	public Heap(int capacity) {
		this(capacity, null);
	}
	
	public Heap(int capacity, Comparator<? super E> comparator) {
		this.array = new Object[capacity];
		this.size = 0;
		this.comparator = comparator;
	}
	
	
	/**
	 * @param newCapacity ���ο� ���� ũ��
	 */
	private void resize(int newCapacity) {
		
		// ���� ���� �迭
		Object[] newArray = new Object[newCapacity];
		
		// �� �迭�� ������ �ִ� �迭�� ��ҵ��� ��� �������ش�.
		for(int i = 1; i <= size; i++) {
			newArray[i] = array[i];
		}
		
		/*
		 *  ���� �迭�� GC ó���� ���� null�� ó���� ��, 
		 *  �� �迭�� �������ش�.  
		 */
		this.array = null;
		this.array = newArray;
		
	}
	
 
 
 
	public void add(E value) {
		
		// �迭 ������ �� ������ ��� ������ �� ��� �÷��ش�. 
		if(size + 1 == array.length) {
			resize(array.length * 2);
		}
		
		siftUp(size + 1, value);	// ���� �������� �߰� �Ǵ� ��ġ�� ���� ��(Ÿ��)�� �Ѱ���
		size++;	// ���������� ���ġ�� ������ ����� ����
	}
	
	// ���� ����
	/**
	 * @param idx	�߰��� ����� �ε��� 
	 * @param target	���ġ �� ���
	 */
	private void siftUp(int idx, E target) {	
		// comparator�� ������ ��� comparator �� ���ڷ� �Ѱ��ش�.
		if(comparator != null) {
			siftUpComparator(idx, target, comparator);
		}
		else {
			siftUpComparable(idx, target);
		}
	}
 
	// Comparator�� �̿��� sift-up
	@SuppressWarnings("unchecked")
	private void siftUpComparator(int idx, E target, Comparator<? super E> comp) {		
 
		// root��庸�� Ŭ �������� Ž���Ѵ�.
		while(idx > 1) {
			int parent = getParent(idx);	// ���Գ���� �θ��� �ε��� ���ϱ�
			Object parentVal = array[parent];	// �θ����� ��
		
			// Ÿ�� ��� ���� �θ��庸�� ũ�� �ݺ��� ����
			if(comp.compare(target, (E) parentVal) >= 0) {
				break;
			}
			
			/*
			 * �θ��尡 Ÿ�ٳ�庸�� ũ�Ƿ�
			 * ���� ���� �� ��ġ�� �θ��� ������ ��ü���ְ�
			 * Ÿ�� ����� ��ġ�� �θ����� ��ġ�� �������ش�. 
			 */
			array[idx] = parentVal;
			idx = parent;
		}
		
		// ���������� ���Ե� ��ġ�� Ÿ�� ��� ���� �������ش�.
		array[idx] = target;
	}
 
	// ���� �� ��ü�� Comparable�� �̿��� sift-up
	@SuppressWarnings("unchecked")
	private void siftUpComparable(int idx, E target) {
		
		// Ÿ�ٳ�尡 �� �� �� �ֵ��� �� ������ �����. 
		Comparable<? super E> comp = (Comparable<? super E>) target;
		
		while(idx > 1) {
			int parent = getParent(idx);
			Object parentVal = array[parent];
			
			if(comp.compareTo((E)parentVal) >= 0) {
				break;
			}
			array[idx] = parentVal;
			idx = parent;
		}	
		array[idx] = comp;
	}
	
 
	
}