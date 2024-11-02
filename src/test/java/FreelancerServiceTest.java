package ru.netology.services;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FreelancerServiceTest {

    @Test
    public void testCalculate() {
        FreelancerService service = new FreelancerService();

        // Пример 1
        int income1 = 10000;
        int expenses1 = 3000;
        int threshold1 = 20000;
        int expected1 = 3; // ожидаем 3 месяца отдыха
        int actual1 = service.calculate(income1, expenses1, threshold1);
        assertEquals(expected1, actual1);

        // Пример 2
        int income2 = 100000;
        int expenses2 = 60000;
        int threshold2 = 150000;
        int expected2 = 2; // ожидаем 2 месяца отдыха
        int actual2 = service.calculate(income2, expenses2, threshold2);
        assertEquals(expected2, actual2);
    }
}
