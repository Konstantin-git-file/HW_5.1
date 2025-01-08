package org.example.hw.block1_1_objects;

public class Main1 {
    public static void main(String[] args) {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(3, 4);
        Point point3 = new Point(-5, 6);

        System.out.println(point1);
        System.out.println(point2);
        System.out.println(point3);
        System.out.println("----------------");
//        Person person1 = new Person(new Name(null, "Клеопатра", null), 152, null);
//        Person person2 = new Person(new Name("Пушкин", null, null), 167, null);
//        Person person3 = new Person(new Name(null, "Александр", null), 189, null);
//
//        System.out.println(person1);
//        System.out.println(person2);
//        System.out.println(person3);

        Name name1 = new Name(null, "Клеопатра", null);
        Name name2 = new Name("Пушкин", "Александр", "Сергеевич");
        Name name3 = new Name("Маяковский", "Владимир", null);

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println("----------------");
        Time time1 = new Time(10);
        Time time2 = new Time(10000);
        Time time3 = new Time(100000);

        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);
        System.out.println("----------------");
        House дом1 = new House(1);
        House дом5 = new House(5);
        House дом23 = new House(23);

        System.out.println(дом1.toString());
        System.out.println(дом5.toString());
        System.out.println(дом23.toString());
    }
}