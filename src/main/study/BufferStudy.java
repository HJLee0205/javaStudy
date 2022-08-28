package main.study;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Buffer
 */

public class BufferStudy {
    public static void main(String args[]) throws IOException{
        String inputData = bufferedReaderEx();

        if(inputData == null || "".equals(inputData)) {
            System.out.println("입력값 없음");
        } else {
            bufferedWriterEx(inputData);
        }

    }

    /**
     * 버퍼를 이용한 입력 (BufferedReader)
     * 2022. 08. 14
     * */
    public static String bufferedReaderEx() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputVal = br.readLine();

        return inputVal;
    }

    /**
     * 버퍼를 이용한 출력 (BufferedWriter)
     * 2022. 08. 14
     * */
    public static void bufferedWriterEx(String param) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 가공 데이터 출력
        for (Object val : dataProcess(param)) {
            // 버퍼에 있는 값 모두 출력
            bw.write("item : "+(String)val+"\n");
            // 남아있는 데이터 모두 출력
            bw.flush();
        }

        // 스트림을 닫음
        bw.close();
    }

    /**
     * 출력 전 데이터 가공 (StringTokenizer, split())
     * 2022. 08. 28
     * */
    public static ArrayList dataProcess(String data) {

        ArrayList result = new ArrayList();

        // 1. StringTokenizer : 공백 데이터 제외
        StringTokenizer stSpace = new StringTokenizer(data);    // 띄어쓰기로 구분
        StringTokenizer stGubun = new StringTokenizer(data, "-");   // 구분자로 구분
        StringTokenizer stTF = new StringTokenizer(data, "-", true);    // 구분자 토큰 포함 (default : false)

        // 남은 토큰 갯수 호출
        // nextToken 메소드를 호출할 수 있는 수 (모든 갯수 x)
        int count = stGubun.countTokens();
        System.out.println("저장 전 토큰 수 : " + count);

        // 토큰 리스트 저장
        while(stGubun.hasMoreTokens()) {
            result.add(stGubun.nextToken());
        }

        count = stGubun.countTokens();
        System.out.println("저장 후 토큰 수 : " + count);

        return result;
    }

    // testData : Daphne-Ficus-Iris-Maackia-Lythrum-Myrica-Sabia-Flos
}
