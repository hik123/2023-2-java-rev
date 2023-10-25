package com.green.second.ch2;

public class OverUnderFlow {
    public static void main(String[] args) {
        short s1 = 129;
        byte b1 = (byte)s1;

        System.out.printf("b1 : %d\n", b1);

        short s2 = -128;
        byte b2 = 0;
        if(Byte.MAX_VALUE >= s2 && Byte.MIN_VALUE <= s2) { //primitive타입의 객체형 래퍼타입
            b2 = (byte)s2;
        }
        System.out.printf("b2 : %d\n", b2);
    }
}
