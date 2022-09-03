package main.baekjoon.no2558;

import java.io.*;

/**
 * no.2558
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오. (2)
 * 2022. 09. 03
 * */
public class Main {
    public static void main(String args[]) throws IOException {
        // 필드
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        // 입력값 받기
        String a = br.readLine();
        String b = br.readLine();
        sum = Integer.parseInt(a)+Integer.parseInt(b);

        // 결과 출력
        System.out.println(sum);
    }
}
