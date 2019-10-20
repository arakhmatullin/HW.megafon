package ru.itpark.model;

public class TurnOnTariff extends Tariff {
    private int voiceCalls;
    private int internetInGB;
    private int SMS;


    public TurnOnTariff(String name, String description, int price, int voiceCalls, int internetInGB, int SMS) {
        super(name, description, price);
        this.voiceCalls = voiceCalls;
        this.internetInGB = internetInGB;
        this.SMS = SMS;
    }

    public int getVoiceCalls() {
        return voiceCalls;
    }

    public void setVoiceCalls(int voiceCalls) {
        this.voiceCalls = voiceCalls;
    }

    public int getInternetInGB() {
        return internetInGB;
    }

    public void setInternetInGB(int internetInGB) {
        this.internetInGB = internetInGB;
    }

    public int getSMS() {
        return SMS;
    }

    public void setSMS(int SMS) {
        this.SMS = SMS;
    }

}

