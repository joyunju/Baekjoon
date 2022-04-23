//두 수를 비교한 결과를 출력하는 문제
//문제 : 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
//입력 : 첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
//출력 : 첫째 줄에 다음 세 가지 중 하나를 출력한다.
//A가 B보다 큰 경우에는 '>'를 출력한다.
//A가 B보다 작은 경우에는 '<'를 출력한다.
//A와 B가 같은 경우에는 '=='를 출력한다.
//제한 : -10,000 ≤ A, B ≤ 10,000
//예제 입력 : 1 2 --> 결과 값 : < 

package com.backjoon.step2;

import java.util.Scanner;

public class Num_9498 {

	public static void main(String[] args) {
		
		//스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		//값 입력 받기 
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		//if 조건문
		if(A>B) {
			System.out.println(">");
		}else if(A<B) {
			System.out.println("<");
		}else {
			System.out.println("==");
		}
		
		
		sc.close();

	}

}
