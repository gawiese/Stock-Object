// Garrett Wiese

// Doug Lundin

// CSC 160 Computer Science I

// November 11th, 2021

// Homework 9 Programming Exercise 9.2 page 363, Stock object

////////////////////////////////////////////////////////////////////////////////////

public class Stock {

    private String symbol;

    private String name;

    private double previousClosingPrice;

    private double currentPrice;

    private double changePercent;

    public Stock(String symbol, String name, double previousClosingPrice, double currentPrice) {

        this.symbol = symbol;

        this.name = name;

        this.previousClosingPrice = previousClosingPrice;

        this.currentPrice = currentPrice;
    }

    public double getChangePercent() {

        if (previousClosingPrice > currentPrice) {
            changePercent = (currentPrice - previousClosingPrice) / previousClosingPrice * 100; }

        if (currentPrice > previousClosingPrice) {
            changePercent = (currentPrice - previousClosingPrice) / previousClosingPrice * 100; }

        return changePercent;
    }
}