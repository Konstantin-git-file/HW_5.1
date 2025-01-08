package org.example.hw.block1_3_arrays;

import org.example.hw.block1_3_arrays.task1.Student;
import org.example.hw.block1_3_arrays.task2.Polyline;
import org.example.hw.block1_3_arrays.task3.City;
import org.example.hw.block1_1_objects.Point;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        // 1.3.1.
        Student vasya = new Student("Вася", new int[]{3, 4, 5});
        Student petya = new Student("Петя", vasya.getGrades());
        petya.getGrades()[0] = 5;
        System.out.println(vasya);
        System.out.println(petya);
        Student andrey = new Student("Андрей", Arrays.copyOf(vasya.getGrades(), vasya.getGrades().length));
        vasya.getGrades()[1] = 2;
        System.out.println(vasya);
        System.out.println(andrey);
        System.out.println("----------------");

        // 1.3.2.
        Point p1 = new Point(1, 5);
        Point p2 = new Point(2, 8);
        Point p3 = new Point(5, 3);
        Polyline polyline1 = new Polyline(new Point[]{p1, p2, p3});
        Point p4 = new Point(2, -5);
        Point p5 = new Point(4, -8);
        Polyline polyline2 = new Polyline(new Point[]{p1, p4, p5, p3});
        System.out.println("Первая ломаная: " + polyline1);
        System.out.println("Вторая ломаная: " + polyline2);
        polyline1.shift(1, 1); // Сдвигаем на (1, 1)
        System.out.println("Первая ломаная после сдвига: " + polyline1);
        System.out.println("Вторая ломаная после сдвига: " + polyline2);
        System.out.println("----------------");
        // 1.3.3.
        City cityA = new City("Город A");
        City cityB = new City("Город B");
        City cityC = new City("Город C");
        City cityD = new City("Город D");

        cityA.addRoute(cityB, 10);
        cityA.addRoute(cityC, 15);
        cityB.addRoute(cityD, 12);
        cityC.addRoute(cityD, 10);

        System.out.println(cityA);
        System.out.println(cityB);
        System.out.println(cityC);
        System.out.println(cityD);


    }
}
