package day19_210717;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

// 큰 수의 법칙
public class Greedy02 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // 입력받은 수 정렬
        Arrays.sort(arr);

        int first = arr[N - 1];     // 가장 큰 수
        int second = arr[N - 2];    // 두번째로 큰 수

        // 가장 큰 수가 더해지는 횟수 계산
        int count = (M / (K + 1)) * K;
        count += M % (K + 1);

        int result = 0;
        result += count * first;
        result += (M - count) * second;

        System.out.println(result);
    }
}
