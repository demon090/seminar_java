/*
 * Нахождение минимального, максимального и среднего значения элементов массива
 */
package seminar_03;

import java.util.*;

public class task_3_2 {
    
    static Integer Max(List<Integer> arrList) {
        int max = arrList.get(0); 
        for (int i=0; i < arrList.size()-1; i++) {
            if (arrList.get(i) > max) {
                max = arrList.get(i);
            }
        } 
        return max;
    }

    static Integer Min(List<Integer> arrList) {
        int min = arrList.get(0); 
        for (int i=0; i < arrList.size()-1; i++) {
            if (arrList.get(i) < min) {
                min = arrList.get(i);
            }
        } 
        return min;
    }

    static Double mid(List<Integer> arrList) {
        int sum = 0; 
        double mid;
        for (int i=0; i < arrList.size()-1; i++) {
            sum += arrList.get(i);
        } 
        mid = sum / arrList.size();
        return mid;
    }
    public static void main(String[] args) {
        List<Integer> list_num = new ArrayList();
        Random rand = new Random();
        for(int i = 0; i < 10; i++){
            list_num.add(rand.nextInt(100));
        }
        
        
        System.out.println("Массив: " + list_num);
        System.out.println("Минимальное значение: " + Min(list_num));
        System.out.println("Максимальное значение: " + Max(list_num));
        System.out.println("Среднее значение: " + mid(list_num));
        
    }
}
