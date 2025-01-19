package org.example.hw;

import lombok.AllArgsConstructor;
import lombok.Data;

/*
1.1.5.
Создайте сущность Дом, которая описывается одним параметром:
    • Количество этажей: целое число
 У Дома можно запросить текстовую форму, которое имеет представление вида “дом с N этажами”,
 где N это число. Гарантировать правильное окончание фразы, в зависимости от
 количества этажей. Создать и вывести на экран дома с 1, 5, 23 этажами.
 */
@Data
@AllArgsConstructor
public class House {
    private final int floors; // чтобы нельзя было изменить после создания по 1.4.4.

    @Override
    public String toString() {
        String ending;
        int lastDigit = floors % 10;
        int lastTwoDigits = floors % 100;

        if (lastTwoDigits >= 11 && lastTwoDigits <= 14) {
            ending = "этажами";
        } else if (lastDigit == 1) {
            ending = "этажом";
        } else if (lastDigit >= 2 && lastDigit <= 4) {
            ending = "этажами";
        } else {
            ending = "этажами";
        }

        return String.format("Дом с %d %s", floors, ending);
    }
}

