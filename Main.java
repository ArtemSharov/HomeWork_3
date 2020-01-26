import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.newRecord("Иванов", "8-962-111-11-11 ivanov@mail.com");
        p.newRecord("Петров", "8-962-222-22-22 petrov@mail.com");
        p.newRecord("Сидоров", "8-962-333-33-33 sidorov@mail.com");
        p.printBook();
        p.findPhone();
        p.findEmail();




    }
}
