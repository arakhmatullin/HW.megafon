package ru.itpark.model;

import java.util.ArrayList;
import java.util.List;

public class Tariff {
    private String name;
    private String  description;
    private int price;
    private final List<ExtendedOption> extendedOptions = new ArrayList<ExtendedOption>();

    public Tariff(String name, String description, int price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ExtendedOption> getExtendedOptions() {
        return extendedOptions;
    }

    public void printExtendedOptions(){
        for (ExtendedOption extendedOption : extendedOptions){
            System.out.println(extendedOption.getName());
        }
    }
}