package chap01;
import java.util.Scanner;
public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("사각형을 출력합니다.");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단 수: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
			
		
		

	}

}
