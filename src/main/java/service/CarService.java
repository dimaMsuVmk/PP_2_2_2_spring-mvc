package service;

import org.springframework.stereotype.Component;
import model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarService {
    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("lada", "priora", 190));
        carList.add(new Car("ford", "focus", 400));
        carList.add(new Car("lada", "largus", 210));
        carList.add(new Car("Renault", "logan", 320));
        carList.add(new Car("Yaz", "Hunter", 245));
    }

    public List<Car> getCarsListByCount(int count) {
        return carList.stream().limit(count).toList();
    }
}