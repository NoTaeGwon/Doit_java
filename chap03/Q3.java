package chap03;
import java.util.Scanner;
// 어떤 값을 갖는 배열 안의 모든 요소를 다른 배열에 복사함

class Q3 {
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int i = 0;
		for (int k = 0; k < n; k++)
			if (a[k] == key)
				idx[i++] = k;
		return i;
		
	}
	

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟수 입력: ");
		int num = stdIn.nextInt();
		
		int[] x = new int[num];
		int[] y = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]：");
			x[i] = stdIn.nextInt();
		}
		System.out.print("찾는 값："); // 키 값을 입력 받음
		int ky = stdIn.nextInt();

		int count = searchIdx(x, num, ky, y);
		
		if (count == 0)
			System.out.print("그 요소는 없습니다.");
		else
			for(int i = 0; i < count; i++)
				System.out.println("그 요소 값은 [" + y[i] + "]에 있습니다." );
	
		
	}
}
