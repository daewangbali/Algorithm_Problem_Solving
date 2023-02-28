package sort;

public class HeapSort {
	
	public static void heapsort(int[] arr) {
		heapsort(arr, arr.length);
	}
	
	public static void heapsort(int[] arr, int size) {
		
		/*
		 * º¸¸ğ³ëµå¿Í heapify°úÁ¤¿¡¼­ À½¼ö°¡ ¹ß»ıÇÏ¸é Àß¸øµÈ ÂüÁ¶°¡ ¹ß»ıÇÏ±â ¶§¹®¿¡
		 * ¿ø¼Ò°¡ 1°³ÀÌ°Å³ª 0°³ÀÏ °æ¿ì´Â Á¤·Ä ÇÒ ÇÊ¿ä°¡ ¾øÀ¸¹Ç·Î ¹Ù·Î ÇÔ¼ö¸¦ Á¾·áÇÑ´Ù.
		 */
		if(size < 2) {
			return;
		}
		
		//°¡Àå ¸¶Áö¸· ³ëµåÀÇ ºÎ¸ğ ³ëµå ÀÎµ¦½º
		int parentIdx = getParent(size - 1);
		
		//max heap ¸¸µé±â
		for(int i=parentIdx; i >= 0; i--) {
			
			//ºÎ¸ğ³ëµå(i°ª)À» 1¾¿ ÁÙÀÌ¸é¼­ heap Á¶°ÇÀ» ¸¸Á·½ÃÅ°µµ·Ï Àç±¸¼ºÇÑ´Ù.
			heapify(arr, i, size - 1);
		}
		
		//Á¤·Ä °úÁ¤
		for(int i = size - 1; i > 0 ; i--) {
			
			/*
			 * rootÀÎ 0¹øÂ° ÀÎµ¦½º¿Í i¹øÂ° ÀÎµ¦½ºÀÇ °ªÀ» ±³È¯ÇØÁØ µÚ
			 * 0 ~ (i - 1)±îÁöÀÇ ºÎºĞÆ®¸®¿¡ ´ëÇØ max heapÀ» ¸¸Á·ÇÏµµ·Ï Àç±¸¼ºÇÑ´Ù.
			 */
			swap(arr , 0, i);
			heapify(arr, 0, i - 1);
		}
		
	}
	
	//ºÎ¸ğ ÀÎµ¦½º¸¦ ¾ò´Â ÇÔ¼ö
	private static int getParent(int child) {
		return (child - 1) / 2;
	}
	
	//µÎ ÀÎµ¦½ºÀÇ ¿ø¼Ò¸¦ ±³È¯ÇÏ´Â ÇÔ¼ö
	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	

	
	//ÈüÀ» ¸¸µå´Â ÇÔ¼ö
	private static void heapify(int[] a, int parentIdx , int lastIdx) {
		
		/*
		 * ÇöÀç Æ®¸®¿¡¼­ ºÎ¸ğ ³ëµåÀÇ ÀÚ½Ä³ëµå ÀÎµ¦½º¸¦ °¢°¢ ±¸ÇØÁØ´Ù
		 * ÇöÀç ºÎ¸ğ ÀÎµ¦½º¸¦ °¡Àå Å« °ªÀ» °®°í ÀÖ´Ù°í °¡Á¤ÇÑ´Ù.
		 */
		int leftChildIdx = 2 * parentIdx + 1;
		int rightChildIdx = 2 * parentIdx + 2;
		int largestIdx = parentIdx;
		
		/*
		 * left child node¿Í ºñ±³
		 * 
		 * ÀÚ½Ä ³ëµåÀÇ ÀÎµ¦½º°¡ ³¡ÀÇ ¿ø¼Ò ÀÎµ¦½º¸¦ ³Ñ¾î°¡Áö ¾ÊÀ¸¸é¼­
		 * ÇöÀç °¡Àå Å« ÀÎµ¦½ºº¸´Ù ¿ŞÂÊ ÀÚ½Ä³ëµåÀÇ °ªÀÌ ´õ Å¬ °æ¿ì
		 * °¡Àå Å« ÀÎµ¦½º¸¦ °¡¸®Å°´Â largestIdx¸¦ ¿ŞÂÊ ÀÚ½Ä ³ëµå ÀÎµ¦½º·Î ¹Ù²ãÁØ´Ù.
		 */
		if(leftChildIdx <= lastIdx && a[largestIdx] < a[leftChildIdx]) {
			largestIdx = leftChildIdx;
		}
		
		/*
		 * left right node¿Í ºñ±³
		 * 
		 * ÀÚ½Ä³ëµå ÀÎµ¦½º°¡ ³¡ÀÇ ¿ø¼Ò ÀÎµ¦½º¸¦ ³Ñ¾î°¡Áö ¾ÊÀ¸¸é¼­
		 * ÇöÀç °¡Àå Å« ÀÎµ¦½ºº¸´Ù ¿À¸¥ÂÊ ÀÚ½Ä³ëµå¿Í °ªÀÌ ´õ Å¬ °æ¿ì
		 * °¡Àå Å« ÀÎµ¦½º¸¦ °¡¸®Å°´Â largesIndex¸¦ ¿À¸¥ÂÊ ÀÚ½Ä³ëµåÀÎ´ì½º·Î ¹Ù²ãÁØ´Ù.
		 */
		if(rightChildIdx <= lastIdx && a[largestIdx] < a[rightChildIdx]) {
			largestIdx = rightChildIdx;
		}
		
		/*
		 * largestIdx ¿Í ºÎ¸ğ³ëµå°¡ °°Áö ¾Ê´Ù´Â °ÍÀº
		 * À§ ÀÚ½Ä³ëµå ºñ±³ °úÁ¤¿¡¼­ ÇöÀç ºÎ¸ğ³ëµåº¸´Ù Å« ³ëµå°¡ Á¸ÀçÇÑ´Ù´Â ¶æÀÌ´Ù.
		 * ±×·Ä °æ¿ì ÇØ´ç ÀÚ½Ä ³ëµå¿Í ºÎ¸ğ³ëµå¸¦ ±³È¯ÇØÁÖ°í,
		 * ±³È¯µÈ ÀÚ½Ä³ëµå¸¦ ºÎ¸ğ³ëµå·Î »ïÀº ¼­ºêÆ®¸®¸¦ °Ë»çÇÏµµ·Ï Àç±Í È£­„ ÇÑ´Ù.
		 */
		if(parentIdx != largestIdx) {
			swap(a, largestIdx, parentIdx);
			heapify(a, largestIdx, lastIdx);
		}
		
	}
}

