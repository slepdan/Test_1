package Exercise_1;
import java.util.Scanner;

import static java.lang.Math.*;

public class Exercise_1 {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y1 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.println("Длина отрезка равна: " + distance(x1,y1,x2,y2));
    }
    public static double distance(double x1, double y1, double x2, double y2){
        double result;
        result = sqrt(pow(x2 - x1,2) + pow(y2 - y1,2));
        return result;
    }
}
