/*
 * Пусть дан произвольный список целых чисел. Нужно удалить из него чётные числа
 */

 package seminar_03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class task_3_1 {

    public static void main(String[] args) {
        List numbers = new ArrayList();
        Random rand = new Random();

        for(int i = 0; i < 10; i++){
            numbers.add(rand.nextInt(100));
        }
        System.out.println(numbers);
        Iterator iterator = numbers.iterator();

        while (iterator.hasNext()) {
            int num = (int) iterator.next();
            
            if (num % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(numbers);
    }
}