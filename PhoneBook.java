import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Написать простой класс PhoneBook(внутри использовать HashMap):
  - В качестве ключа использовать фамилию
  - В каждой записи всего два поля: phone, e-mail
  - Отдельный метод для поиска номера телефона по фамилии (ввели фамилию, получили ArrayList телефонов),
  и отдельный метод для поиска e-mail по фамилии. Следует учесть, что под одной фамилией может быть несколько записей.
  Итого должно получиться 3 класса Main, PhoneBook, Person.
 */
public class PhoneBook {
   private String FIO;


    HashMap<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();

    public void printBook(){
        for (Map.Entry<String, ArrayList<String>> o : hm.entrySet()) {
            System.out.println(o.getKey() + ": " + o.getValue());

        }
    }
    public void findPhone(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите фамилию:");
        String FIO = sc.nextLine();
     for(Map.Entry<String, ArrayList<String>> o : hm.entrySet()){
            if(hm.containsKey(FIO)){
                ArrayList<String> tel = new ArrayList<>(o.getValue());
                System.out.println("Номер телефона: " + tel.get(1));
            } else {System.out.println("Нет такой записи");}
            }
        System.out.println("НЕ РАБОТАЕТ");
        }
    public void findEmail(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите фамилию:");
        String FIO = sc.nextLine();
        for(Map.Entry<String, ArrayList<String>> o : hm.entrySet()){
            if(hm.containsKey(FIO)){
                ArrayList<String> tel = new ArrayList<>(o.getValue());
                System.out.println("e-mail: " + tel.get(2));
            } else {System.out.println("Нет такой записи");}
        }
        System.out.println("НЕ РАБОТАЕТ");
    }






}
