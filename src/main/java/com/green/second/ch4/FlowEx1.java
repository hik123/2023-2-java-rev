package com.green.second.ch4;

import java.util.Scanner;

public class FlowEx1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 하나 입력하세요 > ");
        String input = scan.nextLine();

        try {
            int intVal = Integer.parseInt(input);
            if (intVal != 0 && intVal > 0) {
            System.out.printf("%d는 %s 입니다.", intVal, intVal % 2 == 0 ? "짝수" : "홀수");
            }
        } catch (Exception e) {
            System.out.println("잘못된 입력입니다.");
        }
    }
}
