/*
 * В калькулятор (урок 1 и 2) добавьте возможность отменить последнюю операцию.
 */

package seminar_04;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class task_4_3{
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите два числа:      ");
        double first_num = scan.nextDouble();
        double second_num = scan.nextDouble();
        double count = 0;
        System.out.println("Выберите оператор (+, -, /, *,):        ");
        char res = scan.next().charAt(0);
        Deque <Double> list = new LinkedList<>();
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
            System.out.println(input_operation(scan));
     }   
    public static void reset_operation(Deque <Double> list ) {
        if (!list.isEmpty()) {
            list.removeLast();
            System.out.println("Операция отменена");
            if (list.isEmpty()) {
                list.addLast(0.0);    
            }
        }
        System.out.println("Работаем с результатом " + list.getLast());
    }
    
    public static String input_operation(Scanner scanner) {
        System.out.println("Введите оператор действия (+, -, *, /) или 'Отмена'");
        String oper = scanner.next().toLowerCase();
        if ((!oper.equals("+")) & (!oper.equals("-")) & (!oper.equals("*")) & (!oper
                    .equals("/")) & (!oper.equals("отмена"))) {
                System.out.println("none");
                oper = input_operation(scanner);
                scanner.nextLine();
        }
        return oper;
    }

}
    

