
package ru.netology.stats;

public class StatService {
    public long sum(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;
        }
        return result;
    }

    public long averageSalesAmount(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;
        }
        return result / 12;
    }

    public int monthMaximumSales(long[] sales) {
        int maxMount = 0;
        long maximumSale = sales[0];
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] >= maximumSale) {
                maximumSale = sales[i];
                maxMount = i;
            }
        }
        return maxMount + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int belowAverageSales(long[] sales) {
        int result = 0;
        long averageSales = averageSalesAmount(sales);
        for (long sale : sales) {
            if (sale < averageSalesAmount(sales)) {
                result++;
            }
        }
        return result;
    }

    public int aboveAverageSales(long[] sales) {
        int result = 0;
        long averageSales = averageSalesAmount(sales);
        for (long sale : sales) {
            if (sale > averageSalesAmount(sales)) {
                result++;
            }
        }
        return result;
    }
}



