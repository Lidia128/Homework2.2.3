package transport;

import java.time.LocalDate;

public class Car {
    private final String brend;
    private final String model;
    private double engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;
    private String gears;
    private final String typeOfBody;
    private String regNumber;
    private final int seatsCount;
    private boolean summerTyres;
    private Key key;
    private Insurance insurance;
        public Car(String brend, String model, double engineVolume, String color, int productionYear,
               String productionCountry, String gears, String typeOfBody, String regNumber,
               int seatsCount, boolean summerTyres, Key key, Insurance insurance) {

        if (brend == null) {
            this.brend = "default";
        }else {
            this.brend = brend;}
        if (model == null) {
            this.model = "default";
        }else {
            this.model = model;}
        if (engineVolume == 0) {
            this.engineVolume = 1.5;
        }else {
            this.engineVolume = engineVolume;}
        if (color == null) {
            this.color = "белый";
        }else {
            this.color = color;}
        if (productionYear == 0) {
            this.productionYear = 2000;
        }else {
            this.productionYear = productionYear;}
        if (productionCountry == null) {
            this.productionCountry = "default";
        }else {
            this.productionCountry = productionCountry;}
        if (key == null) {
            this.key = new Key();
        }else {
            this.key = key;
        }
            if (insurance == null) {
                this.insurance = new Insurance();
            }else {
                this.insurance = insurance;
            }
        this.gears = "МКПП";
        this.regNumber = "x000xx000";
        this.typeOfBody = "sedan";
        this.seatsCount = 5;
        this.summerTyres = true;
    }
    public Car (String brend, String model, double engineVolume, String color, int productionYear,
                String productionCountry, String typeOfBody, int seatsCount) {
        this (brend, model,engineVolume,color,productionYear,productionCountry,"МКПП",
                "седан", "x000xx000", 5, true, new Key(), new Insurance()
        );

    }
    public double getEngineVolume() {
        return engineVolume;}
    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;}
    public String getColor() {
        return color;}
    public void setColor(String color) {
        this.color = color;}
    public String getGears() {
        return gears;}
    public String getRegNumber() {
        return regNumber;
    }
    public String getBrend() {
        return brend;
    }
    public String getTypeOfBody () {
        return typeOfBody;
    }
    public int getSeatsCount () {
        return seatsCount;
    }
    public String getProductionCountry () {
        return productionCountry;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public void setRegNumber (String regNumber){
        if (regNumber == null) {
        this.regNumber = "x000xx000";
        } else {
        this.regNumber = regNumber;
                } }
        public void setGears (String gears){
            if (gears == null) {
                this.gears = "МКПП";
            } else {
                this.gears = gears;
            }
        }
        public String getModel() {
        return model;
    }
    public int getProductionYear() {
        return productionYear;
    }

    public boolean isSummerTyres (){
        return summerTyres;
    }
    public void setSummerTyres(boolean summerTyres) {
        this.summerTyres = summerTyres;
    }
            public void changeTyres (){ summerTyres = !summerTyres;
            }
            public boolean isCorrectRegNumber (){
            //x000xx000
                if (regNumber.length() != 9){
                    return false;
                }
                char [] chars = regNumber.toCharArray();
                if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])){
                    return false;
                               }
                return!Character.isDigit(chars[1]) && !Character.isDigit(chars[2]) && !Character.isDigit(chars[3]) &&
                        !Character.isDigit(chars[6]) && !Character.isDigit(chars[7]) && !Character.isDigit(chars[8]);
            }
        public static class Key {
            private final boolean remoteRunEngine;
            private final boolean withouKeyAccess;

            public Key(boolean remoteRunEngine, boolean withouKeyAccess) {
                this.remoteRunEngine = remoteRunEngine;
                this.withouKeyAccess = withouKeyAccess;
            }

            public Key() {
                this(false, false);

            }

            public boolean isRemoteRunEngine() {
                return remoteRunEngine;
            }

            public boolean isWithouKeyAccess() {
                return withouKeyAccess;
            }
        }
        public static class Insurance {

            private final LocalDate expareDate;
            private final double cost;
            private final String number;

            public Insurance(LocalDate expareDate, double cost, String number) {
                if (expareDate == null) {
                    this.expareDate = LocalDate.now().plusDays(365);
                } else {
                    this.expareDate = expareDate;
                }
                this.cost = cost;
                if (number == null) {
                    this.number = "1234567890";
                } else {
                    this.number = number;
                }
            }
            public Insurance(){
                this (null, 10000, null);
            }

            public LocalDate getExpareDate() {
                return expareDate;
            }

            public double getCost() {
                return cost;
            }

            public String getNumber() {
                return number;
            }

            public void chekExpireDate() {
                if (expareDate.isBefore(LocalDate.now()) || expareDate.isEqual(LocalDate.now())) {
                    System.out.println("Нужно срочно ехать оформлять новую страховку!");
                }
            }
            public void checkNumber (){
                if (number.length() != 9){
                    System.out.println("Номер страховки некорректный!");
                }
            }
        }}
