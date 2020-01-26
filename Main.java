import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();
        Person p = new Person();
        p.newRecord("Иванов И.И.", "8-962-222-11-22 ivanov@mail.com");
        p.newRecord("Шарова А.А.", "8-962-222-11-22 sharova@mail.com");
        p.newRecord("Шаров", "8-962 sharov@mail.com");
        p.printBook();

        pb.findPhone();
        pb.findEmail();


    }
}
