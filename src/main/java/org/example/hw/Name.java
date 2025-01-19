package org.example.hw;

import lombok.*;
/*
1.1.3
Имена. Создайте сущность Имя, которая описывается тремя параметрами:
    • Фамилия: строка
    • Личное имя: строка
    • Отчество: строка
Имя может быть приведено к строковому виду, включающему традиционное представление всех трех параметров: Фамилия Имя Отчество (например “Иванов Иван Иванович”). Необходимо предусмотреть возможность того, что какой-либо из параметров может быть не задан, и в этом случае он не учитывается в итоговом тексте.
Необходимо создать и вывести на экран текстовое представление следующих имен:
    • Клеопатра
    • Пушкин Александр Сергеевич
    • Маяковский Владимир
 */
@Data
@NoArgsConstructor
//@AllArgsConstructor по условиям по 1.4.5.
public class Name {
    private String lastName;
    private String firstName;
    private String middleName;

    // только с именем
    public Name(String firstName) {
        this.firstName = firstName;
        this.lastName = null;
        this.middleName = null;
    }

    //  с именем и фамилией
    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = null;
    }

    //  с именем, фамилией и отчеством
    public Name(String firstName, String lastName, String middleName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }

    @Override
    public String toString() {
        return String.join(" ",
                lastName != null ? lastName : "",
                firstName != null ? firstName : "",
                middleName != null ? middleName : "").trim();
    }
}
