package calc;

import com.test.util;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // scanner 호출
		calc ps = new calc(); // calc 호출
		String ca = "+", cb = "-", cc = "*", cd = "/", ce = "="; // 연산기호 비교를 위한 문자열 선언
		int result = 0;

		// 계산기를 만들어 보자
		System.out.println("계산기 프로그램");
		System.out.println("오늘날짜");
		System.out.println(util.getCurrentDate("yyyyMMdd"));
		System.out.print("입력 :");
		int num1 = sc.nextInt();
		String sign = sc.next();
		int num2 = sc.nextInt();
		String sign2 = sc.next();
		System.out.println("계산을 시작합니다.");

		// 계산기
		if (sign2.equals(ce)) {
			if (sign.equals(ca)) {
				// 더하기
				result = ps.plus(num1, num2);
				System.out.println("두수의 더하기: " + result);
				System.out.println("static 을 사용한 두수의 더하기: " + calc.plus2(num1, num2));
			} else if (sign.equals(cb)) {
				// 빼기
				result = num1 - num2;
				System.out.println("두수의 빼기: " + result);
				System.out.println("static 을 사용한 두수의 빼기: " + calc.minus(num1, num2));
			} else if (sign.equals(cc)) {
				// 곱하기
				result = num1 * num2;
				System.out.println("두수의 곱하기: " + result);
				System.out.println("static 을 사용한 두수의 곱하기: " + calc.multi(num1, num2));
			} else if (sign.equals(ce)) {
				// 나누기
				result = num1 / num2;
				System.out.println("두수의 나누기: " + result);
				System.out.println("static 을 사용한 두수의 나누기: " + calc.div(num1, num2));
			} // else if
//		Test test = new Test();
//		test.method();

			// 돈복사 하기 10% 확률로 10배 60% 확률로 3배 30% 확률로 실패
			int myMoney = 1000;
			System.out.println("길을 가다가 돈 복사기를 주웠네");
			System.out.println("내 돈 " + myMoney + "원을 넣어 보자");
			// 돈 복사기 호출
			myMoney = ps.pung(myMoney);
			System.out.println("두구두구두구~ 내돈은 " + myMoney + "원!!!");
		}//if
	}//main
}//class
