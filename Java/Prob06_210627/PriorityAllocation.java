package Prob06_210627;

public class PriorityAllocation implements Scheduler {

    @Override
    public void getNextCall() {
        System.out.println("등급이 높은 고객을 우선으로 가져옵니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("VIP고객 전담 상담원에게 연결합니다.");
    }
}
