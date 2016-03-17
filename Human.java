package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Human {

    {
        System.out.println(Human.class);
    }

    static private int id;
    static private Map<Integer, Human> dataBase = new HashMap<Integer, Human>();

    private String surname;
    private String name;
    private String patronymic;
    private byte age;
    private String position;

    Human(String surname, String name, String patronymic, byte age, String position) {
        this.surname    = surname;
        this.name       = name;
        this.patronymic = patronymic;
        this.age        = age;
        this.position   = position;
        ++id;
        getHuman(this);
        addHuman(this);
        System.out.println("\n");
    }

    public void getHuman(Human human) {
        System.out.println("В БД добавлен новый сотрудник:");
        System.out.println("id: " + id);
        System.out.println("Имя нового сотрудника: " + human.surname + " " + human.name + " " + human.patronymic);
        System.out.println("Возраст: " + human.age);
        System.out.println("Должность: " + human.position);
    }

    private void addHuman(Human human) {
        Human.dataBase.put(id, human);
    }

    static void showAllHuman() {
        for (Map.Entry<Integer, Human> entry : Human.dataBase.entrySet() ) {
            System.out.println("id:        " + entry.getKey());
            System.out.println("Фамилия:   " + entry.getValue().surname);
            System.out.println("Имя:       " + entry.getValue().name);
            System.out.println("Отчество:  " + entry.getValue().patronymic);
            System.out.println("Возраст    " + entry.getValue().age);
            System.out.println("Должность: " + entry.getValue().position + "\n");
        }
    }

    static void showCurrentHuman(Object id) {
        Set<Map.Entry<Integer, Human>> set = Human.dataBase.entrySet();
        boolean b = false;
        for (Map.Entry<Integer, Human> map : set) {
            if (map.getKey().equals((Integer)id)) {
                System.out.println("Данные о работнике с id = " + id + ":");
                System.out.println("id:        " + id);
                System.out.println("Фамилия:   " + map.getValue().surname);
                System.out.println("Имя:       " + map.getValue().name);
                System.out.println("Отчество:  " + map.getValue().patronymic);
                System.out.println("Возраст    " + map.getValue().age);
                System.out.println("Должность: " + map.getValue().position + "\n");
                b = true;
            }
        }
            if (!b) {
                System.out.println("Сотрудник с id = " + id + " в БД не найден! Убедитесь в правильности введенных данных.");
        }
    }

}