package com.green.second.ch1;

public class VarEx2 {
    public static void main(String[] args) {
        int x = 10, y = 30; //선언과 동시에 초기화, 여러개도가능
        // x =을 만나면 쓰기 , 그냥  x 읽기
        System.out.printf("x: %d, y: %d\n", x, y); //f는 format뜻
                //x,y값 스와핑 해보기   //d 는 데시멀 10진수라는 뜻
        int tmp = x;
        x = y;
        y = tmp;
        System.out.printf("x: %d, y: %d\n", x, y);
    }
}
