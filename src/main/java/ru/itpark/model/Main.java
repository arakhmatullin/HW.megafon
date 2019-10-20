package ru.itpark.model;

public class Main {
    public static void main(String[] args) {
        TurnOnTariff watchTariff = new TurnOnTariff(
                "Включайся смотри",
                "",
                650,
                1200,
                -1,
                300
        );
        watchTariff.getExtendedOptions().add(new ExtendedOption("Кино и сериалы в Мегафон ТВ"));
        watchTariff.getExtendedOptions().add(new ExtendedOption("Кэшбэк 30%"));
        System.out.println(watchTariff.getName() + "\n"
                + watchTariff.getDescription() + "\n"
                + watchTariff.getVoiceCalls() + "\n"
                + watchTariff.getInternetInGB() + "\n"
                + watchTariff.getSMS() + "\n"
                + watchTariff.getPrice()

        );
        watchTariff.printExtendedOptions();

        ForModemsTariff unlimitedSixMonth = new ForModemsTariff(
                "Твой безлимит на 6 месяцев",
                "Трафик без ограничений для использования дома и в поездках по России",
                3100,
                -1,
                "6 month"
        );
        System.out.println(unlimitedSixMonth.getName() + "\n"
                + unlimitedSixMonth.getDescription() + "\n"
                + unlimitedSixMonth.getPrice() + "\n"
        );
        unlimitedSixMonth.printExtendedOptions();

        OtherTariff helloTariff = new OtherTariff(
                "#Hello",
                "Тариф для иностранных туристов",
                750,
                30,
                "14 days"
        );
        helloTariff.getExtendedOptions().add(new ExtendedOption("Безлимитные звонки внутри России"));
        System.out.println(helloTariff.getName() + "\n"
                + helloTariff.getDescription() + "\n"
                + helloTariff.getPrice() + "\n"
                + helloTariff.getInternetInGB() + "\n"
                + helloTariff.getTimePeriod()
        );
        helloTariff.printExtendedOptions();

        OtherTariff smartThingsTariff = new OtherTariff(
                "Умные вещи",
                "Тариф для умных устройств",
                20,
                -1,
                "1 week"
        );
        smartThingsTariff.getExtendedOptions().add(new ExtendedOption("Звонки и SMS на номера России"));
        System.out.println(smartThingsTariff.getName() + "\n"
                + smartThingsTariff.getDescription() + "\n"
                + smartThingsTariff.getPrice() + "\n"
                + smartThingsTariff.getInternetInGB() + "\n"
                + smartThingsTariff.getTimePeriod()
        );
        smartThingsTariff.printExtendedOptions();

    }
}
