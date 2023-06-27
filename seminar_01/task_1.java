/*
 * Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 */
package seminar_01;

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("введите число:      ");
        int i = iScanner.nextInt();
        System.out.println(func(i));
        iScanner.close();
    }
    public static int func(int x) {
        return (x * (x + 1)) / 2;
    }
}

