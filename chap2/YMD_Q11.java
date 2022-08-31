package chap02;
import java.util.Scanner;
// 셔기 년월일을 필드로 갖는 클래스를 만들고, 생성자와 메서드를 정의하기
public class YMD_Q11 {
	int y; 	// 년
	int m;	// 월(1~12)
	int d;	// 일(1 ~ 31)
	
	// 각 달의 일수
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, // 평년
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} // 윤년 
	};
	
	// 서기 year년은 윤년인가? (윤년 : 1 / 평년 : 0)
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1: 0;
	}
	
	YMD_Q11(int y, int m, int d) {
		this.y = y;
		this.m = m;
		this.d = d;
	}
	
	YMD_Q11 after(int n) {
		YMD_Q11 temp = new YMD_Q11(this.y, this.m, this.d);
		if (n < 0)
			return (before(-n));

		temp.d += n;

		while (temp.d > mdays[isLeap(temp.y)][temp.m - 1]) {
			temp.d -= mdays[isLeap(temp.y)][temp.m - 1];
			if (++temp.m > 12) {
				temp.y++;
				temp.m = 1;
			}
		}
		return temp;
	}

	YMD_Q11 before(int n) {
		YMD_Q11 temp = new YMD_Q11(this.y, this.m, this.d);
		if (n < 0)
			return (after(-n));

		temp.d -= n;

		while (temp.d < 1) {
			if (--temp.m < 1) {
				temp.y--;
				temp.m = 12;
			}
			temp.d += mdays[isLeap(temp.y)][temp.m - 1];
		}
		return temp;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);

		System.out.print("n일 뒤 날짜.\n");
		System.out.print("년 입력: ");
		int y = stdIn.nextInt();
		System.out.print("월 입력: ");
		int m = stdIn.nextInt();
		System.out.print("일 입력: ");
		int d = stdIn.nextInt();
		YMD_Q11 date = new YMD_Q11(y, m, d);

		System.out.print("몇일 후, 전이 궁금하십니까?: ");
		int n = stdIn.nextInt();

		YMD_Q11 d1 = date.after(n);
		System.out.printf("%d일 후는 %d년 %d월 %d일 입니다.\n", n, d1.y, d1.m, d1.d);

		YMD_Q11 d2 = date.before(n);
		System.out.printf("%d일 전은 %d년 %d월 %d일 입니다.\n", n, d2.y, d2.m, d2.d);

	}

}
