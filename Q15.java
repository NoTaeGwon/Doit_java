package chap01;

public class Q15 {
	
	static void triangleLB(int n) { // 왼쪽 아래가 직각인 이등변 삼각형을 풀력
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void triangleLU(int n) { // 왼쪽 위가 직각인 이등변 삼각형을 출력
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void triangleRU(int n) { // 오른쪽 위가 직각인 이등변 삼각형을 출력
		for (int i = 1; i <= n; i++) { 
			for (int j = 1; j <= i - 1 ; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	static void triangleRB(int n) { // 오른쪽 아래가 직각인 이등변 삼각형을 출력
		for (int i = 1; i <= n; i++) { 
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q15.triangleLB(5);
		System.out.println();
		Q15.triangleLU(5);
		System.out.println();
		Q15.triangleRU(5);
		System.out.println();
		Q15.triangleRB(5);
		
	}
}
