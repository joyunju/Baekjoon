//문제 : 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램 작성
//입력 : 첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
//출력 : 시험 성적을 출력한다.
//예제 입력 : 100 --> 예상 결과값 : A

package com.backjoon.step2;

import java.util.Scanner;

public class Num_9498 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		//시험 점수에 따른 결과값 출력 조건문
		
		if (num <= 100 && num >= 90) {
			System.out.print("A");
		} else if (num >= 80 && num <= 89) {
			System.out.print("B");
		} else if (num >= 70 && num <= 79) {
			System.out.print("C");
		} else if (num >= 60 && num <= 69) {
			System.out.print("D");
		} else {
			System.out.print("E");
		}

		sc.close();
	}

}
