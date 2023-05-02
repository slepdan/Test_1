package Exercise_3;

import java.util.Scanner;

public class Exercise_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = 1;
        while (n != 0) {
            n = sc.nextInt();
            sum = sum + n;
        }
        System.out.print(sum);
    }
}
