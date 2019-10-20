package ru.itpark.model;

public class ForModemsTariff extends Tariff {
    private int internetInGb;
    private String timePeriod;

    public ForModemsTariff(String name, String description, int price, int internetInGb, String timePeriod) {
        super(name, description, price);
        this.internetInGb = internetInGb;
        this.timePeriod = timePeriod;
    }
}
