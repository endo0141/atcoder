import java.util.*;

public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //スペース区切りの入力
        int a = sc.nextInt();
        int b = sc.nextInt();
        //偶数か判定
        if ((a*b)%2 == 0) {
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
}
