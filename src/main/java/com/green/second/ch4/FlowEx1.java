package com.green.second.ch4;

import java.util.Scanner;

public class FlowEx1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 하나 입력하세요 > ");
        String input = scan.nextLine();
        //추가지령1 nextInt() 메소드 사용금지
        //2 콘솔 입력 때 문자가 섞여 있으면 "잘못된 입력입니다." 출력
        /*if () {
            int intVal = Integer.parseInt(input);
            if (intVal % 2 == 0 && intVal != 0) {
                System.out.println("짝수입니다.");
            } else if (intVal % 2 == 1) {
                System.out.println("홀수입니다.");
            } else if (input ==)
                System.out.println("잘못된 입력입니다.");
        }*/

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
