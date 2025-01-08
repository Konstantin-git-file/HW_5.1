package org.example.hw.block1_3_arrays.task1;

import lombok.Data;

import java.util.Arrays;

/*
1.3.1 Студент. Создайте сущность Студент, которая описывается:
    • Имя: строка
    • Оценки: массив целых чисел.
    • Может возвращать текстовое представление вида “Имя: [оценка1, оценка2,…,оценкаN]”
Необходимо выполнить следующие задачи:
    1. Создать студента Васю с оценками: 3,4,5.
    2. Создать студента Петю и скопировать оценки Васи, присвоив содержимое поля с
    оценками Васи полю с оценками Пети.
    3. Заменить первую оценку Пети на число 5. Вывести на экран строковое представление
    Васи и Пети. Объяснить результат
    4. Создать студента Андрея и скопировать ему оценки Васи так, чтобы изменение оценок Васи
    не влияло на Андрея.
 */
@Data
//@AllArgsConstructor - условие по п. 1.4.7.
public class Student {
    private String name;
    private int[] grades;

    public Student(String name, int... grades) {
        this.name = name;
        this.grades = grades;
    }

    @Override
    public String toString() {
        return name + ": " + Arrays.toString(grades);
    }
}
