package org.example.hw.block1_1_objects;

import lombok.*;

/*
   Создайте сущность Точка, расположенную на двумерной плоскости, которая описывается:
   • Координата Х: целое число
   • Координата Y: целое число
   • Может возвращать текстовое представление вида “{X;Y}”
Необходимо создать три точки с разными координатами и вывести на экран их текстовое представление.
    */
@Data
@AllArgsConstructor
//@NoArgsConstructor - удален, чтобы нельзя было создать точку без указания
// координат (условие из задачи 1.4.1.)
public class Point {
    private int x;
    private int y;

    public String getTextRepresentation() {
        return "{" + x + ";" + y + "}";
    }
}
