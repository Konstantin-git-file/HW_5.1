package org.example.hw;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private String name;
    private Department department;

    public String toString() {
        if (department == null) {
            return name + " (отдел не указан)";
        }
        if (this.equals(department.getManager())) {
            return name + " начальник отдела " + department.getName();
        } else {
            String managerName = (department.getManager() != null) ? department.getManager().getName() : "не указан";
            return name + " работает в отделе " + department.getName() + ", начальник которого " + managerName;
        }
    }
    // метод возвращает список всех сотрудников отдела.
    public List<Employee> getDepartmentEmployees() {
        if (department != null) {
            return department.getEmployees();
        }
        return new ArrayList<>();
    }
}