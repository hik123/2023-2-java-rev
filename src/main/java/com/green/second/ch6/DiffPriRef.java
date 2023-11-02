package com.green.second.ch6;

public class DiffPriRef {

    public void changeVal(int num) { //A  //()매개변수
        num =  10;
    }
    public void changeVal(NumBox nb) { //B
        nb = new NumBox();
        nb.num = 20;
    }

    public static void main(String[] args) {
        int num = 1;
        DiffPriRef dp = new DiffPriRef();
        dp.changeVal(num); //A 호출하면서 num값을 전달   //인스턴스 메소드 호출 //static 안붙었으면 무조건 객체화 필요
        System.out.println(num);


        System.out.println("-----------");

        NumBox nb = new NumBox(); // new NumBox(); 생성자 호출
        nb.num = 1;
        dp.changeVal(nb);
        System.out.println(nb.num);

    }
}

class DiffPriRef2 {

    public static void changeVal(int num) { //A
        num =  10;

    }
    public static void changeVal(NumBox nb) { //B
        nb.num = 10;
    }

    public static void main(String[] args) {
        int num = 1;

        changeVal(num);       //같은 클래스 내 static메소드 호출
        System.out.println(num);
        //A 호출하면서 num값을 전달
    }
}
class NumBox {
    int num;
}