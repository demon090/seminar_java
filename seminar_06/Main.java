package seminar_06;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Cat> catSet = new HashSet<>();

        Cat cat1 = new Cat("Барсик", 3);
        Cat cat2 = new Cat("Васька", 5);
        Cat cat3 = new Cat("Кеша", 2);
        Cat cat4 = new Cat("Барсик", 3);

        catSet.add(cat1);
        catSet.add(cat2);
        catSet.add(cat3);
        catSet.add(cat4);

        for(Cat cat : catSet){
            System.out.println(cat.getName() + ':' + cat.getAge());
        }

    }
}
