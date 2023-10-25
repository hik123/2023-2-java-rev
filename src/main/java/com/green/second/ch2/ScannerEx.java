package com.green.second.ch2;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //new옆에 생성자만 올수있다 /Scanner(System.in) 생성자 호출
        System.out.println("아무값 입력 >> ");
        String val = scan.nextLine(); //scan.nextLine();/객체화하고 호출함/static이 아니다

        //int intVal = Integer.parseInt(val); // Integer.parseInt(); 클래스이름. 객체화 안하고 바로 호출하면 static
        //  ㄴ 정수 외 값을 받으면 에러뜨니 MyUtils 이용해서 위험성배제
        int intVal = MyUtils.parseStringToInt(val);
        System.out.println("val : " + val);
        System.out.printf("intVal %d ", intVal);
    }
}

class MyUtils {
    public static int parseStringToInt(String val) {
        try {
            return Integer.parseInt(val);
        } catch (Exception e) {}
        return -1;
    }
}

