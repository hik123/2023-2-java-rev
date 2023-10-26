package com.green.second.ch4;

public class FlowEx4 {
    public static void main(String[] args) {
        ScoreBox sb1 = new ScoreBox(60); //객체화 왜? (90)이라는 값을 가지고있기위해
        ScoreBox sb2 = new ScoreBox(100); // 값이 멤버필드에 저장되 있어야 의미가있다
        sb1.printGrade();
        sb2.printGrade();

        //score값이 90점보다 같거나 크면 A학점 출력
        //score값이 80점보다 같거나 크면 B학점 출력
        //score값이 70점보다 같거나 크면 C학점 출력
        //나머지는 D학점
    }
}

class ScoreBox {
    private int score;

    public ScoreBox(int score) {
        this.score = score;
    }

    public void printGrade() { //static붙은 메소드는 멤버필드 사용못함
        String grade = "D";
        if(score >= 90) { grade = "A"; }
        else if(score >= 80) { grade = "B"; }
        else if(score >= 70) { grade = "C"; }
        System.out.printf("%s학점\n",grade);

    /* String grade = "D학점"
    if(this.score >= 0 || this.score <= 100) {
        if (this.score >= 90) {
            grade = "A학점";
        } else if (this.score >= 80) {
            grade = "B학점";
        } else if (this.score >= 70) {
            grade = "C학점";
        } */
    }
}
