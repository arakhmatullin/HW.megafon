package ru.itpark.model;

public class Main {
    public static void main(String[] args) {
        TurnOnTariff watch = new TurnOnTariff(
                "Включайся смотри",
                "",
                650,
                1200,
                -1,
                300
        );
        watch.getExtendedOptions().add(new ExtendedOption("Кино и сериалы в Мегафон ТВ"));
        watch.getExtendedOptions().add(new ExtendedOption("Кэшбэк 30%"));

        ForModemsTariff unlimitedSixMonth = new ForModemsTariff(
                "Твой безлимит на 6 месяцев",
                "Трафик без ограничений для использования дома и в поездках по России",
                3100,
                -1,
                "6 month"
        );

        OtherTariff helloTariff = new OtherTariff(
                "#Hello",
                "Тариф для иностранных туристов",
                750,
                30,
                "14 days"
        );
        helloTariff.getExtendedOptions().add(new ExtendedOption("Безлимитные звонки внутри России"));

        OtherTariff smartThingsTariff = new OtherTariff(
                "Умные вещи",
                "Тариф для умных устройств",
                20,
                -1,
                "1 week"
        );
        smartThingsTariff.getExtendedOptions().add(new ExtendedOption("Звонки и SMS на номера России"));


    }
}
