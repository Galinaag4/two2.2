import Pets.*;
import transport.Bus;
import transport.Car;
import transport.Train;
import HW2.Human;
import HW2.Flower;

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

        Car lada = new Car("Lada ","Grande ","Russia ","red ",2002,150,1.5,"автомат ","o123oo ","седан ",6);
        lada.setInsurance(insurance);
        Car audi = new Car("Audi ","A8 ","Germany ","black ",2020,200,2.0,"автомат ","o555oo ","седан ",6);
        System.out.println(lada.toString());
        System.out.println(audi.toString());
        lada.refill();

        Train lastochka = new Train("Lastochka ","В-901 ",2011,"Russia ","grey ",301,3500,6,"Belorussky railway station ","Minsk ",11);
        Train leningrad = new Train("Leningrad ","D-125 ",2019,"Russia ","grey ",270,1700,10,"Leningrad station ","Leningrad ",8);
        lastochka.refill();
        System.out.println(lastochka.toString());
        System.out.println(leningrad.toString());

        Bus ford = new Bus("Ford ","Mondeo ",2000,"Russia ","white ",190);
        Bus liaz = new Bus("Liaz ","Kursor ",2001,"Russia ","blue ",100);
        Bus mersedes = new Bus("Mersedes ", "Splinter ", 2020,"Germany ","grey ",250);
        System.out.println(ford.toString());
        System.out.println(liaz.toString());
        System.out.println(mersedes.toString());
        ford.refill();

        Herbivores gazelle = new Herbivores("Газель ",4,"равнина ",60,"травоядное");
        Herbivores giraffe = new Herbivores("Жираф ",5,"равнина ",20,"травоядное");
        Herbivores horse = new Herbivores("Лошадь ",1,"поле ",80,"травоядное");
        Predators hyena  = new Predators("Гиена ",1,"равнина ",35,"хищник");
        Predators tiger  = new Predators("Тигр ",3,"саванна ",100,"хищник");
        Predators bear  = new Predators("Медведь ",6,"лес ",65,"хищник");
        Amphibians frog  = new Amphibians("Лягушка ", 1,"Болото ");
        Amphibians snake  = new Amphibians("Уж ", 1,"Болото ");
        Flightless pavlin = new Flightless("Павлин ",2,"сад ","ходит");
        Flightless penguin = new Flightless("Пингвин ",5,"льды ","ходит");
        Flightless dodo = new Flightless("Додо ",7,"сад ","ходит");
        Flying seagull = new Flying("Чайка ",2,"берег ","летает");
        Flying albatross = new Flying("Альбатрос ",1,"берег ","летает");
        Flying falcon = new Flying("Сокол ",10,"горы ","летает");








    }
}