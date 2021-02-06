package ru.netoligy.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @Test
    void Sum() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.Sum(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void findAverage() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.findAverage(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void findMaxSalea() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.findMaxSales(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void findMinSales() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.findMinSales(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void findAverageMin() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.findAverageMin(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void findAverageMax() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.findAverageMax(purchases);
        assertEquals(expected, actual);
    }
}