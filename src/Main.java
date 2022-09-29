import transport.Car;

public class Main {
    public static void main(String[] args) {

            Human maksim = new Human("maksim", "minsk",27,"brand-manager");
            Human anya = new Human("anya","moskva",29,"methodist");
            Human katya = new Human("katya","kaliningrad",28,"prodact-manager");
            Human artem = new Human("artem","moskva",27,"director");


            Flower rose = new Flower("Rose ",null,"Holland ",35.59 ,0);
            Flower chrysanthemum = new Flower("Chrysanthemum ",null,null,15.00 ,5);
            Flower pion = new Flower("Pion ",null,"England ",69.9 ,1);
            Flower hipsophyla = new Flower("Hipsophyla ",null,"Turkey ",19.5 ,10);
        System.out.println(rose.toString());
        System.out.println(chrysanthemum.toString());
        System.out.println(pion.toString());
        System.out.println(hipsophyla.toString());

        Car.Insurance insurance = new Car.Insurance("FD90876OO",1000,"oo123OO");

        Car lada = new Car("Lada ", "Grande ",1.7,"yellow ",2002,"Russia ","автомат ","седан ","o123oo ",6,"winter");
        lada.setInsurance(insurance);
        Car audi = new Car("Audi A8 ","50 L TDI quattro ",3.0,"black ",2020,"Germany ","автомат ","седан ","o123oo ",6,"winter");
        Car kia = new Car ("Kia Sportage ","4 поколение ",2.4,"red ",2018,"South Korea ","автомат ","седан ","o123oo ",6,"winter");
        Car hundai = new Car("Hyundai ","Avante ",1.6,"oranje ",2016,"South Korea ","автомат ","седан ","o123oo ",6,"winter");
        System.out.println(lada.toString());
        System.out.println(audi.toString());
        System.out.println(kia.toString());
        System.out.println(hundai.toString());





    }
}