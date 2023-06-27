/*
 * Реализовать простой калькулятор
 */
package seminar_01;

import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите два числа:      ");
        double first_num = scan.nextDouble();
        double second_num = scan.nextDouble();
        double count = 0;
        System.out.println("Выберите оператор (+, -, /, *,):        ");
        char res = scan.next().charAt(0);
        switch (res) {
            case '+': count = first_num + second_num;
                break;
            case '-': count = first_num - second_num;
                break;
            case '/': count = first_num / second_num;
                break;
            case '*': count = first_num * second_num;
                break;
            default: System.out.println("o_O???");
                return;
        }
        System.out.printf(first_num + " " + res + " " + second_num + " " + " = " + count);
        


    }
}
