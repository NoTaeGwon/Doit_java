package chap01;
import java.util.Scanner;

public class Q11_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		do {
		System.out.println("양의 정수를 입력> ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		} while (num <= 0);
		
		int no = 0;
		while (num > 0) {
			num /= 10;
			no++;
		}
		
		System.out.println("그 수는 " + no + "의 자리수 입니다." );
		
		

	}

}
