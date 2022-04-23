// 나눗셈 문제. 이 문제에는 "스페셜 저지" 표시가 붙어 있는데, 이것은 예제 출력과 꼭 똑같이 출력할 필요는 없고 조건에 맞는 답을 출력하면 된다는 뜻입니다.
//문제 : 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
//입력 : 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
//출력 : 첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.
// 예제입력 : 1, 3

package com.backjoon.step1;

import java.util.Scanner;

public class Num_1008 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();

		System.out.println(a / b);

		sc.close();

	}

}
