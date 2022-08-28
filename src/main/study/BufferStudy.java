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
            bufferedWriterEx("입력값 없음");
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

        bw.write(param);    // 버퍼에 있는 값 전부 출력
        bw.flush();     // 남아있는 데이터 모두 출력
        bw.close();     // 스트림을 닫음
    }

}
