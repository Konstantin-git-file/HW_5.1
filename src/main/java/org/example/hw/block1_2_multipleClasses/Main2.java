package org.example.hw.block1_2_multipleClasses;

import org.example.hw.block1_1_objects.Name;
import org.example.hw.block1_1_objects.Point;
import org.example.hw.block1_2_multipleClasses.task1.Line;
import org.example.hw.block1_2_multipleClasses.task4.Department;
import org.example.hw.block1_2_multipleClasses.task4.Employee;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
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
        /*
        1.2.2 Человек с именем. Ранее нами был реализован сущностью Человек (1.1.2), в котором присутствовало поле для указания имени, задававшееся строкой. Измените тип этого поля таким образом, чтобы оно задавалось сущностью Имя из задачи 1.1.3.
        Необходимо создать и вывести на экран текстовое представление следующих людей:
         • Человека с Именем Клеопатра и ростом 152
         • Человека с Именем Пушкин Александр Сергеевич и ростом 167
         • Человека с Именем Маяковский Владимир и ростом 189
         */
        Name name1 = new Name(null, "Клеопатра", null);
        // Person person1 = new Person(name1, 152, null);
        Name name2 = new Name("Пушкин", "Александр", "Сергеевич");
        // Person person2 = new Person(name2, 167, null);
        Name name3 = new Name("Маяковский", "Владимир", null);
        // Person person3 = new Person(name3, 189, null);

//        System.out.println(person1.toString());
//        System.out.println(person2.toString());
//        System.out.println(person3.toString());
        System.out.println("----------------");
        // 1.4.4.
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
    }
}

