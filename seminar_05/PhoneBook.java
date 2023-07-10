/*
 * Написать простой класс Телефонный Справочник (с помощью HashMap), который хранит в себе список фамилий и телефонных номеров.
   В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона по фамилии.
   Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
   тогда при запросе такой фамилии должны выводиться все телефоны.

   ***Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес),
   взаимодействие с пользователем через консоль и т.д). Консоль использовать только для вывода результатов проверки телефонного справочника.
 */

package seminar_05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class PhoneBook {
  private HashMap <String, List> contacts;

  public PhoneBook(){
    contacts = new HashMap<String, List>();
  }

  public void add_number(String name, String number){
    List numbers;

    if (contacts.containsKey(name)) {
      numbers = contacts.get(name);
    }
    else{
      numbers = new ArrayList();
      contacts.put(name, numbers);
    }
    numbers.add(number);
  }
  
  public void get_numbers(){
    for(String name:contacts.keySet()){
      System.out.print(name + ":");
      List<String> numbers = new ArrayList<>();
       numbers = contacts.get(name);
      
      for(String number : numbers){
        System.out.print(number + " ");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    PhoneBook pb = new PhoneBook();
    Scanner sc = new Scanner(System.in);
    while (true) {
      System.out.println("Введите 1 для добавления номера или 2 для показа всех номеров:    ");
      int choice = sc.nextInt();
      if (choice == 1) {
        System.out.println("Введите имя:    ");
        String name = sc.next();
        System.out.println("Введите номер:    ");
        String number = sc.next();
        pb.add_number(name, number);
        
      }
      else if (choice == 2) {
        pb.get_numbers();

      }
    }
  }
  
}
