package sii.sup;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Country poland = new Country("Poland", 'P');
        Country germany = new Country("Germany", 'D');
        Country korea = new Country("Korea", 'K');
        Country slovakia = new Country("Slovakia", 'S');
        Country czech = new Country("Czech Republic", 'C');
        Market market1 = new Market("cargo");
        Market market2 = new Market("business");
        Market market3 = new Market("transport");
        Market market4 = new Market("taxi");
        Market market5 = new Market("bus");
        market1.addCountryToMarket(poland);
        market1.addCountryToMarket(germany);
        market1.addCountryToMarket(korea);
        market2.addCountryToMarket(slovakia);
        market2.addCountryToMarket(czech);
        market2.addCountryToMarket(korea);
        market3.addCountryToMarket(slovakia);
        market3.addCountryToMarket(germany);
        market3.addCountryToMarket(poland);
        market4.addCountryToMarket(korea);
        market4.addCountryToMarket(slovakia);
        market4.addCountryToMarket(czech);
        market5.addCountryToMarket(slovakia);
        market5.addCountryToMarket(germany);
        market5.addCountryToMarket(czech);
        Dimension dimension1 = new Dimension(100, 100, 60);
        Dimension dimension2 = new Dimension(110, 110, 80);
        Dimension dimension3 = new Dimension(120, 120, 100);
        Dimension dimension4 = new Dimension(130, 130, 120);
        Dimension dimension5 = new Dimension(140, 140, 140);
        Dimension dimension6 = new Dimension(150, 150, 160);
        Dimension dimension7 = new Dimension(160, 160, 180);
        Dimension dimension8 = new Dimension(170, 170, 250);
        Dimension dimension9 = new Dimension(180, 180, 280);
        Dimension dimension10 = new Dimension(190, 190, 340);
        List<Dimension> dimensions = new ArrayList<>();
        List<Dimension> dimensions2 = new ArrayList<>();
        dimensions.add(dimension1);
        dimensions.add(dimension2);
        dimensions.add(dimension3);
        dimensions.add(dimension4);
        dimensions.add(dimension5);
        dimensions.add(dimension6);
        dimensions.add(dimension7);
        dimensions.add(dimension8);
        dimensions.add(dimension9);
        dimensions.add(dimension10);
        dimensions2.add(dimension1);
        dimensions2.add(dimension2);
        Producent producent1 = new Producent("BMW", "M2");
        Producent producent2 = new Producent("BMW", "M3");
        Producent producent3 = new Producent("Toyota", "Corolla");
        Producent producent4 = new Producent("Honda", "Civic");
        Producent producent5 = new Producent("Skoda", "Octavia");
        Producent producent6 = new Producent("Tesla", "Model S");
        Producent producent7 = new Producent("Tesla", "Model Y");
        Producent producent8 = new Producent("Ford", "Focus");
        Producent producent9 = new Producent("Audi", "Q7");
        Producent producent10 = new Producent("Audi", "A6");
        Car car1 = new Car(producent1, false, market1, "standard", dimensions2);
        Car car2 = new Car(producent2, true, market2, "premium", dimensions);
        Car car3 = new Car(producent3, false, market3, "standard", dimensions);
        Car car4 = new Car(producent4, true, market4, "standard", dimensions);
        Car car5 = new Car(producent5, true, market5, "medium", dimensions);
        Car car6 = new Car(producent6, false, market1, "premium", dimensions);
        Car car7 = new Car(producent7, true, market2, "premium", dimensions);
        Car car8 = new Car(producent8, true, market3, "standard", dimensions);
        Car car9 = new Car(producent9, false, market4, "standard", dimensions);
        Car car10 = new Car(producent10, true, market5, "medium", dimensions);
        Car car11 = new Car(producent1, true, market3, "standard", dimensions);
        Car car12 = new Car(producent2, false, market5, "standard", dimensions2);
        Car car13 = new Car(producent3, true, market3, "medium", dimensions);
        Car car14 = new Car(producent4, false, market5, "standard", dimensions);
        Car car15 = new Car(producent5, true, market1, "standard", dimensions2);
        List<Car> cars = List.of(car1, car2, car3, car4, car5, car6, car7, car8, car9, car10, car11,
                car12, car13, car14, car15);

        Car.filterCars(cars, "BMW", true, 300);
    }
}