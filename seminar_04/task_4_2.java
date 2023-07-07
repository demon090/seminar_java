/*
 *  Реализуйте очередь с помощью LinkedList со следующими методами:
    enqueue() - помещает элемент в конец очереди,
    dequeue() - возвращает первый элемент из очереди и удаляет его,
    first() - возвращает первый элемент из очереди, не удаляя.
 */

package seminar_04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.LinkedList;


public class task_4_2{
    public static void enqueue(LinkedList<Integer> lis, int el){
        lis.add(el);
    }

    public static int dequeue(LinkedList<Integer> lis){
        int a = lis.getFirst();
        lis.removeFirst();
        return a;

    }

    public static int first(LinkedList<Integer> lis){
        return lis.getFirst();
    }

    public static void main(String[] args) {
        LinkedList<Integer> lis = new LinkedList<>(Arrays.asList());
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("введите число");
        for(int i = 0; i < 10; i++){
            lis.add(rand.nextInt(100));
        }
        
        enqueue(lis, scan.nextInt());
        System.out.println(lis);
        System.out.println(dequeue(lis));
        System.out.println(lis);
        System.out.println(first(lis));
        System.out.println(lis);
        scan.close();
    }
}
