package Prob03_0617;

public class Car {
    private static int serialNum = 10001;

    private int carNum;

    public int getCarNum() {
        return carNum;
    }

    public void setCarNum(int carNum) {
        this.carNum = carNum;
    }

    public Car() {
        serialNum++;
        carNum = serialNum;
    }
}
