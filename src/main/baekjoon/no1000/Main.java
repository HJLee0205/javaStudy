package main.baekjoon.no1000;

import java.util.Scanner;

/**
 * no.1000
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * 2022. 09. 03
 * */
public class Main {
    public static void main(String args[]) {
        // 입출력 객체 선언
        // 출력 데이터가 적을 때 Buffer 사용은 오히려 성능 저하를 일으킬 수 있음
        Scanner scan = new Scanner(System.in);
        int sum = 0;

        // 입력값 받기
        String val[] = scan.nextLine().split(" ");

        // 일력값 합산
        for(String item : val) {
            sum += Integer.parseInt(item);
        }

        // 결과 출력
        System.out.println(sum);
    }
}
