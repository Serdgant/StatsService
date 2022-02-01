package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {   // Сумма всех продаж.

    @org.junit.jupiter.api.Test
    void shouldCalcuLateSum() {      //Сумма всех продаж
        StatsService service = new StatsService();
        int[] sales ={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected =180;
        int actual = service.calculateSum(sales);
        assertEquals(expected,actual);
    }

    @Test
    void shouldСalculateAverage() {      // Сердняя сумма продаж в месяце.
        StatsService service = new StatsService();
        int[] sales ={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual =service.calculateAverage(sales);
        assertEquals(expected,actual);
    }





    @Test
    void shouldMinSales() {
        StatsService service = new StatsService();  //Номер месяца, в котором был минимум продаж
            int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            int expected = 9;
            int actual = service.minSales(sales);
            assertEquals(expected,actual);


    }

    @Test
    void shouldMaxSales() {       //Номер месяца, в котором был пик продаж
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxSales(sales);
        assertEquals(expected, actual);

    }


    @Test
    void shouldCalculateLowMonthlyAverage() {   //Кол-во месяцев, в продаже было два раза ниже среднего
     StatsService service=new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected =5;
        int actual =service.calculateLowMonthlyAverage(sales);
        assertEquals(expected,actual);

    }

    @Test
    void shouldTheNumberOfMonthsOnSaleWasAboveAverage() {     //Кол-во месяцев в продаже было выше среднего
        StatsService service=new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected =5;
        int actual =service.calculateLowMonthlyAverage(sales);
        assertEquals(expected,actual);

    }
}