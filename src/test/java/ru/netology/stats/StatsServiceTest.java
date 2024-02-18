package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {

    @Test
    public void shouldFindMinMoth() {
        StatsService service = new StatsService();

        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 9;
        int actualMonth = service.minSales(month);

        Assertions.assertEquals(expectedMonth, actualMonth);

    }

    @Test
    public void shouldFindMaxMoth() {
        StatsService service = new StatsService();

        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 8;
        int actualMonth = service.maxSales(month);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindSummMoth() {
        StatsService service = new StatsService();

        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 180;
        int actualMonth = service.summSales(month);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }


    @Test
    public void shouldFindAverageSummMoth() {
        StatsService service = new StatsService();

        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 15;
        int actualMonth = service.averageSummSales(month);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindLessAverageSummMoth() {
        StatsService service = new StatsService();

        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 5;
        int actualMonth = service.lessAverageSummSales(month);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindMoreAverageSummMoth() {
        StatsService service = new StatsService();

        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 5;
        int actualMonth = service.moreAverageSummSales(month);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

}
