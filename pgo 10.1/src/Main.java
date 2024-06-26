import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*;


public class Main {
    public static void main(String[] args) {

        Car car1= new Car("porshe", 2011);
        Car car2= new Car("bmw", 2010);
        Car car3= new Car("volvo", 2001);
        Car car4= new Car("peugot", 2013);
        Car car5= new Car("suzuki", 2006);
        Car car6= new Car("kia", 2014);
        Car car7= new Car("honda", 2009);
        Car car8= new Car("citroen", 2022);
        Car car9= new Car("fiat500", 2013);
        Car car10= new Car("bmw2", 2018);

        List<Car> cars =new ArrayList<>();

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        cars.add(car8);
        cars.add(car9);
        cars.add(car10);


        for(Car car:cars){
            System.out.println(car);
        }

    }
}
