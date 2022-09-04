package main.baekjoon.no10950;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * no.10950
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오. (3)
 *  - 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 *  - 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 2022. 09. 04
 * */
public class Main {
    public static void main(String args[]) {
        // 입출력 필드
        ArrayList<Integer> list = new ArrayList();
        Scanner scan = new Scanner(System.in);

        // 테스트 케이스 개수 받기
        int tcase = Integer.parseInt(scan.nextLine());

        // 테스트 케이스 생성
        for(int i = 0; i<tcase; i++) {
            int result = 0;
            String val[] = scan.nextLine().split(" ");
            for(String item : val) {
                result += Integer.parseInt(item);
            }
            list.add(result);
        }

        // 입력 종료 (런타임 에러 방지)
        scan.close();

        // 테스트 케이스 출력
        for(int item : list) {
            System.out.println(item);
        }
    }
}