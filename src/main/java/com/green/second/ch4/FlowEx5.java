package com.green.second.ch4;

public class FlowEx5 {
    public static void main(String[] args) {
        ScoreBoxOpt sbo = new ScoreBoxOpt();
        sbo.setScore(80); //멤버필드 이름이 score라는 걸 알수있다, (100)보내주는 값을보면 타입은 정수형.

        ScoreBoxOpt sbo2 = new ScoreBoxOpt();
        sbo2.setScore(79);

        //score값이 90점보다 같거나 크면 A학점 리턴
        //score값이 80점보다 같거나 크면 B학점 리턴
        //1의 자리수가 8이상이면 +, 3이하면 -, 나머지는0
        //나머지 C학점 리턴
        String grade1 = sbo.getGrade();
        String grade2 = sbo2.getGrade();
        System.out.println(grade1);
        System.out.println(grade2);

    }
}
class ScoreBoxOpt {
    private int score;
    private String grade;

    public void setScore(int score) {
        this.score = score;
    }

    public String getGrade() {
        if( score < 0 || score > 100) {
            return "잘못된 점수입니다.";
        } else if( score == 100 ) {
            return "A+";
        } else if( score < 80 ) {
            return "C";
        }
        String opt = "0";
        if( score < 90 ) {
            grade = "B";
        } else if( score >= 90 ) {
            grade = "A";
        }
        if( score % 10 >= 8) {
            opt = "+";
        } else if ( score % 10 <= 3) {
            opt = "-";
        }
        return grade+opt;
        /*
        if (score == 100) {
            return "A+";
        } else if (score < 80) {
            return "C";
        }
        String grade = "A";
        if(score < 90) { grade="B";}

        String opt = "0";
        int modVal = score % 10;
        if(modVal >= 8) { opt = "+"; }
        else if(modVal <= 3) { opt = "-"; }

        return grade + opt;
         */

    }
}
