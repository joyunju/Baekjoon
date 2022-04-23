//문제 : 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.
//입력 : 두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000)
//출력 : 첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.
//예제 입력 : 7, 3

package com.backjoon.step1;

import java.util.Scanner;

public class Num_10869 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int add = a + b;
		int minus = a - b;
		int multiplication = a * b;
		int division = a / b;
		int result = a % b;
		
		//출력
		System.out.println(add);
		System.out.println(minus);
		System.out.println(multiplication);
		System.out.println(division);
		System.out.println(result);

		sc.close();

	}

}
