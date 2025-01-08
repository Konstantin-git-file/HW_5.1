package org.example.hw.block1_1_objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 Создайте сущность Время, которое будет описывать текущее время суток в 24-х часовом формате.
 Время описывается числом секунд, прошедшим с начала суток. Время может быть приведено к
 текстовой форме следующего формата: “ЧЧ:ММ:СС”. Например, если время задано как 12000,
 то текстовая форма будет “3:20:00”. Если общее время превышает 24 часа, то
 отображаться в текстовом виде должно только то время, которое прошло с начала последних суток,
 например 91800, это не 25:30:00, а 1:30:00.
Необходимо создать и вывести на экран текстовую форму для следующих вариантов времени:
    • 10 секунд
    • 10000 секунд
    • 100000 секунд
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Time {
    private int seconds;

    @Override
    public String toString() {
        int secondsInDay = 86400;
        int remainingSeconds = seconds % secondsInDay;
        int hours = remainingSeconds / 3600;
        int minutes = (remainingSeconds % 3600) / 60;
        int secs = remainingSeconds % 60;

        return String.format("%d:%02d:%02d", hours, minutes, secs);
    }
}
