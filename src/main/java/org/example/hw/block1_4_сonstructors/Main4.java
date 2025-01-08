package org.example.hw.block1_4_сonstructors;

import org.example.hw.block1_1_objects.House;
import org.example.hw.block1_1_objects.Name;
import org.example.hw.block1_1_objects.Person;
import org.example.hw.block1_1_objects.Point;
import org.example.hw.block1_2_multipleClasses.task1.Line;
import org.example.hw.block1_3_arrays.task1.Student;
import org.example.hw.block1_3_arrays.task2.Polyline;
import org.example.hw.block1_3_arrays.task3.City;

import java.util.HashMap;
import java.util.Map;

public class Main4 {
    public static void main(String[] args) {

        // 1.4.1. точка с координатами 3;5, 25;6, 7;8
        Point point1 = new Point(3, 5);
        Point point2 = new Point(25, 6);
        Point point3 = new Point(7, 8);
        System.out.println(point1.getTextRepresentation());
        System.out.println(point2.getTextRepresentation());
        System.out.println(point3.getTextRepresentation());
        System.out.println("----------------");
        // 1.4.2. Линия 1 с началом в {1;3} и в {23;8}
        Line line1 = new Line(new Point(1, 3), new Point(23, 8));
        System.out.println(line1);
        // 2. Линия 2, горизонтальная, на высоте 10, от точки 5 до точки 25
        Line line2 = new Line(5, 10, 25, 10);
        System.out.println(line2);
        // 3. Линия 3, которая начинается там же, где начинается 1, и заканчивается где 2
        Line line3 = new Line(line1.getStart(), line2.getEnd());
        System.out.println(line3);
        System.out.println("----------------");
        //1.4.3. точки для ломаной линии
        Point point4 = new Point(3, 5);
        Point point5 = new Point(25, 6);
        Point point6 = new Point(7, 8);
        Polyline polyline = new Polyline(new Point[]{point4, point5, point6});
        System.out.println(polyline);
        polyline.shift(2, -1);
        System.out.println("После сдвига:");
        System.out.println(polyline);
        System.out.println("----------------");
        // 1.4.4. дома с 2, 35 и 91 этажами
        House house1 = new House(2);
        House house2 = new House(35);
        House house3 = new House(91);
        System.out.println(house1);
        System.out.println(house2);
        System.out.println(house3);
        System.out.println("----------------");
        //1.4.5.
        Name name1 = new Name("Клеопатра");
        System.out.println(name1);
        Name name2 = new Name("Александр", "Пушкин", "Сергеевич");
        System.out.println(name2);
        Name name3 = new Name("Владимир", "Маяковский");
        System.out.println(name3);
        Name name4 = new Name("Христофор", "Бонифатьевич");
        System.out.println(name4);
        System.out.println("----------------");
        //1.4.6.
        Person lev = new Person("Лев");
        System.out.println(lev);
        Name sergeyName = new Name("Пушкин", "Сергей");
        Person sergey = new Person(sergeyName, lev);
        System.out.println(sergey);
        Person alexander = new Person("Александр", sergey);
        System.out.println(alexander);
        System.out.println("----------------");
        //1.4.7.
        Student vasya = new Student("Вася", 3, 4, 5);
        System.out.println(vasya);
        Student maxim = new Student("Максим");
        System.out.println(maxim);
        System.out.println("----------------");
        //1.4.8.
        City moscow = new City("Москва");
        System.out.println(moscow);
        Map<City, Integer> routes = new HashMap<>();
        City Sbp = new City("Санкт-Петербург", routes);
        Sbp.addRoute(moscow, 700);
        System.out.println(Sbp);
    }
}
