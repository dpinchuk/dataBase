package main;

public class Main {

    {
        System.out.println(Main.class);
    }

    public static void main(String[] args) {
        new Human("Иванов", "Иван", "Иванович", (byte) 32, "Системный администратор");
        new Human("Петров", "Петр", "Петрович", (byte) 34, "Системный программист");
        new Human("Сидоров", "Сидор", "Сидорович", (byte) 38, "Системный аналитик");
        new Human("Тяпунов", "Евгений", "Николаевич", (byte) 37, "Менеджер");

        //Human.showAllHuman();
        Human.showCurrentHuman("q");

    }

}