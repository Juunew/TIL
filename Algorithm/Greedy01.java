package day19_210717;

public class Greedy01 {

    public static void main(String[] args) {

        int n = 1260;
        int count = 0;
        int[] coinType = {500, 100, 50, 10};

        for(int i = 0; i < 4; i++) {
            int coin = coinType[i];
            count += n / coin;
            n %= coin;
        }

        System.out.println(count);
    }
}
