package AtCoderBeginnersSelection;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int answer = 0;
        if (a / 100 == 1) {
            answer++;
        }
        if ((a /10) % 10 == 1) {
            answer++;
        }
        if (a % 10 == 1) {
            answer++;
        }
        System.out.println(answer);
    }
}
