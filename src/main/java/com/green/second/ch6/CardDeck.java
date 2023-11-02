package com.green.second.ch6;

import java.util.ArrayList;
import java.util.List;

//Card 객체 주소값 여러개를 저장할 수 있는데 배열 X
public class CardDeck {  // 사용X Card[]
    private List<Card> cardList;
    public static final String[] patterns = { "Spade", "Heart", "Clova", "Diamond" };
    public static final int CARD_LEN = 13;
    public CardDeck() {
        cardList = new ArrayList();
        for(int i=0; i<patterns.length; i++) {
            for(int z=0; z<=CARD_LEN; z++) {
                String denomination = getDenomination(z);
                Card c =new Card(patterns[i], denomination);
                cardList.add(c);
            }
        }
        System.out.println("-----");
        for(Card c : cardList) {
            System.out.println(c);
        }
    }
        //카드 종류별로 A, 2~20, J, Q, K
        //Spade, Heart, Clova, Diamond   52개

    public String getDenomination(int val) {
        switch (val) {
            case 1:
                return "A";
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";
        }
        return String.valueOf(val);
    }
}
