package com.green.second.ch3;

public class OperatorEx24 {
    public static void main(String[] args) {
        System.out.println(true && true && 1 < 0);// and연산자&& ()맨왼쪽부터 실행 // false연산자 하나라도 있으면false
        System.out.println(false && true && (10 / 0) == 0); //and연산자는 false 바로 뜨면 나머지는 연산 안함!

        System.out.println("-------------------");
        System.out.println(true || true || false); //or연산자|| 하나라도 true가 있으면 true
        System.out.println(true || true || (10 / 0) == 0); //true뜨면 나머지연산x 바로 true / true를 앞쪽에넣는게 연산이적으니 퍼포먼스상 좋다
    }
}
