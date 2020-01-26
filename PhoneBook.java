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



    HashMap<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();

    public void printBook(){
        for (Map.Entry<String, ArrayList<String>> o : hm.entrySet()) {
            System.out.println(o.getKey() + ": " + o.getValue());

        }
    }
    public void findPhone(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Для поика номера телефона, введите фамилию:");
        String FIO = sc.nextLine();
     for(Map.Entry<String, ArrayList<String>> o : hm.entrySet()){
            if(hm.containsKey(FIO)){
                ArrayList<String> tel = new ArrayList<>(hm.get(FIO));
                System.out.println("Номер телефона " + FIO + ": " + tel.get(0));
            } else System.out.println("Такого человека нет в телефонной книге");
         break;
            }
        }
    public void findEmail(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Для поиска e-mail, введите фамилию:");
        String FIO = sc.nextLine();
        for(Map.Entry<String, ArrayList<String>> o : hm.entrySet()){
            if(hm.containsKey(FIO)){
                ArrayList<String> tel = new ArrayList<>(hm.get(FIO));
                System.out.println("e-mail " + FIO + ": " + tel.get(1));
            } else System.out.println("Такого человека нет в телефонной книге");
            break;
        }

    }






}
