package transport;

public class Car {
    private String marka;
    private String model;
     double value;
     String color;
    private int year;
    private String country;
      String transmission;
    private String type;
     String regNumber;
     private int numberOfSeats;
     String tyre;
     private Insurance insurance;

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public class Key {
    private String remLaunch;
    private String keyless;
    public  Key(String remLaunch,String keyless){
        if (remLaunch==null||remLaunch.isEmpty()){
            System.out.println("Информация не указана");}
        else {this.remLaunch = remLaunch;}
        if (keyless==null||keyless.isEmpty()){
            System.out.println("Информация не указана");}
        else {this.keyless = keyless;}
    }

        public String getRemLaunch() {
            return remLaunch;
        }

        public void setRemLaunch(String remLaunch) {
            this.remLaunch = remLaunch;
        }

        public String getKeyless() {
            return keyless;
        }

        public void setKeyless(String keyless) {
            this.keyless = keyless;
        }
    }
    public static class Insurance{
        private static String validityPeriod;
        private static int prise;
        private static String number;

        public static String getValidityPeriod() {
            return validityPeriod;
        }

        public static int getPrise() {
            return prise;
        }

        public static String getNumber() {
            if (number.length() != 9) {
                System.out.println("Номер страховки некорректный");
            }
                return number;

        }

        public static void setValidityPeriod(String validityPeriod) {
            Insurance.validityPeriod = validityPeriod;
        }

        public static void setPrise(int prise) {
            Insurance.prise = prise;
        }

        public static void setNumber(String number) {
            Insurance.number = number;
        }

        public Insurance(String validityPeriod, int prise, String number){
            if (validityPeriod==null||validityPeriod.isEmpty()){
                System.out.println("Информация не указана");}
            else {this.validityPeriod = validityPeriod;}
            if (prise<=0){
                System.out.println("Информация не указана");}
            else {this.prise = prise;}
            if (number==null||number.isEmpty()){
                System.out.println("Информация не указана");}
            else {this.number = number;}


        }

    }
    public String getMarka() {
        return marka;
    }
    public String getModel() {
        return model;
    }
    public double getValue() {
        return value;
    }
    public void setValue(double value) {
        this.value = value;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getYear() {
        return year;
    }
    public String getCountry() {
        return country;
    }
    public String getTransmission() {
        return transmission;
    }
    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
    public String getType() {
        return type;
    }
    public String getRegNumber() {
        return regNumber;
    }
    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }
    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    public String getTyre() {
        return tyre;
    }
    public void setTyre(String tyre) {
        this.tyre = tyre;
    }

    public Car (String marka, String model, double value, String color, int year, String country, String transmission, String type, String regNumber, int numberOfSeats, String tyre) {
        if (marka==null){
            this.marka = "default";}
        else {this.marka = marka;}
        if (model==null){
            this.model = "default";}
        else {this.model = model;}
        if (value==0.0){
            this.value = 1.5;}
        else {this.value = value;}
        if (color==null){
            this.color = "white";}
        else {this.color = color;}
        if (year==0){
            this.year = 2000;}
        else {this.year = year;}
        if (country==null){
            this.country = "default";}
        else {this.country = marka;}

        this.transmission=transmission;
        this.type=type;
        this.regNumber=regNumber;
        this.numberOfSeats=numberOfSeats;
        this.tyre=tyre;

    }

    @Override
    public String toString() {
        return marka + model + value+" " + color + year+" " +country+ transmission+type+regNumber+numberOfSeats+" "+tyre+" "+ insurance;
    }
}


