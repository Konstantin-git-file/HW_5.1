package org.example.hw;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 1.1.1.
        Point point1 = new Point(1, 2);
        Point point2 = new Point(3, 4);
        Point point3 = new Point(-5, 6);
        System.out.println(point1);
        System.out.println(point2);
        System.out.println(point3);
        System.out.println("----------------");

        // 1.1.2.
        Person person1 = new Person(new Name(null, "Клеопатра", null), 152, null);
        Person person2 = new Person(new Name("Пушкин", null, null), 167, null);
        Person person3 = new Person(new Name(null, "Александр", null), 189, null);
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println("----------------");

        //1.1.3.
        Name name1 = new Name(null, "Клеопатра", null);
        Name name2 = new Name("Пушкин", "Александр", "Сергеевич");
        Name name3 = new Name("Маяковский", "Владимир", null);
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println("----------------");

        //1.1.4.
        Time time1 = new Time(10);
        Time time2 = new Time(10000);
        Time time3 = new Time(100000);
        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);
        System.out.println("----------------");

        //1.1.5.
        House house_1 = new House(1);
        House house_5 = new House(5);
        House house_23 = new House(23);
        System.out.println(house_1.toString());
        System.out.println(house_5.toString());
        System.out.println(house_23.toString());
        System.out.println("----------------");

        // 1.2.1.
        Point point1Start = new Point(1, 3);
        Point point1End = new Point(23, 8);
        Line line1 = new Line(point1Start, point1End);
        Point point2Start = new Point(5, 10);
        Point point2End = new Point(25, 10);
        Line line2 = new Line(point2Start, point2End);
        Line line3 = new Line(line1.getStart(), line2.getEnd());
        System.out.println("До изменений:");
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        line1.setStart(new Point(2, 4));
        line1.setEnd(new Point(24, 9));
        line2.setStart(new Point(6, 11));
        line2.setEnd(new Point(26, 11));
        line3.setStart(line1.getStart());
        line3.setEnd(line2.getEnd());
        System.out.println("После изменений:");
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        line1.setStart(new Point(10, 10));
        line1.setEnd(new Point(20, 20));
        System.out.println("После изменения только линии 1:");
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println("----------------");

        //1.2.2
        Name nameOne = new Name(null, "Клеопатра", null);
        Person personOne = new Person(nameOne, 152, null);
        Name nameTwo = new Name("Пушкин", "Александр", "Сергеевич");
        Person personTwo = new Person(nameTwo, 167, null);
        Name nameThree = new Name("Маяковский", "Владимир", null);
        Person personThree = new Person(nameThree, 189, null);

        System.out.println(personOne.getTextRepresentation());
        System.out.println(personTwo.getTextRepresentation());
        System.out.println(personThree.getTextRepresentation());
        System.out.println("----------------");

        //1.2.3.
        Name ivanName = new Name("Иван", "Чудов");
        Person ivan = new Person(ivanName);
        Name petrName = new Name("Петр", "Чудов");
        Person petr = new Person(petrName, ivan);
        Name borisName = new Name("Борис");
        Person boris = new Person(borisName, petr);
        System.out.println(ivan.toString());
        System.out.println(petr.toString());
        System.out.println(boris.toString());
        System.out.println("----------------");

        //1.2.4.
        Employee petrov = new Employee("Петров", null);
        Employee kozlov = new Employee("Козлов", null);
        Employee sidorov = new Employee("Сидоров", null);
        Department itDepartment = new Department("IT", kozlov, new ArrayList<>());
        itDepartment.addEmployee(petrov);
        itDepartment.addEmployee(kozlov);
        itDepartment.addEmployee(sidorov);
        System.out.println(petrov);
        System.out.println(kozlov);
        System.out.println(sidorov);
        System.out.println("Сотрудники отдела IT:");
        for (Employee employee : petrov.getDepartmentEmployees()) {
            System.out.println(employee.getName());
        }

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
        System.out.println("----------------");

        //1.3.4.
        List<Employee> departmentEmployees = petrov.getDepartmentEmployees();
        System.out.println("Сотрудники отдела IT:");
        for (Employee emp : departmentEmployees) {
            System.out.println(emp.getName());
        }
        System.out.println("----------------");

        // 1.4.1. точка с координатами 3;5, 25;6, 7;8
        Point point_1_3 = new Point(3, 5);
        Point point_25_6 = new Point(25, 6);
        Point point_7_8 = new Point(7, 8);
        System.out.println(point_1_3.getTextRepresentation());
        System.out.println(point_25_6.getTextRepresentation());
        System.out.println(point_7_8.getTextRepresentation());
        System.out.println("----------------");

        // 1.4.2. Линия 1 с началом в {1;3} и в {23;8}
        Line line1_3 = new Line(new Point(1, 3), new Point(23, 8));
        System.out.println(line1_3);
        // 2. Линия 2, горизонтальная, на высоте 10, от точки 5 до точки 25
        Line line5_10 = new Line(5, 10, 25, 10);
        System.out.println(line5_10);
        // 3. Линия 3, которая начинается там же, где начинается 1, и заканчивается где 2
        Line lineNew = new Line(line1_3.getStart(), line5_10.getEnd());
        System.out.println(lineNew);
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
        Name nameCleo = new Name("Клеопатра");
        System.out.println(nameCleo);
        Name nameAlex = new Name("Александр", "Пушкин", "Сергеевич");
        System.out.println(nameAlex);
        Name nameVlad = new Name("Владимир", "Маяковский");
        System.out.println(nameVlad);
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
        Student vasya1 = new Student("Вася", 3, 4, 5);
        System.out.println(vasya1);
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
