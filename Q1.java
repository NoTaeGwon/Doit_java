package chap02;

import java.util.Random;

public class Q1 {
	static int maxOf(int[] a) {
		int max = a[0];
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		
		System.out.println("사람 수를 무작위로 생성해서 키의 최댓값을 구합니다.");
		
		int num = 1 + rand.nextInt(10);
		
		int[] height = new int[num];
		
		System.out.println("생성된 수는 " + num + "입니다.");
		
		for (int i = 0; i < num; i++) {
			height[i] = 100 + rand.nextInt(100);
			System.out.println("height[" + i + "] : " + height[i]);
		}
		
		System.out.println("최댓값은 " + maxOf(height) + "입니다.");
		
	}

}
