package ru.itpark.model;

public class ForModemsTariff extends Tariff {
    private int internetInGb;
    private String timePeriod;

    public ForModemsTariff(String name, String description, int price, int internetInGb, String timePeriod) {
        super(name, description, price);
        this.internetInGb = internetInGb;
        this.timePeriod = timePeriod;
    }

    public int getInternetInGb() {
        return internetInGb;
    }

    public void setInternetInGb(int internetInGb) {
        this.internetInGb = internetInGb;
    }

    public String getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(String timePeriod) {
        this.timePeriod = timePeriod;
    }
}
