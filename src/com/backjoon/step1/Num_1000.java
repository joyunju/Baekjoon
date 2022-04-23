//문제 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//입력 : 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
//출력 : 첫째 줄에 A+B를 출력한다.
//예제 입력1 : 1 , 2

package com.backjoon.step1;

import java.util.Scanner;

public class Num_1000 {

	public static void main(String[] args) {
		
		// Scanner 클래스를 사용
		Scanner sc = new Scanner(System.in);
		
		//입력받을 정수 변수 설정
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//합계 출력 
		System.out.println(a + b);

		sc.close();
	}

}
