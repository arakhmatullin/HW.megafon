package ru.itpark.model;

public class OtherTariff extends Tariff{
    private int InternetInGB;
    private String timePeriod;

    public OtherTariff(String name, String description, int price, int internetInGB, String timePeriod) {
        super(name, description, price);
        InternetInGB = internetInGB;
        this.timePeriod = timePeriod;
    }

    public int getInternetInGB() {
        return InternetInGB;
    }

    public void setInternetInGB(int internetInGB) {
        InternetInGB = internetInGB;
    }

    public String getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(String timePeriod) {
        this.timePeriod = timePeriod;
    }
}
