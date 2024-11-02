package ru.netology.services;

public class FreelancerService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money -= expenses; // траты на отдых
                money -= money / 3; // дополнительные траты на отдых
            } else {
                money += income; // зарабатываем
                money -= expenses; // траты на жизнь
            }
        }
        return count;
    }
}
