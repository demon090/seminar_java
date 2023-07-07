/*
 * Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
 */


package seminar_04;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class task_4_1 {
    public static LinkedList<Integer> reverse(LinkedList<Integer> lis) {
        LinkedList<Integer> rev_lis = new LinkedList<>();
        for(int i=lis.size()-1;i>=0;i--){
            rev_lis.add(lis.get(i));
        }
        return rev_lis;
    }

    public static void main(String[] args) {
        LinkedList<Integer> lis = new LinkedList<>(Arrays.asList());
        Random rand = new Random();
        for (int i = 0; i < 10; i++){
            lis.add(rand.nextInt(100));
            
        }
        System.out.println(lis);
        System.out.println(reverse(lis));
    }
}
