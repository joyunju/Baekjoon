//네 개의 계산식을 계산하는 문제.
//문제 : (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
//문제 : (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
//문제 : 세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
//입력 : 첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)
//출력 : 첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
//예제 입력 : 5 8 4

package com.backjoon.step1;

import java.util.Scanner;

public class Num_10430 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		//출력 
		System.out.println((A + B) % C);
		System.out.println(((A % C) + (B % C)) % C);
		System.out.println((A * B) % C);
		System.out.println(((A % C) * (B % C)) % C);

		sc.close();

	}

}
