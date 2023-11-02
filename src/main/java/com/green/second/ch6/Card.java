package com.green.second.ch6;

public class Card {
    private String pattern;
    private String denomination;

    //생성자 > 리턴타입x, 이름이 클래스명과 동일
    public Card (String pattern, String denomination) {
        this.pattern = pattern;
        this.denomination = denomination;
                            // 생성자는 객체 생성할때 딱한번 호출가능
    }
    @Override
    public String toString() {
        return String.format("%s(%s)", pattern, denomination);
    }
}


