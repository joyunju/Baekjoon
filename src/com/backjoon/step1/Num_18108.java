//문제 : 불기 연도가 주어질 때 이를 서기 연도로 바꿔 주는 프로그램을 작성하시오.
//문제 풀이 : 서기연도와 불기 연도 차이가 543이기 때문에 결과값에서 빼고 출력해야함 
//입력 : 서기 연도를 알아보고 싶은 불기 연도 y가 주어진다. (1000 ≤ y ≤ 3000)
//출력 : 불기 연도를 서기 연도로 변환한 결과를 출력한다.
//예제 입력 : 2541

package com.backjoon.step1;

import java.util.Scanner;

public class Num_18108 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// y라는 변수에 불기 연도를 입력받기
		int year = sc.nextInt();

		// 불기와 서기 차이인 543만큼 뺀 결과값 출력
		System.out.println(year - 543);
		sc.close();

	}

}
