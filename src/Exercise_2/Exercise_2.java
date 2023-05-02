package Exercise_2;

import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(sum(a,b));
    }
    public static int sum(int a, int b){
       if(b==0){
           return a;
       }
       else {
           return sum(a+1,b-1);
       }
    }
}
