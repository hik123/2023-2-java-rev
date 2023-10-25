package com.green.second.ch2;

public class StringEx {
    public static void main(String[] args) {
        String name = "Ja" + "va"; // "Ja"주소값과 "va"주소값이 더해져서 새로운주소값이 name에 들어감
        System.out.println(name);

        String title1 = "12" + 10 + 9;
        //String title1 = "12" + "10" + 9;
        //String title1 = "1210" + 9;
        //String title1 = "1210" + "9";
        //String title1 = "12109";
        System.out.println(title1); //12109

        String title2 = "12" + (10 + 9); //연산에서 소괄호() 가장 우선순위가 높음
        System.out.println(title2); //1219



        String str1 = new String("Hello");
        String str2 = new String("Hello");
        System.out.println("str1 == str2 : " + (str1 == str2));
        System.out.println("str1.equals(str2) : " + str1.equals(str2)); //동등성 비교 가지고있는값 비교
        System.out.println("----");                         //Object에 있는 equals는 주소값비교

        Numbox b1 = new Numbox(10);
        Numbox b2 = new Numbox(11); // b1과 값이 같을때 true 다를때 false 뜨게
        int num1 = b1.getNum();
        int num2 = b2.getNum();
        System.out.println(num1 == num2);

        System.out.println("b1 == b2 : " + (b1 == b2));
        System.out.println("b1.equals(b2) : "+ b1.equals(b2)); //true
        //System.out.println("b1.equals(b2) : "+ b1.equals(str1));
        System.out.println("b1.equals(str1) : "+ b1.equals(null)); //false
    }
}

class Numbox { //extends Object 자동으로 들어감 자동으로 Object 상속받음
    private int num;
    public Numbox(int num) { this.num = num; }
    public int getNum() { return num; }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Numbox)) {
            return false;
        }

        Numbox nb = (Numbox)obj;
        return num == nb.num; //연산의 결과값(true, false)이 리턴
    }
    @Override
    public String toString () {
        return String.format("num : %d", num);
    }
}
