package ru.netology.stats;

public class StatsService {
    public int minSales(long[] temps) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < temps.length; i++) {
            if (temps[i] <= temps[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }


    public int maxSales(long[] temps) {        //номер месяца с максимальной суммой
        int maxMonth = 0;

        for (int i = 0; i < temps.length; i++) {
            if (temps[i] >= temps[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public long summSales(long[] temps) {                  //сумма всех продаж
        long summMonth = 0;

        for (int i = 0; i < temps.length; i++) {
            summMonth = summMonth + temps[i];
        }

        return summMonth;
    }


    public long averageSummSales(long[] temps) {     //средняя сумма
        long summMonth = 0;
        long avergeSummMonth = 0;

        for (int i = 0; i < temps.length; i++) {
            summMonth = summMonth + temps[i];
            avergeSummMonth = summMonth / (i + 1);
        }

        return avergeSummMonth;
    }


    public int lessAverageSummSales(long[] temps) {     //кол-во месяцев с продажами меньше среднего

        long avergeSummMonth = averageSummSales(temps);
        int lessAvergeSummMonth = 0;

        for (int i = 0; i < temps.length; i++) {
            if (temps[i] < avergeSummMonth) {
                lessAvergeSummMonth = lessAvergeSummMonth + 1;
            }
        }

        return lessAvergeSummMonth;
    }


    public int moreAverageSummSales(long[] temps) {     //кол-во месяцев с продажами больше среднего

        long avergeSummMonth = averageSummSales(temps);
        int moreAvergeSummMonth = 0;

        for (int i = 0; i < temps.length; i++) {
            if (temps[i] > avergeSummMonth) {
                moreAvergeSummMonth = moreAvergeSummMonth + 1;
            }
        }

        return moreAvergeSummMonth;
    }


}
