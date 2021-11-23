package level01;

import java.util.Scanner;

//10869 사칙연산
public class step01_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int plus = a + b;
        int minus = a - b;
        int mult = a * b;
        int div = a / b;
        int mod = a % b;

        System.out.println(plus);
        System.out.println(minus);
        System.out.println(mult);
        System.out.println(div);
        System.out.println(mod);

    }
}
