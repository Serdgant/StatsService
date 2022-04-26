package ru.netology.stats;

import org.jetbrains.annotations.NotNull;

public class StatsService {
    public int calculateSum(int[] sales) {  // Сумма всех продаж.
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;

    }

    public int calculateAverage(int[] sales) { // Сердняя сумма продаж в месяце.
        return calculateSum(sales) / sales.length;

    }




    public int maxSales(int[] sales) {        //Номер месяца, в котором был пик продаж
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;


    }


    public int minSales(int[] sales) {        //Номер месяца, в котором был минимум продаж
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }


    public int calculateLowMonthlyAverage(int[] sales) {   //Кол-во месяцев, в продаже было два раза ниже среднего
        int month = 0;
        for (int sale : sales) {
            if (sale > 15) {
                month = month + 1;
            }
        }
        return month;

    }

    public int TheNumberOfMonthsOnSaleWasAboveAverage(int[] sales) {  //Кол-во месяцев в продаже было выше среднего
        int month = 0;
        for (int sale : sales) {
            if (sale < 15) {
                month = month + 1;
            }
        }
        return month;
    }


}
