package ru.netoligy.stats;

public class StatsService {
    public long Sum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum = sum + purchase;
        }
        return sum;
    }

    public long findAverage(long[] purchases) {
        long total = 0;
        long average = 0;
        for (long x = 0; x < purchases.length; ++x)
            total += purchases[(int) x];
        {
            average = total / purchases.length;
        }
        return average;
    }

    public long findMaxSales(long[] purchases) {
        long currentMax = purchases[0];
        for (long purchase : purchases) {
            if (currentMax <= purchase) {
                currentMax = purchase;
            }
        }
        int month = 0;
        int monthMax = 0;
        for (long purchase : purchases){
            month++;
            if (purchase == currentMax){
                monthMax = month;
            }
        }
        return monthMax;
    }

    public long findMinSales(long[] purchases) {
        long currentMin = purchases[0];
        for (long purchase : purchases) {
            if (currentMin >= purchase) {
                currentMin = purchase;
            }
        }
        int month = 0;
        int monthMin = 0;
        for (long purchase : purchases){
            month++;
            if (purchase == currentMin){
                monthMin = month;
            }
        }
        return monthMin;
    }

    public long findAverageMin(long[] purchases) {
        long total = 0;
        long average = 0;
        for (long x = 0; x < purchases.length; ++x)
            total += purchases[(int) x];
        {
            average = total / purchases.length;
        }
        long monthCount = 0;
        for (long purchase : purchases) {
            if (purchase < average) {
                monthCount++;
            }
        }
        return monthCount;
    }

    public long findAverageMax(long[] purchases) {
        long total = 0;
        long average = 0;
        for (long x = 0; x < purchases.length; ++x)
            total += purchases[(int) x];
        {
            average = total / purchases.length;
        }
        long monthCount = 0;
        for (long purchase : purchases) {
            if (purchase > average) {
                monthCount++;
            }
        }
        return monthCount;
    }

}
