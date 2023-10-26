package com.green.second.ch4;

import java.util.Arrays;

public class FlowEx32 {
    public static void main(String[] args) {
        int val = MyUtils.abs(10); //10
        int val2 = MyUtils.abs(-10); //10
        int val3 = MyUtils.abs(-20); //20
        int val4 = MyUtils.abs(22); //22
        System.out.println(val);
        System.out.println(val2);
        System.out.println(val3);
        System.out.println(val4);

        System.out.println("-------");
        int rNum = MyUtils.randomVal(20, 50); // 20~50 사이 랜덤값 나올 수 있도록
        int rNum2 = MyUtils.randomVal(10, 33); // 10~33 사이 랜덤값 나올 수 있도록
        System.out.println(rNum);
        System.out.println(rNum2);

        System.out.println("-------");
        int sum = MyUtils.sumFromTo(10, 30); // 10~30 모두 더한값 리턴
        int sum2 = MyUtils.sumFromTo(12, 32); // 12~32 모두 더한값 리턴
        System.out.println(sum);
        System.out.println(sum2);

        System.out.println("-------");
        String gugudan3 = MyUtils.gugudan(9);
        System.out.println(gugudan3);
        /* 문자열로 만들어야됨
        3 x 1 = 3 ...
        3 x 2 = 6
         */
    }
}
class MyUtils {
    public static int abs(int num) {
        return num < 0 ? -num : num;
    }

    public static int randomVal(int min, int max) {
        int rVal = (int)(Math.random() * (max - min + 1)) + min;
        return rVal;
    }

    public static int sumFromTo(int min, int max) {
        int sum = 0;
        for(int i=min; i<=max; i++) {
            sum += i;
        }
        return sum;
    }                            // String str;선언만 하면 값이 null임, primitive타입은 초기화하고 사용 //for문에서 문자열합치기는 별로
    public static String gugudan(int num) {
        StringBuilder sb = new StringBuilder(); //for문을 통해서 문자열 합치기 해야할 경우 StringBuilder사용하기!!
        String str = "";
        for(int i=1; i<10; i++) {
            sb.append(String.format("%d x %d = %d\n", num, i, num*i));
        }
        return sb.toString();
    }

    public static String gugudan2(int dan) {
        StringBuilder sb = new StringBuilder(); //for문을 통해서 문자열 합치기 해야할 경우 StringBuilder사용하기!!
        sb.append("1");
        sb.append("2");
        sb.append("3");
        sb.append("4");
        return sb.toString();
    }
}
