package calc;
import java.util.Random;

public class calc {
	
	public static int plus2(int num1, int num2) {
		return num1 + num2;
	}

	// 더하기 메소드
	public int plus(int num1, int num2) {
//		int result = num1 + num2;
//		System.out.println("두수의 더하기: " + result);
		return num1 + num2;
	}
	// 빼기 메소드
	public static int minus(int num1, int num2) {
		return num1 - num2;
	}
	// 곱하기 메소드
	public static int multi(int num1, int num2) {
		return num1 * num2;
	}
	// 나누기 메소드
	public static int div(int num1, int num2) {
		return num1 / num2;
	}
	
	// 돈 복사기 메소드(3배 뻥튀기)
	public int pung(int m) {
//		System.out.println("m = " + m * 3);
		Random rand = new Random();
		int n = rand.nextInt(10)+1;
		if(n==1) {
			System.out.println("돈복사 대박 성공!");
			return m*10;
		}else if(n>1 && n<8) {
			System.out.println("돈복사 성공!");
			return m * 3;
		}else {
			System.out.println("돈복사 실패!");
			return m;
		}
	}
}
