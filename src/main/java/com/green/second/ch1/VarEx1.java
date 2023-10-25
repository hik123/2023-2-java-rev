package com.green.second.ch1;

public class VarEx1 {
    public static void main(String[] args) {
        //기본형, primitive type > 8;
        //정수형
        byte v1;
        short v2;
        int v5;
        long v3;

        //실수형
        double v4;
        float v7;

        //논리형(불린형)
        boolean v6;

        //문자형
        char v8;

        //레퍼런스 타입 대문자로 시작함  // 주소값을 저장할수있는 변수
        String str; //String객체의 주소값만 담을수있다.

        v5 = 5; //변수가 가지고있는 값을 변경 (=)대입연산자
        v5 = 15; //오른쪽 값을 복사하여 왼쪽에 준다 담는다
        v5 = 10 + 10; // =은 오른쪽의 연산 먼저 수행
        //v5 = 20;
        // 변수에 값을 처음넣는 것을 (초기화) 라고함
    }
}
