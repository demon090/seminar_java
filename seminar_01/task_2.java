/*
 * Вывести все простые числа от 1 до 1000
 */
package seminar_01;

//import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        
        for(int i = 1; i < 1000; i++ ){
            int k = 0;
           for(int j = 1; j < i + 1; j++){
                if (i % j == 0) {
                    k++;
                }
           }
           if (k == 2) {
            System.out.print(i + " ");
           }
        
        }
    }
}
