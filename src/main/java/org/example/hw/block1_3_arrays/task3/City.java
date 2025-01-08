package org.example.hw.block1_3_arrays.task3;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;
/*
1.3.3. Города. Создайте сущность Город, которая будет представлять собой точку на карте
со следующими характеристиками:
    • Название города
    • Набор путей к следующим городам, где путь представляет собой сочетание
    Города и стоимости поездки в него.
Кроме того, Город может возвращать текстовое представление, в виде названия
города и списка связанных с ним городов (в виде пары: “название: стоимость”).
 */

@Data
@NoArgsConstructor
//@AllArgsConstructor - условия по п. 1.4.8.
public class City {
    private String name;
    private Map<City, Integer> routes;

    public City(String name) {
        this.name = name;
        this.routes = new HashMap<>();
    }

    public City(String name, Map<City, Integer> routes) {
        this.name = name;
        this.routes = routes != null ? routes : new HashMap<>();
    }

    public void addRoute(City destination, int cost) {
        routes.put(destination, cost);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(":\n");
        for (Map.Entry<City, Integer> entry : routes.entrySet()) {
            sb.append("  -> ")
                    .append(entry.getKey().getName()).append(": ")
                    .append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }
}