package com.green.second.ch2;

public class CastingEx1 {
    public static void main(String[] args) {
        byte v1 = 10;
        short v2 = 20;
        int v3 = 30;
        long v4 = 40;
        float v5 = 50.1f;
        double v6 = 50.1;

        v2 = v1;   //아랫방향으로 형변환 됐을때 문제없다
        v3 = v2;
        v4 = v3;
        v5 = v4;
        v6 = v5;

        v5 = (float)v6; //강제형변환
        v4 = (long)v5;

        String str ="안녕" + v6;
        System.out.println(str);
    }
}
