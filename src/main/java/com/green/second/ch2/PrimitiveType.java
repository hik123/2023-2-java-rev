package com.green.second.ch2;

public class PrimitiveType {
    public static void main(String[] args) {
        boolean b = true;
        b = false;

        byte n2 = 100;  //리터럴도 타입이있다
        int n1 = 100; // 100은 리터럴(값 그자체) // 상수는 한번입력된값이 변경되지않는것

        float f = 12.3f; // float f = 12.3 에러 // 12.3은 더블타입
                    //f가 붙으면 float타입이됨
        float f2 = (float)12.3;

        double d = 12.3;
        float f3 = (float)d; //변수일때는 f 붙일수 없으니 (float)강제형변환 이용

        long lng = 10000000000L; //리터럴쓸때 int값 벗어나는 숫자쓰려면 L붙이면됨 //L을 붙이면 리터럴이지만 long타입 됨

        int n3 = 100000;
        long lng2 = n3;
    }
}
