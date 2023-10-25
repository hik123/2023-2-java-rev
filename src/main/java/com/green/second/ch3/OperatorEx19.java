package com.green.second.ch3;

import java.util.Arrays;

public class OperatorEx19 {
    public static void main(String[] args) {
        int n1 = 15, n2 = 8;

        System.out.println("n1 / n2 : " + (n1 / n2));
        System.out.println("n1 % n2 : " + (n1 % n2));

        System.out.println("n1 1자리 숫자" + n1 % 10);
        System.out.println("---------");

        int rVal = (int) (Math.random() * 9) + 1;
        System.out.printf("%d는 %s입니다.\n"
                , rVal, rVal % 2 == 0 ? "짝수" : "홀수");
    }
}
