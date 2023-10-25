package com.green.second.ch2;

public class Mission1 {
    public static void main(String[] args) {
        int n1 = 10, n2 = 3;
        //n1 / n2 했을 때 3.3333

        float r = (float)n1 / n2; //n2도 float으로 자동형변환됨
        //float r = 10.0f / 3.0f;
        //float r = 3.333333f;
        System.out.println(r);
        //System.out.printf("%1.01f",r); //소수점 뒷자리1개만 출력
    }
}
