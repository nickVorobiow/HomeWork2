package com.company;

public class DZ3_task8 {
    public static void main(String[] args) {
        var workHours = 640;
        var hoursPerMan = 8;
        var amountOfWorkers = workHours / hoursPerMan;
        System.out.println("Всего работников в компании: " + amountOfWorkers);

        amountOfWorkers += 94;
        workHours = amountOfWorkers * hoursPerMan;
        System.out.println("Если в компании работает " + amountOfWorkers +
                " человек, то всего " + workHours + " часов работы может быть поделено между сотрудниками.");
    }
}
