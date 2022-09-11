package main.baekjoon.no10953;

import java.io.*;
import java.util.StringTokenizer;

/**
 * no.10953
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오. (6)
 *  - 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 *  - 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다.  (0 < A, B < 10)
 *  - A와 B는 콤마(,)로 구분되어 있다.
 * 2022. 09. 11
 * */
public class Main {
    public static void main(String args[]) throws IOException {
        // 필드 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        // 테스트 케이스 개수 입력
        int tcase = Integer.parseInt(br.readLine());

        // 데이터 삽입
        for(int i = 0; i < tcase; i++) {
            int sum = 0;
            String val = br.readLine();
            st = new StringTokenizer(val, ",");

            // 토큰 수 만큼 합산
            while(st.hasMoreTokens()) {
                sum += Integer.parseInt(st.nextToken());
            }

            sb.append(sum).append("\n");
        }

        // 결과 출력
        System.out.print(sb);
    }
}
