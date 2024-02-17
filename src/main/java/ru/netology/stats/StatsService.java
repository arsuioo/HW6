package ru.netology.stats;

public class StatsService {
    public int minSales(int[] temps) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < temps.length; i++) {
            if (temps[i] <= temps[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }


    public int maxSales(int[] temps) {        //номер месяца с максимальной суммой
        int maxMonth = 0;

        for (int i = 0; i < temps.length; i++) {
            if (temps[i] >= temps[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int summSales(int[] temps) {                  //сумма всех продаж
        int summMonth = 0;

        for (int i = 0; i < temps.length; i++) {
            summMonth = summMonth + temps[i];
        }

        return summMonth;
    }


    public int averageSummSales(int[] temps) {     //средняя сумма
        int summMonth = 0;
        int avergeSummMonth = 0;

        for (int i = 0; i < temps.length; i++) {
            summMonth = summMonth + temps[i];
            avergeSummMonth = summMonth / (i + 1);
        }

        return avergeSummMonth;
    }


    public int LessAverageSummSales(int[] temps) {     //кол-во месяцев с продажами меньше среднего

        int avergeSummMonth = averageSummSales(temps);
        int LessAvergeSummMonth = 0;

        for (int i = 0; i < temps.length; i++) {
            if (temps[i] < avergeSummMonth) {
                LessAvergeSummMonth = LessAvergeSummMonth + 1;
            }
        }

        return LessAvergeSummMonth;
    }


    public int MoreAverageSummSales(int[] temps) {     //кол-во месяцев с продажами больше среднего

        int avergeSummMonth = averageSummSales(temps);
        int MoreAvergeSummMonth = 0;

        for (int i = 0; i < temps.length; i++) {
            if (temps[i] > avergeSummMonth) {
                MoreAvergeSummMonth = MoreAvergeSummMonth + 1;
            }
        }

        return MoreAvergeSummMonth;
    }


}
