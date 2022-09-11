package main.baekjoon.no10951;

import java.io.*;
import java.util.StringTokenizer;

/**
 * no.10951
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오. (4)
 *  - 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 *  - 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 2022. 09. 04
 * */
public class Main {
    public static void main(String args[]) throws IOException {
        // 필드 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String str;

        // 입력값 분기 처리
        while( (str=br.readLine()) != null ){

            // 데이터 삽입
            st = new StringTokenizer(str," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(a+b).append("\n");

        }

        // 결과 출력
        System.out.print(sb);
    }
}
