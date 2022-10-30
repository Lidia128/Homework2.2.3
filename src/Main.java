import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car ("Lada","Granda", 1.7, "желтый", 2015,
                "России", "седан", 5);
        lada.setRegNumber("в025ук158");

        Car audi = new Car("Audi", "A8 50L TDI guattro", 3.0, "черный", 2020,
                "Германии", "хечбек", 2);
        audi.setGears("автомат");

        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021,
                "Германии", "кабриолет", 2);
        bmw.setSummerTyres (false);

        Car kia = new Car("Kia", "portaSge 4-го поколения", 2.4, "красный",
                2018, "Южной Корее", "фургон", 8);

        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016,
                "Южной корее", "хэчбек", 5);

        printInfo(lada);
        printInfo(audi);
        printInfo(bmw);
        printInfo(kia);
        printInfo(hyundai);

        }
       private static void printInfo (Car car){
        System.out.println(car.getBrend () + " " + car.getModel() + "," + car.getProductionYear() +
                " год выпуска, сборка в " + car.getProductionCountry()+ ", " + car.getColor() + " цвет кузова, объем двигателя — " + car.getEngineVolume() + " л."
                + ", коробка передач  " + car.getGears() + ", тип кузова " + car.getTypeOfBody() +
                ", регистрационный номер " + car.getRegNumber() + ", количество мест " + car.getSeatsCount()
                + (car.isSummerTyres() ? ", шины " + "летняя" : "зимняя") +" ," +
                (car.getKey().isWithouKeyAccess()? "" + "запуск без ключа" : "запуск с ключем") + ", "+
                (car.getKey().isRemoteRunEngine()? "" + "удаленнй запуск" : "обычный запуск") +
        " номер страховки" + car.getInsurance().getNumber() + ", стоимость страховки" +
                car.getInsurance().getCost()+ ", срок действия страховки " +
                car.getInsurance().getExpareDate());
}

    }
