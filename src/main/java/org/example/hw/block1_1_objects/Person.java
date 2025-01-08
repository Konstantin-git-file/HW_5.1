package org.example.hw.block1_1_objects;

import lombok.*;

/*
Создайте сущность Человек, которая описывается:
    • Имя: строка
    • Рост: целое число
    • Может возвращать текстовое представление вида “Name, рост: height”, где Name и height это переменная с именем и ростом.
Необходимо создать и вывести на экран текстовое представление следующих людей:
    • Человек с именем “Клеопатра” и ростом 152
    • Человек с именем “Пушкин” и ростом 167
    • Человек с именем “Александр” и ростом 189
 */

@Data
public class Person {
    private Name name;
    private int height;
    private Person father;

    private Person(Name name, int height, Person father) {
        this.name = name;
        this.height = height;
        this.father = father;
    }

    // только с именем
    public Person(String firstName) {
        this(new Name(firstName), 0, null);
    }

    // только с Name
    public Person(Name name) {
        this(name, 0, null);
    }

    // c именем и отцом
    public Person(String firstName, Person father) {
        this(new Name(firstName), 0, father);
    }

    // c именем Name и отцом
    public Person(Name name, Person father) {
        this(name, 0, father);
    }

    public String getTextRepresentation() {
        return name + ", рост: " + height;
    }

    @Override
    public String toString() {
        String lastName = name.getLastName();
        String firstName = name.getFirstName();
        String middleName = name.getMiddleName();

        // если фамилии нет, то тогда фамилия отца
        if (lastName == null || lastName.isEmpty()) {
            if (father != null && father.getName().getLastName() != null) {
                lastName = father.getName().getLastName();
            } else {
                lastName = "";
            }
        }

        // если отчества нет, то тогда имя отца с добавлением "-ович"
        if (middleName == null || middleName.isEmpty()) {
            if (father != null && father.getName().getFirstName() != null) {
                middleName = father.getName().getFirstName() + "ович";
            } else {
                middleName = "";
            }
        }

        return String.join(" ",
                lastName != null ? lastName : "",
                firstName != null ? firstName : "",
                middleName != null ? middleName : "").trim();
    }
}
