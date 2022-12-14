package chap03;
import java.util.Scanner;
// 선형 검색(보초법)

public class Q2 {
	// 요솟수가 n인 배열 a에서 key와 같은 요소를 선형 검색합니다.
	
	static int seqSearchSen(int[] a, int n, int key) {
		System.out.print("   |");
		
		for (int k = 0; k < n; k++)
			System.out.printf("%4d", k);
		System.out.println();
		
		System.out.print("---+");
		for (int k = 0; k < 4 * n + 2; k++)
			System.out.print("-");
		System.out.println();
					
		for (int i = 0; i < n; i++) {
			System.out.print("   |");
			System.out.printf(String.format("%%%ds*\n", (i * 4) + 3), "");
			System.out.printf("%3d|", i);
			for (int k = 0; k < n; k++)
				System.out.printf("%4d", a[k]);
			System.out.println("\n   |");
			if (a[i] == key)
				return i; // 검색 성공
		}
		return -1; // 검색 실패
	  }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num = stdIn.nextInt();
		int[] x = new int[num + 1];				// 요솟수가 num + 1인 배열
		
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i +"]: ");
			x[i] = stdIn.nextInt();
		}
		
		System.out.print("검색할 값: ");			// 검색할 값을 입력
		int ky = stdIn.nextInt();
		int idx = seqSearchSen(x, num, ky);		// 배열 x에서 키 값이 ky인 요소를 검색
		
		if (idx == -1)
			System.out.println("그 값은 요소가 없습니다.");
		else
			System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
		
	}

}
