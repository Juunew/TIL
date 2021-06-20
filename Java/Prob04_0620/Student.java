package Prob04_0620;

import java.util.ArrayList;

public class Student {
    // 학생이름
    String studentName;
    // 학번
    int studentId;
    // 학생의 수강과목
    ArrayList<Subject> subjectList;

    Student(String studentName, int studentId) {
        this.studentName = studentName;
        this.studentId = studentId;

        subjectList = new ArrayList<>();
    }
    // 과목추가
    public void addSubject(String name, int score) {
        // subject 클래스 참조
        Subject subject = new Subject();
        // 학생의 수강과목명
        subject.setName(name);
        // 학생의 수강과목점수
        subject.setScore(score);
        // 학생의 수강과목명과 과목점수를 과목배열에 추가
        subjectList.add(subject);
    }
    // 과목들의 정보 출력
    public void showScoreInfo() {
        // 총점 초기화
        int total = 0;
        // 배열에서 하나씩 꺼내기
        for(Subject subject : subjectList) {
            // 과목들 점수 총점
            total += subject.getScore();
            // 각 과목의 점수
            System.out.println(studentName + "학생의 " + subject.getName() + " 점수는" + subject.getScore() + "점 입니다.");
        }
        // 과목들 점수 총점
        System.out.println(studentName + "학생의 총점은" + total + "점 입니다.");
    }
}
