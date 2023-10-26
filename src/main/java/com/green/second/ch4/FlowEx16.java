package com.green.second.ch4;

public class FlowEx16 {
    public static void main(String[] args) {
        String line = MyStar.star(4 ); //*****
        String line2 = MyStar.star(1); //***
        System.out.print(line);
        System.out.print(line2);
        System.out.println("------");
        String line3 = MyStar.multiStar(4); //*4개짜리 4줄
        System.out.print(line3);
        System.out.println("------");
        String line4 = MyStar.triangleStar(3);
        //*
        //**
        //***
        System.out.println(line4);
    }
}
class MyStar {
    public static String star(int num) {
        StringBuilder sb = new StringBuilder(); // StringBuilder sb = new StringBuilder("ddd"); 초기값도 줄수있음
        for(int i=0; i<num; i++) {
            sb.append("*");
        }
        sb.append("\n");
        return sb.toString();
    }
    public static String multiStar(int num) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<num; i++) {
            sb.append(star(num)); //같은 클래스 내에서 메소드 호출
        }
        return sb.toString();
    }

    public static String triangleStar(int num) {
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=num; i++) {
            sb.append(star(i));
        }
        return sb.toString();
    }
}
