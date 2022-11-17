package chap04;

public class Q4_IntArtQueue {
	private int max;	// 큐 용량
	private int num; 	// 큐 포인터
	private int[] que; 	// 큐 본체
	
	// 실행시 예외: 큐가 비어 있음
	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() { }
	}
	
	// 실행시 예외: 큐가 가득 참
	public class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() { }
	}
	
	// 생성자
	public Q4_IntArtQueue(int capacity) {
		num = 0;
		max = capacity;
		try {
			que = new int[max];				// 큐 본체용 배열을 생성
		} catch (OutOfMemoryError e) {		// 생성할 수 없음
			max = 0;
		}
	}
	
	// 큐에 x를 인큐
	public int enqueue(int x) throws OverflowIntQueueException {
		if (num >= max) 		// 큐가 가득참
			throw new OverflowIntQueueException();
		return que[num++] = x;
	}
	
	// 큐에서 데이터를 디큐(정상에 대한 데이터를 꺼냄)
	public int dequeue() throws EmptyIntQueueException {
		if (num <= 0)			// 큐가 비어 있음
			throw new EmptyIntQueueException();
		int x = que[0];
		for (int i = 0; i < num - 1; i++)
			que[i] = que[i + 1];
		num--;
		return x;
	}
	
	// 큐에서 데이터를 프런트(정상에 있는 데이터를 들여다봄)
	public int front() throws EmptyIntQueueException {
		if (num <= 0)			// 큐가 비어 있음
			throw new EmptyIntQueueException();
		return que[num - 1];
	}
	
	// 큐에서 x를 찾아 인덱스(없으면 -1)를 반환
	public int indexOf(int x) {
		for (int i = 0; i < num; i++) 	// 정상 쪽에서 선형 검색
			if (que[i] == x) 
				return i;	// 검색 성공
		return -1;			// 검색 실패
	}
	
	// 큐를 비움
	public void clear() {
		num = 0;
	}
	
	// 큐의 용량을 반환
	public int capacity() {
		return max;
	}
	
	// 큐에 쌓여 있는 데이터 수를 반환
	public int size() {
		return num;
	}
	
	// 큐가 비어 있는가?
	public boolean isEmpty() {
		return num <= 0;
	}
	
	// 큐가 가득 찼는가?
	public boolean isFull() {
		return num >= max;
	}
	
	// 큐 안의 모든 데이터를 바닥 -> 꼭대기 순서로 출력
	public void dump() {
		if (num <= 0)
			System.out.println("큐가 비어 있습니다.");
		else {
			for (int i = 0; i < num; i++)
				System.out.print(que[i] + " ");
			System.out.println();
		}
	}
}
